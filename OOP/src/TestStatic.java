public class TestStatic {
    int id;
    String name;
    static String company;
    TestStatic(int id,String name){
        this.id=id;
        this.name=name;
        this.company="defaultName";
    }
    public void login(){
        System.out.println(name+"登入成功");
        printCompany();//默认方法可以调用静态方法
    }
    public static void printCompany(){
        System.out.println(company);
    }
    public static void main(String[] args) {
        TestStatic t=new TestStatic(101,"高琪");
        t.login();
        TestStatic.printCompany();
        TestStatic.company="阿里";
        TestStatic.printCompany();

    }
}
