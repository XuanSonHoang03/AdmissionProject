<%-- 
    Document   : AddNewAdmission
    Created on : Nov 10, 2023, 2:06:14 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Add New Admissions</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        h2 {
            text-align: center;
        }
        form {
            margin-top: 20px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        input[type="text"] {
            width: 96%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="date"] {
            width: 96%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="number"] {
            width: 96%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        textarea {
            width: 96%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }
        button{
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            cursor: pointer;
            border-radius: 3px;
        }
        a{
            color: white;
            text-decoration: none;
            list-style: none;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Add New Admissions</h2>
        <form action="AddNewMajor" method="post">
            <label for="name">Code</label>
            <input type="text" id="name" name="code" required>
            
            <label for="description">Name:</label>
            <textarea id="description" name="name" rows="4" required></textarea>
            
            <label for="openDate">subject:</label>
            <input type="text" id="openDate" name="subject" required>
            
            <label for="closeDate">majorName:</label>
            <input type="text" id="closeDate" name="majorName" required>
            
            
            <button>Add Major</button>
            <button><a href="/Admissions/manageMajor">Back To Menu</a></button>
        </form>
    </div>
</body>
</html>
