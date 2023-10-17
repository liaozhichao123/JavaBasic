package com.itbaizhan.file.decorator;

public class TestDecorator01 {
    public static void main(String[] args) {
        Person p=new Person();
        p.say();
        Amplifier am=new Amplifier(p);//装饰
        am.say();
    }
}

/**
 * 定义接口
 */
interface Say{
    void say();
}
class Person implements Say{
    private int voice=10;
    @Override
    public void say(){
        System.out.println("人的声音为:"+this.voice);
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }
}
class Amplifier implements Say{
    private Person p;
    Amplifier(Person p){
        this.p=p;
    }
    @Override
    public void say() {
        System.out.println("人的声音为："+p.getVoice()*10);
        System.out.println("噪音...");
    }
}