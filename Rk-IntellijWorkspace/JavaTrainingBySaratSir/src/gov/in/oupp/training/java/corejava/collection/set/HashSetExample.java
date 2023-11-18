package gov.in.oupp.training.java.corejava.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(35);
        set.add(25);

        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        main1();
    }
    public static void main1() {
        Random random=new Random();
        Set<Integer> hashSet=new HashSet<>();
        for(int i=0; i<10; i++){
            int j=random.nextInt(100);
            System.out.println(j);
            hashSet.add(j);
        }
        System.out.println(hashSet);
    }

}
