package com.company.collections;
import java.util.*;

public class ComparableSorting {

    public static void main(String... args){
        Set<Integer> random = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            random.add((int) (Math.random() * 100));
        }

        System.out.println("Initial Set: " + random);
        Set<Integer> sorted = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        sorted.addAll(random);
        System.out.println("Sorted Set: " + sorted);
    }
}
