package com.itbaizhan.oop;

public class Car {
    String type;
    public Car(){
      type="BYD";
    }
    public Car(String type){
        this.type=type;
    }
    public void printBrand(){
        System.out.println(this.type);
    }
    public static void main(String[] args) {

    }
}
