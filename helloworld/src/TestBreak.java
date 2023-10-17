/**
 * 产生100以内的随机数知道随机数为88时终止
 */
public class TestBreak {
    public static void main(String[] args) {
        int count=0;
        while(true){
            int rand=(int)(Math.random()*100);
            count++;
            System.out.print((rand<10?(" "+rand) :rand)+"\t");
            if(count%5==0){
                System.out.println();
            }
            if(rand==88){
                break;
            }

        }
        System.out.println("\n循环次数"+count);
    }
}
