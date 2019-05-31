package com.atguigu.bigdata.datastruct.ques

object hanoiTower {
    def main(args: Array[String]): Unit = {
        hanoiTower(2,'A','B','C')
    }
    
    def hanoiTower(nums:Int, a:Char,b:Char,c:Char): Unit = {
        if(nums == 1) {
            println("第1个盘从" + a + "->" + c)
        } else {
            hanoiTower(nums-1, a,c,b) // 将nums-1个盘，从 a->b, 中间借助 c
            println("第"+nums+"个盘从" + a + "->" + c)
            hanoiTower(nums-1, b,a,c) // 将nums-1个盘，从 b->c, 中间借助 a
        }
    }
}
