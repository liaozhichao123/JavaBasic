package com.itbaizhan.test;

/**
 * super可以看做是直接父类对象的引用。可通过super来访问父类中被子类覆盖的方法和属性。
 *  使用super调用普通方法没有位置限制
 *  类的构造方法没有显示使用super(...)或this(...)，则默认第一行调用super(),父类的无参构造方法
 */
public class TestSuper {
    public static void main(String[] args) {
        new ChildClass();
    }
}
class FatherClass{
    public int value=100;
    String name;
    static{
        System.out.println("静态初始化: FatherClass");
    }
    public void f(){
        //this.value=100;
        System.out.println("FatherClass.value="+this.value);
    }
    public FatherClass(){
        System.out.println("创建FatherClass");
    }
    FatherClass(int value){
        this.value=value;
        System.out.println("调用有参构造器创建FatherClass");
    }
    FatherClass(String name){
        this.name=name;
    }
}
class ChildClass extends FatherClass{
    public int value;
    public int age;
    static {
        System.out.println("静态初始化: ChildClass");
    }
    public ChildClass(){
        super(111);
        System.out.println("创建ChildClass");
    }
    @Override
    public void f(){
        super.f();
        this.value=200;
        System.out.println("ChildClass.value="+value);
        System.out.println("this.value="+value);
        System.out.println("super.value="+super.value);
        System.out.println(this.name);
    }
    public void f2(){
        System.out.println(age);
    }
}
