package com.itbaizhan.thread.state;

/**
 * 测试 yield,从运行态转入就绪状态
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield my=new MyYield();
        new Thread(my,"t1").start();
        new Thread(my,"t2").start();
        //new Thread(my,"t3").start();
    }
}
class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->start");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"-->end");
    }
}
