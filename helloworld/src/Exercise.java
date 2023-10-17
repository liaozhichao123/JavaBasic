import java.util.Scanner;

/**
 * 循环0-130之间的数字，每行显示五个数字
 */
public class Exercise {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();//nextInt会跳过之前存在的空格等
        System.out.println(a);
        for(int i=0;i<131;i++){
            System.out.print(i);
            if(i%5==4){
                System.out.println();
            }else{
                System.out.print('\t');
            }
        }
    }
}
