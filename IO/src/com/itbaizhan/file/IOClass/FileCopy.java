package com.itbaizhan.file.IOClass;

import java.io.*;

/**
 * 使用文件输入输出达到文件拷贝
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcPath="C:\\Users\\34379\\Pictures\\839885a7bbf1d613782a1574fdb72c14.jpeg";
        String destPath="copy.jpeg";
        dirCopy("F:\\python code",".");
    }

    /**
     *拷贝该文件夹下所有文件
     */
    public static void dirCopy(String srcPath,String destPath){
        File src=new File(srcPath);
        if(src==null||!src.exists()){
            return;
        }
        if(src.isFile()){
            fileCopy(srcPath, destPath+File.separatorChar+src.getName());
            return;
        }
        //是目录
        String temp=destPath+File.separatorChar+src.getName();
        File dest=new File(temp);
        dest.mkdir();
        for(String s: src.list()){
            dirCopy(srcPath+File.separatorChar+s,temp);
        }
    }
    public static void fileCopy(String srcPath,String destPath){
        File src=new File(srcPath);
        File dest=new File(destPath);
        try(InputStream is=new FileInputStream(src);
            OutputStream os=new FileOutputStream(dest);
        ){
            byte[] buffer=new byte[1024];
            int len=-1;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
                /*String str=new String(buffer,0,len);
                System.out.println(str);*/
                os.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
