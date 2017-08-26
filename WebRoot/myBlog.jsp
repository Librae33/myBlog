<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到Librae的博客</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="./css/reset.css">
<link rel="stylesheet" type="text/css" href="./icon/iconfont.css">
<link rel="stylesheet" type="text/css" href="./icon/02/iconfont.css">
<link rel="stylesheet" type="text/css" href="./icon/07/iconfont.css">
<link rel="stylesheet" type="text/css" href="./css/myblog.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<style type="text/css">
	/* 设置模态框*/
	.modal-content{
		height:400px;
	}
	
	.modal-content input{
	display: block;
    width: 279px;
    height: 50px;
    padding:9px 9px 9px 10px;
    margin:20px auto;
    background-color: #fff;
	}
	
	#register .regBtn,#login .logBtn{
		display: block;
		height: 50px;
		width: 300px;
		background: rgb(139,0,0);
		margin-top:10px;
		margin: 0 auto;
		color: white;
		font-size: 16px;
        font-family: "PingFang SC","微软雅黑","Microsoft YaHei",Helvetica,"Helvetica Neue",Tahoma,Arial,sans-serif;
	}
	.regBtn ,.logBtn:hover{
		background: rgba(139,0,0,0.8);

	}
	.btn-lg{
	float:right;
	margin-top:30px;
	margin-right:50px;
	}
	.modal-header a,input{
	font-size: 16px;
    font-family: "PingFang SC","微软雅黑","Microsoft YaHei",Helvetica,"Helvetica Neue",Tahoma,Arial,sans-serif;
	
	}
	.identity{
	height:80px;
	overflow:hidden;
	margin:0 auto;
	width:300px;
	
	}
	
	.identity b{
	font-size: 16px;
    font-family: "PingFang SC","微软雅黑","Microsoft YaHei",Helvetica,"Helvetica Neue",Tahoma,Arial,sans-serif;
	
	}
	.identity input[type=radio]{
	
	line-height:80px;
	}


	</style>
</head>
<body>


<div id="container">

    <!-- 首页的头部 -->
	<div id="header">
	<br><a class="iconfont"  href="">&#xe9dd;</a>

		<span>Librae的博客</span>
			<a class="iconfont" href="">&#xe65c;</a>
	<!-- 首页头部的结束 -->
	
<!-- 注册登录功能的实现  使用了bootstrap和angular -->
<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">登录</button>
	<div  ng-app="test" ng-controller="ctrl" class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
		<div class="modal-dialog">
			<div class="modal-content">
			
			<!-- 注册登录切换功能 -->
		<div class="modal-header">
			<a href="#" ng-click="actions.setCurrent(1)">注册</a>
			<a href="#" ng-click="actions.setCurrent(2)">登录</a>
			<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		</div>
		<!-- 注册登录切换功能的结束-->
	    <!-- 注册功能 的开始-->
	    	<form action="AddUserAction" method="post">	    	
	    <div id="register" ng-if="data.current==1">
	    	<!-- 这里使用了HTML5自带的验证功能 -->
	    	<input type="text" placeholder="请输入邮箱/手机号" name="userName" required pattern="\w+" minlength="3" maxlength="12">
	    	<input type="password" placeholder="请输入6-16位密码，不能用空格！" name="password" required pattern="\w+" minlength="6" maxlength="16">
	    	 <div id="footer">
	    	<input type="submit" class="regBtn" value="注册"/>
	        </div>
	    </div>
	    	</form>
	    <!-- 注册功能的结束 -->
	    	

 <!-- 登录功能 的开始-->
	    <form action="LoginAction" method="post">
	    <div id="login" ng-if="data.current==2">
	    	<input type="text" placeholder="请输入注册邮箱/手机号" name="userName" required pattern="\w+" minlength="3" maxlength="12">
	    	<input type="text" placeholder="请输入密码"  name="password" required pattern="\w+" minlength="6" maxlength="16">
	    	  <div id="footer">
	    	  <div class="identity">
	    	 
   <b>普通用户： </b>      <input type="radio" value="user" name="userright" required>
        </div>
	    	<input type="submit" class="logBtn" value="登录"/>
	    </div>
	    </div>
	    </form>
	     <!-- 登录功能 的结束-->
	      </div>
	  </div>
	</div>
	<!-- 注册登录功能的结束 -->
	 </div>
		<!-- 这里是社交网络链接 -->
	<span id="icon">
		<span>follow  me   at  </span> 
	
	<a class="iconfont" title="facebook" href="">&#xe600;</a>
	<a class="iconfont" title="豆瓣" href="">&#xe603;</a>
	<a class="iconfont" title="微博" href="">&#xe60a;</a>
	<a class="iconfont" title="知乎" href="">&#xe6d1;</a>
	<a class="iconfont" title="Lofter" href="">&#xe7c1;</a>
	</span>
	<!-- 社交网络链接的结束 -->
    <!-- 导航的开始 -->
	<div id="nav">	
			<ul class="nav-bar">
				<li class="nav-item"><a href="./myBlog.jsp">HOME</a></li>
				<li class="nav-item"><a href="./intro.jsp">INTRO</a></li>
				<li class="nav-item"><a href="TitlelistAction">ARTICLE</a>
					
				</li>
				<li class="nav-item"><a href="GallaryAction">GALLERY</a></li>
				<li class="nav-item"><a href="./contact.jsp">CONTACT</a></li>
			</ul>
		</div>
		<!-- 导航的结束 -->
	<div id="main">
		<a class="iconfont"  href="">&#xe60b;</a>

		
	</div>
</div>

 <script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
 <script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="./js/snow.js"></script>
 <script type="text/javascript">
		var m=angular.module("test",[]);
		m.controller("ctrl",["$scope",function($scope){
			$scope.data = {
                current: "1"
            };
			$scope.actions =
            {
                setCurrent: function (param) {
                   $scope.data.current = param;
                }
            }
			
		}]);
		
		
	    </script>
 


 </body>
</html>