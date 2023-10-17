package com.itbaizhan.test;

public class TestComponent {
    public static void main(String[] args) {
        Student2 student=new Student2("judy",21,"cs");
        student.study();

    }
}
class Person2/*extends Object*/{
    String name;
    double height;
    public void relax(){
        System.out.println("休息！");
    }
}
class Student2 {
    Person2 person=new Person2();
    String major;
    public void study(){
        System.out.println("正在学习！");
        person.relax();
        System.out.println(this.person.name);
    }
    Student2(String name,double height,String major){
        this.person.name=name;
        this.major=major;
        this.person.height=height;
    }
}
