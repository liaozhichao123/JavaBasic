package com.itbaizhan.collection;

import java.util.*;

/**
 * 测试迭代器遍历 List,Set,Map
 * 迭代器提供访问容器统一方法
 */
public class TestIterator {
    public static void main(String[] args) {
        testIteratorList();
        //testIteratorSet();
        //testIteratorMap();
    }
    public static void testIteratorList(){
        List<String> list=new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        //遍历list方法1
        for(int i=0;i<list.size();i++){
            //list.set(i,"gao"+i);
            //System.out.print(list.get(i)+" ");
        }
        //遍历list方法2  for each
        for(String s:list){
            //System.out.print(s+" ");
        }//使用迭代器修改元素的内容
        ListIterator<String> iterator= list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("aa")){
                iterator.set("ee");
            }
        }
        //使用迭代器（接口）遍历list
        Iterator<String> iter= list.iterator();
        System.out.println(iter.hasNext());
        while(iter.hasNext()){
            String temp=iter.next();//既会返回当前元素的值，也会将游标移向下一个
            System.out.println(temp);
        }
    }
    public static void testIteratorSet(){
        Set<String>list=new HashSet<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        Iterator<String> iter= list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    public static void testIteratorMap(){
        Map<String,Integer> map=new HashMap<>();
        map.put("aa",1);
        map.put("bb",4);
        map.put("cc",3);
        //使用迭代器遍历，与遍历Set本质没有区别
        Set<Map.Entry<String,Integer>>set=map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter= set.iterator();
        while(iter.hasNext()){
            Map.Entry<String,Integer> en=iter.next();
            System.out.println(en.getValue());
        }
        //遍历方式2
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String temp=it.next();
            System.out.println(temp+"="+map.get(temp));
        }

    }
}
