package com.itbaizhan;

import java.util.Arrays;

/**
 * 实现Comparable接口才可以进行比较
 */
public class TestComparable {
    public static void main(String[] args) {
        Woman [] woman={
                new Woman(18,1001,"judy"),
                new Woman(16,1002,"Alice"),
                new Woman(29,1003,"Jane")
        };
        System.out.println(Arrays.toString(woman));
        Arrays.sort(woman);
        System.out.println(Arrays.toString(woman));

    }
}
class Woman implements Comparable{
    private int age;
    private int id;
    private String name;
    Woman(){

    }
    Woman(int age,int id,String name){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Object o){
        Woman woman=(Woman) o;
        if(this.age<woman.age){
            return -1;
        }else if(this.age== woman.age){
            return 0;
        }
        return 1;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}