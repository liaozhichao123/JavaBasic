package com.sxt.myCollections;

import java.util.Arrays;

public class SxtHashMap <K,V>{
    Node2[] table;//核心数组 bucket array
    int size;//存放键值对的数目
    public SxtHashMap(){
        table=new Node2[16];//一般定义为2的整数次幂
        size=0;
    }
    public void put(K key,V value){
        //如果要完善需要考虑数组扩容的问题
        if(size> ((table.length>>1)+(table.length>>2))) grow();
        //定义新的节点对象
        Node2 newNode=new Node2();
        newNode.hash=key.hashCode()&(table.length-1);//对16取余其实实际上就是通过获取最后几位达到取余的目的
        newNode.key=key;
        newNode.value=value;
        newNode.next=null;//写不写都一样
        if(table[newNode.hash]==null){
            table[newNode.hash]=newNode;
        }else{
            //数组不为空
            //需要注意插入时key重复的话则需要更新value
            Node2 temp=table[newNode.hash];
            if(newNode.key.equals(temp.key)){
                temp.value=newNode.value;
                return;
            }
            while(temp.next!=null){
                if(newNode.key.equals(temp.key)){
                    temp.value=newNode.value;
                    return;
                }
                temp=temp.next;
            }
            temp.next=newNode;//插入成功
        }
        size++;
    }
    private void grow(){
        //扩容涉及重新分配
        Node2[] tempTable=new Node2[table.length<<1];//将所有元素重新分配
        for(int i=0;i<table.length;i++){
            if(table[i]==null) continue;//
            Node2 head=table[i];
            while(head!=null){
                Node2 next=head.next;//提前记录next的位置，防止修改的时候找不到之后的位置了
                int hash=head.key.hashCode()&(tempTable.length-1);//可以进行遍历
                if(tempTable[hash]==null){
                    tempTable[hash]=head;
                }else{//已经有元素了，需要接到末尾
                    Node2 temp=tempTable[hash];
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=head;
                    head.next=null;
                }
                head=next;
            }
            //遍历结束
        }
        table=tempTable;//修改引用，之前的table进行垃圾回收
    }
    public V get(K key){
        int hash=key.hashCode()&(table.length-1);//计算哈希值
        Node2 temp=table[hash];
        if(temp==null) return null;
        if(key.equals(temp.key)) return (V)temp.value;
        while(temp.next!=null){//注意这种写法会跳过第一个元素，因为如果只有一个元素的话·
            if(key.equals(temp.key)){
                return (V)temp.value;
            }
            temp=temp.next;
        }
        return null;//没查询到
    }
    private StringBuilder ergodic(Node2 head){
        StringBuilder sb=new StringBuilder();
        while(head!=null){
            sb.append(head.key+"="+head.value+",");
            head=head.next;
        }
        return sb;
    }
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append('{');
        //遍历整个数组，把每个链表的所有元素添加到sb中
        for(int i=0;i< table.length;i++){
            if(table[i]==null) continue;
            sb.append(ergodic(table[i]));
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }
    int size(){
        return size;
    }
    public static void main(String[] args) {
        SxtHashMap<Integer,String> map=new SxtHashMap<>();
        for(int i=0;i<14;i++){
            map.put(i,"gao"+i);
        }
        System.out.println(map);
        System.out.println(map.get(12));

    }

}

