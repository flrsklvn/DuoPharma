package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Task;
import java.util.ArrayList;
import DB.TaskDB;

public final class isrview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>ISR View</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .nav-side-menu {\n");
      out.write("                overflow: auto;\n");
      out.write("                font-family: verdana;\n");
      out.write("                font-size: 12px;\n");
      out.write("                font-weight: 200;\n");
      out.write("                background-color: #2e353d;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0px;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 100%;\n");
      out.write("                color: #e1ffff;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu .brand {\n");
      out.write("                background-color: #23282e;\n");
      out.write("                line-height: 50px;\n");
      out.write("                display: block;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu .toggle-btn {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul,\n");
      out.write("            .nav-side-menu li {\n");
      out.write("                list-style: none;\n");
      out.write("                padding: 0px;\n");
      out.write("                margin: 0px;\n");
      out.write("                line-height: 35px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                /*    \n");
      out.write("                  .collapsed{\n");
      out.write("                     .arrow:before{\n");
      out.write("                               font-family: FontAwesome;\n");
      out.write("                               content: \"\\f053\";\n");
      out.write("                               display: inline-block;\n");
      out.write("                               padding-left:10px;\n");
      out.write("                               padding-right: 10px;\n");
      out.write("                               vertical-align: middle;\n");
      out.write("                               float:right;\n");
      out.write("                          }\n");
      out.write("                   }\n");
      out.write("                */\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul :not(collapsed) .arrow:before,\n");
      out.write("            .nav-side-menu li :not(collapsed) .arrow:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f078\";\n");
      out.write("                display: inline-block;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .active,\n");
      out.write("            .nav-side-menu li .active {\n");
      out.write("                border-left: 3px solid #d19b3d;\n");
      out.write("                background-color: #4f5b69;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .sub-menu li.active,\n");
      out.write("            .nav-side-menu li .sub-menu li.active {\n");
      out.write("                color: #d19b3d;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .sub-menu li.active a,\n");
      out.write("            .nav-side-menu li .sub-menu li.active a {\n");
      out.write("                color: #d19b3d;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .sub-menu li,\n");
      out.write("            .nav-side-menu li .sub-menu li {\n");
      out.write("                background-color: #181c20;\n");
      out.write("                border: none;\n");
      out.write("                line-height: 28px;\n");
      out.write("                border-bottom: 1px solid #23282e;\n");
      out.write("                margin-left: 0px;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .sub-menu li:hover,\n");
      out.write("            .nav-side-menu li .sub-menu li:hover {\n");
      out.write("                background-color: #020203;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu ul .sub-menu li:before,\n");
      out.write("            .nav-side-menu li .sub-menu li:before {\n");
      out.write("                font-family: FontAwesome;\n");
      out.write("                content: \"\\f105\";\n");
      out.write("                display: inline-block;\n");
      out.write("                padding-left: 10px;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                vertical-align: middle;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu li {\n");
      out.write("                padding-left: 0px;\n");
      out.write("                border-left: 3px solid #2e353d;\n");
      out.write("                border-bottom: 1px solid #23282e;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu li a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #e1ffff;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu li a i {\n");
      out.write("                padding-left: 10px;\n");
      out.write("                width: 20px;\n");
      out.write("                padding-right: 20px;\n");
      out.write("            }\n");
      out.write("            .nav-side-menu li:hover {\n");
      out.write("                border-left: 3px solid #d19b3d;\n");
      out.write("                background-color: #4f5b69;\n");
      out.write("                -webkit-transition: all 1s ease;\n");
      out.write("                -moz-transition: all 1s ease;\n");
      out.write("                -o-transition: all 1s ease;\n");
      out.write("                -ms-transition: all 1s ease;\n");
      out.write("                transition: all 1s ease;\n");
      out.write("            }\n");
      out.write("            @media (max-width: 767px) {\n");
      out.write("                .nav-side-menu {\n");
      out.write("                    position: relative;\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-bottom: 10px;\n");
      out.write("                }\n");
      out.write("                .nav-side-menu .toggle-btn {\n");
      out.write("                    display: block;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    position: absolute;\n");
      out.write("                    right: 10px;\n");
      out.write("                    top: 10px;\n");
      out.write("                    z-index: 10 !important;\n");
      out.write("                    padding: 3px;\n");
      out.write("                    background-color: #ffffff;\n");
      out.write("                    color: #000;\n");
      out.write("                    width: 40px;\n");
      out.write("                    text-align: center;\n");
      out.write("                }\n");
      out.write("                .brand {\n");
      out.write("                    text-align: left !important;\n");
      out.write("                    font-size: 22px;\n");
      out.write("                    padding-left: 20px;\n");
      out.write("                    line-height: 50px !important;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (min-width: 767px) {\n");
      out.write("                .nav-side-menu .menu-list .menu-content {\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("                #main {\n");
      out.write("                    width:calc(100% - 300px);\n");
      out.write("                    float: right;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            aside {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 1.5%;\n");
      out.write("                width: 30%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> ISR </a></li>\n");
      out.write("                    <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"nav-side-menu\">\n");
      out.write("            <div class=\"brand\">Duopharma</div>\n");
      out.write("            <i class=\"fa fa-bars fa-2x toggle-btn\" data-toggle=\"collapse\" data-target=\"#menu-content\"></i>\n");
      out.write("            <div class=\"menu-list\">\n");
      out.write("                <ul id=\"menu-content\" class=\"menu-content collapse out\">\n");
      out.write("                    <li class=\"active\" >\n");
      out.write("                        <a href=\"isrview.jsp\">\n");
      out.write("                            Home\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li data-toggle=\"collapse\" data-target=\"#products\" class=\"collapsed\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-gift fa-lg\"></i> Upload Facility <span class=\"arrow\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <ul class=\"sub-menu collapse\" id=\"products\">\n");
      out.write("                            <li><a href=\"isrAccountingUpload.jsp\">Accounting</a></li>\n");
      out.write("                            <li><a href=\"isrInventoryUpload.jsp\">Inventory</a></li>\n");
      out.write("                            <li><a href=\"isrSalesUpload.jsp\">Sales</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li data-toggle=\"collapse\" data-target=\"#service\" class=\"collapsed\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-globe fa-lg\"></i> Reports Library <span class=\"arrow\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <ul class=\"sub-menu collapse\" id=\"service\">\n");
      out.write("                            <li>Accounting</li>\n");
      out.write("                            <li>Inventory</li>\n");
      out.write("                            <li>Sales</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- TABLE -->\n");
      out.write("        <div class=\"container\" id=\"main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("\n");
      out.write("                    <h2> Welcome, Myron! </h2>\n");
      out.write("                    ");

                        TaskDB tasks = new TaskDB();
                        ArrayList<Task> taskList = tasks.getAllTasks();


                    
      out.write("\n");
      out.write("                    <table class=\"table table-list-search\">\n");
      out.write("                        <thead>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Task</th>\n");
      out.write("                                <th>Report Date</th>\n");
      out.write("                                <th>Report Type</th>\n");
      out.write("                                <th>Due Date</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
  for (int i = 0; i < taskList.size(); i++) {
                                     if (taskList.get(i).getStatus().equals("Not Started")) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getTaskName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getReportDate());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getReportType());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getDueDate());
      out.write("</td>\n");
      out.write("                                <td><font color=\"red\">");
      out.print( taskList.get(i).getStatus());
      out.write("</font></td>\n");
      out.write("                                    ");

                                        if (taskList.get(i).getReportType().equals("Inventory")) {
                                            if (taskList.get(i).getAction().equals("Upload")) {
                                    
      out.write("\n");
      out.write("                                <td><button><a href=\"isrInventoryUpload.jsp\">");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("                                        ");
}
                                        if (taskList.get(i).getAction().equals("Edit")) {
      out.write(" \n");
      out.write("                                <td><button><a>");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("\n");
      out.write("                                                                   ");
    }  
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                ");

                                        if (taskList.get(i).getReportType().equals("Sales")) {
                                            if (taskList.get(i).getAction().equals("Upload")) {
                                    
      out.write("\n");
      out.write("                                <td><button><a href=\"isrSalesUpload.jsp\">");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("                                        ");
}
                                        if (taskList.get(i).getAction().equals("Upload")) {
      out.write(" \n");
      out.write("                                <td><button><a>");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("\n");
      out.write("                                                                   ");
    }  
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            ");

                                        if (taskList.get(i).getReportType().equals("Accounting")) {
                                            if (taskList.get(i).getAction().equals("Upload")) {
                                    
      out.write("\n");
      out.write("                                <td><button><a href=\"isrAccountingUpload.jsp\">");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("                                        ");
}
                                        if (taskList.get(i).getAction().equals("Edit")) {
      out.write(" \n");
      out.write("                                <td><button><a>");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("\n");
      out.write("                                                                   ");
    }  
      out.write("\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            ");

                              if (taskList.get(i).getStatus().equals("Completed")) {
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getTaskName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getReportDate());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getReportType());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( taskList.get(i).getDueDate());
      out.write("</td>\n");
      out.write("                                <td><font color=\"green\">");
      out.print( taskList.get(i).getStatus());
      out.write("</font></td>\n");
      out.write("\n");
      out.write("                                <td><button><a href=\"isrInventoryUpload.jsp\">");
      out.print( taskList.get(i).getAction());
      out.write("</a></button></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                             }
                                         }
                                     
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3 sidenav\">\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <p><b>Reports for Approval</b></p>\n");
      out.write("                        <table class=\"table table-list-search\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Report ID</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>123123213</td>\n");
      out.write("                                    <td>Incomplete</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- @start -->\n");
      out.write("                    <div class=\"well\">\n");
      out.write("                        <p><b>Reports for Entry Validation</b></p>\n");
      out.write("                        <table class=\"table table-list-search\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Report ID</th>\n");
      out.write("                                    <th>Status</th>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>123123213</td>\n");
      out.write("                                    <td>Incomplete</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- @end -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
