val big = sc.textFile("../Input-Files/big.txt").flatMap(lines=>lines.split(" ")).map(word=>(word,1)).reduceByKey((x,y)=>x+y).saveAsTextFile("big-result")
