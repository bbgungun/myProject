<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.bootcss.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="css/screen.css" rel="stylesheet">
    </head>
<body>
<nav class="main-navigation">
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="navbar-header">
                    <span class="nav-toggle-button collapsed" data-toggle="collapse" data-target="#main-menu">
                    <span class="sr-only">Toggle navigation</span>
                    <i class="fa fa-bars"></i>
                    </span>
                </div>
                <div class="collapse navbar-collapse" id="main-menu">
                    <ul class="menu">
                        <li class="nav-current" role="presentation"><a href="index.html">主页</a></li>
                        <li role="presentation"><a href="books.html">同学</a></li>
                        <li role="nav-current"><a href="AboutMe.html">老师</a></li>
                    </ul>   
                </div>
            </div>
        </div>
    </div>
</nav>
<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/fitvids/1.1.0/jquery.fitvids.min.js"></script>
<script src="https://cdn.bootcss.com/highlight.js/8.5/highlight.min.js"></script>
<script src="https://cdn.bootcss.com/magnific-popup.js/1.0.0/jquery.magnific-popup.min.js"></script>
</body></html>