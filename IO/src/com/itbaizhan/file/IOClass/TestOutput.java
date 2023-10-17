package com.itbaizhan.file.IOClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutput {
    public static void main(String[] args) {
        //1.创建源
        File des=new File("dest.txt");
        //des.createNewFile();
        try(OutputStream os=new FileOutputStream(des,true)){
            //3.操作
            String mes="IO is 好 easy \n";
            byte[] datas=mes.getBytes();//字符串到字符编码
            os.write(datas,0, datas.length);
            os.write('l');
            os.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
