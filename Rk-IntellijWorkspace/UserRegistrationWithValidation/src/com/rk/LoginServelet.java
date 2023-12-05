package com.rk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServelet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String username = null;
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(validate(out,email,password)){

			try {
				DbConnection connection=new DbConnection();
				String sqlQuery="select * from signup where email=? AND password=? ;";
				PreparedStatement ps=connection.con.prepareStatement(sqlQuery);
				ps.setString(1,email);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					username=rs.getString(3);
				}
				if(username!=null){
					HttpSession session=request.getSession();
					session.setAttribute("user", username);
					response.sendRedirect("Welcome");  /*Redirecting to another servlet "WelcomeServlet" to show the welcome message*/
				}
				else {
					out.print("Invalid Credential ! Login failed");
					RequestDispatcher rd=request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}
			} catch (SQLException | ClassNotFoundException e) {
				throw new RuntimeException(e);
			}

		}
		else{
//			out.print("Invalid Credential ! Login failed");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

	private boolean validate(PrintWriter out,String email, String password) {
		if (email == null) {
			out.println("<h4>Email can not be empty</h4>");
			return false;
		}
		if (password == null) {
			out.println("<h4>Password can not be empty</h4>");
			return false;
		}
		return true;
	}
}
