package com.itbaizhan.oop.polymorphism;

public class TestPolym {
    public static void main(String[] args) {
        animalCry(new Dog());
        animalCry(new Cat());
        //编译时类型Aninmal  运行时类型 Dog
        Animal a=new Dog();//向上转型(自动)
        a.shout();
        Dog d=(Dog)a;//向下转型（强制）
        d.seeDoor();
        //a.seeDoor();
        //Cat c=(Cat)a;
        //a.shout();
        if(a instanceof Cat ){
            Cat c=(Cat)a;
            c.shout();
        }
    }
    static void animalCry(Animal a){
        System.out.println("TestPolym.animalCry");
        a.shout();  //可以出现多态
    }
}
