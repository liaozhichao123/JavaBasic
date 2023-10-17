package com.itbaizhan.collection;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(20,"aa");
        treeMap.put(3,"bb");
        treeMap.put(6,"cc");
        treeMap.getOrDefault(6,"0");
        //升序遍历
        for(Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("--------------------------------------");
        //逆序遍历
        for(Map.Entry<Integer,String> entry:treeMap.descendingMap().entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        /*for(Integer i:treeMap.keySet()){
            System.out.print(i+"\t");
        }*/
        /*System.out.println();
        for(String value:treeMap.values()){
            System.out.print(value+"\t");//均是按照key的顺序排序
        }
        System.out.println();
        Map<Emp,Integer> map=new TreeMap<>();
        map.put(new Emp("gao1",200,23),1001);
        map.put(new Emp("gao2",300,20),1002);
        map.put(new Emp("gao3",400,25),1003);
        map.put(new Emp("gao3",100,25),1004);
        for(Emp emp:map.keySet()){
            System.out.println(emp);
        }*/
    }
}
//重写Comparable接口
class Emp implements Comparable<Emp>{
    String name;
    int id;
    int age;

    public Emp(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public int compareTo(Emp o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }else{
            if(this.id>o.id){
                return 1;
            }else if(this.id<o.id){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
