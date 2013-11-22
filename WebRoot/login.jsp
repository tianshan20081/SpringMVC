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
	$(function()
	{
		$("#addUserjsonp").click(function()
		{
			var name = $("#userNamejsonp").val();
			var age = $("#userAgejsonp").val();
//			alert(encodeURI(name));
			var user = {"name":name,"age":age};
			$.ajax({
				url:"anno/addJson",
				type:"post",
				data:user,
				success:function(data){
					alert(data.name+data.age+data.isOk);
					
					if(data.isOk){
						//alert("sss");
						$("#addUserjsonpform")[0].reset();
					}
				}
			});
		});

	});
	$(function()
	{
		$("#addUserjp").click(function()
		{
			var name = $("#userNamejp").val();
			var age = $("#userAgejp").val();
//			alert(encodeURI(name));
			var user = {"name":name,"age":age};
			$.ajax({
				url:"anno/addJp",
				type:"post",
				data:user,
				success:function(data){
					alert(data);
				}
			});
		});

	});
	$(function()
	{
		$("#addUserj").click(function()
		{
			var name = $("#userNamej").val();
			var age = $("#userAgej").val();
			var user = {"name":name,"age":age};
			$.ajax({
				url:"anno/addJ",
				type:"get",
				data:user,
				success:function(data){
					alert(data);
				}
			});
		});

	});
	$(function()
	{
		$("#addUser").click(function()
		{
			var name = $("#userName").val();
			var age = $("#userAge").val();
			$.ajax({
				url:"/smvc/anno/loginInput",
				type:"get",
				data:"name="+name+"&age="+age,
				success:function(data){
					alert(data);
				}
				
			});
		});

	});

	function postSubmit()
	{
		var form = document.forms[2];
		form.action = "/smvc/anno/loginInput";
		form.method = "post";
		form.submit();
	}
	function getSubmit()
	{
		var form = $("#getSubmit");
		form.action = "/smvc/anno/loginInput";
		form.method = "get";
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
	<br />
	<form action="anno/loginInput" method="post">
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="postSubmit">
	</form>
	<form action="">
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="postSubmit()" onclick="postSubmit()">
	</form>
	<form action="" id="getSubmit" name="getSubmit">
		name :<input type="text" name="name" id="name" /><br /> 
		age :<input type="text" name="age" id="age" /><br /> 
		<input type="submit" value="getSubmit" onclick="getSubmit()">
	</form>
	<form action="">
		name :<input type="text" name="userName" id="userName" /><br />
		 age :<input type="text" name="userAge" id="userAge" /><br />
		  <input type="button" value="添加新用户" id="addUser"">
	</form>
	<form action="">
		name :<input type="text" name="userNamej" id="userNamej" /><br />
		 age :<input type="text" name="userAgej" id="userAgej" /><br />
		  <input type="button" value="添加新用户" id="addUserj"">
	</form>
	<form action="">
		name :<input type="text" name="userNamejp" id="userNamejp" /><br />
		 age :<input type="text" name="userAgejp" id="userAgejp" /><br />
		  <input type="button" value="添加新用户" id="addUserjp"">
	</form>
	<form action="" id="addUserjsonpform">
		name :<input type="text" name="userNamejsonp" id="userNamejsonp" /><br />
		 age :<input type="text" name="userAgejsonp" id="userAgejsonp" /><br />
		  <input type="button" value="添加新用户jsonp" id="addUserjsonp"">
	</form>

</body>
</html>
