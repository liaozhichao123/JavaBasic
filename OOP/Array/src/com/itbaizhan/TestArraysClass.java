package com.itbaizhan;

/**
 * 测试Arrays类
 */
import java.util.Arrays;
public class TestArraysClass {
    public static void main(String[] args) {
        int [] a={1,324,34,754,8,7,3534,2678,654624,34454};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //没有的话返回负数
        System.out.println("该元素的索引"+Arrays.binarySearch(a,8));
        Arrays.fill(a,2,4,100);//[2,4)
        System.out.println(Arrays.toString(a));
    }
}
