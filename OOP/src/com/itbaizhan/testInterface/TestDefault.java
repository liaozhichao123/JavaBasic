package com.itbaizhan.testInterface;

/**
 * java 8之后含8的默认方法、静态方法
 */
public interface TestDefault {
    void printInfo();
    default void more(){
        System.out.println("TestDefault.more");
        System.out.println("测试默认方法");
        testStatic01();//默认方法可以调用静态方法
    }
    default void fly(){
        System.out.println("TestDefault.fly");
    }
    static void testStatic01(){
        System.out.println("TestDefault.testStatic01");
    }
}
class TestDefaultImpl01 implements TestDefault{
    public void printInfo(){
        System.out.println("TestDefaultImpl01.printInfo");
    }
    static void testStatic01(){
        System.out.println("TestDefaultImpl01.testStatic01");
    }
}
