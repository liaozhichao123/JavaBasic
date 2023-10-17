/**
 * 测试算术运算符的用法
 * 整型运算有long则结果为long,否则均是int
 * 浮点数默认为double
 * 可以强制类型转换
 * 这部分与C语言保持一致
 */
public class TestOperator01 {
    public static void main(String[] args){
        int a=3;
        long b=5;
        long c=a+b;
        double d=3+3.14;
        double d2=32/3.0;
        //取余数。余数符号与最左边操作数符号一致
        int e=10%-3;
        int g=10;
        int h=g++;//先赋值后++
        g=10;
        int i=++g;//先++后赋值
        System.out.println(h);
        System.out.println(i);
    }
}
