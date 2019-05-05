package com.company.collections;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");


        // get the iterator
        Iterator<String> it = list.iterator();
        //list.remove("1");
        // After iterator object is created; 1 item go removed;
        // since ArrayList id fail fast it will throw ConcurrentModificationException
        //manipulate list while iterating
        while(it.hasNext()){
            System.out.println("list is:"+list);
            String str = it.next();
            System.out.println(str);
//            if(str.equals("2"))list.remove("5");
//            if(str.equals("3"))list.add("3 found");
//            //below code don't throw ConcurrentModificationException
//            //because it doesn't change modCount variable of list
//            if(str.equals("4")) list.set(1, "4");
        }

        System.out.println("At last :: "+list);

        ConcurrentHashMap m = new ConcurrentHashMap(200 , 0.75f, 10);
        System.out.println(m.size());
    }

}