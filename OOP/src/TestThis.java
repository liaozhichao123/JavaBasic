/**
 * this是隐式参数，由系统传入方法中
 * this 不能用于static中
 *
 */
public class TestThis {
    int a,b,c;
    TestThis(){
        System.out.println("正在初始化的对象:"+this);
    }
    TestThis(int a,int b){
        //TestThis();//这样不行
        this();//调用无参构造方法,必须位于第一句
        this.a=a;
        this.b=b;
    }
    TestThis(int a,int b,int c){
        this(a,b);//调用构造方法
        this.c=c;
    }
    void sing(){
        System.out.println("我正在唱歌");
    }
    void eat(){
        System.out.println("当前对象"+this);
        System.out.println("喊你吃饭");
        this.sing();
    }

    public static void main(String[] args) {
        TestThis t=new TestThis(2,3);
        System.out.println(t);
        t.eat();
    }

}
