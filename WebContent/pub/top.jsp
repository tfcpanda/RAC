<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
	<header>
	<nav class="top">
		<span class="tel">理财热线：400-888-8888</span>
		<ul>
			<s:if test="#session.existUser == null">
				<li><a
					href="${pageContext.request.contextPath}/user_loginPage.action">登录</a></li>
				<li><a
					href="${pageContext.request.contextPath}/user_registPage.action">快速注册</a></li>
			</s:if>
			<s:else>
				<li><s:property value="#session.existUser.name" /></li>
				<li><a href="${pageContext.request.contextPath}/car_orderPage.action">我的购物车</a></li>
				<li><a href="${pageContext.request.contextPath}/order_findByUid.action?page=1">我的订单</a></li>
				<!-- 销毁session -->
				<li><a
					href="${pageContext.request.contextPath}/user_quit.action">退出</a></li>
			</s:else>

			
			<li><a href="#">帮助</a></li>
			<li><a href="#">APP下载</a></li>
		</ul>
	</nav>
	<nav class="main">
		<a href="${pageContext.request.contextPath}/index_indexPage.action" class="brand"><img
			src="${pageContext.request.contextPath}/img/logo.png" alt="回到首页" /></a>
		<ul>
			<li><a href="${pageContext.request.contextPath}/index_indexPage.action">首页</a></li>
			<li><a href="#">理财频道</a></li>
			<li><a href="#">投资频道</a></li>
			<li><a href="#">新手专区</a></li>
			<li><a href="#">安全保障</a></li>
		</ul>
	</nav>
</header>
	<!--中间部分-->
	<div class="container">
		<section class="transaction">
			<div class="trans-content">
				<div class="trans-data">
					<span>平台累计成交金额</span> <span class="trans-money">19888</span> <span>万元</span>
				</div>
			</div>
			<div class="trans-content">
				<div class="trans-data">
					<span>过去七日成交金额</span> <span class="trans-money">1888</span> <span>万元</span>
				</div>
			</div>
			<div class="trans-report">
				<a href="#">查看平台运营报告</a>
			</div>
		</section>
	</div>
</body>
</html>
