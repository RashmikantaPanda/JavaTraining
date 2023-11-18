package gov.in.oupp.training.java.corejava.collection.list.sorting.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.id > s2.id)
            return 1;
        else
            return -1;

    }
}
public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> studList=new ArrayList<>();
        studList.add(new Student(3,"Bob"));
        studList.add(new Student(1,"John"));
        studList.add(new Student(4,"Morn"));
        studList.add(new Student(2,"Andy"));

        System.out.println("Before Sorting");
        for (Student s:studList){
            System.out.println("Id : "+s.id+" Name : "+s.name);
        }

        System.out.println("Sorting by name");
        Collections.sort(studList,new NameComparator());
        for (Student s:studList){
            System.out.println("Id : "+s.id+" Name : "+s.name);
        }

        System.out.println("Sorting by id");
        Collections.sort(studList,new IdComparator());
        for (Student s:studList){
            System.out.println("Id : "+s.id+" Name : "+s.name);
        }
    }
}
