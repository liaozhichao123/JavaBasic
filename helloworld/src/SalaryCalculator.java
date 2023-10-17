/**
 *
 */
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.print("请输入月薪：");
            double monthSalary=s.nextDouble();
            System.out.print("请输入每年是几个月的薪水：");
            int month=s.nextInt();
            System.out.println("年薪是:"+month*monthSalary);
            s.nextLine();//消耗在输入int时候的换行字符
            String flag=s.nextLine();
            if(flag.equals("88")){//使用==判断的额是引用地址，需要使用equals()方法才合理
                break;
            }
            if(flag.equals("66")){
                System.out.println("重新开始计算...");
            }
            System.out.println(flag);
        }
    }
}
