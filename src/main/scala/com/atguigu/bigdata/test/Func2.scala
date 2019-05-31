package com.atguigu.bigdata.test


object Func2 {


  var money = 100

  def buy: Int = {
    money -= 10
    money
  }

  // 传入buy的值
  def test1(a: Int)

  = {
    println(a)
    println(a)
  }

  // 传入buy的函数
  def test2(a: => Int) = {
    println(a)
    println(a)
  }

  def main(args: Array[String]): Unit = {
    test1(buy)

    // money 是全局变量
    test2(buy)

    def f1 = "venassa"
    // 函数后面的小括号可以省略
    println(f1) //

  }
}