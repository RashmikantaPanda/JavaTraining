package casestudy.atm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    String customerName;
    Address customerAddress;
    Contact customerContact;
    Account account;
    //    Card card;
    DBConnection connection = new DBConnection();

    public Customer() throws SQLException {
    }

    public Customer(Address address,Contact contact) throws SQLException {
        this.customerName="";
        this.customerAddress = address;
        this.customerContact = contact;
    }
    public Customer(String customerName, Address customerAddress, Contact customerContact) throws SQLException {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;

        String sql = "insert into customer (custName,city,state,country,pin,email,phone,password) values (?,?,?,?,?,?,?,?);";
        PreparedStatement pst = connection.con.prepareStatement(sql);
        pst.setString(1, customerName);
        pst.setString(2, customerAddress.getCity());
        pst.setString(3, customerAddress.getState());
        pst.setString(4, customerAddress.getCountry());
        pst.setInt(5, customerAddress.getPincode());
        pst.setString(6, customerContact.getEmail());
        pst.setString(7, customerContact.getPhone());
        pst.setString(8, "password");

        pst.execute();
        System.out.println("Customer Saved");


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

    public void getAccountDetails(int accNo) {
        try {
//            ResultSet rs = connection.st.executeQuery("select * from account where accNo= "+accNo+" ;");
            ResultSet rs = connection.st.executeQuery("select custName,email,accNo,balance,intrestRate,accType,cardNo,expirydate from customer inner join (account inner join atmcard on account.accId=atmcard.accId) on customer.custId=account.custId  where account.accNo="+accNo+";");
            while (rs.next()) {
//                System.out.println("Account No : "+rs.getInt(3)+"\nAvailable Balance : "+rs.getInt(4)+"\nAccount Type : "+rs.getString(6)+"\nInterest Rate : "+rs.getFloat(5));
                System.out.println("Cusomer Name : "+rs.getString(1)+"\nEmail Id : "+rs.getString(2)+"\nAccount No : "+rs.getString(3)+"\nAvailable Balance : "+rs.getInt(4)+"\nAccount Type : "+rs.getFloat(5)+"\nInterest Rate : "+rs.getString(6)+"\nATM Card No : "+rs.getString(7)+"\nExpiry Date : "+rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getAccountBalance(int accNo){
        int availableBalance=0;
        try{
            ResultSet rs=connection.st.executeQuery("select balance from account where accNo="+accNo+";");
            while (rs.next()){
                availableBalance=(int)rs.getInt(1);
            }
            return availableBalance;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    public Account createSavingAccount() throws SQLException {
        return new SavingAccount();
    }

    public Account createCurrentAccount() throws SQLException {
        return new CurrentAccount();
    }

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
