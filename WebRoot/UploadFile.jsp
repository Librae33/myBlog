<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传图片</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<style type="text/css">
body{
background:rgb(52,73,74);
}
h3{
font-weight:bold;
color:white;
font-size:20px;
font-family: "PingFang SC","微软雅黑","Microsoft YaHei",Helvetica,"Helvetica Neue",Tahoma,Arial,sans-serif;
}

</style>
</head>
<body>

 <form method="post" action="UploadAction" name="form1" enctype="multipart/form-data">
 <h3>图片上传：</h3>
 <input type="file" name="upload" class="btn btn-danger"><br><br>
 <input type="submit" value="上传" name="button1" class="btn btn-primary">
 <br>
 
 </form>
 </body>
</html>