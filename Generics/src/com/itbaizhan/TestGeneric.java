package com.itbaizhan;

/**
 * 测试自定义泛型Generic
 */
public class TestGeneric {
    public static void main(String[] args) {
        Generic<String> generic=new Generic<>();
        generic.setFlag("admin");
        String flag= generic.getFlag();
        System.out.println(flag);
        Generic<Integer> g1=new Generic<>();
        g1.setFlag(99);
        System.out.println(g1.getFlag());

    }
}
