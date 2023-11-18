package gov.in.oupp.training.java.corejava.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println("Showing elements of ArrayList using for loop : ");
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("Showing elements of arraylist using Iterator");
        Iterator<Integer> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Showing element using for each loop");
        for (Integer i:arrayList) {
            System.out.println(i);
        }

        //set()
        System.out.println("arrayList.set(4,100);");
        arrayList.set(4,100);

        //get()
        System.out.println(arrayList.get(4));

        //remove(Object o)
        System.out.println("arrayList.remove((Integer) 100);");
        arrayList.remove((Integer) 100);
        System.out.println(arrayList);
        //remove(index i)
        System.out.println("arrayList.remove(1);");
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("arrayList.size()");
        System.out.println(arrayList.size());


    }
}
