package com.itbaizhan.thread.state;

/**
 * join是普通方法不是静态方法
 *
 */
public class TestJoin {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
           for(int i=0;i<100;i++){
               System.out.println(Thread.currentThread().getName()+" "+i);
           }
        });
        t.start();
        for(int i=0;i<100;i++){
            if(i==30){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
