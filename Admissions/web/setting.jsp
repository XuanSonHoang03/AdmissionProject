<%-- 
    Document   : setting
    Created on : Nov 3, 2023, 4:45:53 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link rel="stylesheet" href="style/setting/style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>
        <div class="container">
            <div class="main-body">
                <c:forEach items="${list}" var="l">

                    <!-- Breadcrumb -->
                    <nav aria-label="breadcrumb" class="main-breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="/Admissions/UserPage.jsp?id=${l.idUser}">Home</a></li>
                            <li class="breadcrumb-item active" aria-current="page">User Profile</li>
                        </ol>
                    </nav>
                    <!-- /Breadcrumb -->

                    <div class="row gutters-sm">
                        <div class="col-md-4 mb-3">
                            <div class="card">
                                <div class="card-body">
                                    <div class="d-flex flex-column align-items-center text-center">
                                        <img src="https://bootdey.com/img/Content/avatar/avatar7.png" alt="Admin"
                                             class="rounded-circle" width="150">
                                        <div class="mt-3">
                                            <h4>${name}</h4>
                                            <p class="text-secondary mb-1">Student</p>
                                            <p class="text-muted font-size-sm">${l.location} - Viet Nam</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card mt-3">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item d-flex justify-content-between align-items-center flex-wrap">
                                        <h6 class="mb-0"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                                                              viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                              stroke-linecap="round" stroke-linejoin="round"
                                                              class="feather feather-globe mr-2 icon-inline">
                                            <circle cx="12" cy="12" r="10"></circle>
                                            <line x1="2" y1="12" x2="22" y2="12"></line>
                                            <path
                                                d="M12 2a15.3 15.3 0 0 1 4 10 15.3 15.3 0 0 1-4 10 15.3 15.3 0 0 1-4-10 15.3 15.3 0 0 1 4-10z">
                                            </path>
                                            </svg>Website</h6>
                                        <span class="text-secondary"><a href="/Admissions/UserPage.jsp?id=${l.idUser}">Admissions</a></span>
                                    </li>

                                </ul>
                            </div>
                        </div>


                        <div class="col-md-8">
                            <div class="card mb-3">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Full Name</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            
                                            ${l.name}

                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Gender</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${l.gender}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Email</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${l.email}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Phone</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${l.phone}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">DOB</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${l.dob}
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h6 class="mb-0">Address</h6>
                                        </div>
                                        <div class="col-sm-9 text-secondary">
                                            ${l.location}
                                        </div>
                                    </div>
                                    <hr>      
                                    <div class="row" style="color: white; text-decoration: none">
                                          <div class="col-sm-12">
                                              <button class="btn btn-info " target="__blank" >
                                                  <a style="color: white; text-decoration: none" href="/Admissions/updateProfile?id=${l.idUser}">Edit</a></button>
                                            </div>
                                        </div>
                                            <div style="margin-top: 10px; " class="row">
                                            <div class="col-sm-12">
                                                <button class="btn btn-info " target="__blank" >
                                                    <a style="color: white; text-decoration: none" href="/Admissions/DeleteAccount?id=${l.idUser}">Delete Account</a></button>
                                            </div>
                                        </div>
                                            
<!--                                                        <input type="text" value="${l.id}" name="id" hidden>
                                                        <input type="text" value="${l.name}" name="name" hidden>
                                                        <input type="text" value="${l.gender}" name="gender" hidden>
                                                        <input type="text" value="${l.email}" name="email" hidden>
                                                        <input type="text" value="${l.phone}" name="phone" hidden>
                                                        <input type="text" value="${l.dob}" name="dob" hidden>
                                                        <input type="text" value="${l.location}" name="address" hidden>
                                    -->

                                </div>
                            </div>
                        </c:forEach>


                        <div class="col-md-16">
                            <div class="card mb-3">
                                <div class="card-body">
                                    <h3 style="color: blue;">Register</h3>
                                    <div style="justify-content: center;" class="row">

                                        <table  border="1px">
                                            <thead>
                                                <tr>
                                                    <th>Name</th>
                                                    <th>ID Program</th>
                                                    <th>Name of Program</th>
                                                    <th>Action</th>
                                                    <th>File Application</th>
                                                    <th>Day of application</th>
                                                </tr>
                                            </thead>
                                            <c:forEach items="${lista}" var="a">
                                                <tbody>
                                                    <tr>
                                                        <td>${a.name_Applicants}</td>-
                                                        <td>${a.ID_Programs}</td>
                                                        <td>${a.name_Program}</td>
                                                        <td>${a.result}</td>
                                                        <td>${a.file}</td>
                                                        <td>${a.dateOfPublication}</td>
                                                    </tr>
                                                </tbody>
                                            </c:forEach>
                                        </table>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </body>

</html>