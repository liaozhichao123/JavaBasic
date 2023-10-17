package homework.week2;

public class Problem2 {
    public static void main(String[] args) {
        int remainOfDay1=remain(1);
        int eatOfDay1=remainOfDay1+2;
        System.out.println("第一天吃的桃子数量:"+eatOfDay1);
    }
    /**
     * 递推R(n)=R(n-1)/2-1;
     * R(n-1)=(R(n)+1)*2;
     * R(9)=1;
     * @param i 表示第i天
     * @return 返回第i天吃完之后剩余的数量
     */
    public static int remain(int i){
        if(i==9) return 1;
        return (remain(i+1)+1)*2;
    }
}
