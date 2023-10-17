package com.itbaizhan.commonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.util.Collection;

public class TestCommonsIo {
    public static void main(String[] args) {
        //文件大小
//        long len= FileUtils.sizeOf(new File("lib"));
//        System.out.println(len);
        /*Collection<File> files=FileUtils.listFiles(new File("."),
                EmptyFileFilter.NOT_EMPTY,null);
        for(File f:files){
            //System.out.println(f);
        }
        System.out.println("-----------------------------------------------------------");
        Collection<File> files1=FileUtils.listFiles(new File("."),
                new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
        for(File f:files1){
            System.out.println(f.getName());
        }*/
        test();
    }
    public static void test(){
        String[] extensions={"txt"};
        Collection<File> files=FileUtils.listFiles(new File("."),extensions,
                true);
        for(File f:files){
            System.out.println(f.getName());
        }
    }
    public static void test2(){

    }
}
