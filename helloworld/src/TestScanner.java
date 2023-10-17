/**
 * 测试键盘输入：Scanner用法
 */
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter user name：");
        String uname=s.nextLine();
        System.out.println("请输入年龄：");
        int age=s.nextInt();
        System.out.println("请输入月薪：");
        double salary=s.nextDouble();
        System.out.println("用户名:"+uname);
        System.out.println("年龄："+age);
        System.out.println("年薪:"+salary*12);
    }
}
