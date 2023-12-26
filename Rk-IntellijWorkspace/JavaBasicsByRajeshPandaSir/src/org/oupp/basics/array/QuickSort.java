package org.oupp.basics.array;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr,int l,int r){
        int pivot=arr[r];
        int i=l-1;
        int temp;
        for(int j=l; j<=r-1; j++){
            if(arr[j]<pivot){
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int l,int r){
        if(l<r){
            int p=partition(arr,l,r);
            quickSort(arr,l,p-1);
            quickSort(arr,p+1,r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {200, 3, 45, 78, 90, 10, 15, 18, 5, 4};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        quickSort(arr,0,arr.length-1);
        System.out.println("\nAfter Sorting (QUICK SORT)");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

    }
}
