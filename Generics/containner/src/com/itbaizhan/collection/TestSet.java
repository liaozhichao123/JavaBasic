package com.itbaizhan.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * set没有顺序，不可重复
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set1= new HashSet<>();
        set1.add("aa");
        set1.add("bb");
        set1.add("cctv");
        System.out.println(set1);
        set1.remove("bb");
        System.out.println(set1);
        Set<String> set2=new HashSet<>();
        set2.add("gaoqi");
        set2.add("cctv");
        set2.removeAll(set1);
        System.out.println(set2);

    }

}
