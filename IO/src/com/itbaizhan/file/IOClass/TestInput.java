package com.itbaizhan.file.IOClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 使用缓冲容器
 */
public class TestInput {
    public static void main(String[] args) {
        File src=new File("test.txt");
        try(InputStream is=new FileInputStream(src)){//可以自动关闭try中打开的资源
            byte[] flush=new byte[1024];
            int len=-1;//接收长度
            while((len=is.read(flush))!=-1){
                //字节数组到字符串
                String str=new String(flush,0,len);
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
