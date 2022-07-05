

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
       String username= request.getParameter("username");

    String tutorname= request.getParameter("tutorname");
     try {
                                Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "Delete from regtutor where tutorname=?";
    						PreparedStatement ps= con.prepareStatement(query);
    						
                                                ps.setString(1,tutorname);
    						ps.executeUpdate();
    						
    						%>
                                                
                                                <jsp:forward page="AdminHome.jsp"/>
                                                
    				<%
                                   
      } 
  
  
                 
               
           catch (Exception e) {
          System.out.println(e);
          e.printStackTrace();
          
          
      }
  

                      


%>
    </body>
</html>
