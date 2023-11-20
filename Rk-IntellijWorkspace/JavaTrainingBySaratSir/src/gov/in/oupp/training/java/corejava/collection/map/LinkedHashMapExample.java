package gov.in.oupp.training.java.corejava.collection.map;

import java.util.*;

/*In linkedHashMap insertion order will preserve. But in HashMap it does not maintain the insertion order */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(1,"Alok");
        linkedHashMap.put(2,"Tarini");
        linkedHashMap.put(3,"Jyoti");
        linkedHashMap.put(4,"Sourav");

        System.out.println(linkedHashMap);

        Set<Integer> keys=linkedHashMap.keySet();
        Collection<String > values=linkedHashMap.values();
        System.out.println(keys);
        System.out.println(values);

        for(Integer k:keys){
            System.out.println("Key : "+k+" Values : "+linkedHashMap.get(k));
        }
    }
}
