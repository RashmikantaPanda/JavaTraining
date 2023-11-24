package gov.in.oupp.training.java.corejava.io.serialization.usingInheritance;

import java.io.Serializable;

public class Person implements Serializable {
    int i=10;
}

class Employee extends Person {
    int j=20;
}
