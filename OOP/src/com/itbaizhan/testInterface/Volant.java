package com.itbaizhan.testInterface;

/**
 * 接口中的属性只能是常量，总是public static final修饰，不写也是
 * 接口中的方法只能是：public abstract省略的话也是public abstract
 * 可以extends多个接口
 * 类可以实现implements接口
 */
public interface Volant {
    /*public static final*/ int FLY_HIGHT=100;
    void fly();
}
interface Honest{
    void helpOther();
}
class GoodMan implements Honest{
    public void helpOther(){
        System.out.println("扶老奶奶过马路");
    }
}
class Angel implements Volant,Honest{
    @Override
    public void fly(){
        System.out.println("Angel.fly");
    }
    public void helpOther(){
        System.out.println("Angel.helpOther");
    }
}

