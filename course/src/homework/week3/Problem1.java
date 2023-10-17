package homework.week3;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        //定义用户
        User user1=new User("17700000001","张三","12345671",0);
        User user2=new User("17700000002","李四","12345672",0);
        User user3=new User("17700000003","王五","12345673",0);
        //定义角色
        Role role1=new Role(1001,"医生","治病救人");
        Role role2=new Role(1002,"教师","教书育人");
        Role role3=new Role(1003,"司机","开车");
        Role role4=new Role(1004,"警察","抓小偷");
        //创建user和role关联起来的表
        UserAndRole ur1=new UserAndRole(role1,user1);
        UserAndRole ur2=new UserAndRole(role3,user1);
        UserAndRole ur3=new UserAndRole(role2,user2);
        UserAndRole ur4=new UserAndRole(role3,user2);
        UserAndRole ur5=new UserAndRole(role4,user3);
        ArrayList<UserAndRole> uars=new ArrayList<>(Arrays.asList(ur1,ur2,ur3,ur4,ur5));
        //定义权限
        Authority auth1=new Authority(1,"进手术室","进手术室做手术");
        Authority auth2=new Authority(2,"穿白大褂","卫生干净");
        Authority auth3=new Authority(3,"进教室","进教室教书");
        Authority auth4=new Authority(4,"开车","握方向盘开车");
        Authority auth5=new Authority(5,"巡逻","巡逻抓小偷");
        //将权限关联上角色
        auth1.setRole(role1);
        auth2.setRole(role1);
        auth3.setRole(role2);
        auth4.setRole(role3);
        auth5.setRole(role4);
        ArrayList<Authority>authorities=new ArrayList<>(Arrays.asList(auth1,auth2,auth3,auth4,auth5));
        //将角色关联上权限
        role1.setAuths(new ArrayList<>(Arrays.asList(auth1,auth2)));
        role2.setAuths(new ArrayList<>(Arrays.asList(auth3)));
        role3.setAuths(new ArrayList<>(Arrays.asList(auth4)));
        role4.setAuths(new ArrayList<>(Arrays.asList(auth5)));
        //测试
        getAllRolesAndAuths(user1,uars);
        System.out.println("--------------------------------------------------");
        getAllUserAndAuths(role1,uars);
        System.out.println("--------------------------------------------------");
        getAllRoleAndUser(auth4,uars,authorities);
    }
    //根据一个用户获得其对应的所有角色，以及每一个角色对应的所有权限
    public static void getAllRolesAndAuths(User user,ArrayList<UserAndRole>uars){
        List<Role>roles=new ArrayList<>();
        for(UserAndRole temp : uars){
            if(temp.getUser()==user){
                roles.add(temp.getRole());
            }
        }
        if(roles.isEmpty()){
            System.out.println("用户不存在！");
            return;
        }
        for(Role role:roles){
            System.out.print("该用户对应的角色："+role+" 该角色对应的权限：");
            for(Authority auth: role.getAuths()){
                System.out.print(auth+";");
            }
            System.out.println();
        }

    }
    //根据一个角色获得此角色的所有用户，以及此角色的对应所有权限
    public static void getAllUserAndAuths(Role role,ArrayList<UserAndRole> uars){
        boolean flag=false;
        for(UserAndRole temp:uars){
            if(temp.getRole()==role){
                System.out.println(temp.getUser());
                flag=true;
            }
        }
        if(!flag){
            System.out.println("角色不存在!");
            return ;
        }
        for(Authority auth: role.getAuths()){
            System.out.println(auth);
        }
    }
    public static void getAllRoleAndUser(Authority authority,ArrayList<UserAndRole >uars,ArrayList<Authority>authorities){
        Role role=null;
        for(Authority temp:authorities){
            if(temp==authority){
                role= authority.getRole();
                System.out.println("对应角色为："+role);
            }
        }
        if(role==null){
            System.out.println("该权限不存在");
            return;
        }
        Set<User> users=new HashSet<>();
        for(UserAndRole temp:uars){
            if(temp.getRole()==role){
                users.add(temp.getUser());
            }
        }
        for(User temp:users){
            System.out.println(temp);
        }
    }
}
class User{
    private String phoneNumber;
    private String name;
    private String password;
    private int status;

    public User(String phoneNumber, String name, String password, int status) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.password = password;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
class Role{
    private long ID;
    private String name;
    private String descriptor;
    private List<Authority> auths;
    public Role(long ID, String name, String descriptor) {
        this.ID = ID;
        this.name = name;
        this.descriptor = descriptor;
    }

    public List<Authority> getAuths() {
        return auths;
    }

    public void setAuths(List<Authority> auths) {
        this.auths = auths;
    }

    @Override
    public String toString() {
        return "Role{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}
class UserAndRole{
    private Role role;
    private User user;

    public UserAndRole(Role role, User user) {
        this.role = role;
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
class Authority{
    private long ID;
    private String name;
    private String descriptor;
    private Role role;
    public Authority( long ID, String name, String descriptor) {
        this.ID = ID;
        this.name = name;
        this.descriptor = descriptor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", descriptor='" + descriptor + '\'' +
                '}';
    }
}