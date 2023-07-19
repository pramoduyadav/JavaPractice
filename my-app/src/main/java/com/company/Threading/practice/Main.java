package com.company.Threading.practice;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from main thread :: " + Thread.currentThread().getName());
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Thread runnable = new Thread(new RunnableThread());
        runnable.start();

        new Thread() {
            public void run () {
                System.out.println("from anonymous class");
            }
        }.stop();

    }
}
