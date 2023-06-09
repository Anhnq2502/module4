<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>MailBox</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form:form action="/update" method="get" modelAttribute="mailBox">
    <div class="row">
        <div class="col-3">
            <h3>Languages</h3>
        </div>
        <div class="col-6">${mailBox.language}</div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Page Size:</h3>
        </div>
        <div class="col-6">${mailBox.pageSize}</div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Spams Filter:</h3>
        </div>
        <div class="col-6">${mailBox.spamsFilter}</div>
    </div>
    <br>
    <div class="row">
        <div class="col-3">
            <h3>Signature</h3>
        </div>
        <div class="col-6">${mailBox.signature}</div>
    </div>
    <div class="row">
        <div class="col-3">
            <button type="submit">Update</button>
        </div>
    </div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>