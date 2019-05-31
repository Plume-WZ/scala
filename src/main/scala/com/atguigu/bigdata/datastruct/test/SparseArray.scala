package com.atguigu.bigdata.datastruct.test

import scala.collection.mutable.ArrayBuffer

object SparseArray {
    def main(args: Array[String]): Unit = {
        val cols = 11
        val raws = 11
        val chessMap = Array.ofDim[Int](cols, raws)
        
        chessMap(1)(2) = 1
        chessMap(2)(6) = 2
        chessMap(5)(3) = 1
        chessMap(8)(4) = 1
        chessMap(4)(5) = 2
        
        println("原始的棋盘")
        
        for (row <- chessMap) {
            for (item <- row) {
                printf("%d ", item)
            }
            //换行
            println()
        }
        
        // 用arraybuffer可以动态的添加数据
        val nodes: ArrayBuffer[Node] = new ArrayBuffer[Node]()
        
        // 数组的大小
        nodes.append(new Node(raws, cols, 0))
        
        for (i <- 0 until chessMap.length) {
            for (j <- 0 until chessMap(i).length) {
                if (chessMap(i)(j) != 0)
                    nodes.append(new Node(i, j, chessMap(i)(j)))
            }
        }
        println("稀疏数组情况是")
        
        for (i <- 0 until nodes.length) {
            val node: Node = nodes(i)
            println(node.row, node.col, node.value)
        }
        
        //将稀疏数组恢复成原始的棋盘
        // 从nodes中读取数组大小
        val node: Node = nodes(0)
        // 新建一个二维数组
        val chessmap2: Array[Array[Int]] = Array.ofDim[Int](node.row, node.col)
        
        for (i <- 1 until nodes.length) {
            val node = nodes(i)
            chessmap2(node.row)(node.col) = node.value
        }
        
        for (i <- chessmap2) {
            for (j <- i) {
                print(j + " ")
            }
            println()
        }
    }
}

// 用node表示一行数据
class Node(val row: Int, val col: Int, val value: Int)