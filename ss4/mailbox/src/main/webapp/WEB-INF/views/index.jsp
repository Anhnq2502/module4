<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/03/2023
  Time: 3:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/update" method="get" modelAttribute="mailBox">
    <div class="row">
        <div class="col-3">
            <h3>Languages</h3>
            <p>${mailBox.language}</p></div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Page Size:</h3>
            <p>${mailBox.pageSize}</p></div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Spams Filter:</h3>
            <p>${mailBox.spamsFilter}</p></div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Signature</h3>
            <p>${mailBox.signature}</p></div>
    </div>
    <div class="row">
        <button type="submit">Update</button>
    </div>
</form:form>
</body>
</html>
