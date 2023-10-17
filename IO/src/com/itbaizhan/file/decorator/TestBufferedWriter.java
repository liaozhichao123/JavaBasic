package com.itbaizhan.file.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
    public static void main(String[] args) {
        String dest="dest.txt";
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(dest,true))){
            bw.write("新时代好青年yes!");
            bw.newLine();
            bw.write("牛牛牛");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
