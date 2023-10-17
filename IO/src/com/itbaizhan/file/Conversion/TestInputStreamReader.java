package com.itbaizhan.file.Conversion;

import java.io.*;

/**
 * 以字符流的形式操作字节流
 */
public class TestInputStreamReader {
    public static void main(String[] args) {
        //操作System.in和System.out
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            //循环读取键盘的输入，遇到exit退出
            String msg="";
            while(!msg.equals("exit")){
                msg= reader.readLine();
                writer.write(msg);
                writer.newLine();
                writer.flush();//强制刷新
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
