package com.itbaizhan.innerClass;

/**
 * 测试局部内部类，在方法内部定义，作用域仅限于方法
 */
public class TestLocalInnerClass {
    public void show(){
        //作用域仅限于方法
        class Inner3{
            public void fun(){
                System.out.println("hello world");
            }
        }
        new Inner3().fun();
    }
    public static void main(String[] args) {
        new TestLocalInnerClass().show();
    }
}
