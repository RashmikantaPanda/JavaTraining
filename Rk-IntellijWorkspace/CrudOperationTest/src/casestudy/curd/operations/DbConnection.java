package casestudy.curd.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    String url = "jdbc:mysql://localhost:3306/ouppdb";
    String username = "root";
    String password = "root";
    Connection con= DriverManager.getConnection(url,username,password);
    Statement st=con.createStatement();

    public DbConnection() throws SQLException {
    }
}
