package org.oupp.basics.generic;

interface Pair<K, V> {
    public K getKey();

    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        OrderedPair<String, Integer> pair1 = new OrderedPair<>("EVEN", 100);
        OrderedPair<String, Integer> pair2 = new OrderedPair<>("ODD", 103);

        System.out.println("Key : "+pair1.getKey()+" Value : "+pair1.getValue());
        System.out.println("Key : "+pair2.getKey()+" Value : "+pair2.getValue());

        OrderedPair<String,Double> pair3=new OrderedPair<>("PI",3.14);

    }


}
