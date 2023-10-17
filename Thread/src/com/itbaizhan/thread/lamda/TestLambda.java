package com.itbaizhan.thread.lamda;

/**
 * Lambda表达式，简化线程的使用（用一次）
 */
public class TestLambda {
    //内部类
//    static class Test implements Runnable{
//        @Override
//        public void run() {
//            for(int i=0;i<20;i++){
//                System.out.println("一边听歌...");
//            }
//        }
//    }

    public static void main(String[] args) {
        //局部内部类
//        class Test implements Runnable{
//            @Override
//            public void run() {
//                System.out.println("一边听歌...");
//            }
//        }
//        new Thread(new Test()).start();
        //匿名内部类,借助接口或者父类实现
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<20;i++){
//                    System.out.println("一边听歌...");
//                }
//            }
//        }).start();
        //jdk8之后使用lambda表达式
        new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println("一边听歌..."+i);
            }
        }).start();
    }
}
