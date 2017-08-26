<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看评论</title>
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/message.css">
</head>
<style type="text/css">
	thead{
		background: rgb(26,188,156);
	}
	tbody{
		background: rgb(52,73,74);
		color:white;
	}
</style>
<body>
<table class="table">
		<caption class="text-info">您有新的评论</caption>
		<thead  class="text-warning">
			<th class="text-center"> 文章标题</th>
			<th class="text-center">留言内容</th>
			<th class="text-center">评论人</th>
			<th class="text-center">操作</th>
		</thead>
		<tbody>
		<s:iterator value="commentlist2" var="comment">
			<tr>
				<td>${comment.tiltle}</td>
				<td>${comment.content}</td>
				<td>匿名用户</td>
				<td><button type="button"class="btn btn-danger" onclick="window.location.href='DeleteCommentAction?commentid=${comment.commentid}'">删除</button></td>
			</tr>
		</s:iterator>
			
			
		</tbody>
	</table>

</body>
</html>