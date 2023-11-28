package gov.oupp.training.java.corejava.questions.nov25;

public class QuestionNo2 {
    public static void main(String[] args) {
        Employee e1=new Employee("Tanini Panda","Marketing",1500);

        Employee e2=new Employee(e1.getName(),e1.getDepartment(),e1.getSalary());

        System.out.println(e1);
        System.out.println(e2);
    }
}
