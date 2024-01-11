<%--
  Created by IntelliJ IDEA.
  User: USER 111
  Date: 28-12-2023
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup</title>

    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>


</head>

<body>

<div class="container">
    <div class="row" id="login">
        <div class="col-md-5 mx-auto my-5">
            <div class="card mb-2">
                <h4 class="text-center card-header py-1 text-dark fw-bold">SIGN IN</h4>
            </div>
            <div class="card bg-light fw-bold">
                <div class="card-body">
                    <form action="login" method="post">

                        <div class="row mb-3">
                            <label for="inputEmail1" class="col-sm-3 col-form-label">Username
                            </label>
                            <div class="col-sm-9 ">
                                <input type="text" class="form-control" id="inputEmail1"
                                       name="username" placeholder="Enter Username" required>
                            </div>
                        </div>
                        <div class="row mb-4">
                            <label for="inputPassword3" class="col-sm-3 col-form-label">Password</label>
                            <div class="col-sm-9">
                                <input type="password" class="form-control" id="inputPassword3"
                                       placeholder="Enter your Password" name="password">
                            </div>
                        </div>
                        <div class="text-center" id="signin-btn">
                            <button type="submit" class="btn btn-outline-danger">Sign
                                In
                            </button>
                        </div>

                        <div class="text-center mt-3" id="signup-text">
                            <a href="" class="text-decoration-none text-dark "
                               id="dontHaveAcc">Don't have account ?</a> <a
                                class="text-decoration-none " id="needHelp"
                                href="signup">Create One</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>


</body>

</html>
