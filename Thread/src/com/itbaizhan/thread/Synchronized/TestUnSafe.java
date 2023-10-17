package com.itbaizhan.thread.Synchronized;

/**
 * 线程不安全
 */

public class TestUnSafe implements Runnable{
    //票数
    private int ticketNums=10;
    @Override
    public void run() {
        while(true){
            if(ticketNums<=0){
                break;
            }
            try {
                Thread.sleep(200);//模拟网络延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+(ticketNums--));
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        //一份资源
        TestUnSafe web=new TestUnSafe();
        //多个代理（黄牛）
        new Thread(web,"马处").start();
        new Thread(web,"码农").start();
        new Thread(web,"蚂蟥").start();
    }
}
