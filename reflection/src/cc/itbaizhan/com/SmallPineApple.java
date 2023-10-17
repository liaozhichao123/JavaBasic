package cc.itbaizhan.com;

public class SmallPineApple {
    public String name;
    public int age;
    private double weight;
    public SmallPineApple(){

    }
    public SmallPineApple(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "SmallPineApple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        //reflection
    }
}
