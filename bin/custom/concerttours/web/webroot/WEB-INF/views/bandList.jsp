<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Band List</title>
</head>
<body>
<h1>Band List</h1>
<table>
    <thead>
    <tr>
        <th>
            Name
        </th>
        <th>
            Image
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="band" items="${bands}">
        <tr>
            <td>
                    ${band.name}
            </td>
            <td>
                <a href="./bands/${band.id}"><img src="${band.imageURL}"/></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
