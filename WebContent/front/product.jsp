<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ include file="../pub/top.jsp"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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

<script>
	function saveCar() {
		document.getElementById("carForm").submit();
	}
</script>
</head>
<body>


	<table width="100%">
		<tr>
			<th colspan="6" ALIGN=CENTER><font size="6">产品信息</font></th>
		</tr>

		<tr>
			<td colspan="3">
				<hr>
			</td>
		</tr>

		<tr>
			<td width="400"></td>
			<td ALIGN=CENTER BGCOLOR="#ffffff">
				<form id="carForm"
					action="${pageContext.request.contextPath}/car_addCart.action"
					method="post">


					<table width="400" cellpadding="4">
						<tr>
							<td ALIGN=center><font size="3" face="微软雅黑"><input
									name="id" type="hidden"
									value="<s:property
										value="model.id" />"></font></td>
						</tr>
						<tr>
							<td ALIGN=center>产品名：<font size="3" face="微软雅黑"><s:property
										value="model.name" /></font></td>

						</tr>
						<tr>
							<td ALIGN=center>产品价格：<font size="3" face="微软雅黑"><s:property
										value="model.price" />RMB</font></td>

						</tr>
						<tr>
							<td ALIGN=center>产品收益：<font size="3" face="微软雅黑"><s:property
										value="model.description" /></font></td>

						</tr>
						<tr>
							<td ALIGN=center>购买数量：<font size="3" face="微软雅黑"><input
									name="number" type="text"></font></td>
						</tr>
						<!-- 这是一个按钮需要用JS提交 -->
						<tr>
							<td ALIGN=center><font size="3" face="微软雅黑"><input
									name="number" type="button" value="加入购物车" onclick="saveCar()"></font></td>
						</tr>
					</table>
				</form>
			</td>
			<td width="400"></td>
		</tr>
	</table>

	<%@ include file="../pub/bottom.jsp"%>
</body>
</html>
