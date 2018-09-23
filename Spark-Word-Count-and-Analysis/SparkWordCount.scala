val apache_wiki = sc.textFile("../Input-Files/apache-hadoop-wiki.txt").flatMap( line => line.split(" ")).map(word=> (word,1)).reduceByKey((x,y) => x+y).saveAsTextFile("apache_wiki-result")
val big = sc.textFile("../Input-Files/big.txt").flatMap(lines=>lines.split(" ")).map(word=>(word,1)).reduceByKey((x,y)=>x+y).saveAsTextFile("big-result")
