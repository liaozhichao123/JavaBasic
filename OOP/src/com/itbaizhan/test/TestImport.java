package com.itbaizhan.test;

/**
 * 测试导入import
 */
import com.itbaizhan.oop.Car;
import java.util.*;//会导入util下面所有的类，会降低编译速度但不会降低运行速度，因为编译器会自动识别下面使用的类
public class TestImport {
    public static void main(String[] args) {
        //com.itbaizhan.oop.Car car=new com.itbaizhan.oop.Car();
        //import后可以直接使用Car
        Car car1=new Car("长城");
        Car car2=new Car("比亚迪");
        car1.printBrand();
        car2.printBrand();
    }
}
