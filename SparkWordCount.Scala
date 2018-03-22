sc.textFile("apache_wiki.txt").flatMap( line => line.split(" ")).map(word=> (word,1)).reduceByKey((x,y) => x+y).saveAsTextFile("result")
