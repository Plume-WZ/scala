package com.atguigu.bigdata.scala

object Trait0 {
  def main(args: Array[String]): Unit = {
    val t =new T
    t.insert
  }
}

trait Trait{
  println("t.....")
  def insert: Unit ={
    println("d......")
  }
}

trait Trait1 extends Trait{

  println("1......")

  override def insert {
    print("d1......")
    super[Trait].insert
  }
}

trait Trait2 extends Trait{
  println("2......")

  override def insert: Unit = {
    print("d2......")
    super[Trait].insert
  }
}

trait Trait3 extends Trait{
  println("3......")

  override def insert: Unit = {
    print("d3.....")
    super[Trait].insert
  }
}

class T extends Trait2 with Trait1 with Trait3 {

}