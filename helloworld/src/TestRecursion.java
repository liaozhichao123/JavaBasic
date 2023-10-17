import java.util.Scanner;
public class TestRecursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("请输入整数:");
        int n=s.nextInt();
        long startTime=System.currentTimeMillis();
        long result=factorial(n);
        long endTime=System.currentTimeMillis();
        System.out.println(n+"！="+result);
        System.out.println("耗时:"+(endTime-startTime)+"ms");
    }
    public static long factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
