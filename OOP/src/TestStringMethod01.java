import java.util.Locale;

public class TestStringMethod01 {
    public static void main(String[] args) {
        String s1=" java   ";
        String s2="  ";
        String s3="How are you?";
        System.out.println(s1.trim());//去除首位空格
        String t1=s2.trim();
        System.out.println(t1.length());
        System.out.println(s3.startsWith("How"));
        System.out.println(s3.endsWith("you"));
        String t=s3.substring(4);
        System.out.println(t);
        System.out.println(s3.substring(4,7));//[4,7)
        String s4="  How old are you!  ";
        System.out.println(s4.trim());
        System.out.println(s4);
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
    }
}
