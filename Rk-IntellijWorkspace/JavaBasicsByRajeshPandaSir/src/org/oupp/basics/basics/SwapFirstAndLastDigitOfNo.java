package org.oupp.basics.basics;

import static java.lang.Math.*;

public class SwapFirstAndLastDigitOfNo {
    public static void main(String[] args) {
        int n=1234;
        int lastDigit=0;
        int firstDigit=0;

        int length= (int) log10(n);
        lastDigit=n%10;  //4
        firstDigit= (int) (n/(pow(10,length)));  //1
        n= (int) ((int) (lastDigit*pow(10,length))+(n-(firstDigit*pow(10,length))-lastDigit+firstDigit));
        System.out.println(n);

    }
}
