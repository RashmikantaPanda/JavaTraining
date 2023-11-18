package gov.oupp.training.java.corejava.questions.nov15;

class Student{
    private int roll;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface Filter{
    void filter(Student s);
}
class NameFilter implements Filter{

    @Override
    public void filter(Student student) {
        System.out.println(student.getName());
    }
}

class AgeFilter implements Filter{

    @Override
    public void filter(Student s) {
        System.out.println(s.getAge());
    }
}

class RollFilter implements Filter{

    @Override
    public void filter(Student s) {
        System.out.println(s.getRoll());
    }
}
public class TestFilter {
    public static void main(String[] args) {
        Student student=new Student(152,"RK Panda",23);
        NameFilter nameFilter=new NameFilter();
        nameFilter.filter(student);

        AgeFilter ageFilter=new AgeFilter();
        ageFilter.filter(student);

        RollFilter rollFilter=new RollFilter();
        rollFilter.filter(student);
    }
}
