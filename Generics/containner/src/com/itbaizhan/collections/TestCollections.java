package com.itbaizhan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用
 * Collection是接口，Collections是工具类
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add("gao"+i);
        }
        System.out.println(list);
        Collections.shuffle(list);//洗牌，打乱
        System.out.println(list);
        Collections.reverse(list);//逆序
        System.out.println(list);
        Collections.sort(list);//升序排列，元素如果是自定义类需要实现Comparable接口
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"gao9"));//在binarySearch之前需要sort
        Collections.replaceAll(list,"gao1","haha");
        System.out.println(list);
    }
}
