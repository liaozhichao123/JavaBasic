package com.itbaizhan;

/**
 * 测试三种初始化静态初始化
 */
public class TestInitialize {
    public static void main(String[] args) {
        //静态初始化
        int[]a={10,20,30,40};
        Man[] mans={new Man(1,11),
                    new Man(2,22)};
        System.out.println(mans[1].getAge());
        //动态初始化
        Man[] man=new Man[10];
        //数组的默认初始化，0，null.数组也是对象，数组的元素就是对象的属性
        int a2[]=new int[10];//默认初始化0
        boolean [] b=new boolean[10];//默认初始化false
        String[]s=new String[10];//默认初始化null
    }
}
