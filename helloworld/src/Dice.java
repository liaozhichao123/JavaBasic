/**
 * 测试if单分支结构
 * 1.如果三次值大于15，手气不错
 */

import java.lang.Math;
public class Dice {
    public static void main(String[] args) {
        //Math.random生成[0-1)之间的随机数
        int i=(int)(6*Math.random())+1;//静态方法
        int j=(int)(6*Math.random())+1;
        int k=(int)(6*Math.random())+1;
        int count=i+j+k;
        System.out.println("第一次得分:"+i);
        System.out.println("第二次得分:"+j);
        System.out.println("第三次得分:"+k);
        if(count>15){
            System.out.println("今天手气不错！再来一把!");
        }else if(count>10){
            System.out.println("手气一般!再来两把");
        }else{
            System.out.println("手气不行！回家吧！");
        }
        System.out.println("score="+count);
    }
}
