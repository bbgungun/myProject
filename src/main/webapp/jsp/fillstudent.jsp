<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>填写同学录</title>
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1>填写同学录</h1>
		</div>
		<form class="form-horizontal" action="<%=basePath %>student/fillstudent.do" method="post">
			<input value="${pid }" hidden="hidden" name="pId">
			<div class="form-group">
    			<label class="col-sm-2 control-label">名字:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="pName" placeholder="${p_nickname}" />
			    </div>
			</div>
			<div class="form-group">
    			<label class="col-sm-2 control-label">昵称:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="pNickname" placeholder="${p_nickname}" />
			    </div>
			</div>
	        <div class="form-group">
	        <label class="col-sm-2 control-label">性别: </label>
	          <div class="col-sm-10">
	          	<label class="radio-inline">
				  <input type="radio" name="pSex" id="inlineRadio1" value="male">male
				</label>
				<label class="radio-inline">
				  <input type="radio" name="pSex" id="inlineRadio2" value="female">female
				</label>
	          </div>
	          </div>           
	          <div class="form-group">
		          <label class="col-sm-2 control-label">生日:</label>
		          <div class="col-sm-10">
		          	<input type="date" class="form-control" name="pBirthday" placeholder="${p_birth}" />
	          	  </div>   
	          </div> 
	          <div class="form-group">
    			<label class="col-sm-2 control-label">兴趣爱好:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="pInteresting" placeholder="${p_interesting}" />
			    </div>
			</div>            
	          <div class="form-group">
	          <label class="col-sm-2 control-label">电话: </label>
	          <div class="col-sm-10">
	          	<input type="tel" class="form-control" name="pTel" placeholder="${p_tel}" />
	          </div> </div>              
	          <div class="form-group">
	          <label class="col-sm-2 control-label">邮箱: </label>
	          <div class="col-sm-10">
	          	<input type="email" class="form-control" name="pEmail" placeholder="${p_email}" />
	          </div> </div>             
	          <div class="form-group">
		          <label class="col-sm-2 control-label">QQ:</label>
		          <div class="col-sm-10">
		          	<input type="number" class="form-control" name="pQq" placeholder="${p_qq}" />
		          </div>
	          </div>
	          <div class="form-group">
		          <label class="col-sm-2 control-label">微博 :</label>
		          <div class="col-sm-10">
		          	<input type="text" class="form-control" name="pWeibo" placeholder="${p_weibo}" />
		          </div>
	          </div>
	          <div class="form-group">
	          	<label class="col-sm-2 control-label">家庭住址 :</label>
	          	<div class="col-sm-10">
	          		<input type="text" class="form-control" name="pAddress" placeholder="${p_address}" />
	          	</div>
	          </div>
	          <div class="form-group">
		          <label class="col-sm-2 control-label">星座:</label>
		          <div class="col-sm-10">
		          	<input type="text" class="form-control" name="pConstellation" placeholder="${p_constellation}" />
		          </div>
	          </div>
	          <div class="form-group">
		          <label class="col-sm-2 control-label">偶像:</label>
		          <div class="col-sm-10">
		          	<input type="text" class="form-control" name="pIdol" placeholder="${p_idol}" />
		          </div>
	          </div>
	          <div class="form-group">
	          	<label class="col-sm-2 control-label">幸运色:</label>
	          	<div class="col-sm-10">
	          		<input type="text" class="form-control" name="pLuckcolor" placeholder="${p_idol}" />
	          	</div>
	          </div> 
	          <div class="form-group">
	          	<label class="col-sm-2 control-label">祝福语 :</label>
	          	<div class="col-sm-10">
	          		<textarea class="form-control" rows="3"  name="pWishes" placeholder="${p_wishes}" ></textarea>
	          	</div>
	          </div> 
	          <button type="submit" class="btn btn-primary btn-lg btn-block">提交</button>
		</form>
	</div>
		
	<script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>