<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/message.css">
<title>查看留言</title>
<style type="text/css">
	thead{
		background: rgb(26,188,156);
	}
	tbody{
		background: rgb(52,73,74);
		color:white;
	}
</style>
</head>
<body>

<table class="table table-condensed">
		<caption class="text-info">您有新的评论</caption>
		<thead  class="text-warning">
			<th class="text-center"> 姓名</th>
			<th class="text-center">联系方式</th>
			<th class="text-center">电子邮箱</th>
			<th class="text-center">留言内容</th>
		</thead>
		<tbody>
		<s:iterator value="contactlist" var="contact">
			<tr>
				<td>${contact.cname }</td>
				<td>${contact.cphone}</td>
				<td>${contact.cemail }</td>
				<td>${contact.cmessage }</td>
			</tr>
			</s:iterator>
			
			
		</tbody>
	</table>
</body>
</html>