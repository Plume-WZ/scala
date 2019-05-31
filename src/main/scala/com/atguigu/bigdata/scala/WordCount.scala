package com.atguigu.bigdata.scala

object WordCount {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

    val string: List[String] = list.map(a => (a._1 + " ") * a._2)

    val strings: List[String] = string.flatMap(t => t.split(" "))

    println(strings.mkString(","))

    val stringToStrings: Map[String, List[String]] = strings.groupBy(word => word)

    val stringToInt: Map[String, Int] = stringToStrings.map(t => {
      (t._1, t._2.size)
    })

    val tuples: List[(String, Int)] = stringToInt.toList.sortWith((left, right) => {
      left._2 > right._2
    })

    val result: List[(String, Int)] = tuples.take(3)

    println(result.mkString(","))
  }

}
