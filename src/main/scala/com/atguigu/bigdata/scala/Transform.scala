package com.atguigu.bigdata.scala

object Transform {
  def main(args: Array[String]): Unit = {
    val linesList = List(("Hello Scala World", 4), ("Hello World", 3), ("Hello Hadoop", 2), ("Hello Hbase", 1))

    // 将一行一行数据拆分成一个个的单词数据
    // ("Hello Scala World", 4)
    val flatMapList: List[(String, Int)] = linesList.flatMap(t => {
      // 将传入的每个元素的第一个数据按空格进行切分，然后在与其第二个数据进行合并
      t._1.split(" ").map(w => (w, t._2))
    })

    // 将单词进行分组
    val groupWord: Map[String, List[(String, Int)]] = flatMapList.groupBy(t => t._1)

    println(groupWord.mkString(","))
    // 将分组后的数据进行结构转换
    val wordToSum: Map[String, Int] = groupWord.map(t => {
      val sum: Int = t._2.map(tt => tt._2).sum
      (t._1, sum)
    })
    // 对统计结果进行降序
    val sortList: List[(String, Int)] = wordToSum.toList.sortWith((left, right)=>{left._2>right._2})

    // 取前三
    val result: List[(String, Int)] = sortList.take(3)

    println(result)
  }
}