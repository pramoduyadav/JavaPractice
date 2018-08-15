package com.company;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution1 {

    public int solution(int N) {

        char[] charArray = Integer.toBinaryString(N).toCharArray();
        System.out.println(charArray);
        int oldTempCount = 0;
        int newTempCount = 0;

        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == '0') {
                oldTempCount++;
            } else {
                if(oldTempCount > newTempCount) {
                    newTempCount = oldTempCount;
                }
                oldTempCount = 0;
            }
        }

        if(oldTempCount > newTempCount)
            newTempCount = oldTempCount;

        return newTempCount;
    }

    public int solution2(int[] A) {
        int temp = 1;
        int[] sortedArray = Arrays.stream(A)
                                .filter(p -> p > 0)
                                .distinct()
                                .sorted()
                                .toArray();
        int output = 1;
        for(int i=0; i<Arrays.stream(sortedArray).max().getAsInt(); i++) {
            if(!Arrays.asList(sortedArray).contains(i)){
                output = i;
            }
        }

        return output;

    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(15));
    }
}
