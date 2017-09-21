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

    <title>欢迎</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.bootcss.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
    
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
    <link href="<%=basePath %>jsp/css/screen.css" rel="stylesheet">
    <style>
    #userinfo{
       border-radius: 6px; 
       background: #bbc;
       font-size: 16px;
    }
    #userinfo > h1{
        text-align: center;
    }
    #books{
        text-align: center;
    }
    </style>
</head>
<body class="post-template page-template page">
    <header class="main-header" ">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <a class="branding" src="">
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
	                        <li class="nav-current" role="presentation"><a href="<%=basePath %>user/welcome.do">主页</a></li>
	                        <li role="presentation"><a href="<%=basePath %>student/findAll.do">同学</a></li>
	                        <li role="nav-current"><a href="<%=basePath %>teacher/ofindAll.do">老师</a></li>
	                    </ul>
	                </div>
	            </div>
	        </div>
	    </div>
	</nav>
    <!-- end navigation -->
    
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div id="userinfo">
                    <h1>${user.userAccount}</h1>
                    <p>用户名：${user.userName}</p>
                    <p>真实姓名：${user.userRealname}</p>
                    <p>性别：${user.userSex}</p>
                    <p>生日：${user.userBirth}</p>
                    <p>学历：${user.userEducation}</p>
                    <p>邮箱：${user.userEmail}</p>
                    <p>电话：${user.userTel}</p>
                    <p>QQ：${user.userQq}</p>
                    <p>住址：${user.userAddress}</p>
                    <p>个人评价：${user.userDescriptoin}</p>
                </div>
            </div>
            <div class="col-md-8">
                <div id="books"  class="row">
                   <c:forEach items="${books}" var="book" >
                    <div class="col-md-4">
                        <div class="thumbnail">
                        	<a href="<%=basePath %>book/pagefind.do?id=${book.abId}">
                        		<img alt="" src="${book.models.pictrue}">
                        	</a>
                        	<h4>${book.abDescription}</h4>
                        </div>
                    </div>
                    </c:forEach>
                </div>
                <button type="button" class="btn btn-primary btn-lg btn-block" onclick="addBook()">添加同学录</button>
            </div>
        </div>
    </div>

    <a href="#" id="back-to-top"><i class="fa fa-angle-up"></i></a>

    <div class="modal fade" id="addUserInfo">
       <div class="modal-dialog">
          <div class="modal-content">
             <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">
                 	  完善个人信息
                </h4>
             </div>
             <div class="modal-body">
                 <form id="fillInfoForm" class="form-horizontal" action="<%=basePath %>user/info.do" method="POST">
                   <input hidden="hidden" name="userId" value="${user.userId }">
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userAccount</label>
                    <div class="col-sm-10">
                    	<input type="text" class="form-control" name="userAccount" value="${user.userAccount }">
                  	</div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userRealname</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control" name="userRealname" value="${user.userRealname }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userSex</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control" name="userSex" value="${user.userSex }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userBirth</label>
                    <div class="col-sm-10">
                      <input type="date" class="form-control" name="userBirth" value="${user.userBirth }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userEducation</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control" name="userEducation" value="${user.userEducation }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userEmail</label>
                    <div class="col-sm-10">
                      <input type="email" class="form-control" name="userEmail" value="${user.userEmail }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userTel</label>
                    <div class="col-sm-10">
                      <input type="tel" class="form-control" name="userTel" value="${user.userTel }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userQq</label>
                    <div class="col-sm-10">
                      <input type="number" class="form-control" name="userQq" value="${user.userQq }">
                    </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userAddress</label>
                    <div class="col-sm-10">
	                    <input type="text" class="form-control" name="userAddress" value="${user.userAddress }">
	                  </div>
                  </div>
                  <div class="form-group">
                    <label  class="col-sm-2 control-label">userDescriptoin</label>
                    <div class="col-sm-10">
	                    <input type="text" class="form-control" name="userDescriptoin" value="${user.userDescriptoin }">
	                  </div>
                  </div>
                </form>
             </div>
             <div class="modal-footer">
                <button type="button" class="btn btn-default" 
                   data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="$('#fillInfoForm').submit();">
                  	 添加
                </button>
             </div>
          </div>
    	</div>
    </div>


    <div class="modal fade" id="addBook">
       <div class="modal-dialog">
          <div class="modal-content">
             <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">
                   	添加同学录
                </h4>
             </div>
             <div class="modal-body">
				<form id="addBookForm" action="<%=basePath %>book/add.do" method="GET">
					<input name="userId" value="${user.userId}" hidden="hidden">
					<input name="modelsId" id="modelsId" hidden="hidden">
					<div class="form-group">
						<label>abName</label>
            			<input type="text" class="form-control" value="${ab.abName }" name="abName">
					</div>
					<div class="form-group">
						<label>abDescription</label>
            			<input type="text" class="form-control" value="${ab.abDescription }" name="abDescription">
					</div>
					<div class="form-group">
                    <label  class="col-sm-2 control-label">models</label>
                    <div class="col-sm-10">
	                    <div class="row" id="models">
	                    </div>
	                </div>
                  </div>
				</form>
             </div>
             <div class="modal-footer">
                <button type="button" class="btn btn-default" 
                   data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="$('#addBookForm').submit();">
                   		 添加
                </button>
             </div>
          </div>
    </div>
	</div>

    <script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/fitvids/1.1.0/jquery.fitvids.min.js"></script>
    <script src="https://cdn.bootcss.com/highlight.js/8.5/highlight.min.js"></script>
    <script src="https://cdn.bootcss.com/magnific-popup.js/1.0.0/jquery.magnific-popup.min.js"></script>
    <script>
        
        
        $(document).ready(function(){
            //info unfilled
            var userAc = "${user.userAccount}";
            if(userAc == ""){
                $('#addUserInfo').modal({show:true});
            }
            $('#back-to-top').on('click', function(e){
                e.preventDefault();
                $('html, body').animate({scrollTop : 0},1000);
                return false;
            });

            $(window).scroll(function(){
                if ($(this).scrollTop() > 100) {
                    $('#back-to-top').fadeIn();
                } else {
                    $('#back-to-top').fadeOut();
                }
            });
        })

        function addBook(){
        	$.getJSON("<%= basePath%>models/find.do",function(result){
       	      $.each(result, function(i, mod){
       	    	var s= "$('#modelsId').val(''+this.attr('"+mod.modelsId+"'));"
       	        $('#models').append("<div class='col-md-4 models'><div class='thumbnail'><img src='"+mod.pictrue+"'><a onclick='a("+mod.modelsId+")'><h4>"+mod.descrip+"</h4></a></div></div>");
       	      });
       	    });
            $('#addBook').modal({show:true});
            //set data in form
        }
        function a(i){
        	$('#modelsId').val(i);
        }
    </script>
</body>
</html>