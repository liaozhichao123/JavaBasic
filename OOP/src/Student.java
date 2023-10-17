/**
 * 普通成员方法，默认都会传递this(实例化对象的地址，从而进行操作)
 * 构造方法也是方法也可以重载
 */
public class Student {
    int id;
    int age;
    String name;
    public void study(){
        System.out.println("正在学习中，勿扰！");
    }
    public void kickball(){
        System.out.println("正在踢球中，加油！");
    }

    public static void main(String[] args) {
        Point p1=new Point(3.0,4.0);
        Point p2=new Point();
        System.out.println(p2.getDistance(p1));
        /*Student s1=new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.id=001;
        s1.age=19;
        s1.name="Judy";
        System.out.println(s1.name);
        s1.study();
        s1.kickball();*/
    }
}
class Point{
    double x=1.0;
    double y=1.0;
    Point(double _x,double _y){
        this.x=_x;
        this.y=_y;
    }
    Point(){
        x=0.0;
        y=0.0;
    }

    public Point(double y) {
        this.y = y;
    }

    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}
