package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("    <!-- Title -->\n");
      out.write("    <title>Alazea - Gardening &amp; Landscaping HTML Template</title>\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"icon\" href=\"img/core-img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- Core Stylesheet -->\n");
      out.write("    <script data-require=\"jquery@3.1.1\" data-semver=\"3.1.1\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("     <script src=\"script.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        table, th, td {\n");
      out.write("                 border: 1px solid black;\n");
      out.write("                 border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("             th, td {\n");
      out.write("             padding: 5px;\n");
      out.write("              text-align: left; \n");
      out.write("            }\n");
      out.write("   </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- Preloader -->\n");
      out.write("    <div class=\"preloader d-flex align-items-center justify-content-center\">\n");
      out.write("        <div class=\"preloader-circle\"></div>\n");
      out.write("        <div class=\"preloader-img\">\n");
      out.write("            <img src=\"img/core-img/leaf.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ##### Header Area Start ##### -->\n");
      out.write("    <header class=\"header-area\">\n");
      out.write("\n");
      out.write("        <!-- ***** Top Header Area ***** -->\n");
      out.write("        <div class=\"top-header-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"top-header-content d-flex align-items-center justify-content-between\">\n");
      out.write("                            <!-- Top Header Content -->\n");
      out.write("                            <div class=\"top-header-meta\">\n");
      out.write("                                <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"infodeercreative@gmail.com\"><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i> <span>Email: infodeercreative@gmail.com</span></a>\n");
      out.write("                                <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"bottom\" title=\"+1 234 122 122\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> <span>Call Us: +1 234 122 122</span></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Top Header Content -->\n");
      out.write("                            <div class=\"top-header-meta d-flex\">\n");
      out.write("                                <!-- Language Dropdown -->\n");
      out.write("                                <div class=\"language-dropdown\">\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <button class=\"btn btn-secondary dropdown-toggle mr-30\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Language</button>\n");
      out.write("                                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">USA</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">UK</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Bangla</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Hindi</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Spanish</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Latin</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Login -->\n");
      out.write("                                <div class=\"login\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> <span>Login</span></a>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Cart -->\n");
      out.write("                                <div class=\"cart\">\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i> <span>Cart <span class=\"cart-quantity\">(1)</span></span></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- ***** Navbar Area ***** -->\n");
      out.write("        <div class=\"alazea-main-menu\">\n");
      out.write("            <div class=\"classy-nav-container breakpoint-off\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Menu -->\n");
      out.write("                    <nav class=\"classy-navbar justify-content-between\" id=\"alazeaNav\">\n");
      out.write("\n");
      out.write("                        <!-- Nav Brand -->\n");
      out.write("                        <a href=\"index.html\" class=\"nav-brand\"><img src=\"img/core-img/logo1.png\" width=\"250px\" height=\"22px\" alt=\"\"></a>\n");
      out.write("\n");
      out.write("                        <!-- Navbar Toggler -->\n");
      out.write("                        <div class=\"classy-navbar-toggler\">\n");
      out.write("                            <span class=\"navbarToggler\"><span></span><span></span><span></span></span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Menu -->\n");
      out.write("                        <div class=\"classy-menu\">\n");
      out.write("\n");
      out.write("                            <!-- Close Button -->\n");
      out.write("                            <div class=\"classycloseIcon\">\n");
      out.write("                                <div class=\"cross-wrap\"><span class=\"top\"></span><span class=\"bottom\"></span></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Navbar Start -->\n");
      out.write("                            <div class=\"classynav\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                    <li><a href=\"about.html\">About</a></li>\n");
      out.write("                                    \n");
      out.write("                                    <li><a href=\"shop.html\">Shop</a></li>\n");
      out.write("                                    <li></li>\n");
      out.write("                                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <!-- Search Icon -->\n");
      out.write("                                <div id=\"searchIcon\">\n");
      out.write("                                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Navbar End -->\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <!-- Search Form -->\n");
      out.write("                    <div class=\"search-form\">\n");
      out.write("                        <form action=\"#\" method=\"get\">\n");
      out.write("                            <input type=\"search\" name=\"search\" id=\"search\" placeholder=\"Type keywords &amp; press enter...\">\n");
      out.write("                            <button type=\"submit\" class=\"d-none\"></button>\n");
      out.write("                        </form>\n");
      out.write("                        <!-- Close Icon -->\n");
      out.write("                        <div class=\"closeIcon\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("       \n");
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
