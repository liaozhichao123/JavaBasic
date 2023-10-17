package com.itbaizhan;

/**
 * 测试数组的声明和创建
 */
public class Test01 {
    public static void main(String[] args) {
        /*int [] s;//声明
        s=new int[10];
        for(int i=0;i<10;i++){
            s[i]=(int)Math.pow(i,2);
        }
        for(int n:s){
            System.out.println(n);
        }*/
        Man[] mans;
        mans=new Man[10];//创建数组每个都是null
        Man m1=new Man(1,11);
        Man m2=new Man(2,22);
        mans[0]=m1;
        mans[1]=m2;
        System.out.println(mans[0].getAge());
    }
}
class Man{
    private int age;
    private int id;
    public Man(int id,int age){
        super();
        this.age=age;
        this.id=id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}