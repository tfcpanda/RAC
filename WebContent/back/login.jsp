<%@ page language="java" pageEncoding="UTF-8"%>
<html lang="en">
<head>
	<!-- Meta tags -->
	<title>登录</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- stylesheets -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
	<div class="agile-login">
		<h1>红杏资本</h1>
		<div class="wrapper">
			<h2>后台登录</h2>
			<div class="w3ls-form">
				<form action="${pageContext.request.contextPath}/admin_login.action" method="post">
					<label>用户名</label>
					<input type="text" name="name" placeholder="User" required/>
					<label>密码</label>
					<input type="password" name="password" placeholder="Password" required />
					<a href="#" class="pass">Forgot Password ?</a>
					<input type="submit" value="登录" />
				</form>
			</div>
			
			<div class="agile-icons">
				<a href="#"><span class="fa fa-twitter" aria-hidden="true"></span></a>
				<a href="#"><span class="fa fa-facebook"></span></a>
				<a href="#"><span class="fa fa-pinterest-p"></span></a>
			</div>
		</div>
		<br>
		<div class="copyright">
		<p>© 2017  <a href="#">红杏资本</a></p> 
	</div>
	</div>
	
</body>
</html>