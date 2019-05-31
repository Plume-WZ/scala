package com.atguigu.bigdata.datastruct.test

import scala.util.control.Breaks._

object DoubleLinkedListDemo {
    def main(args: Array[String]): Unit = {
        val doubleLinkedList = new DoubleLinkedList
        //创建三个英雄
        val node1 = new Hero2(1, "宋江", "及时雨")
        val node2 = new Hero2(2, "卢俊义", "玉麒麟")
        val node3 = new Hero2(3, "吴用", "智多星")
        val node4 = new Hero2(4, "张飞", "翼德")
        doubleLinkedList.add(node1)
        doubleLinkedList.add(node2)
        doubleLinkedList.add(node3)
        doubleLinkedList.add(node4)
        
        println("双向链表的情况")
        doubleLinkedList.list()
        
        val node5 = new Hero2(4, "公孙胜", "入云龙")
        //        doubleLinkedList.update(node5)
        println("双向链表的修改后情况")
        doubleLinkedList.list()
        
        //删除的测试
        doubleLinkedList.delete(1)
        doubleLinkedList.delete(2)
        doubleLinkedList.delete(3)
        doubleLinkedList.delete(4)
        println()
        println()
        println("双向链表的删除后情况")
        doubleLinkedList.list()
    }
}

class DoubleLinkedList {
    // 创建头结点，指向该链表的头部
    val head: Hero2 = new Hero2(-1, "", "")
    
    // 遍历
    def list(): Unit = {
        var tmp = head.right
        if (isEmply()) {
            println("kong")
            return
        }
        breakable {
            while (true) {
                println("id = " + tmp.id + " name = " + tmp.name + " nickName = " + tmp.nickName)
                
                if (tmp.right == null) {
                    break()
                }
                tmp = tmp.right
            }
        }
        
    }
    
    //添加英雄到单链表
    def add(heroNode2: Hero2): Unit = {
        var tmp = head
        breakable {
            while (true) {
                if (tmp.right == null) {
                    break()
                }
                tmp = tmp.right
            }
        }
        tmp.right = heroNode2
        heroNode2.left = tmp
    }
    
    //删除结点
    def delete(num: Int): Unit = {
        if (isEmply()) {
            println("链表空")
            return
        }
        
        var tmp: Hero2 = head.right
        var flag = false
        breakable {
            while (true) {
                if (tmp.id == num) {
                    flag = true
                    break()
                }
                if (tmp.right == null) {
                    break()
                }
                tmp = tmp.right
            }
            
            if (flag) {
                tmp.left.right = tmp.right
                if (tmp.right != null) {
                    tmp.right.left = tmp.right
                }
            } else {
                println("no ")
            }
        }
    }
    
    // 判断空
    def isEmply(): Boolean = {
        head.right == null
    }
}

class Hero2(hNo: Int, hName: String, hNickName: String) {
    // 属性
    val id: Int = hNo
    var name: String = hName
    var nickName: String = hNickName
    var right: Hero2 = _
    var left: Hero2 = _
}