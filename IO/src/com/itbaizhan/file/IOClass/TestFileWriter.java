package com.itbaizhan.file.IOClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 测试字符输出流
 */
public class TestFileWriter {
    public static void main(String[] args) {
        File dest=new File("dest.txt");
        try(Writer fw=new FileWriter(dest,true)){
            String str="I am 新时代好青年";
            char[] data=str.toCharArray();
            fw.write(str+"555\r\n");
            fw.write(data);
            fw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
