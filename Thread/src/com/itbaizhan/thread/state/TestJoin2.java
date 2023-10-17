package com.itbaizhan.thread.state;

public class TestJoin2 {
    public static void main(String[] args) {
        System.out.println("爸爸和儿子买烟的故事");
        System.out.println("-----------------------------");
        new Thread(new Father()).start();
    }
}
class Father implements Runnable{
    @Override
    public void run() {
        System.out.println("想抽烟，发现烟没了");
        System.out.println("让儿子去买中华");
        Thread t=new Thread(new Son());
        t.start();
        try {
            t.join();//father被阻塞了
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("儿子走丢了");
        }
        System.out.println("老爸接过烟，抽起了中华");
    }
}
class Son implements Runnable{
    @Override
    public void run() {
        System.out.println("接过老爸的钱出去了。。。");
        System.out.println("路边有个游戏厅玩了10s");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+1+"秒过去了");
        }
        System.out.println("买到中华回家了");
    }
}