package com.company.collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Pramod");
        set1.add("Yadav");
        set1.add("Manoj");
        set1.add("Vinod");

        Set<String> set2 = new TreeSet<>();
        set2.add("Pramod");
        set2.add("Vinod");
        set2.add("Yadav");
        set2.add("Manoj");

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2));


        List<String> lst = Arrays.asList("Pramod", "Yadav" ,"Vinod", "Yadav");
        Iterator<String> itr= lst.iterator();
        Set<String> set = new HashSet<>();
        for(String string : lst) {
            if(!set.add(string)) {
                System.out.println(string);
            }
        }

    }
}
