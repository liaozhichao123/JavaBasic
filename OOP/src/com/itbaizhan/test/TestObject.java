package com.itbaizhan.test;

import java.util.Objects;

/**
 * 测试Object
 * 重写toString()和equals()方法
 */
public class TestObject {
    int id;
    String name;
    String pwd;
    TestObject(int id,String name,String pwd){
         this.id=id;
         this.name=name;
         this.pwd=pwd;
    }
    /*@Override
    public String toString() {
        return "账户名: "+name+"密码："+pwd;
    }*/

    @Override
    public String toString() {
        System.out.println("TestObject.toString");
        return "TestObject{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';

    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }

    public static void main(String[] args) {
//        TestObject t=new TestObject();
//        System.out.println(t.toString());
        //System.out.println(t);//默认调用toString方法
        TestObject t1=new TestObject(1001,"zhangsan","高琪");
        TestObject t2=new TestObject(1001,"zhangsan","高琪");
        System.out.println(t1.equals(t2));
    }
}
