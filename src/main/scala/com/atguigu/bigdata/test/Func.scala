package com.atguigu.bigdata.test


object Func {

  def sum(n1: Int, n2: Int) = n1 + n2

  def test2(n: Int): Unit = {
    if (n > 2) {
      test2(n - 1)
    } else {
      println(s"n = ${n}")
    }
  }

  def test3(n: Int): Int = {
    if (n <= 2) {
      return 1
    } else {
      return test3(n - 1) + test3(n - 2)
    }
  }


  /**
    * 猴子吃桃
    * @param n
    * @return
    */
  def test4(n: Int): Int = {
    if (n < 2) {
      return 1
    } else {
      return test4(n - 1) * 2 + 2
      //return (test4(n).+(test4(n))).+(2)
    }
  }

  def main(args: Array[String]): Unit = {
    /*val n1 = 1
    val n2 = 2
    val res = sum(n1, n2)
    println(s"res = ${res}")*/
    /*
        test(4)
        test2(4)*/

//    println(s"test3() = ${test3(7)}")

    println(s"test4() = ${test4(10)}")
  }

  def test(n: Int): Unit = {
    if (n > 2) {
      test(n - 1)
    }
    println(s"n = ${n}")
  }
}