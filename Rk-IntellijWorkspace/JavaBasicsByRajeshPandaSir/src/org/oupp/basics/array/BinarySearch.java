package org.oupp.basics.array;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int arr[],int k){
        int first=0;
        int last=arr.length-1;
        int mid;
        while(first <=last){
            mid=(first+last)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid] < k){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,8,9,10,15,18,22,62,100,455};
        int key=3;
        int pos=binarySearch(arr,key);
        if(pos!=-1){
            System.out.println("Key : "+key+" at index : "+pos);
        }
        else{
            System.out.println("Not found");
        }

    }
}
