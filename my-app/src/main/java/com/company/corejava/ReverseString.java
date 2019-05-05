package com.company.corejava;

public class ReverseString {

    public static String reverse(String orig)
    {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        System.out.println(halfLength);
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
            System.out.println(s[i]);
            System.out.println(s[n-1-i]);
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println( reverse("Praod"));
    }

}
