package homework.week2;

import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        int bound=100;
        Random random=new Random();
        int num1= random.nextInt(bound)+1;
        int num2= random.nextInt(bound)+1;
        System.out.println("num1 = "+num1+" , num2 = "+num2);
        System.out.println("最大公因数为:"+gcd(num1,num2));
        System.out.println("最小公倍数为:"+lcm(num1,num2));

    }
    /**
     * 利用辗转相除法，gcd(a,b)=gcd(a,a%b);
     * @param a 第一个整数
     * @param b 第二个整数
     * @return 最大公因数
     */
    public static int gcd(int a,int b){
        if(a%b==0)return b;
        return gcd(b,a%b);
    }

    /**
     * 最小公倍数等于两数相乘除以最大公因数
     * @param a
     * @param b
     * @return 最大公倍数
     */
    public static int lcm(int a,int b){
            return a*b/gcd(a,b);
    }


}
