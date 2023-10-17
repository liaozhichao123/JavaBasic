package com.itbaizhan.encapsulation.b;

public class TestUser {
    public static void main(String[] args) {
        User u=new User(99,"高琪",true);
        u.setId(100);
        u.printUserInfo();
    }
}
