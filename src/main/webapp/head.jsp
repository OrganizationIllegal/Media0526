<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
 <!-- header start -->
		<div class="row" style="padding-top:30px;background-color:rgba(121, 200, 225, 1);margin-left: 0px;margin-right: 0px;">
			<div class="col-md-3 col-md-offset-1">
				<img alt="logo"  src="/images/logo.PNG">
			</div>
			<div class="col-md-1"></div>
			<div class="col-md-1" style="padding-left:0px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:22px;">
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/index.jsp" style="color:white;font-size:20px;font-family:楷体;">首页</a></div>
				<div style="color:white;font-size:10px;font-family:楷体;">LATEST NEWS</div>
				<div style="color:white;font-size:10px;font-family:楷体;">EVENT</div>
			</div>
            <div class="col-md-1" style="padding-left:10px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:5px;">
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/News?newsId=1" style="color:white;font-size:20px;font-family:楷体;">动态</a></div>
				<div style="color:white;font-size:10px;font-family:楷体;">WEDDING</div>
				<div style="color:white;font-size:10px;font-family:楷体;">PHOTO</div>
				<div style="color:white;font-size:10px;font-family:楷体;">GUESTPHOTO</div>
			</div>
			<div class="col-md-1" style="padding-left:10px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:39px;">
<<<<<<< HEAD
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/artist.jsp" style="color:white;font-size:20px;font-family:楷体;">艺人</a></div>
=======
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/Artist" style="color:white;font-size:20px;font-family:楷体;">艺人</a></div>
>>>>>>> b7efedcc28ae891d3503380422f458a314cdb05b
				<div style="color:white;font-size:10px;font-family:楷体;">DOING</div>
			</div>
			<div class="col-md-1" style="padding-left:10px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:5px;">
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/Train" style="color:white;font-size:20px;font-family:楷体;">培训</a></div>
				<div style="color:white;font-size:10px;font-family:楷体;">ABOUT US</div>
				<div style="color:white;font-size:10px;font-family:楷体;">JOB</div>
				<div style="color:white;font-size:10px;font-family:楷体;">SERVICE TIPS</div>
			</div>
			<div class="col-md-1" style="padding-left:10px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:5px;">
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/video.jsp" style="color:white;font-size:20px;font-family:楷体;">影视</a></div>
				<div style="color:white;font-size:10px;font-family:楷体;">CONTACT</div>
				<div style="color:white;font-size:10px;font-family:楷体;">WEIBO</div>
				<div style="color:white;font-size:10px;font-family:楷体;">WEIXIN</div>
			</div>
			<div class="col-md-2" style="padding-left:10px;padding-right:0px;border-color:white;border-right-style:solid;border-right-width:1px;padding-top:5px;padding-bottom:5px;">
				<div style="padding-left:10px;margin-bottom:10px;"><a href="/aboutus.jsp" style="color:white;font-size:20px;font-family:楷体;">联系我们</a></div>
				<div style="color:white;font-size:10px;font-family:楷体;">ABOUT US</div>
				<div style="color:white;font-size:10px;font-family:楷体;">JOB</div>
				<div style="color:white;font-size:10px;font-family:楷体;">SERVICE TIPS</div>
			</div>
			
		</div>
<!-- header end -->
</body>
</html>