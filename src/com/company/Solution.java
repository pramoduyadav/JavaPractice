package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        double tip = meal_cost * (tip_percent/(double)100);
        System.out.println(tip);
        double tax = meal_cost * (tax_percent/(double)100);
        System.out.println(tax);
        double totalCost = meal_cost + tip + tax;
        System.out.println(Math.round(totalCost));

        in.close();
    }
}