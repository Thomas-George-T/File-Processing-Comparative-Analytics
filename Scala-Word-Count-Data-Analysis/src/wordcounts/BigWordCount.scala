package wordcounts

import scala.io.Source
import java.io._

/**
 * @author Thomas George Thomas
 * Computing word count, execution time and writing the results of the big text file.
 */

object BigWordCount extends App {

  val startTime = System.currentTimeMillis();

  // Reading and computing word count
  val source = Source.fromFile("../Input-Files/big.txt").getLines.toList

  val words = source.flatMap(line => line.split("\\s"))
  val keyData = words.map(word => (word, 1))
  val groupedData = keyData.groupBy(_._1)
  val result = groupedData.mapValues(list => {
    list.map(_._2).sum
  })

  // FileWriter
  val file = new File("Word-count-big.txt")
  val bw = new BufferedWriter(new FileWriter(file))
   for (line <- result) {
        bw.write(line.toString()+"\n")
    }
 
  bw.close()

  // Find the execution time
  val endTime = System.currentTimeMillis();

  println("Execution time:  " + ((endTime - startTime) / 1000.0) + " seconds");

}