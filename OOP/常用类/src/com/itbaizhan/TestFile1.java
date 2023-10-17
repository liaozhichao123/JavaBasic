package com.itbaizhan;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.util.Date;

/**
 * 创建文件
 */
public class TestFile1 {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));//获得当前项目路径
        File f=new File("a.txt");//相对路径，放到user.dir目录下面
        f.createNewFile();
        File f2=new File("f:/java_code/oop/b.txt");
        f2.createNewFile();
        f2.delete();
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
    }
}
