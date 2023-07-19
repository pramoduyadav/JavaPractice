package com.company.java11;

public class VarClass {
    public static void main(String[] args) {

        var chant = "     INDIA!!      ";
        // These are the only new methods added in String class in java 11
        System.out.println("chant.repeat(3) :: "+chant.repeat(3));
        System.out.println("chant.isBlank() :: "+chant.isBlank());
        System.out.println("chant.strip() :: '"+chant.strip()+"'");
        System.out.println("chant.stripLeading() :: "+chant.stripLeading());
        System.out.println("chant.stripTrailing() :: "+chant.stripTrailing());
        System.out.println("chant.lines() :: "+chant.lines().count());

        // Run command "java VarClass.java" on command line since java 11


    }
}
