package homework.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        char[] str=input.toCharArray();
        System.out.println("原字符数组"+ Arrays.toString(str));
        reverse(str);
        System.out.println("反转后的字符数组"+ Arrays.toString(str));
    }
    public static void reverse(char[] str){
        int n=str.length;
        char temp;
        for(int i=0;i<n/2;i++){
            temp=str[i];
            str[i]=str[n-1-i];
            str[n-1-i]=temp;
        }
    }
}
