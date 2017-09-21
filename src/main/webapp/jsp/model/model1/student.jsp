<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div  style="width: 80%; height: 100%; margin: 0 auto;">
		<!-- <p>ç§ç : <%= request.getParameter("p_picture")%></p>  -->

		<div class="info" style="position: absolute; font-size: 18; text-align: left;width: 80%; padding: 20px; box-sizing: border-box;">
			<div class="info-left" style="float: left; width: 50%;">

				<p id="p_name">姓名 : <%= request.getParameter("pName")%></p> 
				<p id="p_nickname">昵称 : <%= request.getParameter("pNickname")%></p> 
	            <p id="p_sex">性别 : <%= request.getParameter("pSex")%></p>           
	            <p id="p_birthday">生日 : <%= request.getParameter("pBirthday")%></p>          
	            <p id="p_interesting">兴趣爱好 : <%= request.getParameter("pInteresting")%></p>        
	            <p id="p_tel">电话：<%= request.getParameter("pTel")%></p>               
	            <p id="p_email">邮箱 : <%= request.getParameter("pEmail")%></p>              
	            <p id="p_qq">QQ : <%= request.getParameter("pQq")%></p>                
	            <p id="p_weibo">微博 : <%= request.getParameter("pWeibo")%></p>              
	            <p id="p_address">地址 : <%= request.getParameter("pAddress")%></p>            
	            <p id="p_constellation">星座 : <%= request.getParameter("pConstellation")%></p>     
	            <p id="p_idol">偶像 : <%= request.getParameter("pIdol")%></p>               
	            <p id="p_luckcolor">幸运色 : <%= request.getParameter("pLuckcolor")%></p>  
	            
	            
			</div>
			<div class="info-right" style="width: 50%;float: left;">		
				<p id="p_wishes">祝福语:<%= request.getParameter("pWishes")%></p>
			</div>
		</div>
		<img src="https://s1.ax1x.com/2017/09/18/KMenH.jpg" alt=""  style="width: 100%; height: 100%">
	</div>