/**
 * 测试switch语句的用法
 * switch的不能是long,可以是int byte,char,short,String
 */
public class TestSwitch {
    public static void main(String[] args) {
        int grade=(int)(Math.random()*4)+1;
        int month=(int)(Math.random()*12)+1;
        grade=1;
        switch(grade){
            case 1:
                System.out.println("大一!不要迷茫，好好学,差距就是大一开始的");
                //break;
            case 2:
                System.out.println("大二别玩游戏了，加油吧");
                //break;
            case 3:
                System.out.println("大三，真快啊");
                //break;
            default:
                System.out.println("大四要准备工作了");
                break;

        }
        switch(month){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(month+"月，上半年");
                break;
            default:
                System.out.println(month+"月，下半年");
                break;

        }
        char c='3';
        switch(c){
            case 12:
                System.out.println(12);
                break;
            case '3':
                System.out.println('3');
                break;
        }

    }
}
