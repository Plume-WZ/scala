package com.atguigu.bigdata.test


object Func4 {

    def f() = {
      println("xxxx")
    }

    def f1() = {
      f
    }

  def main(args: Array[String]): Unit = {

        println(f1)


      def f2(i: Int) = {
        def f3(j: Int): Int = {
          i * j
        }

        f3 _
      }


      println(s"f2(2)(3) = ${f2(2)(3)}")

    def f4(i: Int)(j: Int) = {
      i * j
    }

    println(s"f4(2)(3) = ${f4(2)(3)}")

    def f11(i: Int) = {

      def f2(j: Int): Int = {
        i * j
      }

      f2 _
    }

    println(s"f11(2)(3) = ${f11(2)(3)}")

    val intToInt = f11(10)

    def f6(f: () => Int) = {
      f()
    }

    f6(()
    =>
    {
      println("xxx")
      3
    }
    )
  }
}