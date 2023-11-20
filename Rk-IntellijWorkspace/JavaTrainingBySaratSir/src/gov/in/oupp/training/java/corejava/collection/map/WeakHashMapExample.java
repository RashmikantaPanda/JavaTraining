package gov.in.oupp.training.java.corejava.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class User{
    @Override
    public String toString() {
        return "User";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
public class WeakHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        /*In case of WeakHashMap, if object is specified as key doesn’t contain any references-
          it is eligible for garbage collection even though it is associated with WeakHashMap.
          i.e Garbage Collector dominates over WeakHashMap.
        * */

        Map<User,String> weakHashMap=new WeakHashMap<>();
        User u=new User();
        weakHashMap.put(u,"Rk Panda");
        System.out.println(weakHashMap);
        u=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(weakHashMap);

        /*OUTPUT :
         *   {User=Rk Panda}
         *   Finalize method called
         *   {}
         **/
    }

    public static void main1(String[] args) throws InterruptedException {
        /*Even though the object is specified as key in hashmap, it does not have any reference
        and it is not eligible for garbage collection if it is associated with HashMap i.e. HashMap dominates over Garbage Collector.
        * */

        Map<User,String> hashMap=new HashMap<>();
        User u=new User();
        hashMap.put(u,"Rk Panda");
        System.out.println(hashMap);
        u=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(hashMap);

        /*OUTPUT :
        *   {User=Rk Panda}
        *   {User=Rk Panda}
        * */
    }
}
