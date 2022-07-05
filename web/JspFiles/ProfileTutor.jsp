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
    
  String tutorname= request.getParameter("tutorname"); 
  String middlename= request.getParameter("middlename"); 
  String surname= request.getParameter("surname"); 
  String password= request.getParameter("password"); 
  String mobileno= request.getParameter("mobileno");
  String email= request.getParameter("email"); 
  String city= request.getParameter("city"); 
  String age= request.getParameter("age"); 
  String qualification= request.getParameter("qualification"); 
  String fees= request.getParameter("fees"); 
  String subject= request.getParameter("subject");
  String noofstudents= request.getParameter("noofstudents"); 
  String sq1= request.getParameter("sq1"); 
  String sq2= request.getParameter("sq2"); 
  String user= request.getParameter("username"); 
  int mobile=Integer.parseInt(mobileno);
  int agee=Integer.parseInt(age);
  int fee=Integer.parseInt(fees);
  int nfstudent=Integer.parseInt(noofstudents);





  
    Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
    						String query= "UPDATE regtutor SET tutorname=?, middlename=?, surname=?, password=?, email=?, age=?,subject=?,qualification=?,noofstudents=?,fees=?,city=?, sq1=?, sq2=?, mobileno=? WHERE username=? ";
    						PreparedStatement ps= con.prepareStatement(query);
    						
                                                ps.setString(1,tutorname);
                                                ps.setString(2,middlename);
                                                ps.setString(3,surname);
                                                ps.setString(4,password);
                                                ps.setString(5,email);
                                                ps.setInt(6,agee);
                                                ps.setString(7,subject);
                                                ps.setString(8,qualification);
                                                ps.setInt(9,nfstudent);
                                                ps.setInt(10,fee);
                                                ps.setString(11,city);
                                                ps.setString(12,sq1);
                                                ps.setString(13,sq2);
                                                ps.setInt(14,mobile);
                                                ps.setString(15,user);

    						
    						ps.executeUpdate();
    						
    						ResultSet rs= ps.getResultSet();
    						%>
                                                
                                                <jsp:forward page="TutorHome.jsp"/>
    </body>
</html>
