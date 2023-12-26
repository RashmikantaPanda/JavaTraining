package org.oupp.basics.array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={200,3,45,78,90,10,15,18,5,4};
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        int temp;
        for(int i=0; i< arr.length-1; i++){
            int index=i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[index]){
                    index=j;
                }
            }
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            System.out.println();
            Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
        }
        System.out.println("After Sorting (SELECTION SORT");
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));

    }
}


