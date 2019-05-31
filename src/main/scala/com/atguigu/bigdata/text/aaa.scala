package com.atguigu.bigdata.text

import org.apache.spark.SparkConf

object aaa {
    def main(args: Array[String]): Unit = {
        val tuple: (Int, Int, Int, String) = (1, 2, 3, "heiheihei")
        println(tuple._4)
        for (elem <- tuple.productIterator) {
            println(elem)
        }
        
        tuple.productIterator.foreach(println)
        
        implicit def a(d: Double) = d.toInt
        
        var i: Int = 1.2
        
        val map = Map("Tom" -> 23)
        println(map.get("Tom"))
        println(map("Tom"))
        
        val optionAge = map.get("Tom")
        optionAge match {
            case Some(x) => optionAge.get
            case None => 0
        }
        println(map("Jack"))
    
        println(optionAge)
        
        val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("aaaa")
    }
}
