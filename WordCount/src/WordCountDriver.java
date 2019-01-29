import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCountDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		//Job object
		//We create job object by passing configuration
		Configuration conf=new Configuration();
		//Create Job object
		//Job job=new Job();
		Job job=Job.getInstance(conf,"Word Count");
		
		//Entry point
		job.setJarByClass(WordCountDriver.class);
		//what is the mapper
		job.setMapperClass(WordCountMapper.class);
		//What is reducer
		job.setReducerClass(WordCountReducer.class);
	
		//when job ip types and o/p types are diff
		//we need to specify the data types which job emits.
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		//FileInputFormat<K, V>
		//Start MR job
		//wait for the progress
		boolean result=job.waitForCompletion(true);
		int status=result?0:1;		
		System.exit(status);	
		
		
	}
}