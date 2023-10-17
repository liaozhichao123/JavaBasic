/**
 *测试条件运算符? :
 */
public class TestOperator05 {
    public static void main(String[] args){
        int score=90;
        String performance=score>=60? "及格":"不及格";
        System.out.println(performance);
        int x=0;
        int flag=x>0? 1:(x==0? 0:-1);
        int r=3*-5+6;
        System.out.println(flag);
        System.out.println(r);
        //优先级问题的用法  非>与>或
        boolean s1=true,s2=true,s3=false;
        System.out.println(s1||s2&&s3);
    }
}
