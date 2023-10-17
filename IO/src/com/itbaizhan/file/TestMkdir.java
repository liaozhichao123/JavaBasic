package com.itbaizhan.file;

import java.io.File;

/**
 * File获得访问文件系统的句柄
 * 创建文件createNewFile()
 * 创建目录mkdir(),mkdirs()//创建多级目录
 */
public class TestMkdir {
    public static void main(String[] args) {
        //创建目录
        File file=new File("f:/");//表示当前目录
        //System.out.println(file.mkdirs());
        String[] subNames=file.list();
        for(String temp:subNames){
            System.out.println(temp);
        }
        /*File[] roots= File.listRoots();
        for(File f:roots){
            System.out.println(f.getAbsolutePath());
        }*/
    }
}
