<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%--<%@page import="sun.jdbc.odbc.JdbcOdbcDriver"%>--%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="Tutor.html">
    
    <title>My JSP 'LoginTutor.jsp' starting page</title>
    
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
    <%
    
    String user= request.getParameter("username");
    String pass= request.getParameter("password");
    
//    int id=Integer.parseInt(Id);
    
    
    
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "select * from regtutor where username=? and password=?";
    						PreparedStatement ps= con.prepareStatement(query);
    						
    						ps.setString(1,user);
    						ps.setString(2,pass);
    						ps.execute();
    						
    						ResultSet rs= ps.getResultSet();
    						
    						if (rs.next()== true)
    						{
    						%>
    						<jsp:forward page="TutorHome.jsp"/>
    						<%
    						}
    						else
    						{
    						 %>
    						 <jsp:forward page="/HtmlFiles/Tutor.html"/>
    						 <%
    						 }
    						  %>
    						
		 
  </body>
</html>
