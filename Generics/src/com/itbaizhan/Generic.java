package com.itbaizhan;

/**
 * 测试泛型，可以用于类，方法，属性，可以定义多个泛型分隔符
 * @param <T>
 */
public class Generic <T>{//可以<T extends Number>上限限定，只能Nummber及其子类
    private T flag;
    /*public static T demo(T name){//静态方法无法获得类中的泛型，因为静态方法属于类，泛型是在类的实例化时确定的
        return name;
    }*/
    public void setFlag(T flag){
        this.flag=flag;
    }
    public T getFlag(){
        return flag;
    }
}
