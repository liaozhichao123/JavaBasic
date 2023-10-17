public class TestString {
    public static void main(String[] args) {
        String s0=null;
        String s1="";//空字符串
        String s2="Java";
        String s3=new String("Java");
        String s4="你好";
        /*System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s4.length());*/
        String g1="北京尚学堂";
        String g2="北京尚学堂";
        String g3=new String("北京尚学堂");
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g1.equals(g3));
    }
}
