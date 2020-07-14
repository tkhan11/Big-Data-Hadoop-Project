import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class TotalTransactionsPerCustomer{	
	public static class TotalTransactionsPerCustomerMapper extends Mapper<LongWritable, Text, Text,LongWritable> {
		public void map(LongWritable key ,Text value, Context con)throws IOException,InterruptedException{
	
			String line = value.toString();
			String[] record = line.split(",");
			con.write(new Text(record[5]),new LongWritable(1));
		}
	}
	
	
	public static class TotalTransactionsPerCustomerReducer extends Reducer <Text,LongWritable ,Text,LongWritable> {
		public void reduce(Text key,Iterable<LongWritable> values, Context con)throws IOException, InterruptedException {
				
			int count=0;
			for( LongWritable val:values){
				count += val.get();
			}
			con.write(key,new LongWritable(count));
			}
	}
	
public static void Driver(String args[]) throws Exception {

	boolean recursive=true;
	Configuration conf=new Configuration();
	FileSystem fs=FileSystem.get(conf);
	
	if(fs.exists(new Path(args[1])))
	fs.delete(new Path(args[1]),recursive);
	
	Job job=Job.getInstance(conf," Total Number of Transactions Per Customer");

	job.setJarByClass(TotalTransactionsPerCustomer.class);
	
	job.setMapperClass(TotalTransactionsPerCustomerMapper.class);
	job.setReducerClass(TotalTransactionsPerCustomerReducer.class);

	job.setNumReduceTasks(1);
	
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(LongWritable.class);

	FileInputFormat.addInputPath(job,new Path(args[0]));
	FileOutputFormat.setOutputPath(job,new Path(args[1]));
	
	job.waitForCompletion(true);

	}

}


