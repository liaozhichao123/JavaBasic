package com.leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class TestSort274 {
    public static void main(String[] args) {
        Integer[] citation={3,0,6,1,5};
        System.out.println(Arrays.toString(citation));
//        Arrays.sort(citation);
//        System.out.println(Arrays.toString(citation));
        Comparator<Integer> c=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        /*Arrays.sort(citation,new Comparator<Integer>(){
            public int compare(Integer num1,Integer num2){
                return num2.compareTo(num1);
            }
        });*/
        Arrays.sort(citation,c);
        System.out.println(Arrays.toString(citation));
    }
}
