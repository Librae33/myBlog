<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
    <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" type="text/css" href="./icon/05/iconfont.css">
<link rel="stylesheet" type="text/css" href="./css/list.css">
<title>文章目录</title>
</head>
<body>
<h1>目录 </h1>
<a class="iconfont" title="home" href="myBlog.jsp">&#xe600;</a>


 <table >
<tbody>

<s:if test="topicList.isEmpty()">
	<tr><td >无记录</td></tr>

</s:if>
<s:else>
	<s:iterator value="topicList" var="topic">
	<tr>
		<td><a href="ArticalAction?articleId=${topic.articleId}">${topic.tiltle }</a></td>
		
	</tr>
     </s:iterator>

</s:else>
<tr>
<td>&nbsp;</td>

</tr>
<tr>
<td>&nbsp;</td>
</tr>

<tr>
<td>&nbsp;</td>

</tr>
<tr>
<td>&nbsp;</td>

</tr>
<tr>
<td>&nbsp;</td>

</tr>




</tbody></table>
</body>
</html>