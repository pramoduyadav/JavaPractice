package com.company.corejava;

public class Finally {

    public static void main(String[] args) {
        System.out.println(add()); // Output : 3 ; finally block gets executed and 3 gets returned
    }

    public static int add () {
        try {
            System.out.println("I m in try");
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("I m in finally");
            return 3;
        }
    }
}
