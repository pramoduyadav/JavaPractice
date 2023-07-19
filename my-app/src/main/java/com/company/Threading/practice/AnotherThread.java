package com.company.Threading.practice;

public class AnotherThread extends Thread{
    public void run () {
        System.out.println("Hello world from another thread " + Thread.currentThread().getName());
    }
}
