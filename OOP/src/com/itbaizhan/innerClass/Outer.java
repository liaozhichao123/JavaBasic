package com.itbaizhan.innerClass;

/**
 * 测试内部类的用法
 * 内部类访问外部类，Outer.this.method
 * 外部类访问内部类 new Inner().
 * 外部类以外的地方使用非静态内部类：
 * Outer.Inner varname=new Outer.new Inner();
 */
public class Outer {
    private int age=10;
    public void show(){
        System.out.println("Outer.show");
        System.out.println(age);
    }
    public class Inner{
        int age=20;
        public void show(){
            System.out.println("Inner.show");
            System.out.println(age);
            System.out.println("outer age"+Outer.this.age);
            Outer.this.show();
        }
    }
}
