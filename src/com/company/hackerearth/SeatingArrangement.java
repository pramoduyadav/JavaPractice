package com.company.hackerearth;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeatingArrangement {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(r.readLine());
        while (T-->0) {
            int N = Integer.parseInt(r.readLine())-1;
            int row = N/6;
            int y = 0;
            int o = N%6;
            int oN = 0;
            int oR;
            if (row%2==0) {
                y = o;
                oN += 5-y;
                oR = row+1;
            } else {
                y = 5-o;
                oN += y;
                oR = row-1;
            }
            oN += oR*6+1;
            w.write(oN+" ");
            if (y == 0 || y == 5) {
                w.write("WS\n");
            } else if (y == 1 || y == 4) {
                w.write("MS\n");
            } else {
                w.write("AS\n");
            }
        }
        w.flush();
    }

}
