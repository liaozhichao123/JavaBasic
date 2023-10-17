package com.itbaizhan.collection;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        System.out.println(set.contains("apple"));
        System.out.println(set);
        set.remove("cherry");
        System.out.println(set);
    }
}
