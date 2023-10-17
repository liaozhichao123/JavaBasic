package com.itbaizhan.collection;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Alice",25);
        map.put("Bob", 20);
        map.put("Charlie", 30);
        map.remove("Alice");
        System.out.println(map.get("Bob"));
        for(String s:map.keySet()){
            System.out.println(s+" "+map.get(s));
        }
    }
}
