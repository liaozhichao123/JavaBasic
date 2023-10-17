package com.itbaizhan.encapsulation.b;
import com.itbaizhan.encapsulation.a.Person;

/**
 * 不同包不继承的话不能访问默认protected属性，不同包不能访问default属性
 * private 类内友好
 * default 包内友好
 * protected 父子友好，包内友好
 * public 全局友好
 */
public class Boy {
    public void play(){
//若子类和父类不在同一个包中，子类可访问父类的protected成员，不能访问父类对象的protected成员
        Person p=new Person();
        System.out.println(p.testPublic);
    }
}
class Girl extends Person{
    public void play(){
        System.out.println(super.testProtected);
        System.out.println(this.testProtected);
    }
}
