package gov.in.oupp.training.java.corejava.collection.set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Random random=new Random();
        Set<Integer> treeSet=new TreeSet<>();
        for(int i=0; i<10; i++){
            int j=random.nextInt(100);
            System.out.println(j);
            treeSet.add(j);
        }
        System.out.println(treeSet);
        main1();
    }

    public static void main1() {
        Random random=new Random();
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("Rk Panda");
        treeSet.add("TP Panda");
        treeSet.add("JB Pradhan");
        System.out.println(treeSet);
    }

}
