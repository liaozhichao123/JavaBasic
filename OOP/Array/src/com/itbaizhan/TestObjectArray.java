package com.itbaizhan;
import java.util.Arrays;

/**
 * 测试Object二维数组保存表格信息
 */
public class TestObjectArray {
    public static void main(String[] args) {
        Object[] a1={1001,"高琪",22,"教师", "2-4"};
        Object[] a2={1001,"高琪",22,"讲师", "2-4"};
        Object[] a3={1001,"高琪",22,"学生", "2-4"};
        Object[][]emp=new Object[3][];
        emp[0]=a1;
        emp[1]=a2;
        emp[2]=a3;

        for(Object[] temp:emp){
            System.out.println(Arrays.toString(temp));
        }
        for(Object[] temp:emp){
            for(int i=0;i<temp.length;i++){
                System.out.print(temp[i]+"\t");
            }
            System.out.println();
        }
    }
}
