package com.itbaizhan.file.test;

import java.util.Arrays;

public class TestChatArray {
    public static void main(String[] args) {
        char[] ar=new char[5];
        ar[0]='中';
        ar[1]='a';
        String s="中a";
        System.out.println(Arrays.toString(ar ));
        System.out.println(s);
        System.out.println(s.length());
    }
}
