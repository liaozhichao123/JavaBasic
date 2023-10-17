package com.itbaizhan.abstractClass;

/**
 * 测试抽象类，抽象类不能被实例化，但可以包含属性，方法，构造方法
 */
public abstract class Animal {
    int age;
    public abstract void rest();
    public void shout(){
        System.out.println("Animal.shout");
    }
    public abstract void run();

}
class Dog extends Animal{
    @Override
    public void rest(){
    }
    @Override
    public void run(){

    }
}
class Cat extends Animal{

    @Override
    public void rest() {

    }

    @Override
    public void run() {

    }
}
