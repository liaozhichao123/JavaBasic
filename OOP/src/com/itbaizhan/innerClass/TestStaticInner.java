package com.itbaizhan.innerClass;

/**
 * 测试静态内部类，将其当做静态属性
 */
public class TestStaticInner {
    public static void main(String[] args) {
        Outer2.Inner.test();//直接通过类名调用静态方法
        Outer2.Inner inner=new Outer2.Inner();//静态类普通方法的调用
        inner.nonStatic();
    }
}
class Outer2{
    private int a=10;
    private static int b=20;
    static class Inner{
        public static void test(){

            System.out.println(b);
        }
        public void nonStatic(){
            //System.out.println(a);不能从静态类中访问非静态成员
            System.out.println(b);
        }
    }
}