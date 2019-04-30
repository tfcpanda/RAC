<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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

<link href="${pageContext.request.contextPath}/css/tasp.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/orderconfirm.css"
	rel="stylesheet" />
</head>

<body data-spm="1">
	<div id="page">
		<div id="content" class="grid-c">
			<form id="J_Form" name="J_Form" action="#" method="post">

				<div>
					<h3 class="dib">确认订单信息</h3>
					<table class="order-table" id="J_OrderTable">
						<thead>
							<tr>
								<th class="s-title">产品名称
									<hr />
								</th>
								<th class="s-price">收益
									<hr />
								</th>
								<th class="s-price">价格
									<hr />
								</th>
								<th class="s-amount">数量
									<hr />
								</th>
								<th class="s-total">总计
									<hr />
								</th>
							</tr>
						</thead>
						<tbody data-spm="3" class="J_Shop">
						<s:iterator var="cartItem" value="#session.cart.cartItems">
								<tr class="item">
									<td>
										<s:property value="#cartItem.product.name" />
									</td>
									<td>
									<s:property value="#cartItem.product.description" />
									</td>
									<td class="s-price"><span class='price'> <s:property
												value="#cartItem.product.price" />
									</span>
									</td>
									<td>
									<s:property value="#cartItem.number" />
									</td>
									<td >
									<s:property value="#cartItem.sum" />
									</td>
								</tr>
							</s:iterator>

							<tr class="item-service">
								<td colspan="5" class="servicearea" style="display: none">1</td>
							</tr>

							<tr class="blue-line" style="height: 2px;">
								<td colspan="5"></td>
							</tr>
							<tr class="shop-total blue-line">
								<td colspan="5">店铺合计(<span class="J_Exclude" style="display: none">不</span>含运费)：
									 <span class='price g_price '> 
									<em class="style-middle-bold-red J_ShopTotal"> <s:property value="#session.cart.total" /></em>
									<span>&yen;</span>
								</span>

								</td>
							</tr>

						</tbody>

						<tfoot>
							<tr>
								<td colspan="5">

									<div class="order-go" data-spm="4">
										<div class="J_AddressConfirm address-confirm">
											<div class="kd-popup pop-back" style="margin-bottom: 40px;">
												<div class="box">
													<div class="bd">
														<div class="point-in">
															<em class="t">实付款：</em> <span class='price g_price '>
																<em class="style-large-bold-red"
																id="J_ActualFee"><s:property value="#session.cart.total" /></em>
																<span>&yen;</span>
															</span>
														</div>

													</div>
												</div>
												<a id="J_Go" class=" btn-go" title="点击此按钮，提交订单。">提交订单<b
													class="dpl-button"></b></a>
											</div>
										</div>
									</div>
								</td>
							</tr>
						</tfoot>
					</table>
				</div>
			</form>
		</div>

	</div>

	<%@ include file="../pub/bottom.jsp"%>
</body>


</html>
