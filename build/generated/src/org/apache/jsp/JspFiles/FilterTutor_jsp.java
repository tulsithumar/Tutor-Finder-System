package org.apache.jsp.JspFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class FilterTutor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

              String user= request.getParameter("username");
              String subject= request.getParameter("subject"); 
              String fees= request.getParameter("fees"); 
              int fee=Integer.parseInt(fees);



      try{
    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                       
                        String filter= "select * from regtutor where subject=? and fees<=?";
                        PreparedStatement ps=con.prepareStatement(filter);
                        ps.setString(1, subject);
                        ps.setInt(2,fee);
                        ps.execute();
                        rs= ps.getResultSet();
                        
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
      out.write("        <a class=\"navLink\" name=\"logout\" href=\"#\">Logout</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"backbutton\">\n");
      out.write("        <button onclick=\"history.back()\">Go Back</button>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    <div class=\"tounamentForm\">\n");
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
      out.write(" </td>\n");
      out.write("          <td>");
      out.print(rs.getString("fees") );
      out.write(" </td>\n");
      out.write("         <td>");
      out.print( rs.getString("mobileno") );
      out.write(" </td>  \n");
      out.write("         <td>");
      out.print( rs.getString("city") );
      out.write(" </td>\n");
      out.write("         </tr>   \n");
      out.write("           ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("           </table>\n");
      out.write("           </div> \n");
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
