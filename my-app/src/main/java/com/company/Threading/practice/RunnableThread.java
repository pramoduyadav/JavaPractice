package com.company.Threading.practice;

public class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Runnable thread :: " + Thread.currentThread().getName());
    }
}
