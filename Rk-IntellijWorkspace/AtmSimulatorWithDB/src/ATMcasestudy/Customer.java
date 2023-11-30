package org.oupp.assginments.ATMcasestudy;

public class Customer {
    String customerName;
    Address customerAddress;
    Contact customerContact;
    Account account;
//    Card card;

    public Customer() {
//        System.out.println("Enter your personal details");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        this.customerName=sc.nextLine();
    }

    public Customer(String customerName, Address customerAddress, Contact customerContact) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Contact getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Contact customerContact) {
        this.customerContact = customerContact;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

//    public Card getCard() {
//        return card;
//    }
//
//    public void setCard(Card card) {
//        this.card = card;
//    }

    public Account createSavingAccount() {
        return new SavingAccount();
    }
    public Account createCurrentAccount() {
        return new CurrentAccount();
    }
//    public Card createCard(){
//        return new Card();
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerAddress=" + customerAddress +
                ", customerContact=" + customerContact +
                ", account=" + account +
                '}';
    }
}
