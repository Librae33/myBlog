<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看图片</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<style type="text/css">

	thead{
		background: rgb(26,188,156);
	}
tbody{
		background: rgb(52,73,74);
		color:white;
	}
	a{
	font-size:20px;
	color:white;
	}
	</style>
</head>
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript"  >
$(function(){
	  	$("#delete").click(function(){
	  		var confirm_=confirm("你确定要删除吗？");
	  		if(confirm_){
	  			$.ajax({
	  				type:"post",
			        url: "DeleteImgAction",
			        success:function(){
			        	 alert("图片删除成功！");
			        }

	  			});
	  		}
	  	});

	  });

	
    
 </script>
<body>


<form name="form1" enctype="multipart/form-data">
<table class="table">
		<caption class="text-info ">图片管理</caption>
		<thead  class="text-warning">
			<th class="text-center"> 查看图片</th>
			<th class="text-center">操作</th>
			
			
		</thead>
		<tbody>
			<s:iterator value="uploadlist" var="uploadimg">
			<tr>
				<td><img src="${uploadimg.location}" width="600" height="400"/></td>
				<td><a id="delete" href="DeleteImgAction?fileID=${uploadimg.fileId}">删除</a></td>
			
			</tr>
		</s:iterator>
			
			
		</tbody>
	</table>
</form>
</body>
</html>