package com.itbaizhan;

import java.util.Arrays;

public class TestMultiDimensionArray {

    public static void main(String[] args) {
        int [][]a=new int[3][];
        a[0]=new int[4];
        a[1]=new int[5];
        a[2]=new int [6];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=i+j;
            }
        }
        a=Test.a;
        for(int[] temp:a){
            for(int t:temp){
                System.out.print(t+"\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(a));

    }
}
class Test{
    static int[][]a={{1,2,3},{2,3,6},{6,3,7}};

}
