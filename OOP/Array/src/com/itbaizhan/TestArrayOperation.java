package com.itbaizhan;

public class TestArrayOperation {
    public static void main(String[] args) {
        int[ ]a=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=100*i;
        }
        //for-each用于读取数组或容器中的所有元素
        for(int n:a){
            System.out.println(n);
        }
        String[] citie={"北京","上海","广州","深圳"};
        for(String t:citie){
            System.out.println(t);
        }
    }
}
