<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <title>ABOUT US</title>
   <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
   <style type="text/css">
   body{
   background-color:rgba(233, 243, 248, 1);
   }
   </style>
   <script type="text/javascript">
   $(function(){
	   $("#id1").click(function(){
		   $("#artist1").css("display","block");
		   $("#artist2").css("display","none");
		   });
	   $("#id2").click(function(){
		   $("#artist2").css("display","block");
		   $("#artist1").css("display","none");
		   });
	   });
   </script>
</head>
<body>
<div class="container">
		<jsp:include page="head.jsp" />
		<div class="row" style="">
		<div class="col-md-9">
		<div style="overflow-y:auto; width:850px; height:850px;">
		<div id="artist1">
		<div style="text-align:center;"><img alt="" src="/images/artist/big1.PNG" style="width:700px;height:550px;"></div>
		<div style="text-align:center;margin-top:30px;"><img alt="" src="/images/artist/jianjie1.PNG"></div>
		</div>
		<div id="artist2" style="display:none;">
		<div style="text-align:center;"><img alt="" src="/images/artist/big1.PNG" style="width:700px;height:550px;"></div>
		<div style="text-align:center;margin-top:30px;"><img alt="" src="/images/artist/jianjie1.PNG"></div>
		</div>
		</div>	
		</div>
		<div class="col-md-3" style="text-align:right;">	
		<div id="id1" style="margin-bottom:10px;"><img alt="" src="/images/artist/xiao1.PNG" style="width:240px;height:170px;cursor:pointer;"></div>
		<div id="id2" style="margin-bottom:10px;"><img alt="" src="/images/artist/xiao2.PNG" style="width:240px;height:170px;cursor:pointer;"></div>
		<div id="id3" style="margin-bottom:10px;"><img alt="" src="/images/artist/xiao3.PNG" style="width:240px;height:170px;cursor:pointer;"></div>
		<div id="id4" style="margin-bottom:10px;"><img alt="" src="/images/artist/xiao4.PNG" style="width:240px;height:170px;cursor:pointer;"></div>
		<div id="id5" style="margin-bottom:10px;"><img alt="" src="/images/artist/xiao5.PNG" style="width:240px;height:170px;cursor:pointer;"></div>	
		</div>
		</div>
		<jsp:include page="foot2.jsp" />
</div>
</body>
</html>
