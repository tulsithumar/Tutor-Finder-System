package org.apache.jsp.JspFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
 ResultSet rsabcd = null; 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Admin Home</title>\n");
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
                        
                        Statement viewt = con.createStatement();
                        String vtutor= "select * from regtutor";
                        rs =viewt.executeQuery(vtutor);

                        
                        Statement views = con.createStatement();
                        String vstudent= "select * from regstudent";
                        rsa =views.executeQuery(vstudent);

                        Statement viewfeed = con.createStatement();
                        String vfeedback= "select * from feedstudent";
                        rsab=viewfeed.executeQuery(vfeedback);
                        
                        Statement viewstu = con.createStatement() ;
                        String query1 = "select * from regstudent";
                        rsabcd =viewstu.executeQuery(query1);
                        
                        Statement viewtut = con.createStatement() ;
                        String query = "select * from regtutor";
                        rsabc =viewtut.executeQuery(query);
                        
                        


                        
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
      out.write("           <li><span id=\"vtutor\">View Tutor</span></li>\n");
      out.write("           <li><span id=\"vstudent\">View Student</span></li>\n");
      out.write("           <li><span id=\"vfeedback\">View Feedback</span></li>\n");
      out.write("        <li><span id=\"rstudent\">Remove Student</span></li>\n");
      out.write("           <li><span id=\"rtutor\">Remove Tutor</span></li>\n");
      out.write("           \n");
      out.write("      \n");
      out.write("        </ul>\n");
      out.write("        `;\n");
      out.write("      }\n");
      out.write("      sidebar();\n");
      out.write("      \n");
      out.write("      document.querySelector(\"#vtutor\").addEventListener(\n");
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
      out.write("    document.querySelector(\"#vstudent\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("   <div class=\"tounamentForm\">\n");
      out.write("          <table style=\"width:100%\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Student Name</th>\n");
      out.write("              <th>City</th>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("       ");
 while(rsa.next()){ 
      out.write("\n");
      out.write("          <tr>\n");
      out.write("        <td>");
      out.print( rsa.getString("name") );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print( rsa.getString("city") );
      out.write(" </td>  \n");
      out.write("         </tr>   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("           </table>\n");
      out.write("           </div> `;\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("       document.querySelector(\"#vfeedback\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("   <div class=\"tounamentForm\">\n");
      out.write("          <table style=\"width:100%\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Tutor name</th>\n");
      out.write("              <th>Feedback</th>\n");
      out.write("              <th>Username</th>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("       ");
 while(rsab.next()){ 
      out.write("\n");
      out.write("          <tr>\n");
      out.write("        <td>");
      out.print( rsab.getString("tutorname") );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print( rsab.getString("feedback") );
      out.write(" </td> \n");
      out.write("        <td>");
      out.print( rsab.getString("username") );
      out.write(" </td>  \n");
      out.write("         </tr>   \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("           </table>\n");
      out.write("           </div> `;\n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("      document.querySelector(\"#rstudent\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("          <form action=\"RemoveS.jsp\" method=\"post\">\n");
      out.write("           <div class=\"tounamentForm\">\n");
      out.write("          <table style=\"width:100%\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Student Name</th>\n");
      out.write("              <th>Remove <th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        ");
 while(rsabcd.next()){ 
      out.write("\n");
      out.write("\n");
      out.write("          <tr>\n");
      out.write("         <td>");
      out.print( rsabcd.getString("name") );
      out.write(" </td> \n");
      out.write("        <input type=\"hidden\" name=\"name\" value=");
      out.print( rsabcd.getString("name") );
      out.write(" /> \n");
      out.write("         <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" /> \n");
      out.write("  \n");
      out.write("        <td>    <input type=\"submit\" value=\"Remove\" > </td>\n");
      out.write("          </tr>  \n");
      out.write("                \n");
      out.write("</div> \n");
      out.write("                           ");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write(" </form>`;\n");
      out.write("    \n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("     \n");
      out.write("      \n");
      out.write("       document.querySelector(\"#rtutor\").addEventListener(\n");
      out.write("        \"click\",\n");
      out.write("        function (event) {\n");
      out.write("          event.preventDefault();\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = '';\n");
      out.write("          document.getElementById(\"mainBody\").innerHTML = `\n");
      out.write("          <form action=\"RemoveT.jsp\" method=\"post\">\n");
      out.write("           <div class=\"tounamentForm\">\n");
      out.write("          <table style=\"width:100%\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Tutor Name</th>\n");
      out.write("              <th>Remove <th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        ");
 while(rsabc.next()){ 
      out.write("\n");
      out.write("\n");
      out.write("          <tr>\n");
      out.write("         <td>");
      out.print( rsabc.getString("tutorname") );
      out.write(" </td> \n");
      out.write("        <input type=\"hidden\" name=\"name\" value=");
      out.print( rsabc.getString("tutorname") );
      out.write(" /> \n");
      out.write("         <input type=\"hidden\" name=\"username\" value=");
      out.print(user);
      out.write(" /> \n");
      out.write("  \n");
      out.write("        <td>    <input type=\"submit\" value=\"Remove\" > </td>\n");
      out.write("          </tr>  \n");
      out.write("                \n");
      out.write("</div> \n");
      out.write("                           ");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write(" </form>`;\n");
      out.write("    \n");
      out.write("        },\n");
      out.write("        false\n");
      out.write("      );\n");
      out.write("\n");
      out.write("      \n");
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
