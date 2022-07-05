<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<% ResultSet rs = null; %>
<% ResultSet rsa = null; %>
<% ResultSet rsabc = null; %>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tutor Home</title>
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

      try{
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                        
                      
                        
                        String query= "SELECT booktutor.studentname, booktutor.subject FROM booktutor INNER JOIN regtutor ON regtutor.tutorname = booktutor.tutorname where regtutor.username=?;";
    						PreparedStatement ps= con.prepareStatement(query);
    						
    						ps.setString(1,user);

    						ps.execute();
    						
    						rsa= ps.getResultSet();
                                                 
                         String query1= "SELECT * from regtutor where username= ?";
    						PreparedStatement ps1= con.prepareStatement(query1);
    						
    						ps1.setString(1,user);

    						ps1.execute();
    					        rsabc= ps1.getResultSet();
                        }
                        
      
        
             catch(SQLException e)
             {
                System.out.println("Error!!!!!!" + e);
             }
     %>

         <header>
      <h1 class="mainHeading">TUTOR FINDER SYSTEM</h1>
      <div class="headingNav">
        <a class="navLink" name="logout" href="/Project/HtmlFiles/homepage.html">Logout</a>
      </div>
    </header>

     <div class="container">
      <div class="sidebar" id="sidebar"></div>
      <div id="mainBody"></div>
      
    </div>
    <script type="text/javascript">
      function sidebar() {
        console.log("sidebar");
        document.getElementById("mainBody").innerHTML = '';
        document.getElementById("sidebar").innerHTML = `
        <ul>
           <li><span id="viewstudent">View Student</span></li>
          <li><span id="profile">Your Profile</span></li>

        </ul>
        `;
      }
      sidebar();
      
      document.querySelector("#viewstudent").addEventListener(
        "click",
        function (event) {
          event.preventDefault();
          document.getElementById("mainBody").innerHTML = '';
          document.getElementById("mainBody").innerHTML = `
   <div class="tounamentForm">
          <table style="width:100%">
            <tr>
              <th>Student Name</th>
              <th>Subject</th>
            </tr>
        
        <% while(rsa.next()){ %>
          <tr>
         <td><%= rsa.getString("studentname") %> </td>
         <td><%= rsa.getString("subject") %> </td> 
         </tr>   
           <% } %>

           </table>
           </div> `;
        },
        false
      );
      document.querySelector("#profile").addEventListener(
        "click",
        function (event) {
          event.preventDefault();
          document.getElementById("mainBody").innerHTML = '';
          document.getElementById("mainBody").innerHTML = `
           <form class="tounamentForm" action="ProfileTutor.jsp" method="post">
           <h1>Update Personal Details</h1>
        
              <% while(rsabc.next()){ %>

          <div class="inputBox">
            <label>Name: </label>
            <input name="tutorname" type="text" value=<%= rsabc.getString("tutorname") %> />
          </div>    
        
            <div class="inputBox">
            <label>Middle Name: </label>
            <input name="middlename" type="text" value=<%= rsabc.getString("middlename") %> />
          </div>    
        
        
            <div class="inputBox">
            <label>Surname: </label>
            <input name="surname" type="text" value=<%= rsabc.getString("surname") %> />
          </div>    
        
        <div class="inputBox">
            <label>Age: </label>
            <input name="age" type="number" value=<%= rsabc.getString("age") %> />
          </div>    
         
        
        
            <div class="inputBox">
            <label>Mobile No: </label>
            <input name="mobileno" type="number" value=<%= rsabc.getString("mobileno") %> />
          </div>    
        
        
            <div class="inputBox">
            <label>Qualification: </label>
            <input name="qualification" type="text" value=<%= rsabc.getString("qualification") %> />
          </div>    
  
        
            <div class="inputBox">
            <label>City: </label>
            <input name="city" type="text" value=<%= rsabc.getString("city") %> />
          </div> 
                       
 
            <div class="inputBox">
            <label>Email: </label>
            <input name="email" type="text" value=<%= rsabc.getString("email") %> />
          </div>    
                      
           <div class="inputBox">
            <label>Subject: </label>
            <input name="subject" type="text" value=<%= rsabc.getString("subject") %> />
          </div> 
                   
           <div class="inputBox">
            <label>No.of Students: </label>
            <input name="noofstudents" type="number" value=<%= rsabc.getString("noofstudents") %> />
          </div> 
                      
           <div class="inputBox">
            <label>Fees: </label>
            <input name="fees" type="number" value=<%= rsabc.getString("fees") %> />
          </div>
        
        
            <div class="inputBox">
            <label>Security Question 1: </label>
            <input name="sq1" type="text" value=<%= rsabc.getString("sq1") %> />
          </div>    
        
        
            <div class="inputBox">
            <label>Security Question 2: </label>
            <input name="sq2" type="text" value=<%= rsabc.getString("sq2") %> />
          </div>    
                 <input type="hidden" name="username" value=<%=user%> />

                                    <% } %>

          <div class="inputBox">
            <label></label>
            <input type="submit">
          </div>
        </form>
`;

        },
        false
      );
     
    </script>
  </body>
</html>