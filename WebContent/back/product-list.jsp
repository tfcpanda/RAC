﻿<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="s" uri="/struts-tags"%>


<!doctype html>
<html>
<head>

<meta charset="UTF-8">
<title>后台管理</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/common.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/modernizr.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery-3.3.1.min.js">
	
</script>
</head>

<body>
	<%@ include file="../pub/topbar-back.jsp"%>
	<div class="container clearfix">
		<%@ include file="../pub/sidebar-back.jsp"%>
		<!--/sidebar-->
		<div class="main-wrap">

			<div class="crumb-wrap">
				<div class="crumb-list">
					<i class="icon-font"></i> <a href="index.jsp">首页</a><span
						class="crumb-step">&gt;</span><span class="crumb-name">产品列表</span>
				</div>
			</div>
			<div class="search-wrap">
				<div class="search-content">
					<form action="#" method="post">
						<table class="search-tab">
							<tr>
								<th width="120">选择分类:</th>
								<td><select name="search-sort" id="">
										<option value="">全部</option>
										<option value="19">技术部</option>
										<option value="20">商务部</option>
								</select></td>
								<th width="70">关键字:</th>
								<td><input class="common-text" placeholder="关键字"
									name="keywords" value="" id="" type="text"></td>
								<td><input class="btn btn-primary btn2" name="sub"
									value="查询" type="submit"></td>
							</tr>
						</table>
					</form>
				</div>
			</div>
			<div class="result-wrap">
				<form name="myform" id="myform" method="post">
					<div class="result-title">
						<div class="result-list">
							<a href="${pageContext.request.contextPath}/product_ProductPage.action"><i
								class="icon-font"></i>增加产品</a>
						</div>
					</div>
					<div class="result-content">

						<%-- 	<c:when test="${pageBean.data eq null}">
									没有任何产品信息
								</c:when>
							<c:when test="${fn:length(pageBean.data) eq 0}">
									没有任何员工信息
								</c:when> --%>

						<table id="empTable" class="result-tab" width="100%">
							<!--头部 样式-->
							<thead>
								<tr>
									<th class="tc" width="5%"><input id="selectall" class=""
										name="selectall" type="checkbox"></th>
									<th>ID</th>
									<th>产品名称</th>
									<th>价格</th>
									<th>利率</th>
									<th colspan="2">操作</th>
								</tr>
							</thead>
							<!--中部 显示-->
							<tbody id="show">
								<s:iterator var="c" value="#session.clist">
									<tr>
										<td class="tc"><input type="checkbox" id="temp"
											value="<s:property value="#c.id"/>" name="check"></td>

										<td><s:property value="#c.id" /></td>

										<td><s:property value="#c.name" /></td>

										<td><s:property value="#c.price" /> RMB</td>

										<td><s:property value="#c.description" /></td>
										<s:if test="#c.status == 1">
											<td><a
												href="product_outStock?id=<s:property value="#c.id"/>">下架</a>
												<input type="hidden" value="<s:property value="#c.name" />"></td>
										</s:if>
										<s:else>
											<td><a
												href="product_putStock?id=<s:property value="#c.id"/>">上架</a>
												<input type="hidden" value="<s:property value="#c.name" />"></td>
										</s:else>
										<%-- <td><a href="emp-input?id=<s:property value="#c.id"/>">编辑</a></td> --%>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</form>
			</div>
		</div>
		<!--/main-->
	</div>
</body>

</html>