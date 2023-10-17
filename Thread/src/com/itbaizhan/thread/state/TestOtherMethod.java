package com.itbaizhan.thread.state;

public class TestOtherMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isAlive());
        Thread t=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t.setName("战斗机");
        t.start();
    }

}
