package bigdata

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

class ssc {

  def main(args: Array[String]): Unit = {
           val conf = new SparkConf().setMaster("local[*]").setAppName( "ssc" )

                 val ssc = new StreamingContext(conf,Seconds(5))
            ssc.checkpoint("D;\\aaa")


  }


}
