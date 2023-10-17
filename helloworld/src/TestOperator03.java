/**
 * 测试逻辑运算符
 * &与
 * &&短路与
 * |或
 * ||短路或
 * !非 取反
 * ^异或 不同为true 相同为false
 */
public class TestOperator03 {
    public static void main(String[] args){
        boolean b1=true;
        boolean b2=false;
        System.out.println(b1&b2);//与
        System.out.println(b1|b2);//或
        System.out.println(!b1);//非
        System.out.println(b1^b2);//异或
        //测试短路与、短路或
        // int b3=2/0;报除0异常
        boolean b3=1>2&&(4<3/0);
        System.out.println(b3);
    }
}
