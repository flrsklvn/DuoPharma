package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DB.DBConnectionFactoryImp;
import Entities.Product;
import java.util.ArrayList;
import DB.ProductDB;

public final class isrInventoryReportPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inventory ISR</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/list.js/1.2.0/list.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        /* Remove the navbar's default rounded borders and increase the bottom margin */\n");
      out.write("        .navbar {\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("            border-radius: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Remove the jumbotron's default bottom margin */\n");
      out.write("        .jumbotron {\n");
      out.write("            margin-bottom: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add a gray background color and some padding to the footer */\n");
      out.write("        footer {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            padding: 25px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Logo</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"homePage.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Products</a></li>\n");
      out.write("                        <li><a href=\"#\">Deals</a></li>\n");
      out.write("                        <li><a href=\"#\">Stores</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Your Account</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Cart</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-10\" id=\"my-cool-sortable-table-wrapper\">\n");
      out.write("            <table class=\"table table-list-search\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th>Name <button class=\"sort glyphicon glyphicon-chevron-down\" data-sort=\"name\"></button></th>\n");
      out.write("                        <th>Product ID <button class=\"sort glyphicon glyphicon-chevron-down\" data-sort=\"prodID\"></button></th>\n");
      out.write("                        <th>Price <button class=\"sort glyphicon glyphicon-chevron-down\" data-sort=\"price\"></button></th>\n");
      out.write("                        <th>Quantity on Hand <button class=\"sort glyphicon glyphicon-chevron-down\" data-sort=\"qoh\"></button></th>\n");
      out.write("                        <th>Shelf Life <button class=\"sort glyphicon glyphicon-chevron-down\" data-sort=\"sl\"></button></th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody class=\"list\">\n");
      out.write("                    ");

                      
                         ProductDB allproduct = new ProductDB();
                        
                       
                        ArrayList<Product> list = allproduct.getAllProducts();
                        
                        
                        for (int j = 0; j < list.size(); j++) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"name\">");
      out.print( list.get(j).getName());
      out.write("</td>\n");
      out.write("                        <td class=\"prodID\">");
      out.print( list.get(j).getProductID());
      out.write("</td>\n");
      out.write("                        <td class=\"price\">");
      out.print( list.get(j).getPrice());
      out.write("</td>\n");
      out.write("                        <td class=\"qoh\">");
      out.print( list.get(j).getQuantityOnHand());
      out.write("</td>\n");
      out.write("                        <td class=\"sl\">");
      out.print( list.get(j).getShelfLife());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
 }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>   \n");
      out.write("        </div>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/list.js/1.1.1/list.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var options = {\n");
      out.write("        valueNames: [ 'name', 'prodID', 'price', 'qoh', 'sl' ]\n");
      out.write("    };\n");
      out.write("    var contactList = new List('my-cool-sortable-table-wrapper', options);\n");
      out.write("</script>\n");
      out.write("            \n");
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
