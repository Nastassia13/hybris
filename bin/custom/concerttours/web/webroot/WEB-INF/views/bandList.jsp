<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bands</title>
</head>
<body>
<h1>Bands</h1>
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
            Albums sold
        </th>
        <th>
            Description
        </th>
        <th>
            Music type
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="band" items="${bands}">
        <tr>
            <td>
                    ${band.id}
            </td>
            <td>
                    ${band.name}
            </td>
            <td>
                    ${band.albumsSold}
            </td>
            <td>
                    ${band.description}
            </td>
            <td>
                    ${band.genres}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
