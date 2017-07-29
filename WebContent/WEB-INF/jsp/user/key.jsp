<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ include file="../common/common_css.jsp"%>
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/jquery.datetimepicker.css"/>
<script src="<%=request.getContextPath() %>/resources/jquery.js"></script>
<script src="<%=request.getContextPath() %>/resources/layer/layer.js"></script>
<script src="<%=request.getContextPath() %>/resources/jquery.datetimepicker.js"></script>
<script>
$(function(){
	$("#userPass").blur(function(){
		var pass = $("#userPass").val();
		if(pass == null || pass == ''){
			layer.tips('密码不能为空！' , '#userPass' , {
				  tips: [2, '#3595CC'],
				  time: 2000
				});
		}else{
			//要求6-20位,只能有大小写字母和数字,并且大小写字母和数字都要有
			var reg = /^(?=.*\d)((?=.*[a-z])|(?=.*[A-Z]))[a-zA-Z\d]{6,20}$/;
			var r = pass.match(reg);
			if(r == null){
				$("#userPass").val("");
				layer.tips('密码必须6-20位,且有字母和数字！' , '#userPass' , {
					  tips: [2, '#3595CC'],
					  time: 2000
					});
			}
		}
		
	});
	
	$("#reUserPass").blur(function(){
		var pass = $("#userPass").val();
		var rePass = $("#reUserPass").val();
		if(pass != rePass){
			$("#reUserPass").val("");
			layer.tips('两次密码输入不一致！' , '#reUserPass' , {
				  tips: [2, '#3595CC'],
				  time: 2000
				});
		}
		
	});
})
</script>
</head>
<body class="no-skin">
	<div class="main-content-inner">
		<!-- #section:basics/content.breadcrumbs -->
		<div class="breadcrumbs" id="breadcrumbs">
			<script type="text/javascript">
				try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
			</script>

			<ul class="breadcrumb">
				<li>
					<i class="ace-icon fa fa-home home-icon"></i>
					<a href="#">管理员/教师</a>
				</li>
				<li class="active">修改密码</li>
			</ul><!-- /.breadcrumb -->			
		</div>
		
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
				<!-- PAGE CONTENT BEGINS -->
				<sf:form method="post" modelAttribute="user" id="addForm" cssClass="form-horizontal" role="form" enctype="multipart/form-data">
					<!-- #section:elements.form -->
					
					<table style="border-collapse:separate; border-spacing:10px;" >
						<tr><td colspan="2"><label>您正在修改工号为：${userChange.loginName },姓名为:${userChange.userName } 的密码：</label></td></tr>
						<tr>									
							<td width="100"><label>新密码: </label></td>
							<td>
								<div>
									<sf:input path="userPass" style="width:258px" type="password" placeholder="新密码"/>
									<sf:errors  path="userPass"/>
								</div>
							</td>
						</tr>
						
						<tr>
							<td width="100"><label>确认新密码: </label></td>
							<td>
								<div>
									<sf:input path="reUserPass" style="width:258px" type="password" placeholder="确认新密码"/>
									<sf:errors  path="reUserPass"/>
								</div>
							</td>
						</tr>	
					</table>			
				</sf:form>
				</div>
			</div><!-- /.row -->
		</div>
	</div>
<%@ include file="../common/common_js.jsp"%>

<script type="text/javascript">
$(function(){
	$("#addForm").cmsvalidate();
});
</script>

</body>
</html>