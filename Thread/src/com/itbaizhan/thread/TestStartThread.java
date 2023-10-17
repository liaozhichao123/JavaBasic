package com.itbaizhan.thread;

/**
 * 创建线程方式一：继承Thread,重写run方法
 */
public class TestStartThread extends Thread{
    /**
     * 线程入口处，线程体
     */
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }
    //主线程
    public static void main(String[] args) {
        //创建子类对象
        TestStartThread st=new TestStartThread();
        //启动
        st.start();//不保证立即调用。交给cpu调度
        for(int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
