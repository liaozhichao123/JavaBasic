/**
 * 测试while语句
 */
public class TestWhile {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while(i<3){
            System.out.println("I love U--"+i);
            i++;
        }
        i=1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
