package com.atguigu.bigdata.scala

object Match {
  def main(args: Array[String]): Unit = {
    val a = 10
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3) // Array[Int]
    else if(a == 7) Array("aa", 1) // Array[Any]
    else if(a == 8) Array("aa") // Array[String]
    else if(a == 9) List("aa") // Array[String]
    else if(a == 10) List(1,2) // Array[String]

    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case g : List[String] => "xxxxxx"
      case h : List[Int] => "yyyyy"
      case _ => "啥也不是"
    }
    println(result)
  }
}
