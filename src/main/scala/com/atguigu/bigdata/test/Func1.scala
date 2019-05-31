package com.atguigu.bigdata.test


object Func1 {


  def main(args: Array[String]): Unit = {
    def f1(): Int = {
      100
    }
    //    println(f1)

    var f2 = f1
    var f3 = f1 _

    // f2 = f1    是将函数的结果作为值传给f2
    // f3 = f1 _  是打印函数
//    println(f2 + "<-2   3->" + f3())

    val f = () => "abc"
    println(s"f = ${f()}")

  }
}