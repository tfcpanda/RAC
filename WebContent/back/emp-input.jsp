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
					<form id="saveForm" action="emp-save" method="post">
						<table class="insert-tab" width="100%">
							<tbody>
								<!--部门开始-->
								<tr>
									<th width="120">部门：</th>
									<td><select id="department" name="employee.department.id">
											<option value="0">请选择</option>
											<c:forEach items="${departments}" var="department"
												varStatus="departmentStatus">
												<option value="${department.id}"
													<c:if test="${department.id eq employee.department.id}">
														selected
													</c:if>>
													${department.departmentName}</option>
											</c:forEach>
											<br>
									</select></td>
								</tr>
								<!--部门结束-->
								<!--姓名开始-->
								<tr>
									<th>姓名：</th>
									<td><c:if test="${employee eq null}">
											<input class="common-text required" id="employeeName"
												name="employee.employeeName" size="50" value="" type="text">
										</c:if> <c:if test="${employee ne null}">
											<input type="text" id="employeeName"
												name="employee.employeeName" disabled="disabled"
												value="${employee.employeeName}">
											<input type="hidden" name="employee.id"
												value="${employee.id}">
										</c:if></td>
								</tr>
								<!--姓名结束-->
								<!--邮箱开始-->
								<tr>
									<th>EMAIL：</th>
									<td><input id="employeeEmail"
										value="${employee.employeeEmail}" class="common-text"
										name="employee.employeeEmail" size="50" type="text"></td>
								</tr>
								<!--邮箱结束-->
								<!--生日开始-->
								<tr>
									<th>生日：</th>
									<td><input
										value="<fmt:formatDate value='${employee.employeeBirthday}'
                             type='date' dateStyle='default' />"
										id="employeeBirthday" class="common-text"
										name="employee.employeeBirthday" size="50" type="text"></td>
								</tr>
								<!--生日结束-->
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

<script type="text/javascript">
	$(document).ready(function() {
		$("#employeeName").change(function() {
			var val = $(this).val();
			val = $.trim(val);
			var $this = $(this);
			if (val != "") {
				//把当前节点后面的所有 font 兄弟节点删除
				$this.nextAll("font").remove();
				var url = "emp-validateEmployeeName?employeeName=" + val;
				$.ajax({
					url : url,
					dataType : "json",
					type : "post",
					success : function(data) {
						//若data的返回值为true，则提示删除成功，且把当前行删除
						if (data.status) {
							$this.after("<font color='green'>姓名可用!</font>");
						} else {
							$this.after("<font color='red'>姓名不可用!</font>");
						}
					}
				});
			} else {
				alert("姓名 不能为空！");
				$(this).val("");
				$this.focus();
			}
		});
	});
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).on("click", "#sub", function() {
			if ($("#employeeName").val() == '') {
				alert("用户名不能为空！");
				return false;
			}
			if ($("#employeeEmail").val() == '') {
				alert("邮箱不能为空！");
				return false;
			}
			if ($("#employeeBirthday").val() == '') {
				alert("生日不能为空！");
				return false;
			}
			if ($("#department").val() == null) {
				alert("部门不能为空！");
				return false;
			}
			var coun = $("#department").val();
			if (coun == 0) {
				alert("部门不能为空！");
				return false;
			}
		});
	});
</script>
</html>