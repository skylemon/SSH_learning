<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MultiUploadSucceed.jsp' starting page</title>
    
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
    file name:<s:property value="uploadsFileName[0]"/><br/>
file type:<s:property value="+ uploadsContentType[0]"/><br/>
file address:<p> <%=basePath %><s:property value="'uploadMultiFiles/'   
        + uploadsFileName[0]"/></p><br/>  

file name:<s:property value="uploadsFileName[1]"/><br/>
file type:<s:property value="uploadsContentType[1]"/><br/>
file address:<p> <%=basePath %><s:property value="'uploadMultiFiles/'   
        + uploadsFileName[1]"/></p><br/>  

file name:<s:property value="+ uploadsFileName[2]"/><br/>
file type:<s:property value="+ uploadsContentType[2]"/><br/>
file address:<p> <%=basePath %><s:property value="'uploadMultiFiles/'   
        + uploadsFileName[2]"/></p><br/> 

  </body>
</html>
