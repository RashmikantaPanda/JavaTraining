package org.oupp.basics.array;

public class MoveAllTheNegativeElementToTheBegining {
    public static void swap(int a, int b) {
        int temp = 0;
        temp = b;
        b = a;
        a = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 18, -12, 15, 11, -1, 6, -4, 5, 8, -6, 45, -11, 12, 14, 15};
        int left = 0, right = arr.length - 1;
        int temp = 0;
        while (left < right) {
            if (arr[right] < 0 && arr[left] > 0) {
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            if (arr[right] > 0 && arr[left] < 0) {
                left++;
                right--;
            }
            if (arr[right] > 0) {
                right--;
            }
            else{
                arr[left]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
