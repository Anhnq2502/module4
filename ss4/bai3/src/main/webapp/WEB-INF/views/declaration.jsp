
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Declaration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center">TỜ KHAI Y TẾ</h1>
<br>
<h2 style="text-align: center; font-size: 16px">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h2>
<br>
<h3 style="text-align: center; color: red">Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h3>
<br>

<form action="" method="post">
    <div class="container">
        <div class="row">
            <div class="form-group">
                <h4>Họ tên (ghi chữ IN HOA) (*)</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group" style="width: 100%">
                <input type="text" class="form-control" id="name">
            </div>
        </div>
        <div class="row">
            <div class="col-4"><h4>Năm sinh(*)</h4></div>
            <div class="col-4"><h4>Giới tính(*)</h4></div>
            <div class="col-4"><h4>Quốc tịch(*)</h4></div>
        </div>
        <div class="row">
            <div class="col-4">
                <input type="date" id="birthday">
            </div>
            <div class="col-4">
                <select name="gender" id="gender">
                    <option value="1">Nam</option>
                    <option value="2">Nữ</option>
                    <option value="3">Giới tính thứ 3</option>
                </select>
            </div>
            <div class="col-4">
                <input type="text" id="country">
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <h4>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác(*)</h4>
            </div>
        </div>
        <div class="row">
            <div class="form-group" style="width: 100%">
                <input type="text" class="form-control" id="card">
            </div>
        </div>
        <div class="row">
            <h4>Thông tin đi lại(*)</h4>
        </div>
        <div class="row">
            <div class="form-select-button">
                <input type="radio" value="1" id="radio1">
                <label for="radio1">Tàu bay</label>
                <input type="radio" value="T2" id="radio2">
                <label for="radio2">Tàu thuyền</label>
                <input type="radio" value="3" id="radio3">
                <label for="radio3">Ô tô</label>
                <input type="radio" value="4" id="radio4">
                <label for="radio4">Khác (Ghi rõ)</label>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <h4>Số hiệu phương tiện</h4>
            </div>
            <div class="col-6">
                <h4>Số ghế</h4>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <input type="text" name="vehicle" placeholder="VD: VN123">
            </div>
        </div>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>

