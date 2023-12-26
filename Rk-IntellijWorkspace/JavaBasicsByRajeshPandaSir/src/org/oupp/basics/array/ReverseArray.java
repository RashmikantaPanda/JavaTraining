package org.oupp.basics.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={9,10,18,12,15,11,1,6};
        int temp=0;
        for (int i=0,j= arr.length-1; i<j; i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
