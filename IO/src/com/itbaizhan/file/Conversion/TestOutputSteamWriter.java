package com.itbaizhan.file.Conversion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 */
public class TestOutputSteamWriter {
    public static void main(String[] args) {
        try(FileOutputStream fo=new FileOutputStream("dest.txt");
            OutputStreamWriter writer=new OutputStreamWriter(fo,"utf-8")
        ){
            writer.write("六六六");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
