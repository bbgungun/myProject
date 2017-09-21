<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />

    <title>同学信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.bootcss.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="<%=basePath %>jsp/css/screen.css" rel="stylesheet">
    <style>
    </style>
</head>
<body class="post-template page-template page">

    <header class="main-header" ">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">

                    <a class="branding">
                        <img src="<%=basePath %>jsp/img/8.png">
                    </a>

                </div>
            </div>
        </div>
    </header>
    <!-- end header -->

    <!-- start navigation -->
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
	                        <li role="presentation"><a href="<%=basePath %>user/welcome.do">主页</a></li>
	                        <li class="nav-current" role="presentation"><a href="<%=basePath %>student/findAll.do">同学</a></li>
	                        <li role="nav-current"><a href="<%=basePath %>teacher/ofindAll.do">老师</a></li>
	                    </ul>
	                </div>
	            </div>
	        </div>
	    </div>
	</nav>
    <!-- end navigation -->
    
    <div id="aboutme">
        <div class="container" id="content">
            <div class="row">
                <div class="col-md-15">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="row">
                                <h1 class="col-md-5">同学信息</h1>
                                <form class="bs-example bs-example-form col-md-5" role="form" style="margin: 20px 0 10px 0;" action="" id="FormSearch" method="post">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="请输入姓名" name="findByName">
                                        <span class="input-group-addon btn" id="sub">搜索</span>
                                    </div>
                                </form>
                            </div>
                        </div>
                        <table class="table table-bordered">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>邮箱</th>
                                        <th>手机</th>
                                        <th>地址</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${list}"  var="item">
                                    <tr>
                                         <td>${item.pId}</td>
                                        <td>${item.pName}</td>
                                        <td>${item.pSex}</td>
                                        <td>${item.pEmail}</td>
                                        <td>${item.pTel}</td>
                                        <td>${item.pAddress}</td>
                                        <td>
                                            <button class="btn btn-xs btn-info" onClick="changeclassmate(${item.pId})">修改</button>
                                            <button class="btn btn-xs btn-danger btn-primary" onClick="confirmd(${item.pId})">删除</button>
                                            <!--弹出框-->
                                        </td>
                                    </tr>
									</c:forEach >
                                     
                                   
                                </tbody>
                        </table>    
                        <div class="panel-footer">
                            <nav style="text-align: center">
                                <ul class="pagination">
                                    <li><a href="<%=basePath %>student/findAll.do?pn=1">&laquo;第一页</a></li>
                                    <c:if test="${page.pageNum > 1}">
                                    	<li><a href="<%=basePath %>student/findAll.do?pn=${page.pageNum-1}">${page.pageNum-1}</a></li>
                                    </c:if>
                                    <li class="active"><a href="<%=basePath %>student/findAll.do?pn=${page.pageNum}">${page.pageNum}</a></li>
                                    <c:if test="${page.pageNum < page.pages}">
                                    	<li><a href="<%=basePath %>student/findAll.do?pn=${page.pageNum+1}">${page.pageNum+1}</a></li>
                                    </c:if>
                                    <li><a href="<%=basePath %>student/findAll.do?pn=${page.pages}">最后一页&raquo;</a></li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="container" id="footer">
            <div class="row">
                <div class="col-md-12"></div>
            </div>
        </div>
    </div>
    <a href="#" id="back-to-top"><i class="fa fa-angle-up"></i></a>



    <div class="modal fade" id="AddModel">
       <div class="modal-dialog">
          <div class="modal-content">
             <div class="modal-header">
                <button type="button" class="close"  > 
               
                </button>
                <h4 class="modal-title" id="myModalLabel">
                   修改同学信息
                </h4>
             </div>
             <div class="modal-body">
                 <form id="changeclassmate" action="<%=basePath %>student/update.do">
				  <input name="pId" id="id" hidden="hidden">
                  <div class="form-group">
                    <label>姓名</label>
                    <input type="text" class="form-control" name="pName">
                  </div>
                  <div class="form-group">
                    <label>邮箱</label>
                    <input type="text" class="form-control" name="pEmail">
                  </div>
                  <div class="form-group">
                    <label>手机</label>
                    <input type="text" class="form-control" name="pTel">
                  </div>

                </form>
             </div>
             <div class="modal-footer">
                <button type="button" class="btn btn-default" 
                   data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="$('#changeclassmate').submit()">
                   提交更改
                </button>
             </div>
          </div>
    </div>

    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/fitvids/1.1.0/jquery.fitvids.min.js"></script>
    <script src="https://cdn.bootcss.com/highlight.js/8.5/highlight.min.js"></script>
    <script src="https://cdn.bootcss.com/magnific-popup.js/1.0.0/jquery.magnific-popup.min.js"></script>
    <!-- <script src="/assets/js/main.js?v=a8de6833b5"></script> -->
    <script>
        $(window).scroll(function(){
            if ($(this).scrollTop() > 100) {
                $('#back-to-top').fadeIn();
            } else {
                $('#back-to-top').fadeOut();
            }
        });

        $('#back-to-top').on('click', function(e){
            e.preventDefault();
            $('html, body').animate({scrollTop : 0},1000);
            return false;
        });
        
        function changeclassmate(id){
        	$('#AddModel #id').val(id);
            $('#AddModel').modal({show:true});
            //set data in form

        }
        $("#sub").click(function () {
            $("#form1").submit();
        });
        function confirmd(id){
        	window.location.href='<%=basePath%>student/delete.do?id='+id;
        }
    </script>
    </script>
</body>
</html>