package org.apache.jsp.JspFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class studenthome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
 ResultSet rs = null; 
      out.write('\n');
 ResultSet rsa = null; 
      out.write('\n');
 ResultSet rsab = null; 
      out.write('\n');
 ResultSet rsabc = null; 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Student Home</title>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <link\n");
      out.write("    href=\"https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Project/HtmlFiles/styles.css\" />\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body> \n");
      out.write("      ");

              String user= request.getParameter("username");

      try{
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                        
                        Statement viewt = con.createStatement() ;
                        String viewtutor= "select * from regtutor";
                        rs =viewt.executeQuery(viewtutor);
                        
                        String query1= "SELECT * from regstudent where username= ?";
    						PreparedStatement ps1= con.prepareStatement(query1);
    						
    						ps1.setString(1,user);

    						ps1.execute();
    					        rsabc= ps1.getResultSet();
                        }
        
             catch(SQLException e)
             {
                System.out.println("Error!!!!!!" + e);
             }
     
      out.write("\n");
      out.write("\n");
      out.write("         <header>\n");
      out.write("      <h1 class=\"mainHeading\">TUTOR FINDER SYSTEM</h1>\n");
      out.write("      <div class=\"headingNav\">\n");
      out.write("        <a class=\"navLink\" name=\"logout\" href=\"/Project/HtmlFiles/homepage.html\">Logout</a>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("     <div class=\"container\">\n");
      out.write("      <div class=\"sidebar\" id=\"sidebar\"></div>\n");
      out.write("      <div id=\"mainBody\"></div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      function sidebar() {\n");
      out.write("        console.log(\"sidebar\");\n");
      out.write("        document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("        document.getElementById(\"sidebar\").innerHTML = `\n");
      out.write("        <ul>\n");
      out.write("           <li><span id=\"viewtutor\">View Tutor</span></li>\n");
      out.write("          <li><span id=\"filter\">Filter Tutor</span></li>\n");
      out.write("          <li><span id=\"book\">Book Tutor</span></li>\n");
      out.write("          <li><span id=\"feedback\">Feedback</span></li>\n");
      out.write("          <li><span id=\"profile\">Your Profile</span></li>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        </ul>\n");
      out.write("        `;\n");
      out.write("      }\n");
      out.write("      sidebar();\n");
      out.write("      \n");
      out.write("      document.querySelector(\"#viewtutor\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("   <div class=\"tounamentForm\">\n");
      out.write("          <table style=\"width:100%\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Tutor Name</th>\n");
      out.write("              <th>Subject</th>\n");
      out.write("              <th>Fees</th>\n");
      out.write("              <th>Contact No.</th>\n");
      out.write("              <th>City</th>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("          <tr>\n");
      out.write("         <td>");
      out.print( rs.getString("tutorname") );
      out.write(" </td>\n");
      out.write("         <td>");
      out.print( rs.getString("subject") );
      out.write(" </td> \n");
      out.write("         <td>");
      out.print( rs.getString("fees") );
      out.write(" </td>\n");
      out.write("         <td>");
      out.print( rs.getString("mobileno") );
      out.write(" </td>  \n");
      out.write("         <td>");
      out.print( rs.getString("city") );
      out.write(" </td>  \n");
      out.write("         </tr>   \n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("           </table>\n");
      out.write("           </div> `;\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("   \n");
      out.write("    document.querySelector(\"#book\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("           <form class=\"tounamentForm\" action=\"BookTutor.jsp\" method=\"post\">\n");
      out.write("          <h1>Book Tutor</h1>\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Student Name: </label>\n");
      out.write("            <input name=\"studentname\" type=\"text\" />\n");
      out.write("          </div>\n");
      out.write("                                         \n");
      out.write("              <div class=\"inputBox\">\n");
      out.write("            <label>Tutor Name: </label>\n");
      out.write("            <input name=\"tutorname\" type=\"text\" />\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        <div class=\"inputBox\">\n");
      out.write("            <label>Subject: </label>\n");
      out.write("            <input name=\"subject\" type=\"text\">\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>`;\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("        document.querySelector(\"#feedback\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("           <form class=\"tounamentForm\" action=\"Feedback.jsp\" method=\"post\">\n");
      out.write("          <h1>Feedback</h1>\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Tutor Name: </label>\n");
      out.write("            <input name=\"tutorname\" type=\"text\" />\n");
      out.write("          </div>                              \n");
      out.write("        \n");
      out.write("        <div class=\"inputBox\">\n");
      out.write("            <label>Feedback: </label>\n");
      out.write("            <input name=\"feedback\" type=\"text\">\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("          <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />\n");
      out.write("\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("       `;\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("     \n");
      out.write("      document.querySelector(\"#filter\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("           <form class=\"tounamentForm\" action=\"FilterTutor.jsp\" method=\"post\">\n");
      out.write("          <h1>Filter by Subject & Fees</h1>\n");
      out.write("        <div class=\"inputBox\">\n");
      out.write("            <label>Subject: </label>\n");
      out.write("            <input name=\"subject\" type=\"text\">\n");
      out.write("          </div>\n");
      out.write("       <div class=\"inputBox\">\n");
      out.write("            <label>Fees: </label>\n");
      out.write("            <input name=\"fees\" type=\"number\">\n");
      out.write("          </div> \n");
      out.write("        \n");
      out.write("       <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />   \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("    <form class=\"tounamentForm\" action=\"FilterSubject.jsp\" method=\"post\">\n");
      out.write("          <h1>Filter by Subject</h1>\n");
      out.write("        <div class=\"inputBox\">\n");
      out.write("            <label>Subject: </label>\n");
      out.write("            <input name=\"subject\" type=\"text\">\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("       <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />   \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("    <form class=\"tounamentForm\" action=\"FilterFees.jsp\" method=\"post\">\n");
      out.write("          <h1>Filter by Fees</h1>\n");
      out.write("       <div class=\"inputBox\">\n");
      out.write("            <label>Fees: </label>\n");
      out.write("            <input name=\"fees\" type=\"number\">\n");
      out.write("          </div> \n");
      out.write("        \n");
      out.write("       <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />   \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>`;\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("      document.querySelector(\"#profile\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("           <form class=\"tounamentForm\" action=\"ProfileStudent.jsp\" method=\"post\">\n");
      out.write("           <h1>Update Personal Details</h1>\n");
      out.write("        \n");
      out.write("              ");
 while(rsabc.next()){ 
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Name: </label>\n");
      out.write("            <input name=\"name\" type=\"text\" value=");
      out.print( rsabc.getString("name") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Middle Name: </label>\n");
      out.write("            <input name=\"middlename\" type=\"text\" value=");
      out.print( rsabc.getString("middlename") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Surname: </label>\n");
      out.write("            <input name=\"surname\" type=\"text\" value=");
      out.print( rsabc.getString("surname") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("        \n");
      out.write("        <div class=\"inputBox\">\n");
      out.write("            <label>Age: </label>\n");
      out.write("            <input name=\"age\" type=\"number\" value=");
      out.print( rsabc.getString("age") );
      out.write(" />\n");
      out.write("          </div>       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Mobile No: </label>\n");
      out.write("            <input name=\"mobileno\" type=\"number\" value=");
      out.print( rsabc.getString("mobileno") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Email: </label>\n");
      out.write("            <input name=\"email\" type=\"text\" value=");
      out.print( rsabc.getString("email") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("  \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>City: </label>\n");
      out.write("            <input name=\"city\" type=\"text\" value=");
      out.print( rsabc.getString("city") );
      out.write(" />\n");
      out.write("          </div> \n");
      out.write("                      \n");
      out.write("           <div class=\"inputBox\">\n");
      out.write("            <label>School Name: </label>\n");
      out.write("            <input name=\"schoolname\" type=\"text\" value=");
      out.print( rsabc.getString("schoolname") );
      out.write(" />\n");
      out.write("          </div> \n");
      out.write("                   \n");
      out.write("           <div class=\"inputBox\">\n");
      out.write("            <label>Standard: </label>\n");
      out.write("            <input name=\"standard\" type=\"number\" value=");
      out.print( rsabc.getString("standard") );
      out.write(" />\n");
      out.write("          </div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Security Question 1: </label>\n");
      out.write("            <input name=\"sq1\" type=\"text\" value=");
      out.print( rsabc.getString("sq1") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("            <label>Security Question 2: </label>\n");
      out.write("            <input name=\"sq2\" type=\"text\" value=");
      out.print( rsabc.getString("sq2") );
      out.write(" />\n");
      out.write("          </div>    \n");
      out.write("                 <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" />\n");
      out.write("\n");
      out.write("                                    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label></label>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("`;\n");
      out.write("\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("     \n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
