package com.itbaizhan;

/**
 * javaBean和数组结合保存表格数据
 */
public class TestJavaBean {
    public static void main(String[] args) {
        Emp[] emps={
                new Emp(1001,"高琪",18,"讲师","2-14"),
                new Emp(1001,"高琪",18,"讲师","2-14"),
                new Emp(1001,"高琪",18,"讲师","2-14")
        };
        for(Emp e:emps){
            System.out.println(e);
        }
    }
}
class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hireDate;

    public Emp(int id, String name, int age, String job, String hireDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
