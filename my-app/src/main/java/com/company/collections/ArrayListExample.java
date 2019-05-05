package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("Hello");

        method(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }


    static void method(ArrayList<String> list) {
        list.add("World");
    }


}
