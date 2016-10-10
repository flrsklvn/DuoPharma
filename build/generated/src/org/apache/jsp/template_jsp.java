package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>ISR Home</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body,html{\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav.sidebar, .main{\n");
      out.write("                -webkit-transition: margin 200ms ease-out;\n");
      out.write("                -moz-transition: margin 200ms ease-out;\n");
      out.write("                -o-transition: margin 200ms ease-out;\n");
      out.write("                transition: margin 200ms ease-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main{\n");
      out.write("                padding: 10px 10px 0 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 765px) {\n");
      out.write("\n");
      out.write("                .main{\n");
      out.write("                    position: absolute;\n");
      out.write("                    width: calc(100% - 40px); \n");
      out.write("                    margin-left: 40px;\n");
      out.write("                    float: right;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar:hover + .main{\n");
      out.write("                    margin-left: 200px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar.navbar.sidebar>.container .navbar-brand, .navbar>.container-fluid .navbar-brand {\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .navbar-brand, nav.sidebar .navbar-header{\n");
      out.write("                    text-align: center;\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar a{\n");
      out.write("                    padding-right: 13px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .navbar-nav > li:first-child{\n");
      out.write("                    border-top: 1px #e5e5e5 solid;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .navbar-nav > li{\n");
      out.write("                    border-bottom: 1px #e5e5e5 solid;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .navbar-nav .open .dropdown-menu {\n");
      out.write("                    position: static;\n");
      out.write("                    float: none;\n");
      out.write("                    width: auto;\n");
      out.write("                    margin-top: 0;\n");
      out.write("                    background-color: transparent;\n");
      out.write("                    border: 0;\n");
      out.write("                    -webkit-box-shadow: none;\n");
      out.write("                    box-shadow: none;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .navbar-collapse, nav.sidebar .container-fluid{\n");
      out.write("                    padding: 0 0px 0 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .navbar-inverse .navbar-nav .open .dropdown-menu>li>a {\n");
      out.write("                    color: #777;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar{\n");
      out.write("                    width: 200px;\n");
      out.write("                    height: 100%;\n");
      out.write("                    margin-left: -160px;\n");
      out.write("                    float: left;\n");
      out.write("                    margin-bottom: 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar li {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar:hover{\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .forAnimate{\n");
      out.write("                    opacity: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (min-width: 1330px) {\n");
      out.write("\n");
      out.write("                .main{\n");
      out.write("                    width: calc(100% - 200px);\n");
      out.write("                    margin-left: 200px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar{\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                    float: left;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                nav.sidebar .forAnimate{\n");
      out.write("                    opacity: 1;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav.sidebar .navbar-nav .open .dropdown-menu>li>a:hover, nav.sidebar .navbar-nav .open .dropdown-menu>li>a:focus {\n");
      out.write("                color: #CCC;\n");
      out.write("                background-color: transparent;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav:hover .forAnimate{\n");
      out.write("                opacity: 1;\n");
      out.write("            }\n");
      out.write("            section{\n");
      out.write("                padding-left: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Duopharma</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ISR </a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-default sidebar\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-sidebar-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>      \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-sidebar-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Home<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Upload Facility<span class=\"caret\"></span><span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("                                <li><a href=\"#\">Accounting</a></li>\n");
      out.write("                                <li><a href=\"#\">Inventory</a></li>\n");
      out.write("                                <li><a href=\"#\">Sales</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Reports Library <span class=\"caret\"></span><span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("                                <li><a href=\"#\">Accounting</a></li>\n");
      out.write("                                <li><a href=\"#\">Inventory</a></li>\n");
      out.write("                                <li><a href=\"#\">Sales</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                    </ul> \n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                            </nav>\n");
      out.write("\n");
      out.write("                            </body>\n");
      out.write("                            </html>\n");
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
