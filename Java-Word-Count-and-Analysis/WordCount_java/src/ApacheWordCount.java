import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
* @author Thomas George Thomas
* Computing word count and execution time of Apache hadoop wikipedia text file.
*/

public class ApacheWordCount {

	static long startTime = System.currentTimeMillis();

	public static void main(String[] args) throws IOException {

		// Create the FileInputStream and the scanner
		FileInputStream fin = new FileInputStream("apache-hadoop-wiki.txt");
		Scanner sc = new Scanner(fin);

		// Create the linkedHashMap
		LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();

		while (sc.hasNext()) {

			String nextWord = sc.next();

			// if the word already exists
			if (words.containsKey(nextWord)) {
				words.put(nextWord, words.get(nextWord) + 1);
			} else {
				words.put(nextWord, 1);
			}
		}

		// close everything
		fin.close();
		sc.close();

		// print values

		try {
			// Write the file
			FileWriter fw = new FileWriter("result/Word-count-apache-hadoop-wiki.txt", false);
			for (Map.Entry<String, Integer> entry : words.entrySet()) {
				fw.write("(" + entry.getKey() + "," + entry.getValue() + ")");
				fw.write(System.lineSeparator());
			}
			fw.close();

		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}

		// Find the execution time
		long endTime = System.currentTimeMillis();

		System.out.println("Execution time:  " + ((endTime - startTime) / 1000.0) + " seconds");

	}

}
