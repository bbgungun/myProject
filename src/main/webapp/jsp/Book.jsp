<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>同学录</title>

	<link href="https://cdn.bootcss.com/Swiper/3.4.2/css/swiper.min.css" rel="stylesheet">
	<link href="https://cdn.bootcss.com/Buttons/2.0.0/css/buttons.min.css" rel="stylesheet">
	<link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<style>
	#back{
		color: rgba(27, 154, 247, 0.9);
		top:20px;
		left:20px;
	}
	#send{
		color: rgba(27, 154, 247, 0.9);
		top:20px;
		right:20px;
	}#delet{
		color: rgba(27, 154, 247, 0.9);
		bottom:20px;
		left:20px;
	}
	.add{
		background-color: rgba(27, 154, 247, 0.9);
		right: 20px;
   		bottom: 20px;
	}
	.add-student{
		right: 20px;
   		bottom: 80px;
   		display: none;
	}
	.add-teacher{
		right: 20px;
   		bottom: 140px;
   		display: none;
	}
	.button{
		position: fixed;
		z-index: 2;
	}
	</style>
</head>
<body>
	<div class="swiper-container">
	   <div class="swiper-wrapper">
			<div class="swiper-slide" data-page-id="-1">
				<jsp:include page="${models.indexpage }">
					<jsp:param value="${mdoels }" name="a"/>
				</jsp:include>
			</div>
			<c:forEach items="${list1}" var="t">
			
				<div class="swiper-slide" data-page-prop="teacher" data-page-id="${t.teacherpageifoId}">
					<jsp:include page="${models.teacherpage}" >
						<jsp:param value="${t.tName}" name="tName"/>
						<jsp:param value="${t.tSex}" name="tSex"/>
						<jsp:param value="${t.tBirth}" name="tBirth"/>
						<jsp:param value="${t.tTel}" name="tTel"/>
						<jsp:param value="${t.tEmail}" name="tEmail"/>
						<jsp:param value="${t.tQq}" name="tQq"/>
						<jsp:param value="${t.address}" name="address"/>
					</jsp:include>
				</div>
			</c:forEach>
			<c:forEach items="${list}" var="s">
				<div class="swiper-slide" data-page-prop="student" data-page-id="${s.pId }">
					<jsp:include page="${models.studentpage}">
						<jsp:param value="${s.pName}" name="pName"/>
						<jsp:param value="${s.pNickname}" name="pNickname"/>
						<jsp:param value="${s.pSex}" name="pSex"/>
						<jsp:param value="${s.pBirthday}" name="pBirthday"/>
						<jsp:param value="${s.pInteresting}" name="pInteresting"/>
						<jsp:param value="${s.pTel}" name="pTel"/>
						<jsp:param value="${s.pEmail}" name="pEmail"/>
						<jsp:param value="${s.pQq}" name="pQq"/>
						<jsp:param value="${s.pWeibo}" name="pWeibo"/>
						<jsp:param value="${s.pAddress}" name="pAddress"/>
						<jsp:param value="${s.pConstellation}" name="pConstellation"/>
						<jsp:param value="${s.pIdol}" name="pIdol"/>
						<jsp:param value="${s.pLuckcolor}" name="pLuckcolor"/>
						<jsp:param value="${s.pWishes}" name="pWishes"/>
					</jsp:include>
				</div>
			</c:forEach>
			<div class="swiper-slide"  data-page-id="-1"><jsp:include page="${models.tailpage }"></jsp:include></div>
		</div>

	    <!-- 如果需要导航按钮 -->
	    <div class="swiper-button-prev"></div>
	    <div class="swiper-button-next"></div>
	    <!-- 如果需要滚动条 -->
	    <div class="swiper-scrollbar"></div>
	</div>
	<!-- back -->
	<button class="button button-large button-plain button-borderless" id="back" onclick="window.location.href='<%=basePath%>user/welcome.do';"><i class="fa fa-chevron-left"></i></button>
	<!-- sendto -->
	<button class="button button-large button-plain button-borderless" id="send"><i class="fa  fa-paper-plane"></i></button>
	<!-- delet -->
	<button class="button button-large button-plain button-borderless" id="delet"><i class="fa  fa-trash-o"></i></button>
	<!-- add -->
	<button class="button button-large button-plain button-border button-circle add add-menu"><i class="fa fa-plus"></i></button>
	<button class="button button-large button-plain button-border button-circle add add-student" ><i class="fa fa-user"></i></button>
	<button class="button button-large button-plain button-border button-circle add add-teacher"><i class="fa fa-graduation-cap"></i></button>

	<div class="modal fade" id="sendto">
       <div class="modal-dialog">
          <div class="modal-content">
             <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">
                   	发送邮件给好友填写
                </h4>
             </div>
             <div class="modal-body">
				<form id="sendtoform" action="<%=basePath%>email/sendto.do" method="get">
					<input name="type" id="type" hidden="hidden">
					<input name="pid" id="pid" hidden="hidden">
					<input name="id" id="bookid" hidden="hidden">
					<div class="form-group">
						<label>your name</label>
            			<input type="text" class="form-control" name="name">
					</div>
					<div class="form-group">
						<label>address</label>
            			<input type="email" class="form-control" name="address">
					</div>
				</form>
             </div>
             <div class="modal-footer">
                <button type="button" class="btn btn-default" 
                   data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick="$('#sendtoform').submit();">
                   		 发送
                </button>
             </div>
          </div>
    </div>
	</div>

	<div class="modal fade" id="deletform">
       <div class="modal-dialog">
          <div class="modal-content">
             <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">
                   	确认删除本页
                </h4>
             </div>
             
             <div class="modal-footer">
                <button type="button" class="btn btn-default" 
                   data-dismiss="modal">我再考虑考虑
                </button>
                <button type="button" class="btn btn-primary" onclick="delet()">
                   		 确定
                </button>
             </div>
          </div>
    </div>
	</div>

	<script src="https://cdn.bootcss.com/jquery/3.2.0/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/Swiper/3.4.2/js/swiper.jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/Buttons/2.0.0/js/buttons.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script>    
	  $(document).ready(function () {
	  	
	  })
	  
	  var mySwiper = new Swiper ('.swiper-container', {
		    direction: 'horizontal',
		    loop : false,
		    observer:true,
		    grabCursor : true,
		    mousewheelControl : true,
		    
		    // 如果需要前进后退按钮
		    nextButton: '.swiper-button-next',
		    prevButton: '.swiper-button-prev',
		    
		    // 如果需要滚动条
	    	scrollbar: '.swiper-scrollbar',
		  })

	  $('.add-menu').click(function(){
	  	$('.add-teacher').toggle();
	  	$('.add-student').toggle();
	  });
	  $('.add-teacher').click(function(){
	  	window.location.href="<%=basePath%>teacher/add.do?id=${abId}";
	  });
	  $('.add-student').click(function(){
	  	window.location.href="<%=basePath%>student/add.do?id=${abId}";
	  });
	  
	  $('#delet').click(function(){
		  $('#deletform').modal({show:true});
	  });
	  
	  $('#send').click(function(){
		  var index = mySwiper.realIndex;
	  	  var dom = $(".swiper-wrapper .swiper-slide:eq("+index+")");
	  	  $('#type').val(dom.data("page-prop"));
	  	  $('#pid').val(dom.data("page-id"));
	  	  $('#bookid').val(${abId});
		  $('#sendto').modal({show:true});
	  })
	  function delet(){
	  	  var index = mySwiper.realIndex;
	  	  var dom = $(".swiper-wrapper .swiper-slide:eq("+index+")");
		  //console.log(dom.data("page-id"));
		  if(dom.data("page-id")>0){
			  window.location.href='<%=basePath%>'+dom.data("page-prop")+'/delet.do?pid='+dom.data("page-id")+'&id=${abId}';
		  }
	  }
    </script>
</body>
</html>