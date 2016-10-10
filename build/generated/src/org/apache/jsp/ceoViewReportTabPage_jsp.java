package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Order;
import DB.OrderDB;
import DB.CustomerDB;
import DB.ProductDB;
import Entities.Product;
import Entities.Account;
import java.util.ArrayList;
import DB.AccountDB;

public final class ceoViewReportTabPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>CEO View Reports</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/list.js/1.2.0/list.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            /* Remove the navbar's default margin-bottom and rounded borders */\n");
      out.write("            .navbar {\n");
      out.write("                margin-bottom: 0;\n");
      out.write("                border-radius: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs {\n");
      out.write("                border-bottom: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tab-content > .tab-pane,\n");
      out.write("            .pill-content > .pill-pane {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tab-content > .active,\n");
      out.write("            .pill-content > .active {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs > li {\n");
      out.write("                float: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs > li > a {\n");
      out.write("                min-width: 74px;\n");
      out.write("                margin-right: 0;\n");
      out.write("                margin-bottom: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs {\n");
      out.write("                float: left;\n");
      out.write("                margin-right: 19px;\n");
      out.write("                border-right: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs > li > a {\n");
      out.write("                margin-right: -1px;\n");
      out.write("                -webkit-border-radius: 4px 0 0 4px;\n");
      out.write("                -moz-border-radius: 4px 0 0 4px;\n");
      out.write("                border-radius: 4px 0 0 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs > li > a:hover,\n");
      out.write("            .tabs-left > .nav-tabs > li > a:focus {\n");
      out.write("                border-color: #eeeeee #dddddd #eeeeee #eeeeee;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .tabs-left > .nav-tabs .active > a,\n");
      out.write("            .tabs-left > .nav-tabs .active > a:hover,\n");
      out.write("            .tabs-left > .nav-tabs .active > a:focus {\n");
      out.write("                border-color: #ddd transparent #ddd #ddd;\n");
      out.write("                *border-right-color: #ffffff;\n");
      out.write("\n");
      out.write("\n");
      out.write("                table, th, td {\n");
      out.write("                    border: 1px solid black;\n");
      out.write("                    border-collapse: collapse;\n");
      out.write("                }\n");
      out.write("                th, td {\n");
      out.write("                    padding: 5px;\n");
      out.write("                }\n");
      out.write("                th {\n");
      out.write("                    text-align: left;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("              <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("              </button>\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">Duopharma</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("              <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"ceoViewReportTabPage.jsp\">Reports</a></li>\n");
      out.write("                <li><a href=\"dashboardCharts.jsp\">Charts</a></li>\n");
      out.write("                <li><a href=\"#\">DSS</a></li>\n");
      out.write("                <li><a href=\"#\">Objective Setting</a></li>\n");
      out.write("              </ul>\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"tabbable tabs-left\">\n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("                    <li class=\"active\"><a href=\"#accountingTab\" data-toggle=\"tab\">Accounting</a></li>\n");
      out.write("                    <li><a href=\"#inventoryTab\" data-toggle=\"tab\">Inventory</a></li>\n");
      out.write("                    <li><a href=\"#orderTab\" data-toggle=\"tab\">Order</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane active\" id=\"accountingTab\">                \n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <table class=\"table table-list-search\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Account ID</th>\n");
      out.write("                                            <th>Due Date</th>\n");
      out.write("                                            <th>Aging Days</th>\n");
      out.write("                                            <th>Start Date</th>\n");
      out.write("                                            <th>Order ID</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody class=\"list\">\n");
      out.write("                                        ");

                                            AccountDB allaccount = new AccountDB();
                                            ArrayList<Account> alist = allaccount.getAllAccountswithCustomerName();
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        ");

                                            for (int j = 0; j < alist.size(); j++) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                            <!-- HINDI PA RIN MAKUHA YUNG CUSTOMER NAME -->\n");
      out.write("                                            <td>");
      out.print( alist.get(j).getCustomerName());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( alist.get(j).getAccountID());
      out.write("</td>\n");
      out.write("                                            <td class=\"name\">");
      out.print( alist.get(j).getDueDate());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( alist.get(j).getAgingDays());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( alist.get(j).getStartDate());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( alist.get(j).getOrderID());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
 }
                                        
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>   \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"tab-pane\" id=\"inventoryTab\"> \n");
      out.write("                        <div class=\"\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <table class=\"table table-list-search\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Product ID</th>\n");
      out.write("                                            <th>Price</th>\n");
      out.write("                                            <th>Quantity on Hand</th>\n");
      out.write("                                            <th>Shelf Life</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                                            ProductDB allproduct = new ProductDB();
                                            ArrayList<Product> plist = allproduct.getAllProducts();
                                        
      out.write("\n");
      out.write("                                        ");

                                            for (int i = 0; i < plist.size(); i++) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print( plist.get(i).getName());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( plist.get(i).getProductID());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( plist.get(i).getPrice());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( plist.get(i).getQuantityOnHand());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( plist.get(i).getShelfLife());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
 }
                                        
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>   \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"tab-pane\" id=\"orderTab\"> \n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <div class=\"col-md-9\">\n");
      out.write("                                <table class=\"table table-list-search\"> <!-- put class list -->\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Customer ID</th>\n");
      out.write("                                            <th>Product ID</th>\n");
      out.write("                                            <th>Order ID</th>\n");
      out.write("                                            <th>Quantity</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                                            OrderDB allorder = new OrderDB();
                                            ArrayList<Order> olist = allorder.getAllOrders();
                                        
      out.write("\n");
      out.write("                                        ");

                                            for (int k = 0; k < olist.size(); k++) {
                                        
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td class=\"name\">");
      out.print( olist.get(k).getOrderedBy());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( olist.get(k).getProductOrdered());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( olist.get(k).getOrderID());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( olist.get(k).getQuantityOrdered());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
 }
                                        
      out.write("  \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>   \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                var summary = {\n");
      out.write("                    valueNames: ['name', 'status', 'date']\n");
      out.write("                };\n");
      out.write("                var summaryList = new List('status', summary);\n");
      out.write("\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
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
