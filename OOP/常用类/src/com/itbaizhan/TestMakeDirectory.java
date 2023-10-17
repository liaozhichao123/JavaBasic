package com.itbaizhan;

import java.io.File;

public class TestMakeDirectory {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File f=new File("TestDirectory");
        boolean flag=f.mkdir();
        System.out.println(flag);
        File f1=new File("f:/电影/刘德华");
        System.out.println(f1.mkdirs());

    }
}
