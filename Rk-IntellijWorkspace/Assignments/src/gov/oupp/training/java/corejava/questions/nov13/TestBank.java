package gov.oupp.training.java.corejava.questions.nov13;

class Bank{
    float calculateIntrest(){
        return 0;
    }
}
class SavingAccount extends Bank{
    @Override
    float calculateIntrest() {
        return 3.5f;
    }
}
class LoanAccount extends Bank{
    @Override
    float calculateIntrest() {
        return 12.5f;
    }
}
public class TestBank {
    public static void main(String[] args) {
        Bank savingAcc=new SavingAccount();
        System.out.println("Saving Acc interest : "+savingAcc.calculateIntrest());

        Bank loanAcc=new LoanAccount();
        System.out.println("Loan Acc interest : "+loanAcc.calculateIntrest());
    }
}
