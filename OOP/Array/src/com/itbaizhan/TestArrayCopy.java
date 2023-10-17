package com.itbaizhan;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[]s={"阿里","京东","搜狐","网易","腾讯"};
        String[] sBak=new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for(String t :sBak){
            System.out.print(t+"\t");
        }
    }
}
