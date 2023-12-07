package org.oupp.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.oupp.mvc.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		String INSERT_USER_SQL="Insert into employee1 (firstname,lastname,username,password,address,contact) values (?,?,?,?,?,?);";
		int result=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ouppdb","root","root")) {
			PreparedStatement pst = con.prepareStatement(INSERT_USER_SQL);

			pst.setString(1,employee.getFirstName());
			pst.setString(2,employee.getLastName());
			pst.setString(3,employee.getUserName());
			pst.setString(4,employee.getPassword());
			pst.setString(5,employee.getAddress());
			pst.setString(6,employee.getContact());

			result=pst.executeUpdate();

		}
		catch (SQLException e){
			printSQLException(e);
		}
		return result;
	}

	private void printSQLException(SQLException ex){
		for(Throwable e :ex){
			if(e instanceof SQLException){
				e.printStackTrace(System.err);
				System.err.println("SQLState : "+((SQLException)e).getSQLState());
				System.err.println("Error code : "+((SQLException)e).getErrorCode());
				System.err.println("Message : "+e.getMessage());
				Throwable t=ex.getCause();
				while ((t!=null)){
					System.out.println("Cause : "+t);
					t=t.getCause();
				}
			}
		}
	}
}
