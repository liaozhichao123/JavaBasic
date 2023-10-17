package com.sxt.myCollections;

import java.util.HashMap;

/**
 * 手动实现HashSet
 */
public class SxtHashSet {
    HashMap map;
    private static final Object PRESENT =new Object();
    public SxtHashSet(){
        map=new HashMap();
    }
    public void add(Object o){
        map.put(o,PRESENT);
    }
    public int size(){
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("{");
        for(Object key:map.keySet()){
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public static void main(String[] args) {
        SxtHashSet set=new SxtHashSet();
        set.add("aa");
        set.add("bb");
        set.add("aa");
        System.out.println(set);
    }
}
