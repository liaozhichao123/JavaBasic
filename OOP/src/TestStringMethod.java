public class TestStringMethod {
    public static void main(String[] args) {
        String s="中国加油aaadgauysvbcbdasi";
        String s1="core Java";
        String s2="Core Java";
        //test charAt()
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));//忽略发小
        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s.indexOf('国',1));
        String s3=s1.replace(' ','&');
        System.out.println(s3);
    }
}
