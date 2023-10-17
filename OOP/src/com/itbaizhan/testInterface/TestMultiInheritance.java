package com.itbaizhan.testInterface;

/**
 * 测试接口多继承
 */
public class TestMultiInheritance {
    public static void main(String[] args) {
        ImplC01 c=new ImplC01();
        c.testA();
        c.testB();
        c.TestC();

    }
}
interface A{
    void testA();
}
interface B{
    void testB();
}
interface C extends A,B{
    void TestC();
}
class ImplC01 implements C{

    @Override
    public void testA() {
        System.out.println("ImplC01.testA");
    }

    @Override
    public void testB() {
        System.out.println("ImplC01.testB");
    }

    @Override
    public void TestC() {
        System.out.println("ImplC01.TestC");
    }
}
