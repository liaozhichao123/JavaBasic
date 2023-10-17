package com.itbaizhan.thread.Synchronized;

public class TestWithdraw implements Runnable{
    Account account;//取钱的账户
    int drawingMoney;
    int packetTotal;//取的总数

    public TestWithdraw(Account account, int drawingMoney) {
        this.account = account;
        this.drawingMoney = drawingMoney;
    }
    public void withdraw(int money){
        account.money-=money;
        packetTotal+=money;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        withdraw(drawingMoney);
        System.out.println(Thread.currentThread().getName()+"-->账户余额为:"+account.money);
    }

    public static void main(String[] args) {
        Account acc=new Account(200,"结婚礼金");
        TestWithdraw you=new TestWithdraw(acc,80);
        TestWithdraw wife=new TestWithdraw(acc,100);
        Thread t1=new Thread(you);
        Thread t2=new Thread(wife);
        t1.start();
        t2.start();
        /*try {

            t2.join();
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(acc.money);
    }
}
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
