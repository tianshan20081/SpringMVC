<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload_index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   
	<form action="upload/upload" method="post" enctype="multipart/form-data">
		name:<input type="text" name="name"><br/>
		file:<input type="file" name="file"><br/>
		<input type="submit" value="submit">
	</form ><br/><br/>
	<form action="upload/multiUpload" method="post" enctype="multipart/form-data">
		name:<input type="text" name="name"><br/>
		file:<input type="file" name="file1"><br/>
		file:<input type="file" name="file2"><br/>
		file:<input type="file" name="file3"><br/>
		file:<input type="file" name="file4"><br/>
		<input type="submit" value="submit">
	</form >
  </body>
</html>
