package com.itbaizhan.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 测试Collection中的方法
 */
public class TestList {
    public static void main(String[] args) {
        test03();
    }
    public static void test01(){

    }
    public static void test02(){
        List<String>list01 =new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println("list01:"+list01);
        List<String> list02=new ArrayList<>();
        list02.add("aa");
        list02.add("dd");
        list02.add("ee");
        System.out.println("list01:"+list02);
//        list01.addAll(list02);
//        list01.removeAll(list02);
        list01.retainAll(list02);//取交集
        System.out.println("list01:"+list01);
        System.out.println(list02.containsAll(list01));//是否包含所有元素
    }

    /**
     * 测试与索引相关的方法
     */
    public static void test03(){
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        list.add(2,"高琪");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,"高老二");
        System.out.println(list);
        System.out.println(list.get(2));
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        System.out.println(list);
        System.out.println(list.indexOf("B"));//寻找第一个"B"
        System.out.println(list.lastIndexOf("B"));//寻找最后一个B
        System.out.println();
    }
}




