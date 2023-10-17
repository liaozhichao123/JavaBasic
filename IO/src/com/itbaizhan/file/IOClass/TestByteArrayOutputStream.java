package com.itbaizhan.file.IOClass;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/**
 * 字节数组输出流
 * ByteArrayOutputStream 非常适合在内存中动态构建字节数组。可以将多个字节数据逐渐写入ByteArrayOutputSteam,最后将其
 * 转换为字节数组，这对于构建HTTP响应，序列化对象很有用.但当数据量很大时，应谨慎处理内存消耗问题。处理大量数据时使用FileOutputStreasm
 */
public class TestByteArrayOutputStream {
    public static void main(String[] args) {
        /*ByteArrayOutputStream os=new ByteArrayOutputStream();
        try {
            os.write(65);
            os.write("新时代好青年".getBytes());
            byte[] array=os.toByteArray();
            System.out.println(Arrays.toString(array));
            System.out.println(new String(array));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        byteArrayToPhoto(photoToByteArray("copy.jpeg"),"copy2.jpeg");
    }
    //读取图片转为字节数组
    public static ByteArrayOutputStream photoToByteArray(String path){
        //创建流
        File file=new File(path);
        try(InputStream is=new FileInputStream(file)){
            ByteArrayOutputStream os=new ByteArrayOutputStream();
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            return os;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void byteArrayToPhoto(ByteArrayOutputStream baos,String path){
        try(OutputStream os=new FileOutputStream(path)){
            os.write(baos.toByteArray());
            os.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
