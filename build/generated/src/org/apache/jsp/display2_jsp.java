package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class display2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         \n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheet.css\"/>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.2.0/css/all.css\" integrity=\"sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ\"\n");
      out.write("  crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("  border: 1px solid #dddddd;\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #dddddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("a[type=submit] {\n");
      out.write(" width: 75%;\n");
      out.write(" background-color: rgb(243, 36, 71);\n");
      out.write(" color: white;\n");
      out.write(" padding: 8px 15px;\n");
      out.write(" margin: 20px 0;\n");
      out.write(" border: none;\n");
      out.write(" border-radius: 10px;\n");
      out.write(" cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <body background=\"1.jpg\">\n");
      out.write("       \n");
      out.write("        <center>    \n");
      out.write("              <img src=\"ll.png\" alt=\"Admin\" />    \n");
      out.write("                </center>\n");
      out.write("   \n");
      out.write("  <!--<h2>Plant Stock</h2> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("  <tr>\n");
      out.write("      \n");
      out.write("                        <th>plantcode</th>\n");
      out.write("\t\t\t<th>plantname</th>\n");
      out.write("\t\t\t<th>quantity</th>\n");
      out.write("\t\t\t<th>price</th>\n");
      out.write("                        <th>date</th>\n");
      out.write("                        <th>Update</th>\n");
      out.write("                        <th>Delete</th>\n");
      out.write("                       <!-- <th>Re-order items</th> --> \n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("  \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tbody>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t");
   Connection con;
	    Statement st;
	    ResultSet rs;
	   
      out.write("\n");
      out.write("           \n");
      out.write("\t   ");
 
	   String url,user,pass;
	   
	   
	       url="jdbc:mysql://localhost/ruvinidb";//dbname
	       user="root";
	       pass="";
               
	      try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection(url,user,pass);
	             
	                String data="select * from plantstock ";
			st=con.createStatement();
			rs= st.executeQuery(data);
			while (rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString("plantcode")+"</td>");
			out.print("<td>"+rs.getString("plantname")+"</td>");
			out.print("<td>"+rs.getString("quantity")+"</td>");
			out.print("<td>"+rs.getString("price")+"</td>");
			out.print("<td>"+rs.getString("date")+"</td>");
			
                        
			out.print("<td class=\"text-center\"><a href =\"updatedata?u="+rs.getString("plantcode")+"\" class = \"btn btn-warning\"> Edit </a></td><td><a href =\"delete?u=" +rs.getString("plantcode")+" \"class =\"btn btn-danger \"> Delete </a></td><td><a href =\"reorder.jsp?u=" +rs.getString("plantcode")+" \"class =\"btn btn-danger \"> Re-order </a></td>");
			out.print("</tr>");
			
			}
                        
		}catch(Exception ex){
                    
			out.print(""+ex);
                        
		}
		
		
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write("</table> \n");
      out.write("\n");
      out.write("  <br>\n");
      out.write("    <br>\n");
      out.write("      <br>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("  \n");
      out.write(" \n");
      out.write("\n");
      out.write("        \n");
      out.write("                     \n");
      out.write("      <!--               \n");
      out.write("                   \n");
      out.write("                     <center>\n");
      out.write("  <form method=\"post\" name=\"resetform\" action=\"insertplantdata\">\n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
      out.write("      Plant Code :<input type=\"number\" name=\"pid\" placeholder=\"***\" required>\n");
      out.write("\t\t<br />\n");
      out.write("  \n");
      out.write("           Plant Name: <input type=\"text\" name=\"pname\" placeholder=\"****\" required>\n");
      out.write("\t\t<br />\n");
      out.write("               \n");
      out.write("\t\t\n");
      out.write("            Quantity: <input type=\"text\" name=\"quant\" placeholder=\"***\" required>\n");
      out.write("                <br/>\n");
      out.write("\t\t\n");
      out.write("\t\tPrice: <input type=\"text\" name=\"price\" placeholder=\"***\" required>\n");
      out.write("\t\t<br />\n");
      out.write("\n");
      out.write("                  <br/>\n");
      out.write("                 Date : <input type=\"date\" id=\"start\" name=\"trip-start\"\n");
      out.write("       value=\"\"\n");
      out.write("       min=\"2018-01-01\" max=\"\">\n");
      out.write("                 <br/>\n");
      out.write("\t\t<br/>\n");
      out.write("\t        <br/>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("\t\t\n");
      out.write("\t\t<input type=\"submit\" name=\"name\" value=\"UPDATE\">\n");
      out.write("                 <br>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                  \n");
      out.write("               \n");
      out.write(" \n");
      out.write("                \n");
      out.write("                \n");
      out.write("           </form>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\t</center>\n");
      out.write("      \n");
      out.write("      <center>\n");
      out.write("       <form method=\"post\" name=\"resetform\" action=\"index1.jsp\">\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"name\" value=\"Back to previous page\">\n");
      out.write("\n");
      out.write("\n");
      out.write("           </form>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("           <form method=\"post\" name=\"resetform\" action=\"index.jsp\">\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"name\" value=\"Back to main page\">\n");
      out.write("\n");
      out.write("\n");
      out.write("           </form>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("-->\n");
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
