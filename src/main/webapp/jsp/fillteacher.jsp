<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>填写老师同学录</title>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1>填写老师同学录</h1>
		</div>
		<form class="form-horizontal" action="<%=basePath %>teacher/fillsteacher.do" method="post">
			<input value="${pid }" hidden="hidden" name="teacherpageifoId">
			<div class="form-group">
    			<label class="col-sm-2 control-label">名字:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="tName" placeholder="${p_nickname}" />
			    </div>
			</div>
	        <div class="form-group">
	        <label class="col-sm-2 control-label">性别: </label>
	          <div class="col-sm-10">
	          	<label class="radio-inline">
				  <input type="radio" name="tSex" id="inlineRadio1" value="male">male
				</label>
				<label class="radio-inline">
				  <input type="radio" name="tSex" id="inlineRadio2" value="female">female
				</label>
	          </div>
	          </div>           
	          <div class="form-group">
	          <label class="col-sm-2 control-label">生日:</label>
	          <div class="col-sm-10">
	          	<input type="date" class="form-control" name="tBirth" placeholder="${p_birth}" />
	          	</div>   
	          	</div>             
	          <div class="form-group">
	          <label class="col-sm-2 control-label">电话: </label>
	          <div class="col-sm-10">
	          	<input type="tel" class="form-control" name="tTel" placeholder="${p_tel}" />
	          </div> </div>              
	          <div class="form-group">
	          <label class="col-sm-2 control-label">邮箱: </label>
	          <div class="col-sm-10">
	          	<input type="email" class="form-control" name="tEmail" placeholder="${p_email}" />
	          </div> </div>             
	          <div class="form-group">
	          <label class="col-sm-2 control-label">QQ:</label>
	          <div class="col-sm-10">
	          	<input type="number" class="form-control" name="tQq" placeholder="${p_qq}" />
	          </div></div>
	          <div class="form-group">
	          	<label class="col-sm-2 control-label">家庭住址 :</label>
	          	<div class="col-sm-10">
	          		<input type="text" class="form-control" name="address" placeholder="${p_address}" />
	          	</div>
	          </div>
	          <button type="submit" class="btn btn-primary btn-lg btn-block">提交</button>
		</form>
	</div>
		
	<script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>