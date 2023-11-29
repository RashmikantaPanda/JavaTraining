package gov.in.oupp.training.java.corejava.jdbc;

import java.util.HashMap;
import java.util.Objects;

class Customer {
    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
}

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(100, "RK Panda");
        Customer customer2 = new Customer(100, "RK Panda");

        System.out.println(customer1.hashCode());
        System.out.println(customer2.hashCode());

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1==customer2);

        HashMap<Customer, String> hashMap=new HashMap<>();
        hashMap.put(customer1,"Customer1");
//        hashMap.put(customer2,"Customer2");
        String result=hashMap.get(customer2);
        System.out.println(result);
    }
}
