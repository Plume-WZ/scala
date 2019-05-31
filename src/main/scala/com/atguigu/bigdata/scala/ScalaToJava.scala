package com.atguigu.bigdata.scala

object ScalaToJava {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val arr=ArrayBuffer("1","2","3")
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList=javaArr.command()
    println(arrList)

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr:mutable.Buffer[String]=arrList
    scalaArr.append("jack")
    println(scalaArr)
  }
}
