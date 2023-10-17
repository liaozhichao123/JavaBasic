/**
 * 把100到150之间不能被3整除的数输出
 * 带标签的continue帮助我们从内部循环跳到外部循环
 * continue outer;
 */
public class TestContinue {
    public static void main(String[] args) {
        /*int count=0;
        for(int i=100;i<151;i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }

        }*/
        //打印100-150之间的所有质数
        outer:for(int i=100;i<150;i++){//java的标签
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.print(i+"\t");
        }
    }
}
