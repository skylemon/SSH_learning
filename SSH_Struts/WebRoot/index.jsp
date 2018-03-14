<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Upload Your File</title>
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
   <!-- <form action="upload" method="post"  enctype="multipart/form-data">
      uploader:<input type="text" name="uploader"/>
      select file:<input type="file" name="upload"/>
       <input type="submit" value="Upload"/>
   </form> --> 
   	<%-- <s:form action="multiUpload" method="post" enctype="multipart/form-data">  
	<s:file label="select file1" name="uploads" />  
	<s:file label="select file2" name="uploads" />  
	<s:file label="select file3" name="uploads" />  
	<s:submit value="Upload" />
	</s:form> --%>
	
	<center>
		<h2>${sessionScope.msgSession}</h2>
		<s:form action="login" method="post">
			<s:textfield label="INVITATION CODE" name="inputCode"></s:textfield>  
        	<s:submit value="Login" />
		</s:form>
		<a href="applyCode.jsp" type="button" >Apply a code</a>
	</center>
  	</body>
</html>
