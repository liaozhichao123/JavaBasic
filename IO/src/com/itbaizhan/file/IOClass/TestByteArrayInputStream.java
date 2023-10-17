package com.itbaizhan.file.IOClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 1、创建源:字节数组，不要太大
 * 2、选择流
 * 3、操作
 * ByteArrayInputStream作用
 * 1.数据转换，将字节数组转换为输入流，以便使用输入流的方法读取数据
 *
 */
public class TestByteArrayInputStream {
    public static void main(String[] args) {
        //1、创建源
        byte[] src="talk is cheap show me the code".getBytes();//作为测试
        System.out.println(Arrays.toString(src));
        InputStream is=new ByteArrayInputStream(src);//创建的时候不会报异常
        byte []buffer=new byte[10];//读取容器
        int len=-1;
        while(true){
            try {
                if (!((len=is.read(buffer))!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print(new String(buffer));
        }

    }
}
