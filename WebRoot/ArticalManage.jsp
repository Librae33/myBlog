<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%request.setCharacterEncoding("gb2312");%>  
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/message.css">
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
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
	color:white;
	}

</style>
<title>文章管理</title>
</head>
<body>
<table class="table">
		<caption class="text-info">文章管理</caption>
		<thead  class="text-warning">
			<th class="text-center"> 文章标题</th>
			<th class="text-center">操作1</th>
			<th class="text-center">操作2</th>
			
		</thead>
		<tbody>
			<s:iterator value="topicList" var="topic">
			<tr>
				<td><a href="ArticalAction?articleId=${topic.articleId}">${topic.tiltle }</a></td>
				<td><button type="button"class="btn btn-primary" onclick="window.location.href='FindArticalByIdAction?articleId=${topic.articleId}'">修改</button></td>
				<td><button type="button"class="btn btn-danger" onclick="window.location.href='DeleteCommentAction?commentid=${comment.commentid}'">删除</button></td>
			</tr>
		</s:iterator>
			
			
		</tbody>
	</table>
</body>
</html>