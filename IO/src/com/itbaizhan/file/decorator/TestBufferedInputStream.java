package com.itbaizhan.file.decorator;

import java.io.*;

/**
 *
 */
public class TestBufferedInputStream {
    public static void main(String[] args) {
        String src="E:/Google downloads/VMware-workstation-full-17.0.0-20800274.exe";
        String dest="F:/copyOfVMware";
        long t1=System.currentTimeMillis();
        bufferedCopy(src,dest);//速度提升了三倍
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);
    }
    public static void bufferedCopy(String src ,String dest){
        try(InputStream is=new BufferedInputStream(new FileInputStream(src));
            OutputStream os=new BufferedOutputStream(new FileOutputStream(dest))
        ){
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);//
            }
            os.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void copy(String src,String dest){
        try(InputStream is=new FileInputStream(src);
            OutputStream os=new FileOutputStream(dest)
        ){
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);//
            }
            os.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
