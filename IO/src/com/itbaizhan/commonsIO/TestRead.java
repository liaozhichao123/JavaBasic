package com.itbaizhan.commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestRead {
    public static void main(String[] args) {
        test2();
    }
    public static void test(){
        //读取文件
        try {
            String msg= FileUtils.readFileToString(new File("test.txt"),"UTF-8");
            byte[] datas=FileUtils.readFileToByteArray(new File("test.txt"));
            System.out.println(datas.length);
            //System.out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test2(){
        try {
            List<String> list=FileUtils.readLines(new File("test.txt"),"UTF-8");
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test03(){

    }
}
