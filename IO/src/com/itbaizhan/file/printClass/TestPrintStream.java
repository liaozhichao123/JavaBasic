package com.itbaizhan.file.printClass;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) {
        //test();
        //testOutputFile();
        redirect();
    }
    public static void test(){
        PrintStream ps=System.out;
        ps.println("打印流");
        ps.println(true);
        //重定向输出端
    }
    public static void testOutputFile(){
        try(PrintStream ps=new PrintStream("ps.txt");){
            ps.println("打印流");
            ps.println(120.152);
            ps.println(true);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void redirect(){
        //重定向输出端
        try(PrintStream ps=new PrintStream("ps.txt");){
            //重定向输出端到ps.txt
            PrintStream originalOut=System.out;
            System.setOut(ps);
            System.out.println("新时代好青年，拥护党的领导");
            System.out.println(1314);
            System.out.print(true);
            //重定向回控制台
            //method01
            /*System.setOut(originalOut);
            System.out.println("我回来了");*/
            //method02
            PrintStream temp=new PrintStream(new FileOutputStream(FileDescriptor.out));
            System.setOut(temp);
            System.out.println("i am back");
            System.out.println(System.out.getClass());
            System.out.println(temp.getClass());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
