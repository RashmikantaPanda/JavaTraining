package gov.in.oupp.training.java.corejava.collection.map;

import java.util.*;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> identityHashMap=new IdentityHashMap<>();
        /*IdentityHashMap uses reference equality instead of object equality when comparing keys.
        In an IdentityHashMap, two keys are considered equal if and only if they are the same object, rather than being equal in terms of their contents*/
        identityHashMap.put(new Integer(1),"Alok");
        identityHashMap.put(new Integer(1),"Tarini");
        identityHashMap.put(3,"Jyoti");
        identityHashMap.put(4,"Sourav");

        System.out.println(identityHashMap);

        Set<Integer> keys=identityHashMap.keySet();
        Collection<String > values=identityHashMap.values();
        System.out.println(keys);
        System.out.println(values);

        for(Integer k:keys){
            System.out.println("Key : "+k+" Values : "+identityHashMap.get(k));
        }
    }
}
