package org.oupp.mvc.controller;

import org.oupp.mvc.dao.EmployeeDao;
import org.oupp.mvc.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class EmployeeController extends HttpServlet {
    private static final long serialVersionUID=1l;

    private EmployeeDao employeeDao;
    public void init(){
        employeeDao=new EmployeeDao();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String firstName=request.getParameter("firstname");
        String lastName=request.getParameter("lastname");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String address=request.getParameter("address");
        String contact=request.getParameter("contact");

        Employee employee=new Employee();

        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUserName(username);
        employee.setPassword(password);
        employee.setAddress(address);
        employee.setContact(contact);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("employeeDetails.jsp");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
