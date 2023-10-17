package com.itbaizhan.file.IOClass;

import java.io.*;

/**
 * 1创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class TestIO02 {
    public static void main(String[] args) {
        File src=new File("test.txt");
        InputStream is=null;
        try{
            is=new FileInputStream(src);
            int temp;
            while((temp=is.read())!=-1){
                System.out.println((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is!=null)//is有才去通知操作系统去释放
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
