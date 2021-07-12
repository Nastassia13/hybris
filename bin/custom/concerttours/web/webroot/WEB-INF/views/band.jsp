<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Band Details</title>
</head>
<body>
<h1>Band Details</h1>
<p>
    <img src="${band.imageURL}"/>
</p>
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
<a href="../bands">Back to Band List</a>
</body>
</html>
