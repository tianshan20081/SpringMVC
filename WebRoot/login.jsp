<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-2.0.3.js"></script>
<script type="text/javascript">
	function postSubmit()
	{
		var form = document.forms[2];
		form.action="/smvc/anno/loginInput";
		form.method="post";
		form.submit();
	}
	function getSubmit()
	{
		var form = $("#form4");
		form.action="/smvc/anno/loginInput";
		form.method="post";
		form.submit();
	}
</script>
</head>

<body>
	<form action="anno/loginInput" method="get">
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="getSubmit">
	</form>
	<br/>
	<form action="anno/loginInput" method="post">
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="postSubmit">
	</form>
	<form action="" >
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="postSubmit()" onclick="postSubmit()">
	</form>
	<form action="" id="form4" name="form4" >
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="getSubmit" onclick="getSubmit()">
	</form>
</body>
</html>
