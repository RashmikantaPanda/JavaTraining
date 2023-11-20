package gov.in.oupp.training.java.corejava.collection.map;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        main1();
        main2();
    }


    public static void main1() {
        /*Creating Map<Integer,String> */
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Alok");
        hashMap.put(2,"Tarini");
        hashMap.put(3,"Jyoti");
        hashMap.put(4,"Sourav");

        System.out.println(hashMap);

        Set<Integer> keys=hashMap.keySet();
        Collection<String > values=hashMap.values();
        System.out.println(keys);
        System.out.println(values);

        for(Integer k:keys){
            System.out.println("Key : "+k+" Values : "+hashMap.get(k));
        }
        System.out.println("Display using Map.Entry ");
        for(Map.Entry<Integer,String> mapEntry: hashMap.entrySet()){
            System.out.println("Key : "+mapEntry.getKey()+" Values : "+mapEntry.getValue());
        }
    }
    public static void main2() {
        /*Generating random keys and values*/
        System.out.println("Generating random keys and values");
        Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        Random random=new Random();

        for(int i=0; i<10; i++){
            hashMap.put(random.nextInt(10),random.nextInt(100));
        }
        System.out.println(hashMap);

    }
}
