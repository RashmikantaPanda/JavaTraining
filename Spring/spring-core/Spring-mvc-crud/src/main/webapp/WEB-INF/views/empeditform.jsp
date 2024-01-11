<%@ page import="org.oupp.springmvc.model.Emp" %><%--
  Created by IntelliJ IDEA.
  User: USER 111
  Date: 03-01-2024
  Time: 16:21
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
    <title>Edit Employee</title>
</head>
<body>


<div class="container">
    <div class="row" id="login">
        <div class="col-md-5 mx-auto my-5">
            <div class="card mb-2">
                <h4 class="text-center card-header py-1 text-dark fw-bold">EDIT EMPLOYEE</h4>
            </div>
            <div class="card bg-light fw-bolder">
                <div class="card-body">
                    <%
                        Emp emp = (Emp) request.getAttribute("command");
                        if (emp != null) {

                    %>
                    <form class="" action="/Spring_mvc_crud/editsave" method="post">
                        <div class="row mb-3 " hidden>
                            <label class="col-sm-4 col-form-label">Emp ID</label>
                            <div class="col-sm-8 ">
                                <input type="text" class="form-control" name="id" value="<%=emp.getId()%>" >
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-4 col-form-label">Emp Name</label>
                            <div class="col-sm-8 ">
                                <input type="text" class="form-control" name="name" value="<%=emp.getName()%>" required>
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-4 col-form-label">Salary</label>
                            <div class="col-sm-8 ">
                                <input type="number" class="form-control" name="salary" value="<%=emp.getSalary()%>"
                                       required>
                            </div>
                        </div>
                        <div class="row mb-3">
                            <label class="col-sm-4 col-form-label">Designation</label>
                            <div class="col-sm-8 ">
                                <input type="text" class="form-control" name="designation"
                                       value="<%=emp.getDesignation()%>">
                            </div>
                        </div>
                        <div class="text-center" id="signin-btn">
                            <button type="reset" class="btn btn-danger me-3 ">Clear</button>
                            <button type="submit" class="btn btn-success ">Update</button>
                        </div>
                    </form>
                    <%
                        }
                    %>


                </div>
            </div>
        </div>
    </div>
</div>


</body>
</html>
