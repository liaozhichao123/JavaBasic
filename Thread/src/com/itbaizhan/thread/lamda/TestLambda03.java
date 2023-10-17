package com.itbaizhan.thread.lamda;

public class TestLambda03 {

    public static void main(String[] args) {
        Lovable l=(a,b)->{
            System.out.println("i love u");
            return a+b;
        };
        System.out.println(l.love(20,30));

    }
}
interface Lovable{
    int love(int a,int b);
}
