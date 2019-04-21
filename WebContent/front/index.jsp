<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
	<!--[if lte IE8]>	
		<![endif]-->
	<section class="feature">
		<div class="item">
			<h3>安全</h3>
			<p>
				国家AAA信用平台<br />银行资金托管<br />上市公司北京保证
			</p>
		</div>
		<div class="item">
			<h3>权威</h3>
			<p>
				国家AAA信用平台<br />银行资金托管<br />上市公司北京保证
			</p>
		</div>
		<div class="item">
			<h3>省心</h3>
			<p>
				国家AAA信用平台<br />银行资金托管<br />上市公司北京保证
			</p>
		</div>
	</section>
	<div class="notice clearfix">

		<a href="#"><span>2014-2-2</span>红杏金服于2014年获得1.3亿美元A轮融资，打破当时全球同行业单笔融资纪录。</a>
		<a href="#" class="more">更多公告</a>
	</div>

	<section class="product clearfix">
		<h2>
			固定定期限产品 <em>增选优质基金</em> <em>省时省力</em> <em>坐等收益</em>
		</h2>

		<div class="product-content clearfix">
			<div class="item clearfix">
				<s:iterator var="c" value="#session.clist">
					<h3>
						<a href="${pageContext.request.contextPath}/product_findById.action?id=<s:property value="#c.id"/>"><em><s:property value="#c.name" /></em></a>
					</h3>
					<div class="info">
						<p>
							约定年化收益率（价格）：<span class="year-rate"><s:property
									value="#c.description" /><i>起</i></span>
						</p>
						<p>
							总成交金额：<span class="money"><s:property value="#c.price" /><i>万元</i></span>
						</p>
					</div>
					<div class="buy">
						<a href="#">购买</a>
					</div>
				</s:iterator>
			</div>
		</div>
	</section>
	<section class="product clearfix">
		<h2>
			定期限产品 <em>增选优质基金</em> <em>省时省力</em> <em>坐等收益</em>
		</h2>

		<div class="product-content">
			<div class="item clearfix">
				<h3>
					<em>3</em>个月
				</h3>
				<div class="info">
					<p>
						约定年化收益率：<span class="year-rate">3.50%<i>起</i></span>
					</p>
					<p>
						总成交金额：<span class="money">1880<i>万元</i></span>
					</p>
				</div>
				<div class="buy">
					<a href="#">购买</a>
				</div>
			</div>
			<div class="item clearfix">
				<h3>
					<em>3</em>个月
				</h3>
				<div class="info">
					<p>
						约定年化收益率：<span class="year-rate">3.50%<i>起</i></span>
					</p>
					<p>
						总成交金额：<span class="money">1880<i>万元</i></span>
					</p>
				</div>
				<div class="buy">
					<a href="#">购买</a>
				</div>
			</div>
			<div class="item clearfix">
				<h3>
					<em>3</em>个月
				</h3>
				<div class="info">
					<p>
						约定年化收益率：<span class="year-rate">3.50%<i>起</i></span>
					</p>
					<p>
						总成交金额：<span class="money">1880<i>万元</i></span>
					</p>
				</div>
				<div class="buy">
					<a href="#">购买</a>
				</div>
			</div>
			<div class="item clearfix">
				<h3>
					<em>3</em>个月
				</h3>
				<div class="info">
					<p>
						约定年化收益率：<span class="year-rate">3.50%<i>起</i></span>
					</p>
					<p>
						总成交金额：<span class="money">1880<i>万元</i></span>
					</p>
				</div>
				<div class="buy">
					<a href="#">购买</a>
				</div>
			</div>
			<div class="item clearfix">
				<h3>
					<em>3</em>个月
				</h3>
				<div class="info">
					<p>
						约定年化收益率：<span class="year-rate">3.50%<i>起</i></span>
					</p>
					<p>
						总成交金额：<span class="money">1880<i>万元</i></span>
					</p>
				</div>
				<div class="buy">
					<a href="#">购买</a>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="../pub/bottom.jsp"%>
</body>
</html>
