# BigDataHadoopProject
Big Data Hadoop framework project for analysis of superstore sales data to find insights.


Dependencies: Cloudera Hadoop framework running on VMWARE

Prerequisite:
* First we have to create a input directory named Superstoredata at HDFS and then we have to put 
superstore.csv ,transaction.csv and customer.csv in it.

* For save Button to work you have to create a folder named Reports at /home/cloudera/Desktop/

Commands to be executed in CMD :

Syntax:export JAVA_HOME=/usr/java/default  //run if java_home not set. echo $JAVA_HOME

Syntax: export PATH=${JAVA_HOME}/bin:${PATH}


# To compile the java class

Syntax:  export HADOOP_CLASSPATH=${JAVA_HOME}/lib/tools.jar

hadoop com.sun.tools.javac.Main -d classfiles Alljavaclasses
   
here it will compile the javaclass and create the class files in an alredy created folder named classfiles


# To create the jar file of all class files

for this we have to be in the folder where all class files are present in this case we have to be in classfiles folder

synatx:    jar cvf jarname.jar ./* 


# To run the jar file

syntax:  hadoop jar jarfile.jar Mainclassname

hadoop jar all.jar Signin

