package com.itbaizhan.file.Data;

import java.io.*;
import java.util.Arrays;

public class TestDataOutputStream {
    public static void main(String[] args) {
        //test1();
        test2();
    }
    public static void test1(){
        double [] a={1,2,3,4,5,8,9,10};
        try(FileWriter writer=new FileWriter("dest.txt")){
            /*String temp=Arrays.toString(a);
            writer.write(temp.substring(1,temp.length()-1));
            System.out.println(temp.length());*/
            for(int i=0;i<a.length;i++){
                writer.write(Double .toString(a[i]));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void test2(){
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(baos);//可以通过这种方法获得某一数据所占的字节数，转为字节数组
        try {
            //dos.writeDouble(89.34);
            //dos.writeBoolean(true);
            dos.writeUTF("你好啊中国");
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] b= baos.toByteArray();
        System.out.println(b.length);
        ByteArrayInputStream bais=new ByteArrayInputStream(b);
        /*System.out.println(b.length);
        int temp=-1;
        while((temp=bais.read())!=-1){
            System.out.println((char)temp);
        }*/
        DataInputStream dis=new DataInputStream(bais);
        /*try {
            System.out.println(dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
