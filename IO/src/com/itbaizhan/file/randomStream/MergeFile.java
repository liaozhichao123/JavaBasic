package com.itbaizhan.file.randomStream;

import javax.print.DocFlavor;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

/**
 * 合并分割后的多个文件
 */
public class MergeFile {
    private String srcDir;//所有文件的所在目录
    private String destPath;//合并后文件的位置
    private File src;

    public MergeFile(String srcDir, String destPath) {
        this.srcDir = srcDir;
        this.destPath = destPath;
        src=new File(srcDir);
    }

    /**
     * 出bug了，原因是需要按序排列
     */
    public void mergeWithSequenceInputStream(){
        File[] files=src.listFiles();//得到所有文件
        //文件需要按序合并，不然会出问题
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                String name1=o1.getName();
                String name2=o2.getName();
                int num1=0,num2=0;
                num1=name1.charAt(1)=='-'? Integer.parseInt(name1.substring(0,1)):Integer.parseInt(name1.substring(0,2));
                num2=name2.charAt(1)=='-'? Integer.parseInt(name2.substring(0,1)):Integer.parseInt(name2.substring(0,2));
                return num1-num2;
            }
        });
        Vector<InputStream> vector=new Vector<>();
        SequenceInputStream sis=null;
        for (File f : files) {
            try{
                InputStream is=new FileInputStream(f);
                vector.add(is);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        sis=new SequenceInputStream(vector.elements());//百变为一个流的操作,会自动关闭所有包含的流
        try(FileOutputStream fos=new FileOutputStream(destPath,true);) {
            byte[] buffer=new byte[1024*8];
            int len=-1;
            while((len= sis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void merge(){
        File[] files=src.listFiles();//得到所有文件
        //文件需要按序合并，不然会出问题
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                String name1=o1.getName();
                String name2=o2.getName();
                int num1=0,num2=0;
                num1=name1.charAt(1)=='-'? Integer.parseInt(name1.substring(0,1)):Integer.parseInt(name1.substring(0,2));
                num2=name2.charAt(1)=='-'? Integer.parseInt(name2.substring(0,1)):Integer.parseInt(name2.substring(0,2));
                return num1-num2;
            }
        });
        try(FileOutputStream fos=new FileOutputStream(destPath,true);) {
            byte[] buffer = new byte[1024];
            for (File f : files) {
                System.out.println(f.getName());
                try (FileInputStream fis = new FileInputStream(f)) {
                    int len = -1;
                    while ((len = fis.read(buffer)) != -1) {
                        fos.write(buffer,0,len);
                        fos.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MergeFile mergeFile=new MergeFile("dest","merge.jpeg");
        mergeFile.mergeWithSequenceInputStream();
    }
}
