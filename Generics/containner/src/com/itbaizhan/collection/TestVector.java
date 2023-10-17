package com.itbaizhan.collection;

import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<10;i++){
            v.add(i);
        }
        System.out.println(v);
        for(int i=9;i>5;i--){
            v.remove(i);
        }
        System.out.println(v);
    }
}
