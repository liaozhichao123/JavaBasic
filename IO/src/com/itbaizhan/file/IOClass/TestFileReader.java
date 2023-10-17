package com.itbaizhan.file.IOClass;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class TestFileReader {
    public static void main(String[] args) {
        File src=new File("test.txt");
        try(Reader fr=new FileReader(src)){
            char[]buffer=new char[1];
            int len=-1;
            while((len=fr.read(buffer))!=-1){
                System.out.print(new String(buffer,0,len));
            }
//            int temp;
//            while((temp=fr.read())!=-1){
//                System.out.println(temp);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
