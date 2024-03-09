<%-- 
    Document   : major
    Created on : Nov 4, 2023, 9:34:17 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="style/university/fonts/icomoon/style.css">
        <link rel="stylesheet" href="style/university/css/owl.carousel.min.css">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="style/university/css/bootstrap.min.css">
        <!-- Style -->
        <link rel="stylesheet" href="style/university/css/style.css">
        <title>University</title>
    </head>
    <body>
        <div class="content">
            <div class="container">
                <div class="header">
                    <ul>
                        <li><a href="/Admissions/UserPage.jsp">HOME</a></li>
                        <li><a href="/Admissions/News.jsp">NEWS</a></li>
                        <li><a href="/Admissions/university">UNIVERSITY</a></li>
                        <li><a href="/Admissions/majorList">MAJOR</a></li>
                        <li><a href="/Admissions/contactus.jsp">ABOUT</a></li>
                    </ul>
                </div>
                <form action="majorList" method="post">
                    <div class="search-major">
                        <input name="contain-major" type="text">
                        <button type="submit">Search</button>
                    </div>
                </form>
                <div class="table-responsive">
                    <table class="table table-striped custom-table">
                        <thead>
                            <tr>
                                <th scope="col">No</th>
                                <th scope="col">Code</th>
                                <th scope="col">Name</th>
                                <th scope="col">Subject</th>
                                <th scope="col">Major</th>
                            </tr>
                        </thead>
                        <c:forEach items="${listM}" var="u" varStatus="loop">
                            <tbody>
                                <tr scope="row">
                                    <td>${loop.index + 1}</td>
                                    <td><a href="#">${u.code}</a></td>
                                    <td>
                                        ${u.name}
                                    </td>
                                    <td>${u.subject}</td>
                                    <td>${u.majorName}</td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
        <script src="style/university/js/jquery-3.3.1.min.js"></script>
        <script src="style/university/js/popper.min.js"></script>
        <script src="style/university/js/bootstrap.min.js"></script>
        <script src="style/university/js/main.js"></script>
    </body>
</html>
