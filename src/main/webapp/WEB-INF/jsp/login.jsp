<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
<title>Login</title>

<link rel="stylesheet"
	href="/java-web-archetype/resources/lib/bootstrap.min.css" />
<link rel="stylesheet"
	href="/java-web-archetype/resources/navbar.css" />
<link rel="stylesheet"
	href="/java-web-archetype/resources/login.css" />

</head>

<body>
	<!-- NavBar -->
	<div class="navbar-wrapper">
		<div class="container">
			<div class="navbar navbar-inverse navbar-static-top"
				role="navigation">
				<div class="container">
					<a href="#"></a>
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand"
							href="/java-web-archetype">Demo</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-6"></div>
			<div class="col-md-6">
				<form class="form-signin" action="j_spring_security_check" method="post" role="form">
					<h2 class="form-signin-heading">请登录</h2>
					<br> <input type="text" name="j_username" class="form-control" placeholder="用户名"
						required autofocus> <br> <input type="password" name="j_password"
						class="form-control" placeholder="密码" required> 
					<c:if test="${error == true}">
						<span style="color: red">用户名或密码错误，请重新登录</span>
					</c:if>
					<br>
					<div class="row">
						<div class="col-md-6">
							<button type="submit" class="btn btn-lg btn-success btn-block">登录</button>
						</div>
						<div class="col-md-6">
							<a role="button" class="btn btn-lg btn-primary btn-block"
								href="/java-web-archetype/register">注册</a>
						</div>
					</div>
				</form>
			</div>

		</div>

		<hr />
		<!-- FOOTER -->
		<footer>
			<p class="pull-right">
				<a href="#">Back to top</a>
			</p>
			<p>2014 ZheJiang University, BME, ChunKin.Lau</p>
		</footer>
	</div>
	<!-- /container -->
	<script
		src="/java-web-archetype/resources/lib/jquery-2.1.0.min.js"></script>
	<script
		src="/java-web-archetype/resources/lib/bootstrap.min.js"></script>
</body>
</html>