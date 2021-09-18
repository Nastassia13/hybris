<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tour</title>
</head>
<body>
<h1>Tour</h1>
Id: ${tour.id} <br>
Name: ${tour.tourName} <br>
Description: ${tour.description} <br>
Concerts:
<table>
    <thead>
    <tr>
        <th>
            Id
        </th>
        <th>
            Date
        </th>
        <th>
            Venue
        </th>
        <th>
            Type
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="concert" items="${tour.concerts}">
        <tr>
            <td>
                    ${concert.id}
            </td>
            <td>
                    ${concert.date}
            </td>
            <td>
                    ${concert.venue}
            </td>
            <td>
                    ${concert.type}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
