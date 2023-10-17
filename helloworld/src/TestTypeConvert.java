/**
 * 类型自动转换
 * 强制类型转换 (destinationType) valueToBeConverted注意括号必不可少
 */
public class TestTypeConvert {
    public static void main(String[] args){
        int a=12345;
        long b=a;
        double d=b;
        float f=b;
        //特例：整型常量是int型，但是可以自动转byte/short/char.只要不超过对应的类型表示范围
        byte h1=123;
        char h2='\u0012';//16位
        System.out.println(h2);
        //强制转型
        double x=3.94;
        int y=(int)x;//浮点数强制转为整数，直接丢失小数部分
        System.out.println("y=="+y);
        //强制转型，超过表述范围
        byte z=(byte)300;
        System.out.println(z);
        //注意在较大计算时做类型提升,example
        int money=1000000000;
        int years=20;
        int result=money*years;
        System.out.println(result);
        long total=money*years;
        System.out.println(total);
        long total2=(long)money*years;//正确
        //或者
        long total3=1L*money*years;
        System.out.println(total2);
        System.out.println(total3);
    }
}
