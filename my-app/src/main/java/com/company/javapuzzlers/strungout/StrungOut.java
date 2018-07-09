package com.company.javapuzzlers.strungout;

public class StrungOut {
    public static void main(String[] args) {
        // JVM doesn't know about main method and
        // throws Exception in thread "main" java.lang.NoSuchMethodError: main
        String s = new String("Hello world");
        System.out.println(s);
    }
}

class String {
    private final java.lang.String s;
    public String(java.lang.String s) {
        this.s = s;
    }
    public java.lang.String toString() {
        return s;
    }
}
