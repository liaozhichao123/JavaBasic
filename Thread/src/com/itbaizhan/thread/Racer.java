package com.itbaizhan.thread;

/**
 * 模拟龟兔赛跑
 */
public class Racer implements Runnable {
    private static String winner;//胜利者
    @Override
    public void run() {
        for(int step=1;step<=100;step++){
            if(gameOver(step))break;
            if(Thread.currentThread().getName().equals("rabbit")&&step%10==0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+step);

        }
    }
    private boolean gameOver(int step){
        if(winner!=null){
            return true;
        }else if(step==100){
            winner=Thread.currentThread().getName();
            System.out.println("winner="+winner);
        }
        return false;
    }

    public static void main(String[] args) {
        Racer racer=new Racer();
        new Thread(racer,"rabbit").start();
        new Thread(racer,"tortoise").start();
    }
}
/*
*
* */