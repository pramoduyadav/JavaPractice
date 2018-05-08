package com.company.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumbersProduct {


    public static void main(String[] args) throws IOException {

//
//         Scanner s = new Scanner(System.in);
//         int number = s.nextInt();                 // Reading input from STDIN
//
//         int factorial = number;
//
//         for(int i=number-1; i>=1; i--) {
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);

         String str= "Hello".toLowerCase();
         String str2= "eHorl".toLowerCase();

         if(str.length() != str2.length()) {
             System.out.println("Two strings are not of same length");
             return;
         }

         StringBuilder stringBuilder = new StringBuilder(str2);
         boolean charFound = false;
         for(int i=0; i<str.length(); i++) {
            char temp = str.charAt(i);
            for (int j=0; j<stringBuilder.length() ; j++) {
                if(stringBuilder.charAt(j) == temp){
                    stringBuilder.deleteCharAt(j);
                    charFound = true;
                    break;
                } else {
                    charFound = false;
                }
            }
            if(!charFound) {
                break;
            }
         }

        System.out.println(stringBuilder.toString());
        System.out.println(charFound);

//
//         System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//         StringBuilder sb = new StringBuilder();
//
//         for (int i=0 ; i<name.length(); i++) {
//            if(Character.isUpperCase(name.charAt(i))) {
//                sb.append(Character.toLowerCase(name.charAt(i)));
//            } else {
//                sb.append(Character.toUpperCase(name.charAt(i)));
//            }
//         }
//
//          System.out.println(sb.toString());
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String numberCount = br.readLine();
//        String numbers = br.readLine();
//        String [] numArray = numbers.split(" ");
//        if(Integer.valueOf(numberCount).intValue() != numArray.length) {
//            System.out.println("Please input exact numbers");
//            return;
//        }
//
//        long finalProduct = 1;
//        for (String num: numArray) {
//              finalProduct =( finalProduct * Integer.parseInt(num)) % ((long)(Math.pow(10, 9) + 7));
//        }
//
//        System.out.println(finalProduct);
    }

}
