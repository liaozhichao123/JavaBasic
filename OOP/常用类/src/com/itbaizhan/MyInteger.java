package com.itbaizhan;

/**
 * 自定义包装类
 */
public class MyInteger {
    private final int value;
    private static MyInteger[] cache;//缓存
    private static final int LOW=-128;
    private static final int HIGH=127;
    static{
        cache=new MyInteger[256];
        for(int i=0;i< cache.length;i++ ){
            cache[i]=new MyInteger(i+LOW);
        }
    }
    public MyInteger(int value){
        this.value=value;
    }
    public static MyInteger valueOf(int value){
        if(value>=LOW&&value<=HIGH){
            return cache[value-LOW];
        }
        return new MyInteger(value);
    }
    public int intValue(){
        return value;
    }
    public static void main(String[] args) {
        MyInteger a=new MyInteger(10);
        MyInteger b=MyInteger.valueOf(20);
        MyInteger c=MyInteger.valueOf(20);
        System.out.println(b==c);
        System.out.println(b.intValue());
    }
}
