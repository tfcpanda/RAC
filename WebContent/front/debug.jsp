<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ include file="../pub/top.jsp"%>
<html lang="zh-CN">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<!--强制IE最高版本加载-->
<title>红杏资本投资网站</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/normalize.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main-front.css" />

</head>
<body>
<h3>s:debug标签可以在html页面上查看值栈内容</h3>
	<s:debug></s:debug>

	<%@ include file="../pub/bottom.jsp"%>
</body>
</html>
