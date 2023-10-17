package com.itbaizhan.file.decorator;

/**
 * 在不改变原有代码的基础上，增加新的功能
 * 模拟咖啡
 * 1、抽象组件：需要装饰的抽象对象（接口或父类）
 * 2.具体组件：需要装饰的对象
 * 3.抽象装饰类：包含了对抽象组件的引用以及装饰着共有的方法
 * 4.具体装饰类：被装饰的对象
 */
public class TestDecorator02 {
    public static void main(String[] args) {
        Drink coffee=new Coffee();
        Drink milk=new Milk(coffee);
        System.out.println(milk.info()+"--->"+milk.cost());
        Drink suger=new Suger(milk);
        System.out.println(suger.info()+"--->"+suger.cost());
    }
}
//抽象组件
interface Drink{
    double cost();//费用
    String info();//说明
}
//具体组件
class Coffee implements Drink{
    private String name="原味咖啡";
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String info() {
        return name;
    }
}
//抽象装饰类
abstract class Decorator implements Drink{
    //对抽象组件的引用
    private Drink drink;
    public Decorator(Drink drink){
        this.drink=drink;
    }
    @Override
    public double cost() {
        return drink.cost();
    }

    @Override
    public String info() {
        return drink.info();
    }
}
//具体装饰类
class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*4;
    }

    @Override
    public String info() {
        return super.info()+"加入了牛奶";
    }
}
class Suger extends Decorator{

    public Suger(Drink drink) {
        super(drink);
    }

    @Override
    public double cost() {
        return super.cost()*4;
    }

    @Override
    public String info() {
        return super.info()+"加入了蔗糖";
    }
}

