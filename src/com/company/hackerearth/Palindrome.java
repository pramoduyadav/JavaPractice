package com.company.hackerearth;

import java.util.*;

public class Palindrome {

    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        if(name.length() < 1 || name.length() >100) {
            System.out.println("String should not be less than 1 and greater than 100.");
            return;
        }

        char[] a = name.toCharArray();
        char[] newArray =  new char[a.length];

        for (int i=a.length-1, j=0 ; i >= 0; i--, j++) {
            newArray[j] = a[i];
        }

        if(String.valueOf(newArray).equalsIgnoreCase(name)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
