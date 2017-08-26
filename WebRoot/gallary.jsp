<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>gallary</title>
<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/flat-ui.min.css">
<style type="text/css">
	body{
		background: black;
	}
	.container{
		margin-left:20%;
		padding-top: 50px;
	    height: 500px;
        width: 800px;
	}
	.lg{

		height: 500px;
		width: 800px;
	}
	.img img{
		position: absolute;
		height: 500px;
		width: 800px;
	}
	.btn{
		height: 60px;
		width: 40px;
		background: black;
		filter:alpha(opacity:60);
		color: white;
		font-weight: bold;
		opacity:0.6;
		font-size: 30px;
		text-align: center;
		line-height: 60px;
		margin-top: 28%;
		cursor: pointer;
	}
	.lside{
		float: left;

	}
	.rside{
		float: right;
	}
	.box{
		position: absolute;
		left: 50%;
		top: 70%;
	}
	.box ul{
		list-style: none;
		background: red;
		height: 20px;
		width: 100px;
		border-radius: 10px;
		background: rgba(255,255,255,.3);
	}

	.box li{
	height: 10px;
	width: 10px;
    float: left;
    background: gray;
    margin-right: 10px;
    margin-top: 5px;
    border-radius: 100%;
    cursor: pointer;
	}
	.box .bg{
		background:red;
	}
	

	
	</style>
<script type="text/javascript">
	var i=0;
	var timer=null;
	$(function(){
		$(".img").eq(0).show().siblings().hide();
		ShowTime();
		  
		 
         
         $("li").hover(function(){
         	i=$(this).index();
         	Show();
         	clearInterval(timer);

         },function(){
         	ShowTime();
         });


		  $(".lside").click(function(){
		  	clearInterval(timer);
		  i--;
		  if(i==0){
		  	i=5;
		  }
		  Show();
		  ShowTime();

		  });
		    $(".rside").click(function(){
		  	clearInterval(timer);
		  i++;
		  if(i==5){
		  	i=0;
		  }
		  Show();
		  ShowTime();

		  });

         function Show(){

         	$(".img").eq(i).fadeIn(1000).siblings().fadeOut(1000);
			$("li").eq(i).addClass("bg").siblings().removeClass("bg");

         }
         function ShowTime(){
         	timer=setInterval(function(){
			i++;
			if (i==5) {
				i=0;
			};
			Show();
		},3000);
         }
		
	  

	});
	</script>
</head>
<body>
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
<div class="container">

<form  name="form1" enctype="multipart/form-data">


<div class="ig">
<s:iterator value="uploadlist" var="uploadimg"><div class="img"><img src="${uploadimg.location}"></div></s:iterator>
</div>
	




  <div class="btn lside">&lt;</div>
    <div class="btn rside">&gt;</div>
     <div class="box">
    	<ul>
    		<li class="bg"></li>
    		<li></li>
    		<li></li>
    		<li></li>
    		<li></li>
    	</ul>
    </div>
</form>
</div>
	
	

	
	
</body>

</html>