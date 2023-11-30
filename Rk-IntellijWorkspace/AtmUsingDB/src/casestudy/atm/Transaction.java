package casestudy.atm;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    String transactionType;
    int amount;
    LocalDateTime timeStamp;
    int availableBalance;

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Transaction() {
    }

    public Transaction(String transactionType, int amount, LocalDateTime timeStamp,int availableBalance) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.availableBalance=availableBalance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

        return
                ""+String.format("|%-7s|",transactionType)+""+String.format("%-10s|",amount)+""+String.format("%20s|",timeStamp.format(formatter))+""+String.format("%15s|",availableBalance)+"\n"
                +String.format("|%-7s|","")+""+String.format("%-10s|","")+""+String.format("%20s|","")+""+String.format("%15s|","");

    }
}
