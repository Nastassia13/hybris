<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News</title>
</head>
<body>
<h1>News</h1>
<table>
    <thead>
    <tr>
        <th>
            Date
        </th>
        <th>
            Headline
        </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${news}">
        <tr>
            <td>
                    ${item.date}
            </td>
            <td>
                    ${item.headline}
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
