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
            Code
        </th>
        <th>
            Name
        </th>
        <th>
            History
        </th>
        <th>
            Album sales
        </th>
        <th>
            Band leader
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
                    ${band.code}
            </td>
            <td>
                    ${band.name}
            </td>
            <td>
                    ${band.history}
            </td>
            <td>
                    ${band.albumSales}
            </td>
            <td>
                    ${band.bandLeader}
            </td>
            <td>
                    ${band.types}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
