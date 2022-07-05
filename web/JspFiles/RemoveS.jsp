
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

    String name= request.getParameter("name");
     try {
                                Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "Delete from regstudent where name=?";
    						PreparedStatement ps= con.prepareStatement(query);
    						
                                                ps.setString(1,name);
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
