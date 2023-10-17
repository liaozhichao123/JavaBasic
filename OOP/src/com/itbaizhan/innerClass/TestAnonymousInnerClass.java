package com.itbaizhan.innerClass;

/**
 * 测试匿名内部类,匿名内部类可以继承接口
 */
public class TestAnonymousInnerClass {
    public void test1(A a){
        a.run();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass t=new TestAnonymousInnerClass();
        t.test1(new A() {
            @Override
            public void run() {
                System.out.println("第一个匿名内部类! ");
            }
        });
        t.test1(new A(){
            @Override
            public void run(){
                System.out.println("第二个匿名内部类！ ");
            }
        });
    }
}
interface A{
    void run();//接口方法默认public abstract
    default void sing(){}
}
