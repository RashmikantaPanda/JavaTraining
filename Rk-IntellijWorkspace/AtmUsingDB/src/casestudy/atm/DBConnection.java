package casestudy.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    String url = "jdbc:mysql://localhost:3306/atmdb";
    String username = "root";
    String password = "root";
    Connection con= DriverManager.getConnection(url,username,password);
    Statement st=con.createStatement();

    public DBConnection() throws SQLException {


    }
}
