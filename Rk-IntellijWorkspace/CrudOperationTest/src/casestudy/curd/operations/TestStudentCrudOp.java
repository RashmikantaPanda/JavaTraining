package casestudy.curd.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestStudentCrudOp {

    public static void main(String[] args) throws Exception {
        home();
    }

    public static void home() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student();
        while (true) {
            System.out.println("1. Login ");
            System.out.println("2. Register ");
            System.out.println("3. Exit ");
            String input = br.readLine();

            switch (input) {
                case "1":
                    if (login(student, br))
                        dashboard(student, br);
                    break;
                case "2":
                    register(student, br);
                    home();
                    break;
                case "3":
                    System.out.println("Are you sure for EXIT ? (Y/N)");
                    String ch = br.readLine();
                    if (ch.charAt(0) == 'Y' || ch.charAt(0) == 'y') {
                        System.out.println("Thank you for using our service.");
                        System.out.println("Exiting");
                        System.exit(1);
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private static boolean login(Student student, BufferedReader br) throws Exception {
        DbConnection connection = new DbConnection();
        System.out.println("Enter email id : ");
        String email = br.readLine();
        System.out.println("Enter password : ");
        String password = br.readLine();
        String query = "select * from student where email=? and password=?;";
        PreparedStatement pst = connection.con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();
        int id = -1;
        while (rs.next()) {
            student.setName(rs.getString(2));
            student.setRollNo(rs.getString(3));
            student.getAddress().setCity(rs.getString(4));
            student.getAddress().setState(rs.getString(5));
            student.getContact().setEmail(rs.getString(6));
            student.getContact().setPhone(rs.getString(7));
            student.setPassword(rs.getString(8));
            id = rs.getInt(1);
        }

        if (id != -1) {
            System.out.println("Login in Successful");
            return true;
        } else {
            System.out.println("Login Failed. Invalid username or password !!!");
            return false;
        }
    }

    private static void register(Student student, BufferedReader br) throws IOException, SQLException {
        if (student.createNewStudent()) {
            System.out.println("Registration Success");
        } else {
            System.out.println("Something went wrong ! Registration Failed !!!");
        }
    }

    public static void dashboard(Student student, BufferedReader br) throws Exception {
        int choice = 0;
        do {
            System.out.println("\nYou can do the following things");
            System.out.println("0. LOGOUT");
            System.out.println("1. Create New Student");
            System.out.println("2. Update Student Details");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Student Details");
            System.out.println("5. Display All Student Details");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 0:
                    System.out.println("Logged Out");
                    break;
                case 1:
                    student.createNewStudent();
//                    dashboard(student,br);
                    break;
                case 2:
                    student.updateStudent(student);
                    break;
                case 3:
                    student.deleteStudent(student);
                    choice = 0;
                    break;
                case 4:
                    System.out.println(student);
//                    student.displayStudentDetail();
                    break;
                case 5:
                    student.displayAllStudentDetails();
                    break;

            }
        } while (choice != 0);

        home();
    }
}
