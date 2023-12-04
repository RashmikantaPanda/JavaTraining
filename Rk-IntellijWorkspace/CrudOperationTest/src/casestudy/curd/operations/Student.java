package casestudy.curd.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static casestudy.curd.operations.TestStudentCrudOp.*;

public class Student {
    String name;
    String rollNo;
    String password;
    Address address = new Address();
    Contact contact = new Contact();
    DbConnection connection = new DbConnection();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Student(String name, String rollNo, Address address, Contact contact, String password) throws SQLException {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
        this.contact = contact;
        this.password = password;
    }

    public Student() throws SQLException {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                '}';
    }

    public boolean createNewStudent() throws IOException, SQLException {
        Student s = new Student();
        System.out.println("Enter name : ");
        s.setName(br.readLine());
        System.out.println("Enter roll no : ");
        s.setRollNo(br.readLine());
        System.out.println("Enter your address-");
        System.out.println("Enter your city : ");
        s.getAddress().setCity(br.readLine());
        System.out.println("Enter your state : ");
        s.getAddress().setState(br.readLine());

        System.out.println("Enter contact details-");
        System.out.println("Enter email id : ");
        s.getContact().setEmail(br.readLine());
        System.out.println("Enter phone no : ");
        s.getContact().setPhone(br.readLine());
        System.out.println("Enter password : ");
        s.setPassword(br.readLine());


        String query = "insert into student (name,rollno,city,state,email,phone,password) values (?,?,?,?,?,?,?);";
        PreparedStatement pst = connection.con.prepareStatement(query);
        pst.setString(1, s.getName());
        pst.setString(2, s.getRollNo());
        pst.setString(3, s.getAddress().getCity());
        pst.setString(4, s.getAddress().getState());
        pst.setString(5, s.getContact().getEmail());
        pst.setString(6, s.getContact().getPhone());
        pst.setString(7, s.getPassword());

        int recordCount = pst.executeUpdate();
        if (recordCount > 0) {
            System.out.println(recordCount + " Record Inserted");
            return true;
        } else
            return false;

    }

    public void updateStudent(Student student) throws IOException, SQLException {
        String name, roll, city, state, password, phone;

        System.out.println("What you want to update");
        System.out.println("1. Name");
        System.out.println("2. RollNo");
        System.out.println("3. City");
        System.out.println("4. State");
        System.out.println("5. Password");
        System.out.println("6. Phone number");
        System.out.println("Enter your choice : ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Enter Name : ");
                name = br.readLine();
                student.setName(name);
                break;
            case 2:
                System.out.println("Enter Roll No : ");
                roll = br.readLine();
                student.setRollNo(roll);
                break;
            case 3:
                System.out.println("Enter your city : ");
                city = br.readLine();
                student.getAddress().setCity(city);
                break;
            case 4:
                System.out.println("Enter your state : ");
                state = br.readLine();
                student.getAddress().setState(state);
                break;
            case 5:
                System.out.println("Enter password : ");
                password = br.readLine();
                student.setPassword(password);
                break;
            case 6:
                System.out.println("Enter phone no : ");
                phone = br.readLine();
                student.getContact().setPhone(phone);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        String query = "update student set name=?,rollno=?,city=?,state=?,password=?,phone=? where email=?";
        PreparedStatement pst = connection.con.prepareStatement(query);
        pst.setString(1, student.getName());
        pst.setString(2, student.getRollNo());
        pst.setString(3, student.getAddress().getCity());
        pst.setString(4, student.getAddress().getState());
        pst.setString(5, student.getPassword());
        pst.setString(6, student.getContact().getPhone());
        pst.setString(7, student.getContact().getEmail());

        int status = pst.executeUpdate();
        if (status > 0) {
            System.out.println("Update success");
        } else {
            System.out.println("Something went wrong !");
        }

    }

    public void deleteStudent(Student student) throws Exception {
        System.out.println("You will be logged out if you delete yourself");
        System.out.println("Are you sure for delete ? (Y/N)");
        String choice = br.readLine();
        if (choice.charAt(0) == 'Y' || choice.charAt(0) == 'y') {
            String query = "delete from student where email= ?";
            PreparedStatement pst = connection.con.prepareStatement(query);
            pst.setString(1, student.getContact().getEmail());

            Thread.sleep(2000);
            System.out.println("We are deleting your record");
            Thread.sleep(2000);
            System.out.println("Please wait...");
            Thread.sleep(3000);
            int status = pst.executeUpdate();
            if (status > 0) {
                System.out.println("Record Deleted");
                Thread.sleep(2000);
                System.out.println("Your are Logged out...");
//                System.out.println("Exiting....");
//                System.exit(1);

            } else {
                System.out.println("Redirecting to login");
                dashboard(student, br);
            }
        }
    }

    public void displayAllStudentDetails() throws SQLException {
        String query = "select * from student ;";
        PreparedStatement pst = connection.con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println("\n" + String.format("|%-20s|", rs.getString(2)) + "" + String.format("%-10s|", rs.getString(3)) + "" + String.format("%-10s|", rs.getString(4)) + "" + String.format("%-10s|", rs.getString(5))+ "" + String.format("%-20s|", rs.getString(6))+ "" + String.format("%-11s|", rs.getString(7)));
        }
    }
}
