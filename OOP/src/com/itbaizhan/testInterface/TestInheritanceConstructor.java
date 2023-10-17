package com.itbaizhan.testInterface;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class TestInheritanceConstructor {
    public static void main(String[] args) {

    }
}
class Person{
    String name;
    int id;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
}
