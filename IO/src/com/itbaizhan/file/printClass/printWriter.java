package com.itbaizhan.file.printClass;

import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        try(PrintWriter pw=new PrintWriter("pw.txt");){
            pw.println(123);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
