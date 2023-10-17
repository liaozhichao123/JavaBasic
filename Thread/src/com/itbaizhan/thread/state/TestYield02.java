package com.itbaizhan.thread.state;

public class TestYield02 {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        },"t1").start();
        for(int i=0;i<100;i++){
            if(i%20==0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
