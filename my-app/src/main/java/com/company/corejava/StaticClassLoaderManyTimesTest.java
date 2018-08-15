package com.company.corejava;

public class StaticClassLoaderManyTimesTest {

    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            try {
                System.out.println(i);
                Class.forName("com.company.corejava.StaticClassLoaderManyTimes");
                System.out.println(i);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
