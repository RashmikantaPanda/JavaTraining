package casestudy.atm;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;


class Account {
    int accountNo;
    int balance;
    double interestRate;
    String accType;


    Card card;
    ArrayList<Transaction> transactions = new ArrayList<>();


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


    public Account() throws SQLException {

    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
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

    boolean deposit(int amount, int accId) {
        if (amount > 0) {
            this.balance += amount;
            Transaction t = new Transaction("credit", amount, LocalDateTime.now(), balance);
            transactions.add(t);
            try {
                DBConnection connection = new DBConnection();
                String sql = "Insert into transactions (accId,transactionType,amount,date,availableBalance) values (?,?,?,?,?);";  //date removed
                try (PreparedStatement pst = connection.con.prepareStatement(sql)) {
                    pst.setInt(1, accId);
                    pst.setString(2, "Credit");
                    pst.setInt(3, t.getAmount());
                    pst.setTimestamp(4, Timestamp.valueOf(t.getTimeStamp()));
                    pst.setInt(5, t.getAvailableBalance());
                    pst.executeUpdate();
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            return true;
        } else {
            return false;
        }

    }

    boolean withdraw(int pin, int amount, int accId) {

        if (card.authenticate(pin)) {
            if (this.balance >= amount) {
                this.balance -= amount;
                Transaction t = new Transaction("debit", amount, LocalDateTime.now(), this.balance);
                this.transactions.add(t);
                try {
                    DBConnection connection = new DBConnection();
                    String sql = "Insert into transactions (accId,transactionType,amount,date,availableBalance) values (?,?,?,?,?);";
                    try (PreparedStatement pst = connection.con.prepareStatement(sql)) {
                        pst.setInt(1, accId);
                        pst.setString(2, "Debit");
                        pst.setInt(3, t.getAmount());
                        pst.setTimestamp(4, Timestamp.valueOf(t.getTimeStamp()));
                        pst.setInt(5, t.getAvailableBalance());
                        pst.executeUpdate();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                return true;
            } else {
                System.out.println("Insufficient Balance");
                return false;
            }
        } else {

            System.out.println("Incorrect Pin");
            return false;
        }
    }

    /*We can use miniStatement or We can use the toString() of Transaction class to view the transaction details*/
    public void miniStatement() {
        if (transactions.size() == 0) {
            System.out.println("No transactions available");
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'T' HH:mm:ss");
            System.out.println("--------Account Statements--------");
            for (Transaction t : transactions) {
                System.out.println("\n" + String.format("|%-7s|", t.getTransactionType()) + "" + String.format("%-10s|", t.getAmount()) + "" + String.format("%-25s|", t.getTimeStamp().format(formatter) + "" + String.format("|%11s|", t.getAvailableBalance()) + "\n"
                        + String.format("|%7s|", "") + "" + String.format("%10s|", "") + "" + String.format("%21s|", "") + "" + String.format("%11s", "")));
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

    public SavingAccount(int accountNo, int balance, double interestRate) throws SQLException {
        super();
    }

    public SavingAccount() throws SQLException {
        super();

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

    public CurrentAccount(int accountNo, int balance, double interestRate) throws SQLException {
        super();
    }

    public CurrentAccount() throws SQLException {
        super();

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
