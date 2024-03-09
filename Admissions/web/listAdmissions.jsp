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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximumF-scale=1">
        <title>Admissions</title>
        <link rel="stylesheet" href="style/homepage/css/bootstrap.min.css">
        <link rel="stylesheet" href="style/homepage/css/style.css">
        <link rel="stylesheet" href="style/homepage/css/responsive.css">
        <link rel="icon" href="style/homepage/images/fevicon.png" type="image/gif" />
        <link rel="stylesheet" href="style/homepage/css/jquery.mCustomScrollbar.min.css">
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <link rel="stylesheet" href="style/homepage/css/owl.carousel.min.css">
        <link rel="stylesoeet" href="style/homepage/css/owl.theme.default.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
        <style>
            table {
                width: 100%;
                border-collapse: collapse;
            }

            table, th, td {
                border: 1px solid black;
            }

            th {
                background-color: #f2f2f2;
                text-align: left;
            }

            th, td {
                padding: 8px;
                text-align: center;
            }

            tr:nth-child(even) {
                background-color: #f2f2f2;
            }

            tr:nth-child(odd) {
                background-color: #ffffff;
            }

            .table-header {
                font-weight: bold;
            }

            .table-footer {
                background-color: #f2f2f2;
                font-weight: bold;
            }
            /* CSS để căn giữa bảng và điều chỉnh khoảng cách với h5 */
            .middle {
                width: 80%; /* Điều chỉnh kích thước của bảng */
                margin: 0 auto; /* Căn giữa bảng theo chiều ngang */
                padding-top: 20px; /* Điều chỉnh khoảng cách giữa dòng h5 và bảng */
            }

            .middle-top {
                text-align: center; /* Căn giữa nội dung của h5 */
                margin-bottom: 20px; /* Điều chỉnh khoảng cách dưới dòng h5 */
            }

        </style>

</head>
<body>
    <form action="ResultSearch" method="post">
        <!--                header section start-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a style="width: 100px" class="logo" href="#"><img src="style/homepage/images/logo3-removebg-preview.png"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
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
                        <a class="nav-link" href="/Admissions/News.jsp">NEWS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Admissions/university">UNIVERSITY</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Admissions/majorList">MAJOR</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Admissions/ContactUs">ABOUT</a>
                    </li>
                </ul>
            </div>
            <div class="login_text">
                <div class="user-dropdown">
                    <i style="font-size: 30px;" class="fa fa-user"></i>
                    <div class="dropdown-content">
                        <ul>
                            <li style="font-size: 15px"><a href="http://localhost:8080/Admissions/setting.jsp">Setting</a></li>
                            <li style="font-size: 15px"><a href="#">Profile</a></li>
                            <li style="font-size: 15px"><a href="#">LogOut</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <!-- middle table to display admission of university-->
        <div class="middle">
            <div class="middle-top">
                <h1>Result Search University Admissions</h1>
            </div>
            <div class="middle-middel">
                <table border="1">
                    <thead>
                        <tr class="table-header">
                            <th>No</th>
                            <th>Name</th>
                            <th>Description</th>
                            <th>Day Open Register</th>
                            <th>Day close Register</th>
                            <th>Quantity Of Admissions</th>
                            <th>Additions Admissions</th>
                            <th>Other</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listFound}" var="listFound" varStatus="loop">
                            <tr>
                                <td>${loop.index + 1}</td>
                                <td>${listFound.name}</td>
                                <td>${listFound.describe}</td>
                                <td>${listFound.registrationOpeningDate}</td>
                                <td>${listFound.registrationClosingDate}</td>
                                <td>${listFound.quantity}</td>
                                <td>${listFound.admissionConditions}</td>
                               <td><a href="/Admissions/MoreInformation?name=${listFound.name}&&describe=${listFound.describe}&&dayopen=${listFound.registrationOpeningDate}&&daycoderegister=${listFound.registrationClosingDate}&&quantity=${listFound.quantity}&&additions=${listFound.admissionConditions}"
                                       >More Information</a></td>
                        
                        <input type="text" name="id" value="${listFound.id}" hidden>
                        <input type="text" name="name" value="${listFound.name}" hidden>
                        <input type="text" name="describe" value="${listFound.describe}" hidden>
                        <input type="text" name="quantity" value="${listFound.quantity}" hidden>
                        <input type="text" name="additions" value="${listFound.admissionConditions}" hidden>
<!--                        <td><a href="/Admissions/AddNewApplication? name=${listFound.name}&&describe=${listFound.describe}&&quantity=${listFound.quantity}&&add=${listFound.admissionConditions}">Add Admissions</a></td>-->
                                
                            </tr>    
                           
                        </c:forEach>

                    </tbody>
                </table>

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


</body>
</html>


