package com.itbaizhan.thread.state;

/**
 * 终止线程的方式。外部干涉：加入标志位，不要使用stop(),destroy()
 */
public class TestTerminate implements Runnable{
    private boolean flag=true;
    private String name;

    public TestTerminate(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int i=0;
        while(flag){
            System.out.println(name+"-->"+i++);
        }
    }
    public void terminate(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestTerminate tt=new TestTerminate("C罗");
        new Thread(tt).start();
        for(int i=0;i<30;i++){
            if(i==10)tt.terminate();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main --> "+i);
        }
        tt.terminate();
    }
}
