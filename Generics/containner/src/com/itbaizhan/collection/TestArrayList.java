package com.itbaizhan.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 测试collection的用法
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> c= new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add(2);
        c.add(5);
        c.add(1);
        System.out.println(c);
        Collections.sort((List)c);
        System.out.println(c);
        System.out.println(c.contains(1));
        //size()方法
        //toArray方法
        Integer []objs=c.toArray(new Integer[0]);//toArray方法有重载
        System.out.println(objs);

    }
}
