package com.itbaizhan.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * 名称分隔符
 * 有盘符则为绝对路径
 * 不存在盘符则为相对路径
 */
public class TestPath {
    public static void main(String[] args) {
        String path=".";//表示当前工作路径，也就是项目的根目录
        //System.out.println(File.separatorChar);
        //1.构建File对象
        File file=new File(path);//构造对象
        File nf=new File("h:/test.txt");
        try {
            boolean flag=nf.createNewFile();
            System.out.println(flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getParent());//返回父路径
        String[] strs=file.list();
        System.out.println(Arrays.toString(strs));
        File f=new File(file,"dog.jfif");
        System.out.println("删除："+f.delete());
        String[] s=file.list();
        System.out.println(Arrays.toString(s));*/

        /*for(String str:strs){
            System.out.println(str);
        }*/
        /*System.out.println(file2.getAbsolutePath());
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());*/
        /*System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());*/
        //System.out.println(System.getProperty("user.dir"));
        //2.构造File对象
        /*File src=new File("C:/Users/34379/Pictures","dog.jfif");
        System.out.println(src.getName());
        //3
        File src1=new File(src,"dog");*/
        print("hello","world","你好");
    }
    public static void print(String...strs){
        for(String s:strs){
            System.out.println(s);
        }
    }
}
