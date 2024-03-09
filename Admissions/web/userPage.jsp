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
            <%
                                    String id2 = request.getParameter("id");
                                    request.setAttribute("id2", id2);
            %>
            <form action="ResultSearch?id=${id2}" method="post">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <a style="width: 100px" class="logo" href="#"><img src="style/homepage/images/logo3-removebg-preview.png"></a>
                    <button class="navbar-toggler" type="button" data-tolapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div style="align-items: center;
                         justify-content: center;" class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <%
                                    String id1 = request.getParameter("id");
                                    request.setAttribute("id1", id1);
                                %>
                                <a class="nav-link" href="/Admissions/UserPage.jsp?id=${id1}">HOME</a>
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
                                <a class="nav-link" href="/Admissions/ContactUs">ABOUT</a>
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
                                    <li style="font-size: 15px"><a href="http://localhost:8080/Admissions/SettingUpdate?id=${id}" >Setting</a></li>
                                    <li style="font-size: 15px"><a href="#">Profile</a></li>
                                    <li style="font-size: 15px"><a href="/Admissions/LogOut">LogOut</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>

                </nav>
                <!--                header section start
                                banner section start-->
                <div class="banner_section layout_padding">
                    <div class="container">
                        <h1 class="best_taital">Unlock your potential with us</h1>

                        <div class="box_main">
                            <input type="" class="email_bt" placeholder="Search University" name="searchUniversity">
                            <button class="subscribe_bt"><a>Search</a></button>
                        </div>


                        <p class="there_text">"Empowering Your Dreams: Our Admissions Team is Your Key to Unleashing Potential, 
                            Crafting Success, and Embracing a Future Filled with Promise."</p>
                        <div class="bt_main">
                            <div class="discover_bt"><a href="#">Discover More</a></div>
                        </div>
                    </div>
                </div>
                <!--                banner section end
                                marketing section start-->
                <div class="marketing_section layout_padding">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="job_section">
                                    <h1 class="jobs_text">Marketing Major</h1>
                                    <p class="dummy_text">Marketing refers to all activities a company does to promote and 
                                        sell products or services to consumers. Marketing makes use of the "marketing mix," 
                                        also known as the four Ps—product, price, place, and promotion.</p>
                                    <div class="apply_bt"><a href="/Admissions/ResultSearch?searchUniversity=Marketing">Apply now</a></div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="image_1 padding_0"><img src="style/homepage/images/img-1.png"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--                marketing section end
                                Industrial section start-->
                <div class="marketing_section layout_padding">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="image_1 padding_0"><img src="style/homepage/images/it1.webp"></div>
                            </div>
                            <div class="col-md-6">
                                <div class="job_section_2">
                                    <h1 class="jobs_text">Infomation Technology Major</h1>
                                    <p class="dummy_text">Information technology (IT) is the use 
                                        of computers to store or retrieve data and information. 
                                        IT is usually applied to business operations rather than 
                                        personal or entertainment purposes. IT is a part of 
                                        information and communications technology (ICT). 
                                        IT also includes software, hardware, services, and related resources. 
                                        IT does not include equipment that is acquired by a Federal 
                                        contractor incidental to a Federal contract.
                                    </p>
                                    <div class="apply_bt"><a href="/Admissions/ResultSearch?searchUniversity=IT">Apply now</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--                Industrial section end
                                Corporate section start-->
                <div class="marketing_section layout_padding">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="job_section">
                                    <h1 class="jobs_text">Automation Major</h1>
                                    <p class="dummy_text">Automation describes a wide range of technologies that reduce 
                                        human intervention in processes, namely by predetermining decision criteria,
                                        subprocess relationships, and related actions, as well as embodying those 
                                        predeterminations in machines. Automation has been achieved by various means
                                        including mechanical, hydraulic, pneumatic, electrical, electronic devices</p>
                                    <div class="apply_bt"><a href="/Admissions/ResultSearch?searchUniversity=automation">Apply now</a></div>
                                </div>
                            </div>
                            <div class="col-md-6 padding_0">
                                <div class="image_1"><img src="style/homepage/images/automation1.jpg"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--                Corporate section end
                                Government section start-->
                <div class="marketing_section layout_padding">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6 padding_0">
                                <div class="image_1"><img src="style/homepage/images/logistic.png"></div>
                            </div>
                            <div class="col-md-6">
                                <div class="job_section_2">
                                    <h1 class="jobs_text">Logistics Major</h1>
                                    <p class="dummy_text">Logistics is a part of supply chain management that deals with 
                                        the efficient forward and reverse flow of goods, services,
                                        and related information from the point of origin to the point of consumption 
                                        according to the needs of customers. Logistics management is 
                                        a component that holds the supply chain together. The resources managed in 
                                        logistics may include tangible goods such as materials</p>
                                    <div class="apply_bt"><a href="/Admissions/ResultSearch?searchUniversity=Logistics">Apply now</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--                Government section end
                                footer section start-->
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
            </form>
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


