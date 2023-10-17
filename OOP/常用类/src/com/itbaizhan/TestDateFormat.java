package com.itbaizhan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //字符串转日期
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//定义format
        String str="2049-10-1 10:10:10";
        Date guoqing =format.parse(str);
        System.out.println(guoqing.getTime());
        //日期转字符串
        DateFormat format1=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date2=new Date(982301142389L);
        String date2Str=format1.format(date2);
        System.out.println(date2Str);
        //小妙招
        Date now=new Date();
        DateFormat f1=new SimpleDateFormat("今年第D天，第w周");
        String str3=f1.format(now);
        System.out.println(str3);
    }
}
