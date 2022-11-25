package com.ouy.heap;

import java.util.ArrayList;

/**
 * 测试堆内存溢出
 *
 * @author 当当
 * @date 2022/11/25
 */
public class VisualVM {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            arrayList.add(new Student());
        }
        Thread.sleep(30000);
        arrayList=null;
        System.out.println("3......");
        Thread.sleep(10000000L);
    }





}

class Student {
        private  byte[] bytes = new byte[1024 * 1024];

}
