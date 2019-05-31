package com.atguigu.bigdata.test


object Func3 {

  def apply(f: Int => String, v: Int) = f(v)

  def fmtInt(n: Int): String = "[整数值{" + n + "}]"

  def a(f1: Int => String, v: Int) = {
    f1(v)
  }

  def main(args: Array[String]): Unit = {
//    println(apply(fmtInt, 1200))

    def test(x: Double) = {
      (y: Double) => x * x * y
    }

    println(s"test() = ${test(2.0)}")
  }
}