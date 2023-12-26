package org.oupp.basics.generic;

public class GenericClassEx {

    public static <E> void printArray(E[] elements){
        for(E x:elements){
            System.out.println(x);
        }
    }

    /**
     * Swap any two types (Using Generator)*/
    public static <T> void swap(T a,T b){
      T temp;
      temp=a;
      a=b;
      b=temp;
        System.out.println("a = "+a+" b = "+b);
    }


    public static void main(String[] args) {
        Integer[] intArr={10,20,50,30,12};
        Character[] charArr={'O','U','P','P'};
        printArray(intArr);
        printArray(charArr);

        swap(20,30);/*Calling the swap method that will swap any types*/
        swap("XYZ","ABC");
        swap(true,false);
    }
}
