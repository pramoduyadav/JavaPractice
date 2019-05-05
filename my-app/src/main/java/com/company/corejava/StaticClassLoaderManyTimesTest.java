package com.company.corejava;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;

public class StaticClassLoaderManyTimesTest {

    public static void main(String[] args) {

        List <? extends Number>  arr = new ArrayList<>();
        //arr.add(3);

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
