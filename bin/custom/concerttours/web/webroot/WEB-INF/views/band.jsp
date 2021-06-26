<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bands</title>
</head>
<body>
<h1>Band</h1>
Code: ${band.code} <br>
Name: ${band.name} <br>
History: ${band.history} <br>
Album sales: ${band.albumSales} <br>
Band leader: ${band.bandLeader.name} <br>
Music type: ${band.types} <br>
</body>
</html>
