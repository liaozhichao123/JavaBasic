/**
 * 测试浮点数的基本用法
 */
public class TestFloatNumber {
    public static void main(String [] args){
        double d1=3.14;
        double d2=3.14E2;
        double d3=3.14E-3;
        float f1=3.12f;//必须加f因为浮点常量默认为double 类型
        float f2=0.25F;
        double d4=0.25;
        float f4=23567000000L;
        float f5=f4+1;
        System.out.println(f4==f5);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(f1);
    }
}
