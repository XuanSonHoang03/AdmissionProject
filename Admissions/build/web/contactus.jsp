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
        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="style/contactus/css/style.css">
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
        <c:if test="${check != 'user'}">
            <div style="  display: flex;
                 flex-direction: column;
                 justify-content: center;
                 align-items: center;
                 height: 100vh;">
                <div style="font-size: 40px">You Must Login to page before access this page</div>
                <button style="width: 130px; height: 60px"><a style=" font-size: 20px; text-decoration: none; display: flex; align-content: center; justify-content: center" href="/Admissions/LoginPage">Login</a></button>
            </div>
        </c:if>
        <c:if test="${check == 'user'}">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a style="width: 100px" class="logo" href="#"><img src="style/homepage/images/logo3-removebg-preview.png"></a>
                <button class="navbar-toggler" type="button" data-tolapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div style="align-items: center;
                     justify-content: center;" class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="/Admissions/UserPage.jsp">HOME</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://localhost:8080/Admissions/News.jsp">NEWS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Admissions/university">UNIVERSITY</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Admissions/majorList"">MAJOR</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/Admissions/contactus.jsp">ABOUT</a>
                        </li>
                    </ul>
                </div>
                <div class="login_text">
                    <div class="user-dropdown">
                        <i style="font-size: 35px;" class="fa fa-user"></i>
                        <div class="dropdown-content">
                            <ul>
                                <%
                                    String user = (String) request.getAttribute("user");
                                %>
                                <li style="font-size: 15px"><a href="http://localhost:8080/Admissions/setting.jsp?id=${user}">Setting</a></li>
                                <li style="font-size: 15px"><a href="#">Profile</a></li>
                                <li style="font-size: 15px"><a href="#">LogOut</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

            </nav>
            <section class="ftco-section">
                <div style="margin-top: -100px" class="container">
                    <div class="row justify-content-center">
                        <div class="col-md-6 text-center mb-5">
                            <h2 class="heading-section">Contact Us</h2>
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-lg-10">
                            <div class="wrapper">
                                <div class="row no-gutters">
                                    <div class="col-md-6 d-flex align-items-stretch">
                                        <div class="contact-wrap w-100 p-md-5 p-4 py-5">
                                            <h3 class="mb-4">Write us</h3>
                                            <div id="form-message-warning" class="mb-4"></div> 
                                            <div id="form-message-success" class="mb-4">
                                                Your message was sent, thank you!
                                            </div>
                                            <form method="POST" id="contactForm" name="contactForm" class="contactForm">
                                                <div class="row">
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <input style="background-color: #666666" type="text" class="form-control" name="name" id="name" placeholder=" Name">
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12"> 
                                                        <div class="form-group">
                                                            <input style="background-color: #666666" type="email" class="form-control" name="email" id="email" placeholder=" Email">
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <input style="background-color: #666666" type="text" class="form-control" name="subject" id="subject" placeholder=" Subject">
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <textarea style="background-color: #666666" name="message" class="form-control" id="message" cols="30" rows="6" placeholder=" Message"></textarea>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12">
                                                        <div class="form-group">
                                                            <input type="submit" value="Send Message" class="btn btn-primary">
                                                            <div class="submitting"></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                    <c:forEach items="${list}" var="l">
                                    <div class="col-md-6 d-flex align-items-stretch">
                                        <div class="info-wrap w-100 p-md-5 p-4 py-5 img">
                                            <h3>Contact information</h3>
                                            <p class="mb-4">We're open for any suggestion or just to have a chat</p>
                                            <div class="dbox w-100 d-flex align-items-start">
                                                <div class="icon d-flex align-items-center justify-content-center">
                                                    <span class="fa fa-map-marker"></span>
                                                </div>
                                                <div class="text pl-3">
                                                    <p><span>Address:</span>${l.adress}</p>
                                                </div>
                                            </div>
                                            <div class="dbox w-100 d-flex align-items-center">
                                                <div class="icon d-flex align-items-center justify-content-center">
                                                    <span class="fa fa-phone"></span>
                                                </div>
                                                <div class="text pl-3">
                                                    <p><span>Phone:</span> <a href="tel://1234567920">${l.phone}</a></p>
                                                </div>
                                            </div>
                                            <div class="dbox w-100 d-flex align-items-center">
                                                <div class="icon d-flex align-items-center justify-content-center">
                                                    <span class="fa fa-paper-plane"></span>
                                                </div>
                                                <div class="text pl-3">
                                                    <p><span>Email:</span> <a href="mailto:info@yoursite.com">${l.email}</a></p>
                                                </div>
                                            </div>
                                            <div class="dbox w-100 d-flex align-items-center">
                                                <div class="icon d-flex align-items-center justify-content-center">
                                                    <span class="fa fa-globe"></span>
                                                </div>
                                                <div class="text pl-3">
                                                    <p><span>Website</span> <a href="http://localhost:8080/Admissions/News.jsp">${l.website}</a></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
                                <div class="footer_section layout_padding">
                    <div class="container">
                        <h1 class="subscribr_text">Register Now</h1>
                        <p class="lorem_text">With your information now. 
                            We will contact for you to give you more information about admissions. 
                            Please check your email about some minute
                        <div class="box_main_2">
                            <textarea type="" class="email_bt_2" placeholder="Enter Your Email" name=""></textarea>
                        </div>
                        <button class="subscribe_bt_2"><a href="#">Send to email</a></button>
                    </div>
                </div>
                <!--                footer section end
                                copyright section start-->
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
    </body>
</html>


