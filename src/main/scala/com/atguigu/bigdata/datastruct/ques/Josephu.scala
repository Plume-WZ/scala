package com.atguigu.bigdata.datastruct.ques

import scala.util.control.Breaks._

object JoseDemo {
    def main(args: Array[String]): Unit = {
        val josephu = new Jose()
        josephu.add(5)
        josephu.list()
        
        //测试一下游戏
        //josephu.countBoy(2,2,5) // 3 - 5 - 2 - 1 - 4
        josephu.countPeople(2, 2, 5) //3 - 5 - 2 - 1 - 4
    }
}

// 链表
class Jose {
    var first: People = null
    
    def countPeople(startNo: Int, stepNo: Int, countNo: Int): Unit = {
        if (startNo < 0 || stepNo < 0 || countNo <= 0) {
            println("error")
            return
        }
        
        breakable {
            var curNode: People = first
            for (_ <- 0 until startNo - 1) {
                curNode = curNode.next
            }
            while (true) {
                // 找出开始的位置
                var helper: People = curNode
                //                var tmp: People = null
                // 找出要删除的位置
                for (_ <- 0 until stepNo - 1) {
                    //                    curNode = helper
                    helper = helper.next
                }
                println("chu num = " + helper.num)
                curNode = curNode.next
//                helper = null
                if (curNode == helper.next) {
                    break()
                }
            }
        }
    }
    
    def add(num: Int): Unit = {
        var curNode: People = null
        for (i <- 1 to num) {
            // 创建要添加的对象
            val people = new People(i)
            if (i == 1) {
                first = people
                curNode = people
                first.next = first
            } else {
                curNode.next = people
                people.next = first
                curNode = people
            }
        }
    }
    
    def list(): Unit = {
        if (first == null) {
            println("list kong")
            return
        }
        var curNode = first
        breakable {
            while (true) {
                println("no = " + curNode.num)
                if (curNode.next == first) {
                    break()
                }
                curNode = curNode.next
            }
        }
    }
}

// 类型
class People(no: Int) {
    val num = no
    var next: People = _
}