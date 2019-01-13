package com.company.corejava;

import java.util.concurrent.atomic.AtomicInteger;

public class SystemExit {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger();

        System.out.println(atomicInteger.get());
        atomicInteger.incrementAndGet();



        try {
            System.exit(0);
        } catch(RuntimeException re) {
            System.out.println("catch me");
        } finally {
            System.out.println("Hi");
        }

    }
}
