package com.itbaizhan.thread.agent;

/**
 * 静态代理设计模式
 * 1.真实角色
 * 2.代理角色
 * 两者都实现某一接口才能代理
 */
public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
    }
}
interface Marry{
    void happyMarry();
}

/**
 * 真实角色
 */
class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("you and 嫦娥终于奔月了...");
    }
}
class WeddingCompany implements Marry{
    //真实角色
    private Marry target;
    public WeddingCompany(Marry target){
        this.target=target;
    }
    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }
    public void ready(){
        System.out.println("布置猪窝...");
    }
    public void after(){
        System.out.println("收拾猪窝...");
    }
}
