package com.itbaizhan.thread.state;

/**
 * 线程优先级1-10
 * NORM_PRIORITY 5默认
 * MIN_PRIORITY 1
 * MAX_PRIORITY 10
 */
public class TestPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        MyPriority mp=new MyPriority();
        Thread t0=new Thread(mp);
        Thread t1=new Thread(mp);
        Thread t2=new Thread(mp);
        Thread t3=new Thread(mp);
        Thread t4=new Thread(mp);
        t0.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}
