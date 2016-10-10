package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entities.Product;
import java.sql.*;
import DB.ProductDB;
import DB.OrderDB;
import java.util.ArrayList;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Selecting data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Selecting Data</h1>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <&!\n");
      out.write("        public class Product {\n");
      out.write("            String URL = \"jdbc:mysql://localhost:3306/thes01\";\n");
      out.write("            String USERNAME = \"root\";\n");
      out.write("            String PASSWORD = \"0105\";\n");
      out.write("            \n");
      out.write("            Connection connection = null;\n");
      out.write("            PreparedStatement selectProduct = null;\n");
      out.write("            ResultSet resultSet = null;\n");
      out.write("            \n");
      out.write("            public Product(){\n");
      out.write("            try {\n");
      out.write("            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);\n");
      out.write("            \n");
      out.write("            selectProduct = connection.prepareStatement(\"select * from product order by productID\")\n");
      out.write("            \n");
      out.write("            } catch (SQLException e){\n");
      out.write("                e.printStackTrace();\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            public ResultSet getProducts(){\n");
      out.write("            try{\n");
      out.write("            resultSet = selectProduct.executeQuery();\n");
      out.write("            \n");
      out.write("            } catch (SQLException e){\n");
      out.write("                e.printStackTrace();\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                return resultSet;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("        %>\n");
      out.write("        ");

        
        
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" ");
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
