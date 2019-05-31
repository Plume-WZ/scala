package com.atguigu.bigdata.scala

object Maptest {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    println(map.mkString(","))
    val map1: Map[String, Int] = map + ( "d" -> 4 )
    val map11: Map[String, Int] = map + ( "a" -> 6 )
    println(map1.mkString(","))
    println(map11.mkString(","))

    val map2: Map[String, Int] = map - ("e")
    println(map2.mkString(","))
    println(map == map1)

//    println(map.get("f").get)
    println(map.get("c").getOrElse(0))
  }
}
