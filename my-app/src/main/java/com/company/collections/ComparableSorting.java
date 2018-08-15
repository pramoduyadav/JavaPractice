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


        // 2nd Example
        Map<String, String> m = new HashMap<>();
        m.put("1", "Pramod");
        m.put("2", "Vinod");
        m.put("3", "Manoj");
        m.put("4", "Harish");

        List<String> lst = new ArrayList<>(m.values());
        Collections.sort(lst);
        System.out.println(lst);

    }
}
