package org.oupp.basics.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={2,3,45,78,90,10,15,18,22,62,100,455};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        int temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("\nAfter Sorting (BUBBLE SORT)");
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }
}
