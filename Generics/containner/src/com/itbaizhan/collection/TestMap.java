package com.itbaizhan.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap
 * key不能重复，如果重复，则value覆盖
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();
        m1.put("one",1);
        m1.put("two",2);
        m1.put("three",3);
        System.out.println(m1.get("two"));
        System.out.println(m1.containsKey("three"));
        System.out.println(m1.containsValue(2));
        Map<String,Integer> m2=new HashMap<>();
        m2.put("四",4);
        m2.put("五",5);
        m1.putAll(m2);
        System.out.println(m1);
        m1.put("one",0);
        System.out.println(m1);
        System.out.println(m1.containsKey("three"));
        String key="one";
        m1.put(key,m1.get(key)+10);
        m1.replace(key,m1.get(key)+10);
        System.out.println(m1);
        for(String s:m1.keySet()){
            System.out.println(s);
        }
    }
}
