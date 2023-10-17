package com.itbaizhan;

import java.util.Date;

/**
 * 测试Date类
 */
public class TestDate {
    public static void main(String[] args) {
        long nowNum=System.currentTimeMillis();
        System.out.println(nowNum);
        Date date1=new Date(100000);
        System.out.println(date1);
        System.out.println(date1.getTime());
        Date date2=new Date(-21L*365*24*3600*1000);
        System.out.println(date2);
        System.out.println(date2.equals(date1));
        System.out.println(date2.before(date1));
    }
}
