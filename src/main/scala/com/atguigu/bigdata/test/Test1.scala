package com.atguigu.bigdata.test


object Test1 {

  var i: Int = _

  def sum(i: Int, i1: Int) = {
    println("sum执行了")
    i + i1
  }

  @throws(classOf[NumberFormatException])
  def f11() = {
    "abc".toInt
  }

  def main(args: Array[String]): Unit = {

    lazy val res = sum(10, 20)
    println("-------------")
    println(res)

    //    println(s"f11() = ${f11()}")

    for (i <- 1 to(18, 2)) {
      var j = (18 - i) / 2
      println(j + " " * j + "*" * i + " " * j)
    }

    for {i <- 1 to(18, 2)
         j = (18 - i) / 2} {
      println(9 - j + " " * j + "*" * i + " " * j)

    }
    val str = "s".+("s")
    println(str)

  }
}