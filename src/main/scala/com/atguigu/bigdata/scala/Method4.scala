package com.atguigu.bigdata.scala

object Method4 {

    def main(args: Array[String]): Unit = {

      // 模式匹配，类似于Java的switch语法
      var result = 0
      val c = '-'
      c match {
        case '-' =>
          result = 1
          println("匹配到-")
        case '+' =>
          result = -1
          println("匹配到+")
        case '%' => { //多行的话，可以换行，可以使用 {} 括起来，也可以不扩
          result = 100
          println("匹配到%")
        }
        case _ => println("没有匹配到...")
      }
      println(result)
    }
}