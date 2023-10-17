package com.itbaizhan;

/**
 * 测试字符串相关类
 */
public class TestString {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<7;i++){
            sb.append((char)('a'+i));
        }
        //append把自己this返回，所以可以写成方法链
        sb.append("1").append("2").append(3);
        System.out.println(sb);
        sb.append(",I can sing my abc!");
        System.out.println(sb);
        StringBuffer sb2=new StringBuffer("北京尚学堂");
        sb2.insert(2,"好").insert(2,"真不错");
        System.out.println(sb2.toString());
        sb2.delete(0,2);
        System.out.println(sb2);



    }
}
