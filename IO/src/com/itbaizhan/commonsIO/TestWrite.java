package com.itbaizhan.commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TestWrite {
    public static void main(String[] args) {
        //test();
        testCopy();
    }
    public static void testCopy(){
        try {
            //拷贝文件到文件
            //FileUtils.copyFile(new File("merge.jpeg"),new File("m-copy.jpeg"));
            //拷贝文件到目录
            //FileUtils.copyFileToDirectory(new File("merge.jpeg"),new File("src"));
            //拷贝目录到目录.(拷贝到指定目录的下面
            //FileUtils.copyDirectoryToDirectory(new File("lib"),new File("lib2"));
            //FileUtils.copyDirectory(new File("lib"),new File("lib2"));
            //拷贝URL的内容
            String path="https://t7.baidu.com/it/u=1595072465,3644073269&fm=193&f=GIF";
            FileUtils.copyURLToFile(new URL(path),new File("marvel.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test(){
        File dest=new File("dest.txt");
        String str="hello 新时代新青年！\n";
        try {
            FileUtils.writeStringToFile(dest,str,"UTF-8");
            FileUtils.writeStringToFile(dest,str,"UTF-8",true);
            FileUtils.writeByteArrayToFile(dest,str.getBytes(StandardCharsets.UTF_8),true);
            //写出列表
            List<String>list=new ArrayList<>();
            list.add("马云");
            list.add("马化腾");
            list.add("王健林");
            FileUtils.writeLines(dest,list,"...",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}