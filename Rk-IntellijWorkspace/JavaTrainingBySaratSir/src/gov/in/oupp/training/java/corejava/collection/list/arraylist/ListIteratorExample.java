package gov.in.oupp.training.java.corejava.collection.list.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println(list);

        ListIterator<Integer> iterator=list.listIterator();
        System.out.println("Forward Direction");
/*
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
        while (iterator.hasNext()){
            int i=iterator.next();
            if(i==70) {
                iterator.set(7);    /*It will replace 70 with 7*/
                iterator.add(700);  /*It will add 700 as a next element*/
            }
            else {
                System.out.println("Hi");
            }
        }
        System.out.println(list);

        /*We can only use backward direction only after completing the forward direction*/
        System.out.println("Backward Direction");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }




    }
}
