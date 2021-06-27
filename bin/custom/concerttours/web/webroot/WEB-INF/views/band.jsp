<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Band</title>
</head>
<body>
<h1>Band</h1>
Id: ${band.id} <br>
Name: ${band.name} <br>
Description: ${band.description} <br>
Albums sold: ${band.albumsSold} <br>
Music type: ${band.genres} <br>
Tours:
<table>
    <thead>
    <tr>
        <th>
            Id
        </th>
        <th>
            Name
        </th>
        <th>
            Number of concerts
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="tour" items="${band.tours}">
        <tr>
            <td>
                    ${tour.id}
            </td>
            <td>
                    ${tour.tourName}
            </td>
            <td>
                    ${tour.numberOfConcerts}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
