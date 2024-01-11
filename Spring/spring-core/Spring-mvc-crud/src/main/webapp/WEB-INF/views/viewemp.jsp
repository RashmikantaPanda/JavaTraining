<%@ page import="org.oupp.springmvc.model.Emp" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: USER 111
  Date: 03-01-2024
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<div class="container mt-5">
    <h3 class="text-center my-3">VIEW EMPLOYEE</h3>
    <table class="table table-list-search table-striped table-warning text-center table-bordered table-hover">
        <thead>
        <tr class="table-success">
            <th class="">ID</th>
            <th>Name</th>
            <th>Salary</th>
            <th>Designation</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody class="overflow-scroll">
        <%
            List<Emp> empList = (List<Emp>) request.getAttribute("list");
            if (empList != null) {
                for (Emp emp: empList) {

        %>
                <tr>
                    <td><%= emp.getId()%></td>
                    <td><%= emp.getName()%></td>
                    <td><%= emp.getSalary()%></td>
                    <td><%= emp.getDesignation()%></td>
                    <td><a href="editemp/<%= emp.getId()%>" >Edit</a></td>
                    <td><a href="deleteemp/<%= emp.getId()%>" >Delete</a></td>
                </tr>

        <%
                }
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>
