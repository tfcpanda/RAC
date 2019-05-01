<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0043)http://localhost:8080/mango/cart/list.jhtml -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>订单页面</title>
<link href="${pageContext.request.contextPath}/css/common1.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/cart.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/normalize.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/main-front.css" />
</head>
<body>
	<div class="container header">


		<%@ include file="../pub/top.jsp"%>

	</div>


	<div class="container cart">

		<div class="span24">

			<div class="step step1">
				<ul>

					<li class="current"></li>
					<li>生成订单成功</li>
				</ul>
			</div>


			<table>
				<tbody>
					<tr>
						<th colspan="5">订单编号:<s:property value="model.oid" />&nbsp;&nbsp;&nbsp;&nbsp;
						</th>
					</tr>
					<tr>
						<th>商品</th>
						<th>价格</th>
						<th>数量</th>
						<th>小计</th>
					</tr>
					<s:iterator var="orderItem" value="model.orderItems">
						<tr>
							<td><s:property value="#orderItem.product.name" /></td>
							<td><s:property value="#orderItem.product.price" /></td>
							<td class="quantity" width="60"><s:property
									value="#orderItem.count" /></td>
							<td width="140"><span class="subtotal">￥<s:property
										value="#orderItem.subtotal" /></span></td>

						</tr>
					</s:iterator>
				</tbody>
			</table>
			<dl id="giftItems" class="hidden" style="display: none;">
			</dl>
			<div class="total">
				<em id="promotion"></em> 商品金额: <strong id="effectivePrice">￥<s:property
						value="model.total" />元
				</strong>
			</div>
			<form id="orderForm"
				action="${ pageContext.request.contextPath }/order_payOrder.action"
				method="post">
				<input type="hidden" name="oid"
					value="<s:property value="model.oid"/>" />
				<div class="span24">
					<p>
						收货地址：<input name="addr" type="text"
							value="<s:property value="model.user.address"/>"
							style="width: 350px" /> <br /> 收货人&nbsp;&nbsp;&nbsp;：<input
							name="name" type="text"
							value="<s:property value="model.user.name"/>"
							style="width: 150px" /> <br /> 联系方式：<input name="phone"
							type="text" value="<s:property value="model.user.phone"/>"
							style="width: 150px" />

					</p>

					<p style="text-align: right">
						<a
							href="javascript:document.getElementById('orderForm').submit();">
							付款 </a>
					</p>
				</div>
			</form>
		</div>

	</div>
	<div class="container footer">
		<%@ include file="../pub/bottom.jsp"%>
	</div>
</body>
</html>