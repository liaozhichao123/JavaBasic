package com.sxt.myCollections;

import javax.management.RuntimeErrorException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 自定义ArrayList.第一版。
 * Vector线程安全，但效率低
 * 增加数组功能
 * 增加数组边界的检查
 */
public class SxtArrayList<E>{
    private Object[] elementData;
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    public SxtArrayList(){
        elementData=new Object[DEFAULT_CAPACITY];
    }
    public SxtArrayList(int capacity){
        if(capacity<0){
            throw new RuntimeException("容器容量不能为负数");
        }else if(capacity==0){
            elementData=new Object[DEFAULT_CAPACITY];
        }else elementData=new Object[capacity];
    }
    public void add(E element){
    //什么时候扩
        if(size==elementData.length){
            //怎么扩容
            Object[] newArray=new Object[elementData.length+(elementData.length>>1)];//变为1.5
            System.arraycopy(elementData,0,newArray,0,size);
            elementData=newArray;//将应用给elementData;//老的数组对象会被垃圾回收
        }
        elementData[size++]=element;
    }
    public E get(int index){
        checkRange(index);
        return (E)elementData[index];
    }
    public void set(int index ,E element){
        checkRange(index);
        elementData[index]=element;
    }
    public void checkRange(int index){
        if(index<0||index>=size){
            throw new RuntimeException("索引不合法!");
        }
    }
    public boolean remove(E element){
        //element和所有元素挨个比较，获得第一批比较true的，返回
        for(int i=0;i<size;i++){
            if(element.equals(get(i))){//容器中所有的比较操作都是用equals而不是用==
                //进行移除0 1 2 3
                System.arraycopy(elementData,i+1,elementData,i,size-i-1);
                elementData[--size]=null;
                return true;
            }
        }
        return false;
    }
    public boolean remove(int index){
        checkRange(index);
        //注意arraycopy方法中src和dest是同一数组时，会创建一个临时数组
        System.arraycopy(elementData,index+1,elementData,index,size-index-1);
        elementData[--size]=null;
        return true;
    }
    int size(){
        return size;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('[');
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        SxtArrayList<String>s1=new SxtArrayList(10);
        for(int i=0;i<40;i++){
            s1.add("gao"+i);
        }
        s1.set(1,"ddf");
        System.out.println(s1.get(10));
        System.out.println(s1);
        s1.remove(1);
        System.out.println(s1);
        s1.remove("gao4");
        System.out.println(s1);
    }

}
