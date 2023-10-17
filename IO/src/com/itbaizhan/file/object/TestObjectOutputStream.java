package com.itbaizhan.file.object;

import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        //test1();
        persistence();
        read();
    }
    public static void persistence(){
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("dest.txt"))){
            Employee e1=new Employee("Alice",1230.1);
            Employee e2=new Employee("Bob",12332.1);
            os.writeObject(e1);
            os.writeObject(e2);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void read(){
        try(ObjectInputStream is=new ObjectInputStream(new FileInputStream("dest.txt"))){
            System.out.println(is.readObject());
            System.out.println(is.readObject());
            //System.out.println(is.readObject());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void test1(){
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        try(ObjectOutputStream os=new ObjectOutputStream(baos);
        ){
            Employee e=new Employee("Alice",100);
            os.writeObject(e);
            //os.writeObject("新青年");
        }catch(IOException e){
            e.printStackTrace();
        }
        ByteArrayInputStream bis=new ByteArrayInputStream(baos.toByteArray());
        try(ObjectInputStream is=new ObjectInputStream(bis);){
            System.out.println(is.readObject());
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
class Employee implements Serializable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
