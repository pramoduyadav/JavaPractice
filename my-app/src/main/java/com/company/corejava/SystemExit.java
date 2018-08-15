package com.company.corejava;

public class SystemExit {
    public static void main(String[] args) {
        try {
            System.exit(0);
        } catch(RuntimeException re) {
            System.out.println("catch me");
        } finally {
            System.out.println("Hi");
        }

    }
}
