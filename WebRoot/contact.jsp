<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css" href="./css/reset.css">
<link rel="stylesheet" type="text/css" href="./icon/02/iconfont.css">
<link rel="stylesheet" type="text/css" href="./icon/04/iconfont.css">
<link rel="stylesheet" type="text/css" href="./css/contact.css">
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css">
<title>Insert title here</title>
</head>
<body>
<form action="ContactAction" method="post">
<div id="header">
    		<h2>Contact me</h2>
    	</div>
    	<nav class="navbar navbar-default navbar-inverse" role="navigation">
			<div class="container-fluid">
			<div class="navbar-header">
			    <button type="button" class="navbar-toggle" data-toggle="collapse"
	             data-target="#example-navbar-collapse">
	            <span class="sr-only">ÇÐ»»µ¼º½</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	        </button>
				<a class="navbar-brand" href="#">LibraeµÄ²©¿Í</a>
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
        <div id="container">

       
    	<div id="input">
    	<input class="inputText" type="text" name="cname" placeholder="Your Name">
    	<br>
        <br>
    	<input class="inputText" type="text" name="cphone" placeholder="Phone Number">
    	<br>
        <br>
        <input class="inputText" type="text" name="cemail" placeholder="Your Email">
    	
        <div class="textarea">
    	<textarea placeholder="message" name="cmessage"></textarea>
        </div>
        <div class="button">
        <input type="submit" value="submit">
        <input type="reset" value="reset">
        </div>
    	</div>
        
    </div>
    </form>


</body>
</html>