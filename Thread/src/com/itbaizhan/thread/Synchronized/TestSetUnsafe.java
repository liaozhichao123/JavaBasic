package com.itbaizhan.thread.Synchronized;

import java.util.ArrayList;

/**
 * 容器不安全
 */
public class TestSetUnsafe {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<100;i++){
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(list.size());
    }
}
