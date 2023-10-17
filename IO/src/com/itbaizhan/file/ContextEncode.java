package com.itbaizhan.file;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ContextEncode {
    public static void main(String[] args) {
        String msg="责任m";//UTF-8一个中文字符3字节
        /*String letterA="我Amlm";
        byte[] bytesA=letterA.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytesA.length);
        System.out.println(Arrays.toString(bytesA));*/
        byte[] datas=msg.getBytes();//默认使用工程的字符集
        System.out.println(datas.length);
        //解码字符串
        String s=new String(datas,0, datas.length, StandardCharsets.UTF_8);
        System.out.println(s);
        //乱码
        //1)字节数不够
        //2)字符集不统一
        //编码成其他字符集
        /*datas=msg.getBytes(StandardCharsets.UTF_16);
        System.out.println(datas.length);*/
    }
}
