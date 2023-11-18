package gov.in.oupp.training.java.corejava.questions.nov13;

class Salary{
    float calculateSalary(){
        return 0;
    }
}
class Manager extends Salary{
    @Override
    float calculateSalary() {
        return 50000f;
    }
}
class Developer extends Salary{
    @Override
    float calculateSalary() {
        return 35250f;
    }
}
public class TestSalary {
    public static void main(String[] args) {
        Salary managerSalary=new Manager();
        System.out.println("Manager salary : "+managerSalary.calculateSalary());

        Salary developer=new Developer();
        System.out.println("Developer salary : "+developer.calculateSalary());
    }
}

