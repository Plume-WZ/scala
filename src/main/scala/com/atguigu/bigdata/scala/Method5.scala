package com.atguigu.bigdata.scala

object Method5 {
  def main(args: Array[String]): Unit = {
    val list = List(1, List(2, 3), List(4, 5), 6, List(7, 8))
    // 有数字，有集合所以用any
    list.flatMap(any => {
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
    })

    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 5
      }
      println(ch + " " + sign + " " + digit)
    }

    val ch = 'V'
    ch match {
      case '+' => println("ok~")
        // mychar是一个变量
      case mychar => println("ok~" + mychar)
      case _ => println ("ok~~")
    }
  }
}
