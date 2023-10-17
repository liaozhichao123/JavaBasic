package homework.week2;

public class Problem4 {
    public static void main(String[] args) {
        Book book1=new Book();
        Book book2=new Book("Walking");
        Book book3=new Book("Old Man",29.01);
        Book book4=new Book("Having Fun",18.99);
        System.out.println(Book.getTotal());
    }
}
class Book{
    private String name;
    private long number;//编号从0开始
    private double price;
    private static long total=0;
    public Book(){
        this.number=total++;
    }
    public Book(String name){
        this.name=name;
        this.number=total++;
    }
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        this.number=total++;
    }
    public static long getTotal(){
        return total;
    }
}
