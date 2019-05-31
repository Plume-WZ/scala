package com.atguigu.bigdata.datastruct.test

import java.util

import scala.util.control.Breaks._

object SingleLinkedList {
    def main(args: Array[String]): Unit = {
        
        // tmp=tmp.next tmp向后更新，来达到循环遍历目的
        
        val singleLinkedList = new SingleLinkedList
        
        val node1 = new HeroNode(1, "宋江", "及时雨")
        val node2 = new HeroNode(2, "卢俊义", "玉麒麟")
        val node3 = new HeroNode(3, "吴用", "智多星")
        val node4 = new HeroNode(4, "张飞", "翼德")
        
        singleLinkedList.addByOrder(node2)
        singleLinkedList.addByOrder(node3)
        singleLinkedList.addByOrder(node4)
        singleLinkedList.addByOrder(node1)
        
        val node5 = new HeroNode(4, "公孙胜", "入云龙")
        singleLinkedList.update(node5)
        printf("链表修改后的情况\n\n")
        singleLinkedList.list()
        
//        println("删除后的链表情况")
//        singleLinkedList.delete(3)
//        singleLinkedList.delete(1)
//        singleLinkedList.delete(4)
        
        singleLinkedList.list()
        singleLinkedList.reversePrint
    }
    
}

class SingleLinkedList {
    // 创建头结点，指向该链表的头部
    val head = new HeroNode(-1, "", "")
    
    def reversePrint(): Unit = {
        val stack = new util.Stack[HeroNode]()
        if (isEmply()) {
            println("kong")
            return
        }
        var tmp: HeroNode = head.next
        breakable {
            while (true) {
                stack.push(tmp)
                if (tmp.next == null) {
                    break()
                }
                tmp = tmp.next
            }
        }
    
        println("\n")
        while (!stack.isEmpty) {
            val heroNode: HeroNode = stack.pop()
            println("no = " + heroNode.id)
        }
    }
    
    //遍历单向链表
    def list(): Unit = {
        var tmp: HeroNode = head.next
        
        if (isEmply()) {
            println("no list")
            return
        }
        
        breakable {
            while (true) {
                println("id = " + tmp.id + " name = " + tmp.name + " nickName = " + tmp.nickName)
                if (tmp.next == null) {
                    break()
                }
                tmp = tmp.next
            }
        }
        
    }
    
    //按照id编号的从小到大进行插入
    def addByOrder(heroNode: HeroNode): Unit = {
        var tmp: HeroNode = head
        var flag = false
        
        breakable {
            while (true) {
                if (tmp.next == null) {
                    break()
                }
                
                if (tmp.next.id == heroNode.id) {
                    flag = true
                    break()
                } else if (tmp.next.id > heroNode.id) {
                    break()
                }
                tmp = tmp.next
            }
        }
        if (flag) {
            println("is exist")
        } else {
            heroNode.next = tmp.next
            tmp.next = heroNode
        }
    }
    
    //添加英雄到单链表
    def add(heroNode: HeroNode): Unit = {
        
        var tmp: HeroNode = head
        
        breakable {
            while (true) {
                if (tmp.next == null) {
                    break()
                }
                tmp = tmp.next
            }
        }
        // 循环结束，tmp指向null
        tmp.next = heroNode
    }
    
    //删除一个结点
    def delete(num: Int): Unit = {
        if (isEmply()) {
            println("is emply")
        }
        var tmp: HeroNode = head
        var flag = false
        
        breakable {
            while (true) {
                if (tmp.next.id == num) {
                    // tmp的下一个节点就是要删除的节点
                    flag = true
                    break()
                }
                
                // 当tmp到倒数第二个时候证明没有匹配的
                if (tmp.next == null) {
                    break()
                }
                tmp = tmp.next
            }
        }
        
        if (flag) {
            tmp.next = tmp.next.next
        } else {
            println("要删除的节点不存在")
        }
    }
    
    def update(heroNode: HeroNode): Unit = {
        if (isEmply()) {
            println("no args")
        }
        
        var tmp: HeroNode = head.next
        var flag = false
        
        breakable {
            while (true) {
                if (tmp.id == heroNode.id) {
                    flag = true
                    break()
                }
                
                if (tmp.next == null) {
                    break()
                }
                tmp = tmp.next
            }
            
        }
        // 由于id不可变，当传入相同id的heroNode时就证明要修改
        if (flag) {
            tmp.name = heroNode.name
            tmp.nickName = heroNode.nickName
        } else {
            println("no")
        }
    }
    
    // 空
    def isEmply(): Boolean = {
        head.next == null
    }
}

class HeroNode(hNo: Int, hName: String, hNickName: String) {
    // 属性
    val id: Int = hNo
    var name: String = hName
    var nickName: String = hNickName
    var next: HeroNode = _
}