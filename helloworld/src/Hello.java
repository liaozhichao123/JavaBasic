/**
 * 这是文档注释
 * 我的第一个java程序!
 * @author liao zhichao
 * @version 1.0
 */
public class Hello {
    //成员变量会自动初始化
    int a;//成员变量，属于对象，对象创建，成员变量也跟着创建，对象消失成员变量也跟着消失
    static int b=10;//静态变量，属于类。类被加载静态变量就有效，类被卸载，静态变量就消失

    public static void main(String [] /*arguments行内注释*/args){
        //单行注释
        //People p=new People();
        //double r=9;
        //double area=p.PI*r*r;
        byte var=20;
        short s=1000;
        int a=100;
        int b=015;
        int c=0xff;
        int d=0b100101101;
        int salary=30000;//整型常量默认类型为int
        long yearSalary=3000000000L;//把整型常量定义为long类型（超过21亿）
        long sh=300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(var);
        System.out.println(yearSalary);
        System.out.println(sh);
        /*
        int age;//局部变量
        int x=0,y=0,z=19;
        age=22;//使用之前必须初始化
        System.out.println(age);
        System.out.println("hello world");
        System.out.println("你好，中国！");
        System.out.print(x);
        System.out.println(y);
        System.out.println(z);
        */

        /*
        这是多行注释*/
    }
}
class People{
    final double PI=3.14;
    final int MAX_SPEED=120;
    byte b=12;

}
