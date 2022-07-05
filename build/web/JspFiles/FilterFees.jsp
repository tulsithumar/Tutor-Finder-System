<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<% ResultSet rs = null; %>
<% ResultSet rs2 = null; %>
<% ResultSet rs3 = null; %>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Home</title>
    <meta charset="UTF-8" />
    <link
    href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet"/>
    <link rel="stylesheet" href="/Project/HtmlFiles/styles.css" />
    <style>  
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {  
    padding: 10px;  
}  
table#alter tr:nth-child(even) {  
    background-color: #eee;  
}  
table#alter tr:nth-child(odd) {  
    background-color: #fff;  
}  
table#alter th {  
    color: white;  
    background-color: gray;  
}  
</style>
  </head>

  <body> 
<%
              String user= request.getParameter("username");
              String fees= request.getParameter("fees"); 
                        int fee=Integer.parseInt(fees);


      try{


    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                       
                       
                        String filter2= "select * from regtutor where fees<=?";
                        PreparedStatement ps2=con.prepareStatement(filter2);
                        ps2.setInt(1,fee);
                        ps2.execute();
                        rs= ps2.getResultSet();
                        

                        }
        
             catch(SQLException e)
             {
                System.out.println("Error!!!!!!" + e);
             }
     %>

         <header>
      <h1 class="mainHeading">TUTOR FINDER SYSTEM</h1>
      <div class="headingNav">
        <a class="navLink" onclick="history.back()">Go Back</a>
      </div>
    </header>

  
    <div class="tounamentForm">
          <table style="width:100%">
            <tr>
              <th>Tutor Name</th>
              <th>Subject</th>
              <th>Fees</th>
              <th>Contact No.</th>
              <th>City</th>
            </tr>
        
        <% while(rs.next()){ %>
          <tr>
              <td><a href="newjsp.jsp?tutorname=<%= rs.getString("tutorname") %>"><%= rs.getString("tutorname") %> </a></td>
             
         <td><%= rs.getString("subject") %> </td>
          <td><%=rs.getString("fees") %> </td>
         <td><%= rs.getString("mobileno") %> </td>  
         <td><%= rs.getString("city") %> </td>
          
         </tr>   
           <% } %>
          
           
          

           </table>
           </div> 
  </body>
</html>