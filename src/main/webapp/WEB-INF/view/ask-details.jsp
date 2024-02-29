<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmeli
  Date: 21.09.2023
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* Reset default margin and padding */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Center the content vertically and horizontally */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background-color: #f9f9f9;
        }

        /* Style the form container */
        .container {
            text-align: center;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        /* Style the form input fields */
        form input {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        /* Style the submit button */
        input[type="submit"] {
            background-color: #0074D9;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 10px 20px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Insert</h2>
    <form:form action="showEmpDetails" modelAttribute="employee" method="post">
        Name <form:input path="name"/>
        <form:errors path="name"/><br><br>
        Surname <form:input path="surname"/>
        <form:errors path="surname"/><br><br>
        Salary <form:input path="salary"/>
        <form:errors path="salary"/><br><br>
        Department <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select><br><br>
        Sex <form:radiobuttons path="sex" items="${employee.sexs}"/><br><br>
        Languages <form:checkboxes path="languages" items="${employee.languageList}"/><br>
        Phone Number <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/><br>
        Email <form:input path="email"/>
        <form:errors path="email"/><br>
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
