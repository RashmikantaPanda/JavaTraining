package org.oupp.basics.array;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        Integer[] arr ={10,12,10,45,10,12,10,10,10,10,10,10,10,10,10,10,10,78,56,32,45};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Integer count=0;
        for(int i=0; i<arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                Integer v=hashMap.get(arr[i]);
                hashMap.put(arr[i],++v);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);

        for(Integer i: hashMap.keySet()){
            if(hashMap.get(i)>arr.length/2){
                System.out.println(i);
            }
        }
    }
}
