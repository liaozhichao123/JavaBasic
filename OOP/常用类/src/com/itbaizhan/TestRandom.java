package com.itbaizhan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * 判断输入年月份是当年的第几天
 */
public class TestRandom {
    public static void main(String[] args) throws ParseException {
        /*SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        Date date=format.parse(str);
        SimpleDateFormat format2=new SimpleDateFormat("今年的第D天第w周");
        String result=format2.format(date);
        System.out.println(result);*/
        Random rand=new Random();
        System.out.println(rand.nextInt(20));


    }
}
