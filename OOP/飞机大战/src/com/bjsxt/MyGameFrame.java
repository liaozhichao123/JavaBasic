package com.bjsxt;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static com.bjsxt.GameUtil.*;
public class MyGameFrame extends Frame{
    Image bg=GameUtil.getImage("images/bg.jpg");
    Image planeImg=GameUtil.getImage("images/plane.png");
    Plane plane=new Plane(planeImg,200,200,7);
    int x=200,y=200;//飞机坐标
    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);//窗口默认不可见。需要让它可见
        this.setSize(500,500);
        this.setLocation(300,100);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {//匿名类
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动窗口绘制线程
        new PaintThread().start();
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());
        //初始化多发炮弹
        for(int i=0;i<shells.length;i++){
            shells[i]=new Shell();
        }
    }
    //重写paint方法
    Shell[] shells=new Shell[50];//声明多发炮弹
    Explode explode;//声明爆炸
    @Override
    public void paint(Graphics g) {//g是画笔
        g.drawImage(bg,0,0,FRAME_WIDTH,FRAME_HEIGHT,null);
        plane.drawMyself(g);
        //shell.drawMyself(g);
        for(int i=0;i<shells.length;i++){
            shells[i].drawMyself(g);
            //飞机和所有炮弹进行碰撞检测
            boolean collision=shells[i].getRec().intersects(plane.getRec());
            if(collision){
                //System.out.println("飞机死了！！！");
                plane.live=false;
                if(explode==null){
                    explode=new Explode(plane.x,plane.y);
                }
                explode.drawMyself(g);
                g.setFont(new Font("Arial",Font.BOLD,24));
                g.setColor(Color.RED);
                g.drawString("Defeated",200,250);
            }
        }

    }
    //键盘监听内部类
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusAddDirection(e);
        }
    }
    //重画线程
    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                repaint();
                try {
                    Thread.sleep(40);//1s=1000s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public static void main(String[] args) {
        MyGameFrame frame=new MyGameFrame();
        frame.launchFrame();
    }
    //使用双缓冲技术
    private Image offScreenImage=null;
    public void update(Graphics g){
        if(offScreenImage==null){
            offScreenImage=this.createImage(FRAME_WIDTH,FRAME_HEIGHT);
        }
        Graphics gOff=offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage,0,0,null);
    }
}
