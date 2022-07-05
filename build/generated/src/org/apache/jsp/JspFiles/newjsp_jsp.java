package org.apache.jsp.JspFiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
 ResultSet rs = null; 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link\n");
      out.write("    href=\"https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap\" rel=\"stylesheet\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Project/HtmlFiles/styles.css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

                          String user= request.getParameter("username");
                          String tutorname= request.getParameter("tutorname");




    			Class.forName("org.postgresql.Driver");
    			Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project","postgres","1234");
                       
                        String filter= "select * from regtutor where tutorname=?";
                        PreparedStatement ps=con.prepareStatement(filter);
                        ps.setString(1, tutorname);
                        ps.execute();
                        rs= ps.getResultSet();
                        

             

            
      out.write("\n");
      out.write("            <header>\n");
      out.write("      <h1 class=\"mainHeading\">TUTOR FINDER SYSTEM</h1>\n");
      out.write("      <div class=\"headingNav\">\n");
      out.write("        <a class=\"navLink\" onclick=\"history.back()\">Go Back</a>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("            <form class=\"tounamentForm\" action=\"ProfileStudent.jsp\" method=\"post\">\n");
      out.write("           <h1>Update Personal Details</h1>\n");
      out.write("        \n");
      out.write("              ");
 while(rs.next()){ 
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Tutor Name: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("tutorname") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Surname: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("surname") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Age: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("age") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Contact No: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("mobileno") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>City: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("city") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Qualification </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("qualification") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Subject: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("subject") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"inputBox\">\n");
      out.write("            <label>Fees: </label>\n");
      out.write("                        <label>");
      out.print( rs.getString("fees") );
      out.write("</label>\n");
      out.write("          </div> \n");
      out.write("                     ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
