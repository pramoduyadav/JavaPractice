package com.company.ubs.test9;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Burger", "Pizza", "Donut", "Burger");
        Set<String> s1 = new HashSet<>(list);
        Set<String> s2 = new TreeSet<>(list);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}