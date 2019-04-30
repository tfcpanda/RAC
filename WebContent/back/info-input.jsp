<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理</title>
<link rel="stylesheet" type="text/css" href="../css/common.css" />
<link rel="stylesheet" type="text/css" href="../css/main.css" />
<script type="text/javascript" src="../js/modernizr.min.js"></script>
<script type="text/javascript" src="../scripts/jquery-3.3.1.min.js">
	
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
					<i class="icon-font"></i><a href="index.jsp">首页</a><span
						class="crumb-step">&gt;</span><a class="crumb-name"
						href="emp-list">员工列表</a><span class="crumb-step">&gt;</span><span>新增员工信息</span>
				</div>
			</div>
			<div class="result-wrap">
				<div class="result-content">
					<form id="saveForm" action="info-getall" method="post">
						<table class="insert-tab" width="100%">
							<tbody>
							
								<!--邮箱开始-->
								<tr>
									<th>隐私政策：</th>
									<td><input id="employeeEmail"
										value="${employee.employeeEmail}" class="common-text"
										name="employee.employeeEmail" size="50" type="text"></td>
								</tr>
								<!--邮箱结束-->
							
								<tr>
									<th></th>
									<td><input class="btn btn-primary btn6 mr10" value="提交"
										id="sub" type="submit"></td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
			</div>

		</div>
		<!--/main-->
	</div>
</body>


</html>