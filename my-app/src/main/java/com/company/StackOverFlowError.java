package com.company;

import java.util.Stack;

public class StackOverFlowError {

    public int calculateFactorial(int number) {
        System.out.println(number);
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        StackOverFlowError s = new StackOverFlowError();
        Stack<Object> stack = new Stack<>();
        System.out.println(stack.size());
        System.out.println(stack.capacity());

        int a =10;
        int b =10;
        int c =10;
        int d =10;
        int e =10;
        int f =10;
        int g =10;
        int h =10;
        int i =10;
        int j =10;
        int k =10;
        int l =10;
        int m =10;
        int n =10;

        System.out.println(stack.size());
        System.out.println(stack.capacity());

         s.calculateFactorial(5);
    }
}
