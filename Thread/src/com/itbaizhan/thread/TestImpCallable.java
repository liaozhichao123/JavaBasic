package com.itbaizhan.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 测试callable创建多线程
 */
public class TestImpCallable implements Callable<Boolean> {
    private String url;
    private String name;
    @Override
    public Boolean call() throws Exception {
        System.out.print("hello");
        WebDownloader wd=new WebDownloader();
        wd.downLoad(url,name);
        return true;
    }

    public static void main(String[] args) {

        PhotoDownLoad pd1=new PhotoDownLoad("https://t7.baidu.com/it/u=2621658848,3952322712&fm=193&f=GIF",
                "tree.jpg");

        PhotoDownLoad pd2=new PhotoDownLoad("https://t7.baidu.com/it/u=738441947,1208408731&fm=193&f=GIF",
                "water.jpg");

        PhotoDownLoad pd3=new PhotoDownLoad("https://t7.baidu.com/it/u=738441947,1208408731&fm=193&f=GIF",
                "building.jpg");
        //创建执行服务
        ExecutorService ser=Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> result1=(Future<Boolean>) ser.submit(pd1);
        Future<Boolean> result2=(Future<Boolean>) ser.submit(pd2);
        Future<Boolean> result3= (Future<Boolean>) ser.submit(pd3);
        //获取结果
        try {
            System.out.println(result1.get());
            System.out.println(result2.get());
            System.out.println(result3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        //关闭服务
        ser.shutdownNow();
    }
}
