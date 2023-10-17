package com.itbaizhan;

/**
 * 测试泛型方法
 */
public class GenericMethod {
    public static <T> void demo(T name){
        System.out.println(name);
    }
    public <T> void setName (T name){//泛型方法声明格式
        System.out.println(name);
    }
    public <T> T getName(T name){
        return name;
    }
    //测试可变参数
    public <T> void method(T ... args){
        for(T t:args){
            System.out.println(t);
        }
    }
    public static void main(String[] args) {
        GenericMethod g=new GenericMethod();
        g.setName("old");
        g.setName(1233);
        String s=g.getName("T");//泛型方法，可以根据参数推断出类型
        System.out.println(s);
        GenericMethod.demo("bjsxt");
        System.out.println("##############调用可变参数#############");
        String[] strs={"hi","hello","hey"};
        g.method(1,2,3,4,5);
        g.method();
        g.method(strs);
    }
}
