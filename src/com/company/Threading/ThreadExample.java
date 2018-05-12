package com.company.Threading;

class ThreadE extends Thread{

    public void run() {

        System.out.println(Thread.currentThread().getName() + " Hello");
    }
}

class ThreadExample {

    public static void main(String[] args) {
        ThreadE t = new ThreadE();
        t.start();
        System.out.println(Thread.currentThread().getName());
    }


}
