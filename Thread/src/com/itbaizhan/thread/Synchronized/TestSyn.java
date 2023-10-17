package com.itbaizhan.thread.Synchronized;

public class TestSyn implements Runnable{
    private int ticketNums=10;//票数
    public  void buy(){
        while(ticketNums>0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticketNums);
            ticketNums--;
        }
    }
    @Override
    public void run() {
         buy();
    }

    public static void main(String[] args) {
        TestSyn testSyn=new TestSyn();
        new Thread(testSyn,"张三").start();
        new Thread(testSyn,"李四").start();
        new Thread(testSyn,"王五").start();
    }
}
