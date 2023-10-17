package com.bjsxt;

import java.awt.*;

//爆炸类
public class Explode {
    int  x,y;
    static Image[] imgs=new Image[16];
    static{
        for(int i=0;i<16;i++){
            imgs[i]=GameUtil.getImage("images/explode/e"+(i+1)+".gif");//懒加载
            imgs[i].getHeight(null);//调用方法，这样会真的加载
        }
    }

    int count=0;//计数器
    boolean live=true;
    public void drawMyself(Graphics g){
        //实现轮播
        if(!live) return;
        if(count<16){
            g.drawImage(imgs[count],x,y,null);
            count++;
        }else{
            live=false;

            //System.exit(0);
        }
    }

    public Explode(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
