/**
 * 无法从静态上下文中引用静态方法
 * 测试方法的定义和调用
 */
public class TestMethod {
        public static void main(String[] args) {
            double a=handleLate(10,3000);
        }
        public static int add(int a,int b,int c){
            return a+b+c;//返回值，结束
        }
        public static double handleLate(int lateMinute,int salary){
            double fine=0.0;
            System.out.println("迟到分钟数："+lateMinute);
            System.out.println("月薪："+salary);
            if(lateMinute<10){
                System.out.println( "警告！");
            }else if(lateMinute<=20){
                System.out.println("罚款100元！");
                fine=100;
            }else if(lateMinute<30){
                System.out.println("罚款200元！");
                fine=200;
            }else{
                System.out.println("旷工");
                fine=salary/60;
            }

            return fine;
        }



}
