package com.itbaizhan.testInterface;

public class Test {
    public static void main(String[] args) {
        Angel a=new Angel();
        a.fly();
        a.helpOther();
        System.out.println(a.FLY_HIGHT);
        System.out.println(Volant.FLY_HIGHT);
        Volant angel=new Angel();
        angel.fly();
        System.out.println(angel.FLY_HIGHT);
        Honest h=(Honest) angel;
        h.helpOther();
        System.out.println("===============测试默认方法==================");
        TestDefaultImpl01 td=new TestDefaultImpl01();
        td.printInfo();
        td.more();
        System.out.println("=================测试静态方法======================");
        TestDefault.testStatic01();
        //td.testStatic01();
        td.testStatic01();

    }
}
