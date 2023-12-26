package org.oupp.basics.array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {200, 3, 45, 78, 90, 10, 15, 18, 5, 4};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        int temp, j, kv;
        for (int i = 1; i < arr.length; i++) {
            kv = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > kv; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = kv;
        }
        System.out.println("\nAfter Sorting (INSERTION SORT)");
        Arrays.stream(arr).
                forEach(x -> System.out.print(x + " "));
    }
}
