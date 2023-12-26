package org.oupp.basics.array;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr={9,10,18,12,15,11,1,6};
        int max=arr[arr.length-1];
        System.out.println(max);
        for(int i= arr.length-2; i>=0; i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
