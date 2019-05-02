<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="topbar-wrap white">
		<div class="topbar-inner clearfix">
			<div class="topbar-logo-wrap clearfix">
				<h1 class="topbar-logo none">
					<a href="index.html" class="navbar-brand">后台管理</a>
				</h1>
				<ul class="navbar-list clearfix">
					<li><a class="on" href="emp-list">首页</a></li>
					<li><a href="#">网站首页</a></li>
				</ul>
			</div>
			<div class="top-info-wrap">
				<ul class="top-info-list clearfix">
					<li><s:property value="#session.existUser.name" /></li>
					<li><a href="${pageContext.request.contextPath}/admin_pageAdmin.action">修改密码</a></li>
					<li><a href="${pageContext.request.contextPath}/admin_quit.action">退出</a></li>
					
				</ul>
			</div>
		</div>
	</div>