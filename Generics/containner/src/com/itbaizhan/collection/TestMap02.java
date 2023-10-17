package com.itbaizhan.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap02 {
    public static void main(String[] args) {
        Employee e1=new Employee(1001,"高琪",50000);
        Employee e2=new Employee(1002,"小二",5000);
        Employee e3=new Employee(1003,"小五",6000);
        Map<Integer,Employee> map=new HashMap<>();
        map.put(1001,e1);
        map.put(1002,e2);
        map.put(1003,e3);
        Employee emp=map.get(1001);
        System.out.println(emp);
        System.out.println(emp.hashCode());
        Integer i=100;

        System.out.println(i.hashCode());
    }
}
//雇员信息
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "id:"+id+" name:"+name+" salary:"+salary;
    }
}