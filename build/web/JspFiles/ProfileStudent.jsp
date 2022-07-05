

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
    
  String name= request.getParameter("name"); 
  String middlename= request.getParameter("middlename"); 
  String surname= request.getParameter("surname"); 
  String password= request.getParameter("password"); 
  String mobileno= request.getParameter("mobileno");
  String email= request.getParameter("email"); 
  String city= request.getParameter("city"); 
  String age= request.getParameter("age"); 
  String schoolname= request.getParameter("schoolname"); 
  String standard= request.getParameter("standard"); 
  String sq1= request.getParameter("sq1"); 
  String sq2= request.getParameter("sq2"); 
  String user= request.getParameter("username"); 
  int mobile=Integer.parseInt(mobileno);
  int agee=Integer.parseInt(age);
  int std=Integer.parseInt(standard);




  
    Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "UPDATE regstudent SET name=?, middlename=?, surname=?, password=?, email=?, age=?,schoolname=?,standard=?,city=?, sq1=?, sq2=?, mobileno=? WHERE username=? ";
    						PreparedStatement ps= con.prepareStatement(query);
    						
                                                ps.setString(1,name);
                                                ps.setString(2,middlename);
                                                ps.setString(3,surname);
                                                ps.setString(4,password);
                                                ps.setString(5,email);
                                                ps.setInt(6,agee);
                                                ps.setString(7,schoolname);
                                                ps.setInt(8,std);
                                                ps.setString(9,city);
                                                ps.setString(10,sq1);
                                                ps.setString(11,sq2);
                                                ps.setInt(12,mobile);
                                                ps.setString(13,user);

    						
    						ps.executeUpdate();
    						
    						ResultSet rs= ps.getResultSet();
    						%>
                                                
                                                <jsp:forward page="studenthome.jsp"/>
    </body>
</html>
