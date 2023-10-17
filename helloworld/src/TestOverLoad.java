/**
 * 测试方法重载
 * 构成方法重载的条件：形参类型，个数，顺序不同
 * 只有返回值不同不构成重载
 */
public class TestOverLoad {
    public static void main(String[] args) {
        add(10);
        System.out.println(add(10,20));
    }
    public static void add(int a){
        System.out.println("nothing");
    }
    public static int add(int a,int b){
        return a+b;
    }
    /*public static void add(int b){

    }*/
}
