<%-- 
    Document   : Login
    Created on : Oct 26, 2023, 12:53:09 AM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="style/images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">    
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/vendor/animate/animate.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="style/vendor/css-hamburgers/hamburgers.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/vendor/animsition/css/animsition.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/vendor/select2/select2.min.css">
        <!--===============================================================================================-->	
        <link rel="stylesheet" type="text/css" href="style/vendor/daterangepicker/daterangepicker.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="style/css/util.css">
        <link rel="stylesheet" type="text/css" href="style/css/main.css">
        <!--===============================================================================================-->
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">
                    <div class="login100-form-title" style="background-image: url(style/images/bg-01.jpg);">
                        <span class="login100-form-title-1">
                            Sign In
                        </span>
                    </div>

                    <form action="LoginPage" class="login100-form validate-form">
                        <div>Role: 
                            <select name="role">
                                <option value="user">User</option>
                                <option value="admin">Admin</option>
                            </select></div>
                        <div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
                            <span class="label-input100">Username</span>
                            <input class="input100" type="text" name="user" placeholder="Enter username">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
                            <span class="label-input100">Password</span>
                            <input class="input100" type="password" name="pass" placeholder="Enter password">
                            <span class="focus-input100"></span>
                        </div>

<!--                        <div class="flex-sb-m w-full p-b-30">
                            <div class="contact100-form-checkbox">
                                <input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
                                <label class="label-checkbox100" for="ckb1">
                                    Remember me
                                </label>
                            </div>

                            <div>
                                <a href="/Assignment-Final/Forgot" class="txt1">
                                    Forgot Password?
                                </a>
                            </div>
                        </div>-->
                        <div class="formlogin">
                            <div class="container-login100-form-btn">
                                <button class="login100-form-btn" id="loginButton">
                                    Login
                                </button>
                                <a href="http://localhost:8080/Admissions/SignUp.jsp" class="login100-form-btn" 
                                   style="text-decoration: none; display: block; text-align: center; color: white; padding-top: 15.5px">
                                    Signup
                                </a>

                            </div>
                        </div>

                        <div style="margin-top: 20px">
                            <c:forEach items="${error}" var="e">
                                <h6 style="color: red">${e}</h6>
                            </c:forEach>
                        </div>
                        <!--                        <div style="margin-top: 20px">
                        <c:if test="${not empty error}}">
                            <h6>${error}</h6>
                        </c:if>
                    </div>-->
                    </form>
                </div>
            </div>
        </div>

        <!--===============================================================================================-->
        <script src="style/vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="style/vendor/animsition/js/animsition.min.js"></script>
        <!--===============================================================================================-->
        <script src="style/vendor/bootstrap/js/popper.js"></script>
        <script src="style/vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="style/vendor/select2/select2.min.js"></script>
        <script src="style/vendor/daterangepicker/moment.min.js"></script>
        <script src="style/vendor/daterangepicker/daterangepicker.js"></script>
        <script src="style/vendor/countdowntime/countdowntime.js"></script>
        <!--===============================================================================================-->
        <script src="style/js/main.js"></script>

    </body>
</html>