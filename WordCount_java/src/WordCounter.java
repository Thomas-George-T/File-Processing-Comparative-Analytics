import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

//Word counter in java

public class WordCounter {
	
	public static void main(String[] args) throws IOException {
		
		//Create the FileInpurStream and the scanner
		FileInputStream fin = new FileInputStream("apache_wiki.txt");
		Scanner sc=new Scanner(fin);
		
		//Create the linkedHashMap
		LinkedHashMap<String,Integer> words= new LinkedHashMap<String,Integer>();
		
		while(sc.hasNext()){
			
			String nextWord=sc.next();
			
			//if the word already exists
			if(words.containsKey(nextWord)){
				words.put(nextWord, words.get(nextWord)+1);
			} 
			else{
				words.put(nextWord, 1);
			}		
		}
		
		//close everything
		fin.close();
		sc.close();
		
		System.out.println("Word\tCount");
		
		//print values
		for(Map.Entry<String, Integer> entry : words.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

}
