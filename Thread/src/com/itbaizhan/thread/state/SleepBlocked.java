package com.itbaizhan.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepBlocked {
    public static void main(String[] args) {
        //倒计时10s,1s一个
        test02();
    }
    public static void test02(){
        //倒计时
        //Date date=new Date(System.currentTimeMillis()+10*1000);
        SimpleDateFormat f=new SimpleDateFormat("yy-MM-dd hh-mm-ss");
        int i=0;
        while(true){
            System.out.println(f.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //date=new Date(date.getTime()-1000);
            if(i==9) break;
            i++;
        }
    }
    public static void test(){
        int i=10;
        while(true){
            if(i==0) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+i--);
        }
    }
}
