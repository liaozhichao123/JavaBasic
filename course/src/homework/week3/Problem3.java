package homework.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    //电话薄
    static String[] blog={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> result=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        dfs(input,0,new StringBuilder());
        System.out.println(result);
    }
    public static void dfs(String input, int index, StringBuilder sb){
        if(index==input.length()){
            result.add(sb.toString());
            return;
        }
        char temp=input.charAt(index);
        String str=blog[temp-'2'];
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            dfs(input,index+1,sb);
            sb.deleteCharAt(index);
        }
    }
}
