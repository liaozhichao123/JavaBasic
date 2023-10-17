package com.itbaizhan.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar={2,56,3,67,54674,565,123};
        System.out.println(Arrays.toString(ar));
        bubbleSort(ar);//java是按值传递，所以ar地址不变，但是ar指向的内容却进行了修改
        System.out.println(Arrays.toString(ar));//
        System.out.println(binarySearch(ar,5652));
        //System.out.println(Arrays.toString(br));
    }
    public static void bubbleSort(int [] ar){
        for(int i=0;i<ar.length-1;i++){
            boolean flag=true;
            for(int j=i;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static int binarySearch(int[] ar,int value){
        int left=0,right=ar.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(value<ar[mid]){
                right=mid-1;
            }else if(value>ar[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
