package com.itbaizhan.thread.state;

public class AllState {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            for(int i=0;i<20;i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread.State state=t.getState();//NEW
        System.out.println(state);
        t.start();
        state=t.getState();
        System.out.println(state);//Runnable
        while(true){

            System.out.println(Thread.activeCount());
            if(Thread.activeCount()<=2) break;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state=t.getState();
            System.out.println(state);
        }
        System.out.println("-------------------");
        System.out.println(Thread.activeCount());
    }
}
