package com.itbaizhan;

public class TestWildcard {
    public void showFlag(Generic <? > g){//无界通配符
        System.out.println(g.getFlag());
    }
    public void show1(Generic<? extends Number> g){//通配符上限限制，只能是Number或Number子集，可以用于泛型类
        System.out.println(g.getFlag());
    }
    public void show2(Generic<? super Integer> g){//通配符下限限制，不可用于类

    }
    public static void main(String[] args) {
        TestWildcard t=new TestWildcard();
        Generic<Integer> g=new Generic<>();
        g.setFlag(100);
        t.showFlag(g);
        Generic<Number> g2=new Generic<>();
        g2.setFlag(90);
        t.showFlag(g2);
        Generic<String>g3=new Generic<>();
        g3.setFlag("str");
        //t.show1(g3);
    }
}
