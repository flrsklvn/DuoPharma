package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class isrInventoryUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            /* layout.css Style */\n");
      out.write("            .upload-drop-zone {\n");
      out.write("                height: 200px;\n");
      out.write("                border-width: 2px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* skin.css Style*/\n");
      out.write("            .upload-drop-zone {\n");
      out.write("                color: #ccc;\n");
      out.write("                border-style: dashed;\n");
      out.write("                border-color: #ccc;\n");
      out.write("                line-height: 200px;\n");
      out.write("                text-align: center\n");
      out.write("            }\n");
      out.write("            .upload-drop-zone.drop {\n");
      out.write("                color: #222;\n");
      out.write("                border-color: #222;\n");
      out.write("            }\n");
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
      out.write("                    <li>\n");
      out.write("                        <a href=\"isrview.jsp\">\n");
      out.write("                          Home\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li data-toggle=\"collapse\" data-target=\"#products\" class=\"collapsed active\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-gift fa-lg\"></i> Upload Facility <span class=\"arrow\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <ul class=\"sub-menu collapse\" id=\"products\">\n");
      out.write("                        <li><a href=\"isrAccountingUpload.jsp\">Accounting</a></li>\n");
      out.write("                        <li><a href=\"isrInventoryUpload.jsp\" class=\"active\">Inventory</a></li>\n");
      out.write("                        <li><a href=\"isrSalesUpload.jsp\">Sales</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <li data-toggle=\"collapse\" data-target=\"#service\" class=\"collapsed\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-globe fa-lg\"></i> Reports Library <span class=\"arrow\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <ul class=\"sub-menu collapse\" id=\"service\">\n");
      out.write("                        <li>Accounting</li>\n");
      out.write("                        <li>Inventory</li>\n");
      out.write("                        <li>Sales</li>\n");
      out.write("                    </ul>                 \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\" id=\"main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\"><strong>Upload Inventory File</strong></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <!-- Standar Form -->\n");
      out.write("                            <h4>Select files from your computer</h4>\n");
      out.write("                            <form action=\"\" method=\"post\" enctype=\"multipart/form-data\" id=\"js-upload-form\">\n");
      out.write("                                <div class=\"form-inline\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"file\" name=\"files[]\" id=\"js-upload-files\" multiple>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-sm btn-primary\" id=\"js-upload-submit\"><a href=\"isrAfteruploadInventory.jsp\">Upload file</a></button>\n");
      out.write("                                </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- /container -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            +function ($) {\n");
      out.write("                'use strict';\n");
      out.write("\n");
      out.write("                // UPLOAD CLASS DEFINITION\n");
      out.write("                // ======================\n");
      out.write("\n");
      out.write("                var dropZone = document.getElementById('drop-zone');\n");
      out.write("                var uploadForm = document.getElementById('js-upload-form');\n");
      out.write("\n");
      out.write("                var startUpload = function (files) {\n");
      out.write("                    console.log(files)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                uploadForm.addEventListener('submit', function (e) {\n");
      out.write("                    var uploadFiles = document.getElementById('js-upload-files').files;\n");
      out.write("                    e.preventDefault()\n");
      out.write("\n");
      out.write("                    startUpload(uploadFiles)\n");
      out.write("                })\n");
      out.write("\n");
      out.write("                dropZone.ondrop = function (e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    this.className = 'upload-drop-zone';\n");
      out.write("\n");
      out.write("                    startUpload(e.dataTransfer.files)\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                dropZone.ondragover = function () {\n");
      out.write("                    this.className = 'upload-drop-zone drop';\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                dropZone.ondragleave = function () {\n");
      out.write("                    this.className = 'upload-drop-zone';\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }(jQuery);\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
