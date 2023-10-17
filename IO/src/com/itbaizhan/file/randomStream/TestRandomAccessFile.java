package com.itbaizhan.file.randomStream;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        try(RandomAccessFile raf=new RandomAccessFile("test.txt","r");){
            //随机读取
            raf.seek(2);
            System.out.println((char)raf.readByte());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
