package com.itbaizhan.collection;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("scaoiu");
        stack.pop();
        System.out.println(stack.peek());
    }
}
