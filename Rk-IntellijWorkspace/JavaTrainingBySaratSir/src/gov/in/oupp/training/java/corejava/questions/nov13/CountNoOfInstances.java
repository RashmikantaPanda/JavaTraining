package gov.in.oupp.training.java.corejava.questions.nov13;

public class CountNoOfInstances {
    static int instanceCount=0;

    public CountNoOfInstances() {
        instanceCount++;
    }

    public static void main(String[] args) {
        CountNoOfInstances ci1=new CountNoOfInstances();
        CountNoOfInstances ci2=new CountNoOfInstances();
        CountNoOfInstances ci3=new CountNoOfInstances();
        CountNoOfInstances ci4=new CountNoOfInstances();
        CountNoOfInstances ci5=new CountNoOfInstances();
        System.out.println("No of instance created is : "+instanceCount);

    }
}
