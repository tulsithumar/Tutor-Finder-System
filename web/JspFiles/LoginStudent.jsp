

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <base href="Student.html">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link
<!--    href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet"/>
    <link rel="stylesheet" href="/styles.css" />-->
    </head>
    <body>
        
         <%
    
    String user= request.getParameter("username");
    String pass= request.getParameter("password");
        
    
    
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "select * from regstudent where username=? and password=?";
    						PreparedStatement ps= con.prepareStatement(query);
    						
    						ps.setString(1,user);
    						ps.setString(2,pass);
    						ps.execute();
    						
    						ResultSet rs= ps.getResultSet();
    						
    						if (rs.next()== true)
    						{
    						%>
    						<jsp:forward page="studenthome.jsp"/>
    						<%
    						}
    						else
    						{
    						 %>
    						 <jsp:forward page="/HtmlFiles/Student.html"/>
    						 <%
    						 }
    						  %>
    						

    </body>
</html>
