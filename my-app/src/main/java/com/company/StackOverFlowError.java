package com.company;

public class StackOverFlowError {

    public int calculateFactorial(int number) {
        System.out.println(number);
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        StackOverFlowError s = new StackOverFlowError();
        s.calculateFactorial(5);
    }
}
