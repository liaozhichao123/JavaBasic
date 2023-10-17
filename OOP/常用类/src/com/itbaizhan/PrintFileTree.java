package com.itbaizhan;

import java.io.File;

/**
 * 打印目录树
 */
public class PrintFileTree {
    public static void main(String[] args) {
        File f=new File("F:\\Java_code\\OOP");
        printFile(f,0);
    }
    static void printFile(File file , int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();//列出所有子文件子目录
            for(File temp:files){
                printFile(temp,level+1);
            }
        }
    }
}
