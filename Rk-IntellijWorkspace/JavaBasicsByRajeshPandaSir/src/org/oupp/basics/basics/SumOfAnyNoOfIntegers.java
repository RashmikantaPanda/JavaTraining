package org.oupp.basics.basics;

public class SumOfAnyNoOfIntegers {
    public static int sumOfIntegers(int... args){
        int sum=0;
        for (int i : args) {
            sum = sum + i;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfIntegers(10,15,5,12,32,15,24,65,45,8));
    }
}
