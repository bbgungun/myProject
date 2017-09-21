<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>注册</title>
    <style type="text/css">
body {
  padding-top: 50px;
}
.starter-template {
  padding: 40px 15px;
  text-align: center;
}
input{
  margin: 10px 0;
}
    </style>
</head>

<body class="signin" style="height: 100vh">
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <a class="navbar-brand" href="#">Books</a>
      </div>
      <a href="<%=basePath %>jsp/login.jsp" style="float:right"><button class="btn btn-primary">登陆</button></a>
    </div>
  </nav>
  <div class="container" style="/* min-height: 100vh */">
    <div class="starter-template">
      <h1>Books</h1>
    </div>
    <div class="row">
        <div class="col-md-8"></div>
        <div class="col-md-4">
          <form action="<%= basePath %>user/register.do" method="post" class="form-signin" id="loginform" style="padding: 0 30px;">
            <h2 class="form-signin-heading">Sign in</h2>
            <label for="username" class="sr-only">username</label>
            <input type="text" id="username" class="form-control" placeholder="username" name="userName" required="">
            <label for="userpsw" class="sr-only">Password</label>
            <input type="password" id="userpsw" class="form-control" placeholder="Password" name="userPassword" required="">
            <label for="Reuserpsw" class="sr-only">Repassword</label>
            <input type="password" id="Reuserpsw" class="form-control" placeholder="Password" name="reuserpsw" required="">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
          </form>
        </div>

      </div>
  </div>
  <img src="<%=basePath %>jsp/img/back.jpg" alt="" style="z-index: -1; position: fixed; top: 0;left: 0;min-width:100%;">
  <img src="" alt="">
  <div class="tail" style="position: fixed;bottom: 0">@2017</div>
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <c:if test="${message != null}">
  	<script type="text/javascript">alert('<c:out value="${message }" />');</script>
  </c:if>

</body></html>