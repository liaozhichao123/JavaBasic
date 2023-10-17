/**
 *测试for循环
 *
 */
public class TestFor {
    public static void main(String[] args) {
        int sum=0;
        // 标准for
        int oddSum=0,evenSum=0;
        for(int i=0;i<101;i++){
            sum+=i;
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("总和:"+sum);
        System.out.println("奇数和:"+oddSum);
        System.out.println("偶数和:"+evenSum);
        //增强for,用于遍历可迭代对象
        int [] ar=new int[5];
        for(int num:ar){
            System.out.println(num);
        }

    }
}
