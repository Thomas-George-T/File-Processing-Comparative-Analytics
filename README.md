![GitHub license](https://img.shields.io/github/license/Thomas-George-T/Word-Count-Data-Analysis?style=flat)
![GitHub top language](https://img.shields.io/github/languages/top/Thomas-George-T/Word-Count-Data-Analysis?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/Thomas-George-T/Word-Count-Data-Analysis?style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/Thomas-George-T/Word-Count-Data-Analysis?style=flat)
![ViewCount](https://views.whatilearened.today/views/github/Thomas-George-T/Word-Count-Data-Analysis.svg?cache=remove)

## Aim
To find out which of the programming languages and execution engines take the maximum and the minimum amount of time to process files.

## Methodology

This :green_book: project conducts data analysis :bar_chart: & comparisons of the execution times :watch: taken for computing the word count of input text files varying from extremely small to extremely large sizes in various programming languages and execution engines. This project includes sample findings, observations, comparisons and sample word count programs. We then calculate the time taken to process the files individually and gather the results. All of the findings from individual analyses were collected and combined in a google colab notebook where we have plotted graphs using matplotlib and drawn conclusions based on our findings.

## File Sizes

| File Name              | Size    |
|------------------------|---------|
| apache-hadoop-wiki.txt | 46.5 kB |
| big.txt                | 6.5 MB  |


## File Sources

- [apache-hadoop-wiki](https://en.wikipedia.org/wiki/Apache_Hadoop)
- [big.txt](https://norvig.com/big.txt)

## Programming Languages

Computing for individual languages. Click the images to go to the respective data analysis results.

<br>
<p align="left">
	<a href="Python-Word-Count-Data-Analysis">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/python.svg" alt="Python" Title="Python" width=150 hspace=10 />
	</a>
		<a href="Java-Word-Count-Data-Analysis">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/java.svg" alt="Java" Title="Java" width=120 hspace=80 />
	</a>
		<a href="Scala-Word-Count-Data-Analysis">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/scala.svg" alt="Scala" Title="Scala" width=100/>
	</a>
</p>


## Execution engines

Computing for individual execution engines. Click the images to go to the respective data analysis results.

<br>
<p align="left">
	<a href="Hadoop-MapReduce-WordCount-Data-Analysis">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/hadoop.svg" alt="Hadoop" Title="Hadoop" width=180 hspace=100/>
	</a>
	<a href="Spark-Word-Count-Data-Analysis">
		<img src="https://raw.githubusercontent.com/Thomas-George-T/Word-Count-Data-Analysis/master/assets/svg/apache_spark.svg" alt="Spark" Title="Spark" width=240 />
	</a>
	
</p>

## Visualizing Results

### Comparing Programming Languages

<p align="center">
	<a href="#">
		<img src="assets/graphs/languages.png" alt="Languages findings" Title="Languages findings" />
	</a>
</p>	

### Comparing Execution Engines	
	
<p align="center">
	<a href="#">
		<img src="assets/graphs/execution_engines.png" alt="Execution engines findings" Title="Execution engines findings" />
	</a>	
</p>

## Conclusions

We have observed from the graphs that **Python** has the least execution time for small and large files while **Scala** has the largest execution time.

We have observed that **Spark** has the least execution time while **Hadoop** has the highest execution time.

## Notebook

The Google Colab Notebook with the complete Analysis with Graphs: [Notebook](Data-Analysis.ipynb) 
