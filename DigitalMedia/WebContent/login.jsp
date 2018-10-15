<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>登录页</title>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css">
 	<script>
	  function login(){
		  
		  document.getElementById("loginForm").submit();//表单提交  
	    
	  }
	</script> 
</head>
<body>
<div class="top">
	<div class="top-center"></div>
</div>

<div class="main-img">
	<img src="resources/img/校园.jpg">
</div>
<div class="center">
<div class="login">
<div class="login-top">登录</div>
<div class="login-center clearfix">
<div class="login-center-img"><img src="resources/img/name.png"/></div>
<div class="login-center-input">
<form id="loginForm" action="login" method="post">
<input type="text" name="id" id="sid" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'" />
<div class="login-center-input-text">学号</div>
</div>
</div>
<div class="login-center clearfix">
<div class="login-center-img"><img src="resources/img/password.png" /></div>
<div class="login-center-input">
<input type="password" name="pwd" id="pwd" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'" />
<div class="login-center-input-text">密码</div>
</div>
</form>
</div>
<div class="login-button" onClick="login()">
登录
</div>
</div>
</div>
<div class="bottom">
	
	<img src="resources/img/头像.jpg">

	<div class="bottom-right">
		<p>版权所有 Copyright © 2018 数字媒体技术（嵌入式）161班 </p>
	</div>
</div>



</body>
</html>