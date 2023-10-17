/**
 * 构造方法用于对象普通属性初始化
 * 静态初始化块，用于类的初始化操作，初始化静态属性
 */
public class TestStatic2 {
    int id;
    String name;
    static String company;
    //静态初始化块,类加载的时候使用
    static{
        System.out.println("执行静态初始化块");
        company="百战程序员";
        printCompany();
    }
    public static void main(String[] args) {

    }
    public static void printCompany(){
        System.out.println(company);
    }
}
