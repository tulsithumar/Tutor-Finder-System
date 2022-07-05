<%@page import="java.sql.Statement"%>
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
  String tname= request.getParameter("tutorname");  
  String feed= request.getParameter("feedback"); 

   

  try {
                        Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                        Statement statement = con.createStatement() ;

               int i=statement.executeUpdate("insert into feedstudent(tutorname,feedback,username)values('"+tname+"','"+feed+"','"+user+"')");
               
                
               %>
               
               <jsp:forward page="studenthome.jsp"/>

                               <%                            
      }               
           catch (Exception e) {
          System.out.println(e);
          e.printStackTrace();          
      }
  %>
 </body>
</html>