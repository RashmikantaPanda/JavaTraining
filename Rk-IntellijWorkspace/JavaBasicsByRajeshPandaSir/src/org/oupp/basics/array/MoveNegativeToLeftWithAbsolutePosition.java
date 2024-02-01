/**
 * Array Manipulation:
 * Write a Java program that takes an array of integers and rearranges its elements so that all negative numbers appear before the positive numbers, maintaining relative order.
 * <p>
 * Example:
 * <p>
 * Input: [-2, 3, -7, 10, 5, -8]
 * Output: [-2, -7, -8, 3, 10, 5]
 */


package org.oupp.basics.array;

import java.util.Arrays;

public class MoveNegativeToLeftWithAbsolutePosition {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -7, 10, 5, -8};
        Arrays.stream(moveNegativeToLeft2(arr)).forEach(x -> System.out.print(x + " "));
    }

    public static int[] moveNegativeToLeft2(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                for (int k = i; k > j + 1; k--) {
                    int tempK = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = tempK;
                }
                j++;
            }
        }
        return arr;
    }
}
