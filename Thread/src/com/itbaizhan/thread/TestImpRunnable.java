package com.itbaizhan.thread;

/**
 * 测试创建线程2,实现Runnable接口
 * 推荐使用接口，从而避免单继承的局限性，方便共享资源
 */
public class TestImpRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        TestImpRunnable ir=new TestImpRunnable();
        //创建代理类对象
        new Thread(new TestImpRunnable()).start();//使用匿名,启动
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
