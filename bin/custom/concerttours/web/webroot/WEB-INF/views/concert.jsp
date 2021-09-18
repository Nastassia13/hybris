<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Concert</title>
</head>
<body>
<h1>Concert</h1>
Id: ${concert.id} <br>
Venue: ${concert.venue} <br>
Date: ${concert.date} <br>
Type: ${concert.type} <br>
Producer: ${concert.producer.name} <br>
</body>
</html>
