package com.itbaizhan;

/**
 * java.util.Date
 */
public class TestStringTrap {
    public static void main(String[] args) {
        String s="";
        long num1=Runtime.getRuntime().freeMemory();//获取系统剩余空间
        long time1=System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            s=s+i;
        }
        long num2=Runtime.getRuntime().freeMemory();//获取系统剩余空间
        long time2=System.currentTimeMillis();
        System.out.println("String占用内存"+(num1-num2));
        System.out.println("String占用时间"+(time2-time1));
        StringBuilder sb=new StringBuilder("");
        long num3=Runtime.getRuntime().freeMemory();//获取系统剩余空间
        long time3=System.currentTimeMillis();
        for(int i=0;i<5000;i++){
            sb.append(i);
        }
        long num4=Runtime.getRuntime().freeMemory();//获取系统剩余空间
        long time4=System.currentTimeMillis();
        System.out.println("StringBuilder占用内存"+(num3-num4));
        System.out.println("StringBuilder占用时间"+(time4-time3));

    }
}
