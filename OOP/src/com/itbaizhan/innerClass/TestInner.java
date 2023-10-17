package com.itbaizhan.innerClass;

public class TestInner {
    public static void main(String[] args) {
        Outer o=new Outer();
//        Outer.Inner i=new Outer().new Inner();
//        i.show();
        o.show();
        Outer.Inner inner=o.new Inner();
        System.out.println(inner.age);

    }
}
