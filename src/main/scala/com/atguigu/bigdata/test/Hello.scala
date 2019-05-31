package com.atguigu.bigdata.test


object Hell {
  var int = "123"

  def main(args: Array[String]): Unit = {
    println(int)
    var m = 1
    var n = 2
    n = m ^ n
    m = m ^ n
    n = m ^ n
    println(m + "   m   " + n + "   n   ")

    def test = "zhangsan"

    def test1 = {
      println("zhangsan")
    }

    def test2 = {
      "zhangsan"
    }

    test
    test1
    val t2 = test2
    println(s"t2 = ${t2}")
    println(s"test = ${test}")

    def test3(s: String): String = {
      return s + "..."
    }

    println {
      s"test3() = ${test3("lisi")}"
    }


    def test4(): String = {
      return "zhangsan"

    }

    println(s"test4() = ${test4()}")


    def test5(): Unit = {
      return "lisi"
    }

    println(s"test5() = ${test5()}")

    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"$i X $j = ${i * j}" + "\t")
      }
      println()
    }

    val unit: Unit = for (i <- 1 to 3) {
      //println(s"${i}")
      "abc"
    }

    def addMulti(a: Int) = {
      (b: Int) => (c: Int) => (a + b) * c
    }

    println(s"add() = ${addMulti(2)(3)(4)}")

    def f(f1: (Int, Int) => Int): Int = {
      f1(999, 666)
    }

    println(f(_ + _))
  }

}