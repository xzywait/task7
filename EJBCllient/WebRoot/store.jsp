<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'store.jsp' starting page</title>
    
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
    <br>
    <h4>请选择购买的项目<%session.getSessionContext();%></h4>
	<form action="perchaseServlet" method="post">
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<td>书名</td>
				<td>单价</td>
				<td>购买</td>
			</tr>
			<tr>
				<td>Java</td>
				<td>50</td>
				<td><input type="checkbox" name="book" value="java">
				</td>
			</tr>
			<tr>
				<td>Oracle</td>
					<td>60</td>
				<td><input type="checkbox" name="book" value="Oracle">
				</td>
			</tr>
			<tr>
				<td>Struts</td>
				<td>30</td>
				<td><input type="checkbox" name="book" value="Structs">
				</td>
			</tr>
			<tr>
				<td>Spring</td>
					<td>40</td>
				<td><input type="checkbox" name="book" value="Spring">
				</td>
			</tr>
			<tr>
				<td>EJB</td>
					<td>50</td>
				<td><input type="checkbox" name="book" value="EJB">
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Submit"></td>

			</tr>
		</table>
	</form>
  </body>
</html>
