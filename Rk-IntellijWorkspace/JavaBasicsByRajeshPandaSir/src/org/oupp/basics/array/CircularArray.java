/**
 * Circular Array Rotation:
 * Implement a method to rotate the elements of an array to the right by a given number of positions in a circular manner.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5], k = 2
 * Output: [4, 5, 1, 2, 3]
 * */

package org.oupp.basics.array;

import java.util.Arrays;

public class CircularArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int curr, next;
        int resultArr[]=rotateArray(2,arr);
        Arrays.stream(resultArr).forEach(x-> System.out.print(x+" "));

    }

    public static int[] rotateArray(int k, int arr[]) {
        int length = arr.length;
        for (int j = 0; j < k; j++) {
            int bigTemp=arr[0];
            for (int i = 0; i < arr.length; i++) {
                int temp=arr[(i+1)%length];
                arr[(i+1)%length]=bigTemp;
                bigTemp=temp;
            }
        }
        return arr;
    }

}
