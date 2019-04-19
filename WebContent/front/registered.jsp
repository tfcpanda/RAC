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
	<form method="post">
		<table width="100%">
			<tr>
				<th colspan="6" ALIGN=CENTER><font size="6">注册新用户</font></th>
			</tr>

			<tr>
				<td colspan="3">
					<hr>
				</td>
			</tr>

			<tr>
				<td width="400"></td>
				<td ALIGN=CENTER BGCOLOR="#ffffff">
					<table width="400" cellpadding="4">
						<tr>
							<td ALIGN=RIGHT><font size="3" face="微软雅黑">用户名</font></td>
							<td ALIGN=LEFT><input name="name" tyoe="texe"></td>
						</tr>
						<tr>
							<td ALIGN=RIGHT><font size="3" face="微软雅黑">登陆邮箱</font></td>
							<td ALIGN=LEFT><input name="password" type="text"></td>
						</tr>
						<tr>
							<td ALIGN=RIGHT><font size="3" face="微软雅黑">再输一次</font></td>
							<td ALIGN=LEFT><input type="password"></td>
						</tr>
					</table>
				</td>
				<td width="400"></td>
			</tr>
			<tr>
				<td width="400"></td>
				<td ALIGN=CENTER BGCOLOR="#ffffff">
					<table width="400" cellpadding="4">
						<tr>
							<td ALIGN="center" colspan="3"><input type="submit"
								value="注册"> <input type="reset" value="重置"></td>
						</tr>
					</table>
		</table>
	</form>

	<%@ include file="../pub/bottom.jsp"%>
</body>
</html>
