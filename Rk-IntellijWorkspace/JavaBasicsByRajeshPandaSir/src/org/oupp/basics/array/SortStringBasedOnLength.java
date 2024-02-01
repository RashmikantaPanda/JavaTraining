/**
 * Custom Sorting:
 * Create a Java program that takes an array of strings and sorts them based on the length of each string.
 *
 * Example:
 *
 * Input: ["apple", "banana", "kiwi", "orange", "grape"]
 * Output: ["kiwi", "grape", "apple", "banana", "orange"]
 * */

package org.oupp.basics.array;

import java.util.Arrays;

public class SortStringBasedOnLength {
    public static void main(String[] args) {
        String[] arr={"apple", "banana", "kiwi", "orange", "grape"};
        System.out.println("Before Sorting : ");
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));

        System.out.println("\nAfter Sorting (Based on length of the string");
        Arrays.stream(sortStringBasedOnLength(arr)).forEach(x-> System.out.print(x+" "));

    }

    public static String[] sortStringBasedOnLength(String[] strArr){
        for(int i=0; i<strArr.length; i++){
            for (int j=0; j< strArr.length-1; j++){
                if(strArr[j].length()> strArr[j+1].length()){
                    var temp=strArr[j+1];
                    strArr[j+1]=strArr[j];
                    strArr[j]=temp;
                }
            }
        }
        return strArr;
    }
    
}
