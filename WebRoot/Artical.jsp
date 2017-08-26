<%@ page language="java" contentType="text/html;charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<%@ taglib prefix="s"  uri="/struts-tags" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="./css/article.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css">
<title>Insert title here</title>
</head>
<body>
<!--导航的开始  使用了bootstrap和flatUI-->
<nav class="navbar navbar-default navbar-inverse" role="navigation">
			<div class="container-fluid">
			<div class="navbar-header">
			    <button type="button" class="navbar-toggle" data-toggle="collapse"
	             data-target="#example-navbar-collapse">
	            <span class="sr-only">切换导航</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	        </button>
				<a class="navbar-brand" href="#">Librae的博客</a>
			</div>
			</div>
			 <div class="collapse navbar-collapse navbar-right" id="example-navbar-collapse">
			 	<ul class=" nav navbar-nav">
			 		<li class="active"><a href="./myBlog.jsp">HOME</a></li>
			 		<li><a href="./intro.jsp">INTRO</a></li>
			 		<li><a href="TitlelistAction">ARTICLE</a></li>
			 		<li><a href="GallaryAction">GALLARY</a></li>
			 		<li><a href="./contact.jsp">CONTACT</a></li>
			 		
			 	</ul>
			 </div>
		</nav>
		<!--导航的结束 -->
		<!-- 显示文章 的开始-->
	<div class="rside">
<p>
	<s:iterator value="topic" var="topic">
	<h3 class="text-info">${topic.tiltle }</h3><!-- 显示文章 标题-->
	<span class="text-primary">发表时间：<fmt:formatDate value="${topic.createtime}" pattern="yyyy年MM月dd日" /> </span>
    <p>${topic.tcontent }</p><!-- 显示文章 内容-->
	</p>
	</s:iterator>
	
<!-- 发表评论的开始 -->

<form action="CommentAction" name="form2" method="post">
<div class="comment">
	<s:iterator value="topic" var="topic">
	<input name="articleId" type="hidden" value="${topic.articleId}"/>
	<input name="tiltle" type="hidden" value="${topic.tiltle}"/>
    
	</s:iterator>
	<textarea rows="12" cols="80" name="content"></textarea>
	<p>
	<input type="submit" class="btn btn-info" value="发表评论">
	</p>
</div>
</form>
<!-- 发表评论 的结束-->

<!-- 显示评论 的开始-->
<div class="comContent">
 <dl>
 <s:iterator value="commentlist" var="comment">
 <dd>
 <span>匿名用户 发表于：<fmt:formatDate value="${comment.comtime }" pattern="yyyy年MM月dd日" /> </span>
 <br/>
 ${comment.content }
 </dd>
 </s:iterator>
 </dl>
 </div>
 <!-- 显示评论的结束-->
</div> 




 <script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
 <script type="text/javascript" src="js/jquery.form.js"></script>
 <script type="text/javascript"  >
 //使用AJAX和jQuery提交评论
$(function () {
            $(":submit").click(function () {
                var options = {
                   url: "CommentAction",
                   type:"post",
                   contentType: "application/x-www-form-urlencoded; charset=UTF-8", 
                    success: function () {
                    alert("评论发表成功！");
                    }
                };
                $("form").ajaxForm(options);
                 setTimeout(function(){
                 window.location.reload();},500);//设置一个定时器，页面提交成功后重新加载页面
               
            });
            
        });
 </script>
</body>
</html>