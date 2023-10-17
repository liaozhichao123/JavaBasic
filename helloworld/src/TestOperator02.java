/**
 * 关系运算符 关系运算的结果为boolean，true false
 * ==和!=所有类型都可以使用
 * > < >=  <=仅可用于数值类型(int ,short,byte ,char(16位unicode)
 */
public class TestOperator02 {
    public static void main(String[] args){
        int a=3;
        int b=4;
        boolean c=a>b;
        char d='s';
        System.out.println((byte)d);
    }
}
