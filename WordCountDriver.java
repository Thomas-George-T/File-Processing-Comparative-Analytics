import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;

import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.Text;

public class WordCountDriver {
 public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
	
	 //Job object
	 // we create job object by passing a configuration object
	 
	 Configuration conf=new Configuration();
		//Create job object
	 	//Job job=new Job();
	 	Job job=Job.getInstance(conf,"Word Count");
	 	
	 	//Entry pont
	 	job.setJarByClass(WordCountDriver.class);
	 	//what is the mapper?
	 	job.setMapperClass(WordCountMapper.class);
	 	//what is the reducer?
	 	job.setReducerClass(WordCountReducer.class);
	 	
	 	//When job ip types and o/p types are different
	 	// we need to specify the data types wich job emits
	 
	 	job.setOutputKeyClass(Text.class);
	 	job.setOutputValueClass(IntWritable.class);
	 	
	 	//Start map reduce job
	 	//wait for the progress
	 	boolean result=job.waitForCompletion(true);
	 	int status=result?0:1;
	 	System.exit(status);

	 
}
	
	
}
