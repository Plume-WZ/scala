package com.atguigu.bigdata.scala

object Match1 {
  def main(args: Array[String]): Unit = {
    /*for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val result = arr match {
        case Array(0, _*) => "以0开头和数组"
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case _ => "什么集合都不是"
      }
      println("result = " + result)
    }*/

    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0 ..."
        case _ => "something else"
      }
      println(result)
    }
  }
}
