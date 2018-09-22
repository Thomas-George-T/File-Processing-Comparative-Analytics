[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Description

To find word counts and compare the execution times for different input textFile sizes executed on Spark-Shell using RDDs in Scala

## Run Command:

In terminal execute

```
spark-shell -i "SparkWordCount.scala"
```

## File Sources

- [apache-hadoop-wiki](https://en.wikipedia.org/wiki/Apache_Hadoop)
- [big.txt](https://norvig.com/big.txt)


## File Sizes

- apache-hadoop-wiki.txt: 46.5 kB
- big.txt: 6.5 MB 

## Observations 
<br>
<p align="center">
	<img src="images/spark-jobs-chart.png" width=500>
</p>

The execution time for the spark jobs on Spark local mode are:

- apache-hadoop-wiki.txt: 1s
- big.txt: 3s
