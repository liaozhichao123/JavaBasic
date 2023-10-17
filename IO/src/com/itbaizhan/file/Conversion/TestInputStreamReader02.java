package com.itbaizhan.file.Conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TestInputStreamReader02 {
    public static void main(String[] args) {
        try(BufferedReader is=
                new BufferedReader(
                    new InputStreamReader(
                            new URL("https://www.matools.com/api/java8").openStream(),"UTF-8"))){
            String msg;
            while((msg=is.readLine())!=null){
                System.out.println(msg);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
