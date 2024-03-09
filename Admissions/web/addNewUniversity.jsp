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
        <form action="AddNewUniversity" method="post">
            <label for="name">Code: </label>
            <input type="text" id="name" name="code" required>
            
            <label for="name">Name English: </label>
            <input type="text" id="name" name="nameE" required>
            
            <label for="name">Name: </label>
            <input type="text" id="name" name="name" required>
            
            <label for="name">Area: </label>
            <input type="text" id="name" name="area" required>
            
            <label for="name">Location: </label>
            <input type="text" id="name" name="location" required>
            
            <label for="name">Type: </label>
            <input type="text" id="name" name="type" required>
             
            
            <button>Add Admission</button>
            <button><a href="/Admissions/AdminAdmissionsControll">Back To Menu</a></button>
        </form>
    </div>
</body>
</html>
