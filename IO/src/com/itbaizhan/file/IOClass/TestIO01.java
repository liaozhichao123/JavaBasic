package com.itbaizhan.file.IOClass;

import java.io.*;

/***
 * 1.创建源
 */
public class TestIO01 {
    public static void main(String[] args) throws IOException {
        //1 创建源
        File src=new File("test.txt");
        //2.创建流
        InputStream is=new FileInputStream(src);
        //3.操作(读取)
        int data1=is.read();
        int data2=is.read();
        int data3=is.read();
        int data4=is.read();
        System.out.println((char)data1);
        System.out.println((char)data2);
        System.out.println((char)data3);
        System.out.println((char)data4);//没有字符了
        is.close();

    }
}
