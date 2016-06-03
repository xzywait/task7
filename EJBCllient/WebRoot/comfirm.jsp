<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'comfirm.jsp' starting page</title>
    
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
    
   <h4>请确认核实信息</h4>
  <table border="1" cellpadding="10" cellspacing="0">
  <tr>
  <td>顾客姓名</td>
  <td>${userName}${cart.User.userName }
  </td>
  </tr>
   <tr>
  <td>地址</td>
  <td></td>
  </tr>
  <tr>
 
  <tr>
  <td>Goods</td>
  <td>  
  
  </td>
  </tr>
  
  </table>
  </body>
</html>
