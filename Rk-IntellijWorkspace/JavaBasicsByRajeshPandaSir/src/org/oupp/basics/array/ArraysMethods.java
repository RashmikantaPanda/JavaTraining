package org.oupp.basics.array;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,8,};
        int arr2[]={2,3,4,5,8};

        String[] str1={"abc","def","ghi"};
        String[] str2={"abc","def","ghi","jkl"};
        System.out.println(Arrays.toString(Arrays.copyOf(str2, 2)));
        System.out.println(Arrays.toString(Arrays.copyOf(str2, 12)));

        System.out.println(Arrays.equals(arr1,arr2));

       Arrays.fill(arr2,3,5,10);
       Arrays.stream(arr2).forEach(System.out::println);
    }
}
