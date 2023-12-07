<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>Registration</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
    <style>
.registrationForm {
	align-items: center;
	justify-content: center;
}
.regForm{
	margin-top:100px;
	border: solid black 2px;

}

    </style>
</head>

<body>
<div class="container">
    <div class="col-sm-12 col-md-6 col-lg-4 container regForm">
        <h5 class="text-center">Employee Registration</h5>

        <form action="<%= request.getContextPath()%>/register" method="post"  class="registrationForm">
            <table>
                <tr>
                    <td class="pe-5">First Name</td>
                    <td><input type="text" name="firstname"></td>
                </tr>
                <tr>
                    <td class="pe-5">Last Nmame :</td>
                    <td><input type="text" name="lastname"></td>
                </tr>
                <tr>
                    <td class="pe-5">Username :</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td class="pe-5">Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td class="pe-5">Address</td>
                    <td><input type="password" name="address"></td>
                </tr>
                <tr>
                    <td class="pe-5">Contact</td>
                    <td><input type="password" name="contact"></td>
                </tr>

                <tr>
                    <td><button class="" type="submit">Register</button></td>
                </tr>

            </table>
            <a href="#">Already have account ? Login Here</a>

        </form>
    </div>
</div>
</body>

</html>