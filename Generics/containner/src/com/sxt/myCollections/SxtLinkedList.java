package com.sxt.myCollections;

import java.util.LinkedList;
import java.util.List;

/**
 * 自定义双向链表
 * @author Administer
 * 增加泛型
 */
public class SxtLinkedList <E>{//泛型
    private Node first;
    private Node last;
    private int size;
    //[]
    //["a"]
    public void add(E obj){
        Node node=new Node(obj);
        if(first==null){
            first=node;
            last=node;
            node.previous=null;
            node.next=null;
        }else{
            last.next=node;
            node.previous=last;
            last=node;
            node.next=null;
        }
        size++;
    }
    //[a,b,c,d]
    //使用异常标准化方法，来处理，没必要返回null
    //当前get方法，效率不高，所以可以利用last
    public E get(int index){
        if(index<0||index>=size){
            throw new RuntimeException("索引不合法");
        }
        Node temp=null;
        if(index<(size>>1)) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else{
            temp=last;
            for(int i=0;i<size-index-1;i++){
                temp=temp.previous;
            }
        }
        return (E)temp.element;

    }
    public Node getNode(int index){
        if(index<0||index>=size){
            throw new RuntimeException("索引不合法");
        }
        Node temp=null;
        if(index<(size>>1)) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else{
            temp=last;
            for(int i=0;i<size-index-1;i++){
                temp=temp.previous;
            }
        }
        return temp;
    }
    //[]
    public void remove(int index){
        //需要注意对属性的维护，不然会出问题
        Node temp=this.getNode(index);
        //首位节点需要单独处理
        if(temp==first){
            first=temp.next;
        }else if(temp==last){
            last=temp.previous;
        }else{//处于中间位置时候的移除
            //[] [] []
            temp.previous.next=temp.next;
            temp.next.previous=temp.previous;
        }
        size--;
    }
    public void add(int index,E obj){
        Node newNode=new Node(obj);
        Node temp=getNode(index);
        if(temp==first){//插入位置为0时
            newNode.next=first;
            newNode.previous=null;
            first.previous=newNode;
            first=newNode;

        }else if(temp==last){//在最后一个位置插入
            newNode.previous=last;
            newNode.next=null;
            last.next=newNode;
            last=newNode;
        }else{
            newNode.next=temp;
            newNode.previous=temp.previous;
            temp.previous.next=newNode;
            temp.previous=newNode;
        }
        size++;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        Node temp=first;
        sb.append("[");
        while(temp!=null){//遍历链表
            sb.append(temp.element+",");
            temp=temp.next;
        }
        if(sb.length()==1)sb.append(']');
        else sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
//        LinkedList<String> list=new LinkedList<>();
//        list.add("aa");
//        list.add("bb");
//        list.add("cc");
//        list.add("dd");
//        System.out.println(list);
//        list.add(2,"ff");
//        System.out.println(list);
//        list.remove("ff");
//        System.out.println(list);
        SxtLinkedList<String> l=new SxtLinkedList();
        for(int i=0;i<4;i++){
            l.add("gao"+i);
        }
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.add("aa");
        System.out.println(l);
        l.add(0,"bb");
        System.out.println(l);
        l.add(1,"cc");
        System.out.println(l);
    }
}
