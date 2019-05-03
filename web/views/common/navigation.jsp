<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- bootstrap연결 -->
<link rel="stylesheet" href="<%= request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/header.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
	a:link { color: rgb(241, 196, 15); text-decoration: none;}
	a:visited { color: rgb(241, 196, 15); text-decoration: none;}
	a:hover { color: rgb(241, 196, 15); text-decoration: underline;}
	header > span{
		color: rgb(241, 196, 15);
		font-weight: bold;
		margin-top: 20px;
	}
	span:clicked{
		font-style:none;
	}
	
</style>
<!-- 
a:link { color: red; text-decoration: none;}
 a:visited { color: black; text-decoration: none;}
 a:hover { color: blue; text-decoration: underline;}
 
style 소스의 type = text를 제어하는 css로 한다.
a:link : 클릭하지 않은 링크
a:visited : 한번 클릭했던 혹은 다녀갔던 링크
a:hover : 링크를 클릭하려고 마우스를 가져갔을 때
decoration : 밑줄
none : 없는 상태
underline : 있는 상태

a:active : 링크부분에서 마우스를 누르고 있는 동안의 상태
-->
<title>JooTopia</title>
</head><
<body>
	<header style="background: rgb(53, 15, 15); width: 100%; height:50px;" class="row">
		<span class="col-lg-1"></span>	
		<span class="col-lg-1"><a href="#">고객센터</a></span>
		<span class="col-lg-1"><a href="#">매입신청</a></span>
		
		<span class="col-lg-6"><a href="#">logo</a></span>
		
		<span class="col-lg-1"><a href="#">Login</a></span>
		<span class="col-lg-1"><a href="#">Join us</a></span>
		<span class="col-lg-1"></span>
	</header>
	<nav></nav>
</body>
</html>