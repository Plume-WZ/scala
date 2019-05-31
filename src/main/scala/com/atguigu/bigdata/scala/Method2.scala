package com.atguigu.bigdata.scala

object Method2 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)

    /*println(list.reduce((left, right) => {
      left + right
    }))*/

    //    val i: Int = list.reduceRight(_-_)

    //    val i: Int = list.fold(100)(_-_)
    //    val i: Int = list.foldLeft(100)(_ - _)
    val i = list.foldRight(100)(_ - _)
    println(i)

    val ints = list.scanLeft(100)(_ - _)
    val unit = list.scanRight(100)(_ - _)
    println(ints + "=ints" + unit + "=unit")
  }
}
