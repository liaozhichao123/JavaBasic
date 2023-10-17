package com.itbaizhan.file.randomStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class SplitFile {
    //源头
    private File src;
    //目的地（文件夹）
    private String destDir;
    //所有分割后的文件存储路径
    private List<String>destPaths;
    //每块大小
    private int blockSize;
    //块数:多少块
    private int count;
    public SplitFile(File src,String destDir,int blockSize){
        this.src=src;
        this.destDir=destDir;
        this.blockSize=blockSize;
        this.init();
    }
    private void init(){
        //创建文件夹
        File f=new File(destDir);
        f.mkdirs();
        long len=src.length();//文件长度
        this.count=(int)Math.ceil(1.0*len/blockSize);//文件块数
        destPaths=new ArrayList<String>();
        for(int i=0;i<len;i++){
            destPaths.add(destDir+"/"+i+"-"+src.getName());
        }
    }

    /**
     * 计算每一块的起始位置
     */
    public void split(){
        //分割文件
        try(RandomAccessFile raf=new RandomAccessFile(src,"r");){
            byte[]buffer=new byte[blockSize];
            int begin=0;
            for(int i=0;i<count-1;i++){
                raf.seek(begin);
                begin+=blockSize;
                raf.read(buffer);
                //try-with-resource可以嵌套
                try(RandomAccessFile writer=new RandomAccessFile(destPaths.get(i),"rw");) {
                    writer.write(buffer);
                }
            }
            raf.seek(begin);
            int len=raf.read(buffer);
            try(RandomAccessFile writer=new RandomAccessFile(destPaths.get(count-1),"rw");) {
                writer.write(buffer, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String srcPath="copy.jpeg";
        String destPath="dest";
        SplitFile sf=new SplitFile(new File(srcPath),destPath,1024*10);
        sf.split();
    }
}
