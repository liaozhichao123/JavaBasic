package homework.week2;

import java.util.*;

public class Problem3 {
    private static List<User> array;//存储用户信息
    private static Map<String,User> map;
    public static void main(String[] args) {
        map=new HashMap<>();
        map.put(null,new User());
        map.put("张三",new User("张三"));
        map.put("李四",new User("李四","123456"));
        login();
        //System.out.println(array.get(3).getInfo());
    }
    public static void login(){
        //输入用户名和口令
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入用户名:");
        String name=scanner.nextLine();
        System.out.print("请输入口令:");
        String password=scanner.nextLine();
        scanner.close();
        User temp=map.get(name);
        if(temp!=null&&password.equals(temp.getPassword())){
            System.out.println("登录成功");
            return ;
        }
        System.out.println("登录失败！");
    }
}
class User{
    private String name;
    private String password;
    public User(){
    }
    public User(String name){
        this.name=name;
    }
    public User(String name,String password){
        this.name=name;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
    public String getInfo(){
        return "name:"+name+", password:"+password;
    }
}
