package com.company;

public class Equaltest {
    public static void main(String[] args) {
        String str1 = new String("ABCD");
        String str2 = new String("ABCD");
        String str4 = "Hello" + '}'; // Concat String + literal
        System.out.println(str4);

        String str = "";

        if("".equals(str)) {
            System.out.println("".equals(str));
        } else {
            System.out.println("".equals(str));
        }
//
//
//        if (str1 == str2) {
//            System.out.println("String 1 == String 2 is true");
//        } else {
//            System.out.println("String 1 == String 2 is false");
//            String Str3 = str2;
//            if (str2 == Str3) {
//                System.out.println("String 2 == String 3 is true");
//            } else {
//                System.out.println("String 2 == String 3 is false");
//            }
//            if (str1.equals(str2)) {
//                System.out.println("String 1 equals string 2 is true");
//            } else {
//                System.out.println("String 1 equals string 2 is false");
//            }
//        }
    }
}
