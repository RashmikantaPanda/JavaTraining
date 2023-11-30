package casestudy.atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestATM {

    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("----------------------------");
        System.out.println("        ATM SIMULATOR       ");
        System.out.println("----------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String name, city, state, country, email, phone, createAcc, applyForATM, input;
        int pin, selectAccType, choice, depositAmount, withdrawAmount, newAtmPin, oldAtmPin, authenticatePin;
        Customer customer;
        DBConnection connection = new DBConnection();
        int accountId = 0;

        System.out.println("Do you want to continue with existing data or new data ?(Y/N)");
        input = sc.nextLine();
        /*If you want to continue with existing customer's details*/
        if (input.charAt(0) == 'Y' || input.charAt(0) == 'y') {

            Account account = new SavingAccount();
            Card card = new Card();
            Address address = new Address();
            Contact contact = new Contact();
            customer = new Customer(address, contact);
            customer.setAccount(account);
            customer.getAccount().setCard(card);
            /*Authentication*/
            System.out.println("Login...");
            System.out.println("Enter email address : ");
            String emailAuth = br.readLine();
            System.out.println("Enter password : ");
            String passwordAuth = br.readLine();

            ResultSet rs = connection.st.executeQuery("select custName,email,phone,city,state,country,pin,accNo,balance,intrestRate,accType,cardNo,expirydate,cardPin,account.accId from customer " +
                    "inner join (account inner join atmcard on account.accId=atmcard.accId)" +
                    " on customer.custId=account.custId where customer.email=\"" + emailAuth + "\" AND customer.password=\"" + passwordAuth + "\";");

            while (rs.next()) {
                customer.setCustomerName(rs.getString(1));

                customer.getCustomerContact().setEmail(rs.getString(2));
                customer.getCustomerContact().setPhone(rs.getString(3));

                customer.getCustomerAddress().setCity(rs.getString(4));
                customer.getCustomerAddress().setState(rs.getString(5));
                customer.getCustomerAddress().setCountry(rs.getString(6));
                customer.getCustomerAddress().setPincode(rs.getInt(7));

                customer.getAccount().setAccountNo(rs.getInt(8));
                customer.getAccount().setBalance(rs.getInt(9));
                customer.getAccount().setInterestRate(rs.getFloat(10));
                customer.getAccount().setAccType(rs.getString(11));

                customer.getAccount().getCard().setCardNumber(rs.getString(12));
                customer.getAccount().getCard().setExpiryDate(rs.getString(13));
                customer.getAccount().getCard().setPin(rs.getInt(14));
                accountId = (int) rs.getInt(15);
                System.out.println("AccId : " + accountId);

            }
            Transaction t;
            ResultSet rs1 = connection.st.executeQuery("select transactionType,amount,date,availableBalance from transactions where accId=" + accountId + ";");
            while (rs1.next()) {
                t = new Transaction();
                t.setTransactionType(rs1.getString(1));
                t.setAmount(rs1.getInt(2));
                t.setTimeStamp(rs1.getTimestamp(3).toLocalDateTime());
                t.setAvailableBalance(rs1.getInt(4));
                customer.getAccount().getTransactions().add(t);
            }
            customer.getAccount().setTransactions(customer.getAccount().getTransactions());
            if (customer.getCustomerName() == "") {
                System.out.println("Invalid Credential. Please Try Again");
                System.exit(0);
            }

        }
        /*If you want to provide new customer's details*/
        else {
            System.out.println("Enter your personal details");
            System.out.println("Enter your name : ");
            name = sc.nextLine();
            System.out.println("Enter your address-");
            System.out.println("Enter your city : ");
            city = sc.nextLine();
            System.out.println("Enter your state : ");
            state = sc.nextLine();
            System.out.println("Enter your country : ");
            country = sc.nextLine();
            System.out.println("Enter your pin code : ");
            pin = Integer.parseInt(br.readLine());
            System.out.println("Enter contact details-");
            System.out.println("Enter email id : ");
            email = sc.nextLine();
            System.out.println("Enter phone no : ");
            phone = sc.nextLine();

            Address address = new Address(city, state, country, pin);
            Contact contact = new Contact(email, phone);
            customer = new Customer(name, address, contact);

            /*-----------------*/

            System.out.println("Do you want to create account ? (Y/N)");
            createAcc = sc.nextLine();
            if (createAcc.charAt(0) == 'y' || createAcc.charAt(0) == 'Y') {
                /*Which types of account you want to create ?*/
                System.out.println("Which types of account you want to create ?");
                System.out.println("1. Saving Account : ");
                System.out.println("2. Current Account : ");
                selectAccType = Integer.parseInt(br.readLine());
                {
                    if (selectAccType == 1) {
                        customer.setAccount(customer.createSavingAccount());
                        System.out.println("Saving account created successfully");
                        System.out.println("Your account number is : " + customer.getAccount().getAccountNo());
                    } else {
                        customer.setAccount(customer.createCurrentAccount());
                        System.out.println("Current account created successfully");
                        System.out.println("Your account number is : " + customer.getAccount().getAccountNo());
                    }
                    try {
                        String emailId = customer.getCustomerContact().getEmail();
                        ResultSet rs = connection.st.executeQuery("select custId from customer where email= \"" + emailId + "\";");
                        int custId = -1;
                        while (rs.next()) {
                            custId = (int) rs.getInt(1);
                        }
                        String sql = "insert into account (custId,accNo,balance,intrestRate,accType) values (?,?,?,?,?);";
                        PreparedStatement pst = connection.con.prepareStatement(sql);

                        pst.setInt(1, custId);
                        pst.setInt(2, customer.getAccount().getAccountNo());
                        pst.setInt(3, customer.getAccount().getBalance());
                        pst.setDouble(4, customer.getAccount().getInterestRate());
                        pst.setString(5, customer.getAccount().getAccType());
                        int recordCount = pst.executeUpdate();
                        System.out.println(recordCount + " Account Record Saved");

                        ResultSet rs1 = connection.st.executeQuery("select accId from account where custId= \"" + custId + "\";");
                        while (rs1.next()) {
                            accountId = (int) rs1.getInt(1);
                        }
                        System.out.println("AccId : " + accountId);

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }

                /*Apply ATM*/
                System.out.println("Do you want to apply for ATM Card ? (Y/N)");
                applyForATM = sc.nextLine();
                if (applyForATM.charAt(0) == 'y' || applyForATM.charAt(0) == 'Y') {
                    customer.getAccount().createCard();
                    System.out.println("Card issued successfully");
                    System.out.println("Card Number : " + customer.getAccount().getCard().getCardNumber());
                    System.out.println("Expiry Date: " + customer.getAccount().getCard().getExpiryDate());

                    try {

                        int accNo = customer.getAccount().getAccountNo();

                        ResultSet rs = connection.st.executeQuery("select accId from account where accNo= " + accNo + ";");
                        int idAccount = -1;
                        while (rs.next()) {
                            idAccount = (int) rs.getInt(1);
                        }
                        String sql = "insert into atmcard (accId,cardNo,expiryDate,cardPin) values (?,?,?,?);";
                        PreparedStatement pst = connection.con.prepareStatement(sql);

                        pst.setInt(1, idAccount);
                        pst.setString(2, customer.getAccount().getCard().getCardNumber());
                        pst.setString(3, customer.getAccount().getCard().getExpiryDate());
                        pst.setInt(4, customer.getAccount().getCard().getPin());

                        int recordCount = pst.executeUpdate();
                        System.out.println(recordCount + " Card Detail Saved");

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                } else {
                    System.out.println("You can't do any transactions without ATM");
                }
            }
            /*-----------------*/


        }
        /*Can do the following things after having an account and ATM Card*/
        do {
            System.out.println("\nYou can do the following things");
            System.out.println("0. EXIT");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Card Details");
            System.out.println("6. Change ATM Pin");
            System.out.println("7. View Transaction History");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 0:
                    choice = 0;
                    System.out.println("Thank you for using our service. \nExited");
                    break;
                case 1:
                    customer.getAccountDetails(customer.getAccount().getAccountNo());
                    break;
                case 2:
                    System.out.println("Available Balance : " + customer.getAccountBalance(customer.getAccount().getAccountNo()));
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposit : ");
                    depositAmount = Integer.parseInt(br.readLine());
                    if (customer.getAccount().deposit(depositAmount, accountId)) {

                        String sql = "Update account Set balance=  ? WHERE accNo= ? ;";

                        try (PreparedStatement pst = connection.con.prepareStatement(sql)) {
                            pst.setDouble(1, customer.getAccount().getBalance());
                            pst.setInt(2, customer.getAccount().getAccountNo());
                            pst.executeUpdate();
                        }

                        System.out.println("Deposit Success");
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;
                case 4:
                    System.out.println("Enter your ATM Pin");
                    authenticatePin = Integer.parseInt(br.readLine());
                    System.out.println("Enter the amount to be withdraw : ");
                    withdrawAmount = Integer.parseInt(br.readLine());
                    if (customer.getAccount().withdraw(authenticatePin, withdrawAmount, accountId)) {

                        String sql = "Update account Set balance=  ? WHERE accNo= ? ;";
                        try (PreparedStatement pst = connection.con.prepareStatement(sql)) {
                            pst.setDouble(1, customer.getAccount().getBalance());
                            pst.setInt(2, customer.getAccount().getAccountNo());
                            pst.executeUpdate();
                        }

                        System.out.println("Withdraw Success");
                    } else {
                        System.out.println("Withdraw Unsuccessful !");
                    }
                    break;
                case 5:
                    System.out.println(customer.getAccount().getCard());
                    break;
                case 6:
                    System.out.println("Enter the old PIN : ");
                    oldAtmPin = Integer.parseInt(br.readLine());
                    System.out.println("Enter the new PIN");
                    newAtmPin = Integer.parseInt(br.readLine());
                    if (customer.getAccount().getCard().changePin(oldAtmPin, newAtmPin)) {

                        String sql = "Update atmcard Set cardPin= ? WHERE cardNo= ? ;";

                        try (PreparedStatement pst = connection.con.prepareStatement(sql)) {
                            pst.setInt(1, customer.getAccount().getCard().getPin());
                            pst.setString(2, customer.getAccount().getCard().getCardNumber());
                            pst.executeUpdate();
                        }

                        System.out.println("Pin changed successfully");
                    } else {
                        System.out.println("Please enter the valid pin");
                    }
                    break;
                case 7:
                    customer.getAccount().miniStatement();
                    break;

                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        } while (choice != 0);


    }

}
