<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>艺人详情</title>
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <link href="/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
   <link href="/css/news.css" rel="stylesheet">
   <script src="/js/jquery.min.js"></script>
   <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="container">
 	<div class="row">
 		<div class="col-md-8 col-lg-8">
 			<div class="row" style="height:500px;">
 				<div class="col-md-4 col-lg-4">
 					<img alt="" src="" height="">
 				</div>
 				<div class="col-md-8 col-lg-8">
 					<c:if test="${not empty var1}">
 						<div class="form-group">
					    <label class="col-sm-3 control-label">姓名：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
						</div>
					</c:if>
 					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">别名</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">民族：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">星座：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">血型：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">身高：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">体重：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">生日：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">出生地：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">职业：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">经纪公司：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">属相：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">代表作品：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">现居地：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">毕业院校：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">成就：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">国籍：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
					    <label class="col-sm-3 control-label">性别：</label>
					    <div class="col-sm-9">
					      <label class="col-sm-3 control-label"></label>
					    </div>
					</div>
					</c:if>
					
					<c:if test="${not empty var1}">
						<div class="form-group">
						    <label class="col-sm-3 control-label">特长：</label>
						    <div class="col-sm-9">
						      <label class="col-sm-3 control-label"></label>
						    </div>
						</div>
					</c:if>
					<c:if test="${not empty var1}">
					    <div class="form-group">
						    <label class="col-sm-3 control-label">音乐风格：</label>
						    <div class="col-sm-9">
						      <label class="col-sm-3 control-label"></label>
						    </div>
						</div>
					</c:if>
					
					
				  	
 				</div>
 			</div>
 			<div class="row">
 			
 			</div>
 			
 		</div>
 		<div class="col-md-4 col-lg-4">
 			<img alt="" src="" class="row" height="300px">
 			<img alt="" src="" class="row" height="300px">
 			<img alt="" src="" class="row" height="300px">
 			<img alt="" src="" class="row" height="300px">
 			<img alt="" src="" class="row" height="300px">
 		</div>
 	</div>
 </div>
</body>
</html>