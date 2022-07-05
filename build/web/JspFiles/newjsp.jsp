<%-- 
    Document   : newjsp
    Created on : 21 Mar, 2022, 6:21:05 PM
    Author     : Tulsi
--%>
<%@page import="java.sql.ResultSet"%>
<% ResultSet rs = null; %>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link
    href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet"/>
    <link rel="stylesheet" href="/Project/HtmlFiles/styles.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%
                          String user= request.getParameter("username");
                          String tutorname= request.getParameter("tutorname");




    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                       
                        String filter= "select * from regtutor where tutorname=?";
                        PreparedStatement ps=con.prepareStatement(filter);
                        ps.setString(1, tutorname);
                        ps.execute();
                        rs= ps.getResultSet();
                        

             

            %>
            <header>
      <h1 class="mainHeading">TUTOR FINDER SYSTEM</h1>
      <div class="headingNav">
        <a class="navLink" onclick="history.back()">Go Back</a>
      </div>
    </header>
            <form class="tounamentForm" action="ProfileStudent.jsp" method="post">
           <h1>Update Personal Details</h1>
        
              <% while(rs.next()){ %>

          <div class="inputBox">
            <label>Tutor Name: </label>
                        <label><%= rs.getString("tutorname") %></label>
          </div> 
          <div class="inputBox">
            <label>Surname: </label>
                        <label><%= rs.getString("surname") %></label>
          </div> 
          <div class="inputBox">
            <label>Age: </label>
                        <label><%= rs.getString("age") %></label>
          </div> 
          <div class="inputBox">
            <label>Contact No: </label>
                        <label><%= rs.getString("mobileno") %></label>
          </div> 
          <div class="inputBox">
            <label>City: </label>
                        <label><%= rs.getString("city") %></label>
          </div> 
          <div class="inputBox">
            <label>Qualification </label>
                        <label><%= rs.getString("qualification") %></label>
          </div> 
          <div class="inputBox">
            <label>Subject: </label>
                        <label><%= rs.getString("subject") %></label>
          </div> 
          <div class="inputBox">
            <label>Fees: </label>
                        <label><%= rs.getString("fees") %></label>
          </div> 
                     <% } %>

        
        
            
          
        </form>

                                  


    </body>
</html>
