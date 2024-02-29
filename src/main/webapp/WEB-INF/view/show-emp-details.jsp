<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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

        /* Style the container */
        .container {
            text-align: center;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        /* Style the list */
        ul {
            list-style-type: none;
            padding-left: 0;
        }

        /* Style the list items */
        li {
            font-size: 16px;
            color: #333;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Employee Details</h2>
    <p>
        Name: ${employee.name}<br>
        Surname: ${employee.surname}<br>
        Salary: ${employee.salary}<br>
        Department: ${employee.department}<br>
        Sex: ${employee.sex}<br>
        Languages:
    </p>
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
    <p>
        Phone Number: ${employee.phoneNumber}<br>
        Email: ${employee.email}
    </p>
</div>
</body>
</html>
