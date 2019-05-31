package com.atguigu.bigdata.datastruct.test

object ArrayQueueDemo {
    def main(args: Array[String]): Unit = {
    
    }
}

//编写一个数据结构的基本思路 创建-遍历-修改-删除
class ArrayQueue(arrayMaxSize: Int) {
    val maxSize = arrayMaxSize
    val arr = Array[Int](maxSize)
    
    val left = -1
    var right = -1
    
    // 判断满
    def isFull(): Boolean = {
        right == maxSize - 1
    }
    
    // 判断空
    def isEmply(): Boolean = {
        Left == right
    }
    
    //查看队列的头元素，但是不取出
    def getHead(): Any = {
        if (isEmply()) {
            return new Exception("队列为空")
        }
        arr(left + 1)
    }
    
    //向队列中添加数据
    def add(num: Int) = {
        if (isFull()) {
            println("队列满")
        }
        // 不为空，右向后移一位
        right += 1
        arr(right) = num
    }
    
    //遍历显示队列
    def list(): Unit = {
        if (isEmply()) {
            println("队列空")
            return
        }
        for (i <- left + 1 to right) {
            print(i + " ")
        }
    }
}