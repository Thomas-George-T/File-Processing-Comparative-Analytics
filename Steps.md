## Steps for running Map Reduce programs

1. Start hdfs and yarn daemons

  ```
  start-hdfs.sh
  start-yarn.sh
     OR
  *deprecated code*
  *start-all.sh*
  ```

2. Open a java project in Eclipse

3. In the java project, Add External Archives using a build path
   From the hadoop software folder add :

   ```
   /common/*.jar 
   /common/lib/All
   /hdfs/*.jar
   /mapreduce/*.jar
   /yarn/*.jar
   ```

4. Write the mapper, reducer and driver class

5. Export it into a .jar file 

6. Make a sample input file (Source: text, data set)

7. Copy file from local to hdfs
   
   ```
   hdfs dfs -copyFromLocal <sourcefile> <destinationPath>
   ```

8. Submit the file to the hdfs cluster
   
   ```
   Hadoop jar <source.jar Path> MainClassDriver <sourceFile Path in hdfs> <Destination Folder path in hdfs>
   ```

9. Read the output file

   ```
   hdfs dfs -cat /DestinationFolder/* to view the results
   ```

10. Stop all the hdfs daemons
	
   ```
   stop-dfs.sh
   stop-yarn.sh
       OR
   *deprecated code:*
   *Stop-all.sh*
   ```
