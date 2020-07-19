# Spark Word Count Data Analysis


<p align="center">
	<a href="#">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/apache_spark.svg" width=300 Title="Apache spark" alt="Apache Spark" />
	</a>
</p>

## Overview

Data Analysis & comparisons of the execution time take to compute word counts for different input textFile sizes executed on Spark-Shell in Scala in local cluster mode.

## File Sizes

- apache-hadoop-wiki.txt: 46.5 kB
- big.txt: 6.5 MB 

## Prerequisites

- Linux System
- Hadoop 
- Spark 2.0 set up in Local cluster mode

## Execution

In terminal execute the following command:

```
spark-shell -i "SparkWordCount.scala"
```

## Observations 
<br>
<p align="center">
	<img src="images/spark-jobs-chart.png" width=500>
</p>

The average execution times for the spark jobs on Spark local mode are:

- apache-hadoop-wiki.txt: 1 second
- big.txt: 3 seconds

## Source code

To view the source code of the word counts of:
- [apache-hadoop-wiki-small](smallWordCount.scala)
- [big](bigWordCount.scala)

## Word Count Results

To view the results of the word counts
- [apache-hadoop-wiki](apache_wiki-result/part-00000.txt)
- [big](big-result/part-00000.txt)

## File Sources

- [apache-hadoop-wiki](https://en.wikipedia.org/wiki/Apache_Hadoop)
- [big.txt](https://norvig.com/big.txt)
