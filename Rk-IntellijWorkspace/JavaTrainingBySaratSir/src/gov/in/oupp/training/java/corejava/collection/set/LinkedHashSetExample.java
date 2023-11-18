package gov.in.oupp.training.java.corejava.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Random random=new Random();
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        for(int i=0; i<10; i++){
            int j=random.nextInt(100);
            System.out.println(j);
            linkedHashSet.add(j);
        }
        System.out.println(linkedHashSet);
    }
}
