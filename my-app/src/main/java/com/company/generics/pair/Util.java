package com.company.generics.pair;


public class Util {
    public static void main(String[] args) {
        generics.pair.Pair<String, String> p1 = new generics.pair.Pair<String, String>("Harish", "Pramod");
        generics.pair.Pair<String, String> p2 = new generics.pair.Pair<String, String>("Pramod", "Pramod");
        System.out.println(compare(p1,p2));

    }
    public static <K, V> boolean compare(generics.pair.Pair<K, V> p1, generics.pair.Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}