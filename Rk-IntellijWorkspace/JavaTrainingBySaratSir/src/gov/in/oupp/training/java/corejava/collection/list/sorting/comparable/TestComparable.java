package gov.in.oupp.training.java.corejava.collection.list.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student st) {
        if(st.id < id)
            return 1;
        else
            return -1;
    }


}

public class TestComparable {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1=new Student(2,"C");
        Student s2=new Student(1,"A");
        Student s3=new Student(4,"D");
        Student s4=new Student(3,"B");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (Student s:list){
            System.out.println("Id : "+s.id+" Name : "+s.name);
        }

        Collections.sort(list);
        System.out.println("After sorting");
        for (Student s:list){
            System.out.println("Id : "+s.id+" Name : "+s.name);
        }

    }
}
