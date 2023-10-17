package com.itbaizhan.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 学习需要守破离
 */
public class PhotoDownLoad extends Thread{
    private String url;
    private String name;
    public PhotoDownLoad(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run() {
        WebDownloader wd=new WebDownloader();
        wd.downLoad(url,name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        List<PhotoDownLoad>list=new ArrayList<>();
        PhotoDownLoad pd1=new PhotoDownLoad("https://t7.baidu.com/it/u=2621658848,3952322712&fm=193&f=GIF",
                "tree.jpg");
        list.add(pd1);
        PhotoDownLoad pd2=new PhotoDownLoad("https://t7.baidu.com/it/u=738441947,1208408731&fm=193&f=GIF",
                "water.jpg");
        list.add(pd2);
        PhotoDownLoad pd3=new PhotoDownLoad("https://t7.baidu.com/it/u=738441947,1208408731&fm=193&f=GIF",
                "building.jpg");
        list.add(pd3);
        //启动三个进程

        for(int i=0;i< list.size();i++){
            list.get(i).start();
        }
    }
}
