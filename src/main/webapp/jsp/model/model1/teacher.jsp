<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div  style="width: 80%; height: 100%; margin: 0 auto;">
	<div class="info" style="position: absolute; font-size: 18; text-align: left;width: 80%; padding: 20px; box-sizing: border-box;">
		<div class="info-left" style="float: left; width: 50%;">
			<p id="t.p_nickname">姓名: <%= request.getParameter("tName") %></p> 
            <p id="t.p_sex">性别:<%= request.getParameter("tSex") %></p>           
            <p id="t.p_age">生日:<%= request.getParameter("tBirth") %> </p>                
            <p id="t.p_tel">电话:<%= request.getParameter("tTel") %> </p>               
            <p id="t.p_email">邮箱:<%= request.getParameter("tEmail") %> </p>              
            <p id="t.p_qq">QQ:<%= request.getParameter("tQq") %> </p>
            <p id="t.p_address">联系地址:<%= request.getParameter("address") %> </p>
		</div>
		
	</div>
	<img src="https://s1.ax1x.com/2017/09/18/KMenH.jpg" alt=""  style="width: 100%; height: 100%">
</div>