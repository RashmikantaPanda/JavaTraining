package gov.oupp.training.java.corejava.questions.nov15;
interface Payment{
    void pay();
}
class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment using Credit Card");
    }
}
class DebitCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment using Debit Card");
    }
}
class NetBankingPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment using NetBanking");
    }
}
public class TestPayment {
    public static void main(String[] args) {
        Payment creditCard=new CreditCardPayment();
        creditCard.pay();

        Payment debitCard=new DebitCardPayment();
        debitCard.pay();

        Payment netBanking=new NetBankingPayment();
        netBanking.pay();
    }
}
