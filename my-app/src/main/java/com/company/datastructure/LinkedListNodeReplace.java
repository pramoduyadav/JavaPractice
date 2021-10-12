package com.company.datastructure;

import java.util.LinkedList;
import java.util.List;

public class LinkedListNodeReplace {


    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();

        lst.add(5);
        lst.add(10);
        lst.add(25);
        lst.add(45);
        lst.add(31);
        lst.add(16);
        lst.add(23);
        lst.add(51);
        int temp;

        System.out.println(lst);
        for (int i=0; i<lst.size(); i++) {
            if(i == 2) {
                temp = lst.get(i);
                lst.remove(2);
                lst.add(2, lst.get(lst.size() - 3));
                lst.remove(lst.size() - 3);
                lst.add(lst.size() - 2, temp);

            }
        }

        System.out.println(lst);
    }
}
