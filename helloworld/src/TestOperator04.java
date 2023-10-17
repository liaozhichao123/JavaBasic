/**
 * ~按位取反
 * &按位与
 * |按位或
 *^按位异或
 * <<左移运算符
 * >>右移运算符
 */
public class TestOperator04 {
    public static void main(String [] args){
        int a=3;//011
        int b=4;//100
        int c=a&b;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<1);//乘以2除以2相当于移位
        System.out.println(a>>1);
        //测试字符串连接
        //字符串连接符号+，当其中有一个字符串的时候，另一个会转为字符串。条件为Sting,如果是char仍然是正常的加法
        String str1="hello";
        String str2=23+49+str1;
        System.out.println(str2);
        //通过加空字符串可以让所有+都变成连接符
        String s=""+'h'+'i'+23+49;
        System.out.println(s);
    }
}
