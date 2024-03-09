<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Update Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
            }
            .container {
                max-width: 800px;
                margin: 0 auto;
                padding: 20px;
                background-color: #fff;
                border: 1px solid #ccc;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            }
            table {
                width: 100%;
                border-collapse: collapse;
            }
            th, td {
                padding: 8px;
                border: 1px solid #ccc;
                text-align: center;
            }
            th {
                background-color: #f2f2f2;
                font-weight: bold;
            }
            input[type="text"] {
                width: 85%;
                padding: 5px;
            }
            input[type="submit"] {
                background-color: #007bff;
                color: #fff;
                padding: 10px 20px;
                border: none;
                cursor: pointer;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2>Update Values</h2>
            <form action="updateUniversity" method="post">
                <table>
                    <thead>
                        <tr>
                            <th>Code</th>
                            <th>NameE</th>
                            <th>name</th>
                            <th>area</th>
                            <th>location</th>
                            <th>type</th>
                        </tr>
                    </thead>
                    <c:forEach items="${list}" var="l">
                        <tbody>
                            <tr>
                                <input type="text" name="id" value="${l.id}" hidden>
                                <td><input type="text" name="code" value="${l.code}"></td>
                                <td><input type="text" name="nameE" value="${l.nameEnglish}"></td>
                                <td><input type="text" name="name" value="${l.name}"></td>
                                <td><input type="text" name="area" value="${l.area}"></td>
                                <td><input type="text" name="location" value="${l.location}"></td>
                                <td><input type="text" name="type" value="${l.type}"></td>
                            </tr>
                        </tbody>
                    </c:forEach>
                </table>
                <input type="submit" value="Update">
            </form>
        </div>
    </body>
</html>
