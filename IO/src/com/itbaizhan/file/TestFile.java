package com.itbaizhan.file;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        /*File file=new File("sr");
        System.out.println(file.exists());
        System.out.println(file.length());//length()返回文件的字符数，文件夹的时候返回0
        lengthOfDir(file);
        System.out.println(sum);*/
        //使用面向对象方法
        String path="src";
        DirCount d=new DirCount(path);
        System.out.println(d.lengthOfDirectory());
        System.out.println(d.getDirSize());
        System.out.println(d.getFileSize());
    }

}
class DirCount{
    private String path;
    private File src;
    private long len=0;
    private int fileSize;
    private int dirSize;
    public DirCount(String path){
        this.path=path;
        this.src=new File(path);
        this.len=0;
        this.dirSize=0;
        this.fileSize=0;
    }
    public long lengthOfDirectory(){
        count(this.src);
        return len;
    }
    private void count(File file){
        if(file==null||!file.exists())return ;
        if(file.isFile()) {
            len+=file.length();
            this.fileSize++;
            return ;//统计到文件，返回
        }
        this.dirSize++;
        for(File f:file.listFiles()){
            count(f);
        }
    }
    //返回文件数目
    public int getFileSize() {
        this.fileSize=0;
        this.dirSize=-1;
        count(src);
        return fileSize;
    }

    public int getDirSize() {
        this.fileSize=0;
        this.dirSize=-1;
        count(src);
        return dirSize;
    }
}