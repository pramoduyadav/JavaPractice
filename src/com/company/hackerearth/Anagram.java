package com.company.hackerearth;

import java.io.*;

public class Anagram {

    public static void main(String[] args) {

        int testCases = 0;
        String word1 = "";
        String word2 = "";
        int numDeletions = 0;

        // create a buffered reader to get inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            testCases = Integer.parseInt(br.readLine());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Loop once for each test case
        for(int i = 0; i < testCases; i++) {

            numDeletions = 0;

            // read the two words that we'll operate on
            try {

                word1 = br.readLine();
                word2 = br.readLine();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // Force each word into all lower case
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            for(char currentChar = 'a'; currentChar < 'z'+1; currentChar++) {

                int word1CharCnt = 0;
                int word2CharCnt = 0;

                // Count how many currentChar's there are in word 1
                for(int j = 0; j < word1.length(); j++) {
                    if(word1.charAt(j) == currentChar) {
                        word1CharCnt++;
                    }
                }

                // Count how many currentChar's there are in word 2
                for(int k = 0; k < word2.length(); k++) {
                    if(word2.charAt(k) == currentChar) {
                        word2CharCnt++;
                    }
                }

                // The number of deletions will be the difference in count between the two words.
                System.out.print("currentChar ::"+currentChar);
                System.out.print("  word1CharCnt ::"+word1CharCnt);
                System.out.print("  word2CharCnt ::"+word2CharCnt);

                numDeletions += Math.abs(word2CharCnt - word1CharCnt);
                System.out.println("  numDeletions ::"+numDeletions);

            }

            // Output the result
            System.out.println(numDeletions);
        }
    }
}