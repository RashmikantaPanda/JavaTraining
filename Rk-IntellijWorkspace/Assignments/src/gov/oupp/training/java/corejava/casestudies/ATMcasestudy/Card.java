package gov.oupp.training.java.corejava.casestudies.ATMcasestudy;

import java.util.Random;

public class Card {
    String cardNumber;
    String expiryDate;
    int pin;

    public Card(String cardNumber, String expiryDate, int pin) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public Card() {
        Random random = new Random();
        int cardNumber1 = random.nextInt(1000, 9999);
        int cardNumber2 = random.nextInt(2000, 8888);
        int cardNumber3 = random.nextInt(3000, 7777);
        int cardNumber4 = random.nextInt(4000, 6666);
        this.cardNumber = String.valueOf(cardNumber1 + "-" + cardNumber2 + "-" + cardNumber3 + "-" + cardNumber4);
        this.expiryDate="01/01/2030";
        this.pin=1234;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean changePin(int oldPin,int newPin){
        if(oldPin==getPin()){
            this.pin=newPin;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean authenticate(int pin){
        if(this.pin==pin){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", pin=" + pin +
                '}';
    }
}
