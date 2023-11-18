package gov.oupp.training.java.corejava.casestudies.ATMcasestudy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;


class Account {
    int accountNo;
    int balance;
    double interestRate;
    Card card;
    ArrayList<Transaction> transactions = new ArrayList<>();


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }



    public Account() {

    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }


    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    int checkBalance() {
        return this.balance;
    }

    public Card createCard() {
        this.card = new Card();
        return card;
    }

    boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            Transaction t = new Transaction("credit", amount, LocalDateTime.now(),balance);
            transactions.add(t);

            return true;
        } else {
            return false;
        }

    }

    boolean withdraw(int pin, int amount) {

        if (card.authenticate(pin)) {
            if (this.balance >= amount) {
                this.balance -= amount;
                Transaction t = new Transaction("debit", amount, LocalDateTime.now(),this.balance);
                this.transactions.add(t);
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    /*We can use miniStatement or We can use the toString() of Transaction class to view the transaction details*/
    public void miniStatement(){
        if(transactions.size()==0)
        {
            System.out.println("No transactions available");
        }
        else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'T' HH:mm:ss");

            for (Transaction t : transactions) {
                System.out.println("\n" + String.format("|%-7s|", t.getTransactionType()) + "" + String.format("%-10s|", t.getAmount()) + "" + String.format("%-25s|", t.getTimeStamp().format(formatter) +""+ String.format("|%11s|", t.getAvailableBalance()) + "\n"
                        + String.format("|%7s|", "") + "" + String.format("%10s|", "") + "" + String.format("%25s|", "") + "" + String.format("%11s|", "")));
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", card=" + card +
                ", transactions=" + transactions +
                '}';
    }
}

class SavingAccount extends Account {
    String accType = "Saving";

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public SavingAccount(int accountNo, int balance, double interestRate) {
        super();
    }

    public SavingAccount() {

        Random random = new Random();
        super.accountNo = random.nextInt(90000000, 999999999);
        super.balance = 1000;
        super.interestRate = 3.5;

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "accType='" + accType + '\'' +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", card=" + card +
                ", transactions=" + transactions +
                '}';
    }
}


class CurrentAccount extends Account {
    String accType = "Current";

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public CurrentAccount(int accountNo, int balance, double interestRate) {
        super();
    }

    public CurrentAccount() {

        Random random = new Random();
        super.accountNo = random.nextInt(90000000, 999999999);
        super.balance = 100000;
        super.interestRate = 1.5;

    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accType='" + accType + '\'' +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", card=" + card +
                ", transactions=" + transactions +
                '}';
    }
}
