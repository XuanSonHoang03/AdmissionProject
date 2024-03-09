<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- <%-- 
    Document   : homepage
    Created on : Oct 26, 2023, 1:07:34 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>
    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximumF-scale=1">
        <!-- title -->
        <title>Admissions</title>
        <!-- bootstrap css -->
        <link rel="stylesheet" href="style/homepage/css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="style/homepage/css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="style/homepage/css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="style/homepage/images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="style/homepage/css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <!-- owl stylesheets --> 
        <link rel="stylesheet" href="style/homepage/css/owl.carousel.min.css">
        <link rel="stylesoeet" href="style/homepage/css/owl.theme.default.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">

    </head>
    <body>
        <c:if test="${check != 'admin'}">
            <div style="  display: flex;
                 flex-direction: column;
                 justify-content: center;
                 align-items: center;
                 height: 100vh;">
                <div style="font-size: 40px">You Must Login to page before access this page</div>
                <button style="width: 130px; height: 60px"><a style=" font-size: 20px; text-decoration: none; display: flex; align-content: center; justify-content: center" href="/Admissions/LoginPage">Login</a></button>
            </div>
        </c:if>
        <c:if test="${check == 'admin'}">
            <form action="ResultSearch" method="post">
                <!--                header section start-->
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <a class="logo" href="#"><img src="style/homepage/images/logo3-removebg-preview.png"></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" href="/Admissions/AdminPage">MANAGE</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/Admissions/AdminAdmissionsControll">ADMISSIONS</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/Admissions/manageUniversity">UNIVERSITY</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/Admissions/manageMajor">MAJOR</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="services.html">CONTACT</a>
                            </li>
                        </ul>
                    </div>
                    <div class="login_text">
                        <div class="user-dropdown">
                            <i style="font-size: 35px;" class="fa fa-user"></i>
                            <div class="dropdown-content">
                                <%
                                    String id = request.getParameter("id");
                                    request.setAttribute("id", id);
                                %>
                                <ul>
                                    <li style="font-size: 15px"><a href="/Admissions/LogOut">LogOut</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </nav>
                <div style="display: flex; justify-content: center; margin-top: 20px;" class="middle">
                    <table style="border-collapse: collapse; width: 80%; margin: 20px auto;" border="1">
                        <thead>
                            <tr>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">ID Applicant</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">Name Applicant</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">ID Program</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">Name Program</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">Action</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">Day Send Application</th>
                                <th style="background-color: #f2f2f2; font-weight: bold; text-align: center; padding: 8px;">Save</th>
                            </tr>
                        </thead>
                        <c:forEach items="${list}" var="l">
                            <tr>
                                <td style="text-align: center; padding: 8px;">${l.ID_Applicants}</td>
                                <td style="text-align: center; padding: 8px;">${l.getName_Applicant()}</td>
                                <td style="text-align: center; padding: 8px;">${l.ID_Programs}</td>
                                <td style="text-align: center; padding: 8px;">${l.name_Program}</td>
                                <td style="text-align: center; padding: 8px;">${l.status}</td>
                                <td style="text-align: center; padding: 8px;">${l.getDaySendApplication()}</td>
                                <td style="text-align: center; padding: 8px;"><a style="text-decoration: none;" href="#">Save</a></td>
                            </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
                <!--Corporate section start-->
                <div class="container-fluid">
                    <p class="lorem_text">With your information now. 
                    <div class="copyright_section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-6">
                                    <p class="copyright_text">Made By HE172036 - HOANG XUAN SON - FPT UNIVERSITY<a></a></p>
                                </div>
                                <div class="col-md-6">
                                    <p class="cookies_text">Cookies, Privacy and Terms</p>
                                </div>
                            </div>
                        </div>
                    </div>
            
        </c:if>
        <!-- copyright section end-->


        <!-- JavaScript files -->
        <script src="style/homepage/js/jquery.min.js"></script>
        <script src="style/homepage/js/popper.min.js"></script>
        <script src="style/homepage/js/bootstrap.bundle.min.js"></script>
        <script src="style/homepage/js/jquery-3.0.0.min.js"></script>
        <script src="style/homepage/js/plugin.js"></script>
        <!-- Sidebar -->
        <script src="style/homepage/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="style/homepage/js/custom.js"></script>
        <!-- JavaScript -->
        <script src="style/homepage/js/owl.carousel.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".fancybox").fancybox({
                    openEffect: "none",
                    closeEffect: "none"
                });
            });
        </script>
    </body>
</html>


