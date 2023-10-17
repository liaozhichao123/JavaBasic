package com.itbaizhan.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * javaBean+List nb
 */
public class TestStoreData2 {
    public static void main(String[] args) {
        User user1=new User(1001,"张三",2000,"2018.5.5");
        User user2=new User(1002,"李四",2000,"2015.3.12");
        User user3 =new User(1003,"王五",2000,"2023.4.5");
        List<User> list=new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        for(User u:list){
            System.out.println(u);
        }
    }

}
class User{
    private int id;
    private String name;
    private double salary;
    private String hireDate;
    //一个完整的JavaBean有空的构造器
    public User(){

    }

    public User(int id, String name, double salary, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public String toString(){
        return "id:"+id;
    }
}