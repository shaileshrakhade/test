package oops;

import java.util.*;

public class SplitArrayToChunks {
    public static void main(String[] args) {
//        Split an array into chunks of specific size. (size=3) & return te counts of arrays

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = 3;
        int chunked = chunk(input, chunkSize);
        System.out.println("chunk size is :: " + chunked);
    }

    public static int chunk(int[] input, int chunkSize) {
        int size = 0;
        int index = 0;
        int[] newCharArray = new int[chunkSize];
        for (int i = 0; i < input.length; i++) {
            if (index == chunkSize) {
                size++;
                index = 0;
                i--;
                System.out.println(Arrays.toString(newCharArray));
                newCharArray = new int[chunkSize];
            } else {
                newCharArray[index] = input[i];
                index++;
            }
            if (i == input.length - 1) {
                System.out.println(Arrays.toString(newCharArray));
                size++;
            }
        }

        return size;
    }
}

