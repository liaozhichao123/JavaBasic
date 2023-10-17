package com.itbaizhan;

import java.util.Random;

/**
 * 测试枚举
 */
public class TestEnum {
    public static void main(String[] args) {
        /*System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);*/
        Season x=Season.WINTER;
        System.out.println("x= "+x);
        //遍历枚举
        for (Season s:Season.values()){
            System.out.println(s);
        }
        int a=new Random().nextInt(4);//生成0,1,2,3随机数
        switch(Season.values()[a]){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            default:
                System.out.println("冬天");
                break;
        }

    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER//每个变量都是一个Season类型
}