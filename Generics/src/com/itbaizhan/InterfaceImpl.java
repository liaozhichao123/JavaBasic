package com.itbaizhan;

public class InterfaceImpl implements GenericInterface<String>{
    @Override
    public String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        InterfaceImpl a=new InterfaceImpl();
        System.out.println(a.getName("hello"));
        GenericInterface<String> b=new InterfaceImpl();
        System.out.println(b.getName("nihao"));
    }
}
