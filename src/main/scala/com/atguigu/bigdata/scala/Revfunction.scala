package com.atguigu.bigdata.scala

import scala.collection.mutable.ArrayBuffer

object Revfunction {

  def main(args: Array[String]): Unit = {
    //    val ints: Array[Int] = Array(1,2,3,4)
    //    println(ints(1))
    //    println(ints.length)

    //    println(list.mkString("|"))
    //    for (elem <- list) {
    //      println(elem)
    //    }

    //    val aints: ArrayBuffer[Int] = ArrayBuffer(4,5,6,7)
    //    aints.remove(1,2)
    //    aints-=(4)
    //    for (elem <- aints) {
    //      println(elem)
    //    }

    val list: List[Int] = List(1, 3, 4, 3)
    val alist: List[Int] = list.::(9)
    println(alist.mkString(","))
    println(Nil)
    val ints = list.:::(Nil)
    println(ints)


    val intToString: Map[Int, String] = Map((1, "zhangsan"))
    intToString.foreach(t => {
      println(t._1 + " " + t._2)
    })
  }

}
