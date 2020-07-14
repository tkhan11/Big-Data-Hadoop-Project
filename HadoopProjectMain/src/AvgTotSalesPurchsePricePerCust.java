import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class AvgTotSalesPurchsePricePerCust{	
	public static class AvgTotSalesPurchsePricePerCustMapperCustomer extends Mapper<Object, Text, Text,Text> {
		public void map(Object key ,Text value, Context con)throws IOException,InterruptedException{

		String line = value.toString();
		String[] record = line.split(",");
	
		con.write(new Text(record[0]),new Text("customer\t" + record[1]));

		}
	}
	
	public static class AvgTotSalesPurchsePricePerCustMapperTransaction extends Mapper<Object, Text, Text,Text> {
		public void map(Object key ,Text value, Context con)throws IOException,InterruptedException{

		String line = value.toString();
		String[] record = line.split(",");
	
		con.write(new Text(record[3]),new Text("transaction\t" + record[7]));

		}
	}
	
	public static class AvgTotSalesPurchsePricePerCustReducer extends Reducer <Text, Text ,Text,Text> {
		public void reduce(Text key,Iterable<Text> values, Context con)throws IOException, InterruptedException {
			
			String NAME="";
			double Total=0.0;
			double AvgTotal=0.0;
			int Count=0;
			for(Text t:values) {
				String[] parts =t.toString().split("\t");
			
				if(parts[0].equals("customer")) {
					NAME= parts[1];
					Count++;
				} else if (parts[0].equals("transaction")) {
					Total +=Float.parseFloat(parts[1]);
				}
				
			}
				AvgTotal=Total/Count;
				String str =String.format("%d\t%f\t\t%f",Count,Total,AvgTotal);
				//String str =String.format("%d\t%f\t%f",Count,AvgTotal);
				con.write(new Text(NAME), new Text(str));
			
		}

	}
	
public static void Driver(String args[]) throws Exception {

	boolean recursive=true;
	Configuration conf=new Configuration();
	FileSystem fs=FileSystem.get(conf);
	
	if(fs.exists(new Path(args[2])))
	fs.delete(new Path(args[2]),recursive);
	
	Job job=Job.getInstance(conf, "Avgerage Total Sales Purchse Price PerCust ");

	job.setJarByClass(AvgTotSalesPurchsePricePerCust.class);
	
	job.setMapperClass(AvgTotSalesPurchsePricePerCustMapperCustomer.class);
	job.setMapperClass(AvgTotSalesPurchsePricePerCustMapperTransaction.class);

	job.setReducerClass(AvgTotSalesPurchsePricePerCustReducer.class);

	job.setNumReduceTasks(1);
	
	
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(Text.class);

	MultipleInputs.addInputPath(job,new Path(args[0]),TextInputFormat.class,AvgTotSalesPurchsePricePerCustMapperCustomer.class);
	MultipleInputs.addInputPath(job,new Path(args[1]),TextInputFormat.class,AvgTotSalesPurchsePricePerCustMapperTransaction.class);
	FileOutputFormat.setOutputPath(job,new Path(args[2]));
	
	job.waitForCompletion(true);



	}

}


