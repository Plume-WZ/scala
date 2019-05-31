package com.atguigu.bigdata.scala

import scala.collection.mutable

object Method3 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 3, "c" -> 2, "d" -> 1)

    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2)((map, t) => {
      map(t._1) = map.getOrElse(t._1, 0) + t._2
      map
    })
    println(stringToInt)
  }
}
