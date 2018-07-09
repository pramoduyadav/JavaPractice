package com.company.javapuzzlers;

public class Oddity {

    public static boolean isOdd(int i) { // primitive int ranges from
        return i % 2 == 1;
    }

    public static void main(String[] args) {

        System.out.println(isOdd(-2));
    }
}
