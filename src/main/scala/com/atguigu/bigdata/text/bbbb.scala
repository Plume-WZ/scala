package com.atguigu.bigdata.text

import org.apache.spark.SparkConf

object bbbb {
    def main(args: Array[String]): Unit = {
        val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("bbbb")
        
    }
}
