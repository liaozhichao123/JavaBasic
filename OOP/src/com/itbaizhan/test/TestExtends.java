package com.itbaizhan.test;

/**
 * java只有单继承
 * java 类没有多继承，接口有多继承
 *子类继承父类，可以得到父类的全部属性和方法（除了父类的构造方法），但不见得可以直接访问，比如父类的私有属性和方法
 */
public class TestExtends {
    public static void main(String[] args) {
        Student s1=new Student("高琪",170,"计科");
        //s1.relax();
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
    }

}
class Person/*extends Object*/{
    String name;
    double height;
    public void relax(){
        System.out.println("休息！");
    }
}
class Student extends Person{
    String major;
    public void study(){
        System.out.println("正在学习！");
        relax();
        System.out.println(this.name);
    }
    Student(String name,double height,String major){
        this.name=name;
        this.major=major;
        this.height=height;
    }
}
