import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


//Provide keyin,valuein, and keyout,valueout data types
//Generics <>
public class WordCountMapper extends Mapper<LongWritable,Text, Text, IntWritable>{

	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
			//String[] words=value.toString().split(" ");
			StringTokenizer words=new StringTokenizer(value.toString(), " ");
			while(words.hasMoreTokens()){
				String word=words.nextToken();
				
				context.write(new Text(word),new IntWritable(1));
			}
	
	}

}
