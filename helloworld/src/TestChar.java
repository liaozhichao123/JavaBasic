import java.lang.instrument.Instrumentation;
public class TestChar {
    public static void main(String [] args){
        char s='a';
        char c='\u1278';
        String str="我爱中国";
        String str1="hello";
        System.out.println(str.charAt(3));
        System.out.println(s);
        System.out.println(c);
        System.out.println(str);
        System.out.println("a\tb\tc\td\t");
    }
}
