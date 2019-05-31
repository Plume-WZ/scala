package com.atguigu.bigdata.text

object LinkToStack {
    def main(args: Array[String]): Unit = {
    
    }
}

class LinkToStack(maxListSize: Int) {
    val down = new NodeTwoList()
    val maxSize = maxListSize
    
    // 断空
    def isEmply(): Unit = {
        if (down.top == -1) {
            println("kong ")
            return
        }
    }
    
    //    def isFull: Boolean = {
    //        if (maxSize)
    //    }
    
    def add(): Unit = {
        //        if (isFull) {
        
        //        }
    }
    
    def peek() {
    
    }
}

class NodeTwoList {
    var left = null
    var right = null
    var top = -1
}