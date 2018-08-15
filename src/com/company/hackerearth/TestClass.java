package com.company.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            int count = 0;
            int M = s.nextInt();
            for (int i1 = 0; i1 < M; i1++) {
                int K = s.nextInt();
                if (K % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}