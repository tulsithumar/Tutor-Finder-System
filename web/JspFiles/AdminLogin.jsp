

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <%
    
    String user= request.getParameter("username");
    String pass= request.getParameter("password");
        
    
    
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "select * from admin where username=? and password=?";
    						PreparedStatement ps= con.prepareStatement(query);
    						
    						ps.setString(1,user);
    						ps.setString(2,pass);
    						ps.execute();
    						
    						ResultSet rs= ps.getResultSet();
    						
    						if (rs.next()== true)
    						{
    						%>
    						<jsp:forward page="/JspFiles/AdminHome.jsp"/>
    						<%
    						}
    						else
    						{
    						 %>
    						 <jsp:forward page="/HtmlFiles/Admin.html"/>
    						 <%
    						 }
    						  %>
    					
    </body>
</html>
