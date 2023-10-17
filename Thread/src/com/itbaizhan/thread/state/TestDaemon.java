package com.itbaizhan.thread.state;

/**
 * 守护线程：是为用户线程服务的，JVM停止不用等待守护线程执行完毕
 *jvm等待用户进程执行完毕后才会停止
 */
public class TestDaemon {
    public static void main(String[] args) {
        God god=new God();
        People p=new People();
        Thread t=new Thread(god);
        t.setDaemon(true);//将用户线程设置为守护线程
        t.start();
        new Thread(p).start();
        System.out.println("main线程休眠");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main线程结束");
    }
}
class People implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=365;i++){
            System.out.println("happy life...");
        }
        System.out.println("oooo...");
    }
}
class God implements Runnable{
    @Override
    public void run() {
        for(;true;){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("bless you");
        }
    }
}