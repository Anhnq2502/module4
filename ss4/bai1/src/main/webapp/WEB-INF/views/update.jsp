<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Setting</h1>
<br>
<form action="">
    <div class="row">
        <div class="col-3"><h3>Languages</h3></div>
        <div class="col-6">
            <select name="lg" id="lg" style="width: 32%">
                <option value="en">English</option>
                <option value="vi">Vietnamese</option>
                <option value="jp">Japanese</option>
                <option value="cn">Chinese</option>
            </select>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-3"><h3>Page Size:</h3></div>
        <div class="col-6">
            <select name="size" id="size">
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="25">25</option>
                <option value="50">50</option>
                <option value="100">100</option>
            </select>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-3"><h3>Spams Filter:</h3></div>
        <div class="col-6">
            <input type="checkbox" value="Enable"> Enable spams filter
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-3"><h3>Signature</h3></div>
        <div class="col-6">
            <textarea name="signature" id="sg" cols="30" rows="5"></textarea>
        </div>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>