package com.company.ubs.test12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<?> f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Hello ");
                }
            }
        });
        Future<?> f2 = service.submit(() -> {
           synchronized (o2) {
               synchronized (o1) {
                   System.out.println("World");
               }
           }
        });
        //f1.get();
        //f2.get();

    }
}
