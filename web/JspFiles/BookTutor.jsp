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
  String username= request.getParameter("username");
  String studentname= request.getParameter("studentname"); 
  String tutorname= request.getParameter("tutorname"); 
  String subject= request.getParameter("subject"); 
   

   

  try {
                        Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                        Statement statement = con.createStatement() ;

               int i=statement.executeUpdate("insert into booktutor(username,studentname,tutorname,subject)values('"+username+"','"+studentname+"','"+tutorname+"','"+subject+"')");
               
                
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