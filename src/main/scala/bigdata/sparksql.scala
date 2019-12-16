package bigdata

import org.apache.spark.sql.SparkSession


class sparksql {

  def main(args: Array[String]): Unit = {
            val conf = SparkSession.builder().appName("sparksql").master("local[]")
                     val spark = conf.getOrCreate()
    val scfile = spark.sparkContext.textFile("D:\\logs")
    scfile.map(line => {
        line.split()
    })
  }
}
