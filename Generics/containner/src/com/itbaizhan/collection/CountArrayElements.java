package com.itbaizhan.collection;
import java.util.*;

public class CountArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3, 3};

        // 创建一个 TreeMap 来记录元素和它们的数量
        TreeMap<Integer, Integer> elementCountMap = new TreeMap<>();

        // 遍历数组，更新 TreeMap
        for (int num : arr) {
            // 如果元素已存在于 TreeMap 中，则增加其数量；否则将其添加到 TreeMap 中并初始化数量为1
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        // 打印每个元素及其数量
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println("元素 " + entry.getKey() + " 出现次数: " + entry.getValue());
        }
    }
}

