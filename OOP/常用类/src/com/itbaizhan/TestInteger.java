package com.itbaizhan;

/**
 * 测试包装类的使用
 */
public class TestInteger {
    public static void main(String[] args) {
//        Integer i=Integer.valueOf(10);//官方推荐,把数字10转为对象
//        int a=i.intValue();
//        String s=i.toString();
//        System.out.println(a);
//        System.out.println(s);
//        Integer m=Integer.valueOf("-1f",16);
//        System.out.println(m);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
        Integer i=100;//自动装箱，编译器解释为Integer i=Integer.valueOf(100);
        int j=i;// 自动拆箱 int j=x.intValue();
        //字符串转数字
        //方法1
        int x=Integer.parseInt("10",8);
        System.out.println(x);
        //方法2
        int y=Integer.valueOf("10",8);//自动装箱
        System.out.println(y);
        //数字变字符串
        //方法1
        int z=78;
        String s=Integer.toString(z);
        System.out.println(z);
        //方法2
        String s2=String.valueOf(z);
        System.out.println(s2);
        //测试缓存问题 类加载将-128-127之间的数缓存
        Integer x1=100;
        Integer x2=100;
        Integer x3=1000;
        Integer x4=1000;
        System.out.println(x1==x2);
        System.out.println(x3==x4);
        System.out.println(x1.equals(x2));
        System.out.println(x3.equals(x4));


    }
}
