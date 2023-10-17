package com.itbaizhan.collection;

interface ParentInterface {
    void foo();
}

interface ChildInterface extends ParentInterface {
    void foo(int agw); // 子接口重复声明了父接口的方法
}

public class Main {
    public static void main(String[] args) {
        ChildInterface child = new ChildClass();
        child.foo(10); // 可以调用子接口中的方法
        ChildClass c=(ChildClass)child;
        System.out.println(c);
    }
}

class ChildClass implements ChildInterface {
    final int value;
    ChildClass(){
        value=100;
    }
    @Override
    public void foo(int age) {
        System.out.println("ChildClass's foo");
    }

    @Override
    public void foo() {
        System.out.println("Parent.foo");
     }

     public final String  toString(int x) {
        return "value";
    }
}
