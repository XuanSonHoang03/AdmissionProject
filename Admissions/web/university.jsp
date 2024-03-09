<%-- 
    Document   : university
    Created on : Nov 4, 2023, 3:27:44 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
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
                        <li><a href="/Admissions/majorList"">MAJOR</a></li>
                        <li><a href="/Admissions/contactus.jsp">ABOUT</a></li>
                    </ul>
                </div>
                <div class="select-area">
                    <form action="filter">
                        <select name="name" class="select-items" id="selectRegion">
                            <option value="mienbac">Miền Bắc</option>
                            <option value="mientrung">Miền Trung</option>
                            <option value="miennam">Miền Nam</option>
                        </select>
                    </form>
                </div>
                <div class="table-responsive">
                    <table class="table table-striped custom-table">
                        <thead>
                            <tr>
                                <th scope="col">No</th>
                                <th scope="col">Code</th>
                                <th scope="col">Name</th>
                                <th scope="col">Area</th>
                                <th scope="col">Location</th>
                                <th scope="col">Type</th>
                            </tr>
                        </thead>
                        <c:forEach items="${listU}" var="u" varStatus="loop">
                            <tbody>
                                <tr scope="row">
                                    <td>${loop.index + 1}</td>
                                    <td><a href="#">${u.code}</a></td>
                                    <td>
                                        ${u.name}
                                        <small class="d-block">${u.nameEnglish}</small>
                                    </td>
                                    <td>${u.area}</td>
                                    <td>${u.location}</td>
                                    <td><a href="#" class="more">${u.type}</a></td>
                                </tr>
                            </tbody>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
        <script>
            const selectRegion = document.getElementById('selectRegion');

            // Kiểm tra nếu có giá trị đã lưu trữ trong Local Storage
            const storedValue = localStorage.getItem('selectedRegion');
            if (storedValue) {
                selectRegion.value = storedValue; // Gán giá trị đã lưu trữ cho select
            }

            selectRegion.addEventListener('change', function () {
                const selectedValue = selectRegion.value;
                const urlMapping = {
                    'mienbac': '/Admissions/filter?name=mienbac',
                    'mientrung': '/Admissions/filter?name=mientrung',
                    'miennam': '/Admissions/filter?name=miennam'
                };
                const targetUrl = urlMapping[selectedValue];

                if (targetUrl) {
                    localStorage.setItem('selectedRegion', selectedValue); // Lưu giá trị đã chọn vào Local Storage
                    window.location.href = targetUrl;
                }
            });
        </script>
        <script src="style/university/js/jquery-3.3.1.min.js"></script>
        <script src="style/university/js/popper.min.js"></script>
        <script src="style/university/js/bootstrap.min.js"></script>
        <script src="style/university/js/main.js"></script>
    </body>
</html>
