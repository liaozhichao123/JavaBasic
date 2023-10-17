package com.itbaizhan.file.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符缓冲流
 */
public class TestBufferedReader {
    public static void main(String[] args) {
        String src="test.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(src))){
            String line=null;
            while((line=br.readLine())!=null){//readLine读取一行文本
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
