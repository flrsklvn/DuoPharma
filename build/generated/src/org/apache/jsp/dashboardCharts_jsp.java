package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboardCharts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"dashboard.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"mine.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Highcharts script for charts and graphs! -->     \n");
      out.write("    <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://code.highcharts.com/highcharts.js\"></script>\n");
      out.write("    <script src=\"https://code.highcharts.com/modules/exporting.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function () { \n");
      out.write("            var myChart = Highcharts.chart('barChart', {\n");
      out.write("                chart: {\n");
      out.write("                    type: 'bar'\n");
      out.write("                },\n");
      out.write("                title: {\n");
      out.write("                    text: 'Inventory Stocks'\n");
      out.write("                },\n");
      out.write("                xAxis: {\n");
      out.write("                    categories: ['Juice', 'Meds']\n");
      out.write("                },\n");
      out.write("                yAxis: {\n");
      out.write("                    title: {\n");
      out.write("                        text: 'Product Ordered'\n");
      out.write("                    }\n");
      out.write("                },\n");
      out.write("                series: [{\n");
      out.write("                    name: 'Kelvin',\n");
      out.write("                    data: [6, 3]\n");
      out.write("                }, {\n");
      out.write("                    name: 'Myron',\n");
      out.write("                    data: [9, 3]\n");
      out.write("                }]\n");
      out.write("            });\n");
      out.write("            var myChart = Highcharts.chart('pieChart',{\n");
      out.write("                  chart: {\n");
      out.write("                      plotBackgroundColor: null,\n");
      out.write("                      plotBorderWidth: null,\n");
      out.write("                      plotShadow: false,\n");
      out.write("                      type: 'pie'\n");
      out.write("                  },\n");
      out.write("                  title: {\n");
      out.write("                      text: 'Inventory'\n");
      out.write("                  },\n");
      out.write("                  tooltip: {\n");
      out.write("                      pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'\n");
      out.write("                  },\n");
      out.write("                  plotOptions: {\n");
      out.write("                      pie: {\n");
      out.write("                          allowPointSelect: true,\n");
      out.write("                          cursor: 'pointer',\n");
      out.write("                          dataLabels: {\n");
      out.write("                              enabled: false\n");
      out.write("                          },\n");
      out.write("                          showInLegend: true\n");
      out.write("                      }\n");
      out.write("                  },\n");
      out.write("                  series: [{\n");
      out.write("                      name: 'Brands',\n");
      out.write("                      colorByPoint: true,\n");
      out.write("                      data: [{\n");
      out.write("                          name: 'Microsoft Internet Explorer',\n");
      out.write("                          y: 56.33\n");
      out.write("                      }, {\n");
      out.write("                          name: 'Chrome',\n");
      out.write("                          y: 24.03,\n");
      out.write("                          sliced: true,\n");
      out.write("                          selected: true\n");
      out.write("                      }, {\n");
      out.write("                          name: 'Firefox',\n");
      out.write("                          y: 10.38\n");
      out.write("                      }, {\n");
      out.write("                          name: 'Safari',\n");
      out.write("                          y: 4.77\n");
      out.write("                      }, {\n");
      out.write("                          name: 'Opera',\n");
      out.write("                          y: 0.91\n");
      out.write("                      }, {\n");
      out.write("                          name: 'Proprietary or Undetectable',\n");
      out.write("                          y: 0.2\n");
      out.write("                      }]\n");
      out.write("                  }]\n");
      out.write("              });\n");
      out.write("              var myChart = Highcharts.chart('lineChart',{\n");
      out.write("                  title: {\n");
      out.write("                      text: 'Sales',\n");
      out.write("                      x: -20 //center\n");
      out.write("                  },\n");
      out.write("                  subtitle: {\n");
      out.write("                      text: 'Source: WorldClimate.com',\n");
      out.write("                      x: -20\n");
      out.write("                  },\n");
      out.write("                  xAxis: {\n");
      out.write("                      categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',\n");
      out.write("                          'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']\n");
      out.write("                  },\n");
      out.write("                  yAxis: {\n");
      out.write("                      title: {\n");
      out.write("                          text: 'Temperature (°C)'\n");
      out.write("                      },\n");
      out.write("                      plotLines: [{\n");
      out.write("                          value: 0,\n");
      out.write("                          width: 1,\n");
      out.write("                          color: '#808080'\n");
      out.write("                      }]\n");
      out.write("                  },\n");
      out.write("                  tooltip: {\n");
      out.write("                      valueSuffix: '°C'\n");
      out.write("                  },\n");
      out.write("                  legend: {\n");
      out.write("                      layout: 'vertical',\n");
      out.write("                      align: 'right',\n");
      out.write("                      verticalAlign: 'middle',\n");
      out.write("                      borderWidth: 0\n");
      out.write("                  },\n");
      out.write("                  series: [{\n");
      out.write("                      name: 'Tokyo',\n");
      out.write("                      data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]\n");
      out.write("                  }, {\n");
      out.write("                      name: 'New York',\n");
      out.write("                      data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]\n");
      out.write("                  }, {\n");
      out.write("                      name: 'Berlin',\n");
      out.write("                      data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]\n");
      out.write("                  }, {\n");
      out.write("                      name: 'London',\n");
      out.write("                      data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]\n");
      out.write("                  }]\n");
      out.write("              });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("            \tmargin: 0;\n");
      out.write("            \tpadding-top: 0px;\n");
      out.write("            \tbackground: #cccccc;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                font-family: arial, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 70%;\n");
      out.write("            }\n");
      out.write("            td, th {\n");
      out.write("                border: 1px solid #dddddd;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #dddddd;\n");
      out.write("            }\n");
      out.write("            .top {\n");
      out.write("                position:absolute;\n");
      out.write("                left:0; right:0;\n");
      out.write("                height: 92px;\n");
      out.write("            }\n");
      out.write("            .left {\n");
      out.write("                position:absolute;\n");
      out.write("                left:0; top:60px; bottom: 0;\n");
      out.write("                width: 178px;\n");
      out.write("            }\n");
      out.write("            .main {\n");
      out.write("            \tposition:relative;\n");
      out.write("            \ttop:0px;\n");
      out.write("                margin-left: 120px;\n");
      out.write("                border-left: 1px solid gray;\n");
      out.write("                padding: 1em;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("  \n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
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
      out.write("                <li><a href=\"ceoViewReportTabPage.jsp\">Reports</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"dashboardCharts.jsp\">Charts</a></li>\n");
      out.write("                <li><a href=\"#\">DSS</a></li>\n");
      out.write("                <li><a href=\"#\">Objective Setting</a></li>\n");
      out.write("              </ul>\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"left\">\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li class=\"active\"><a href=\"#\">Overview</a></li>\n");
      out.write("            <li><a href=\"#\">Analytics</a></li>\n");
      out.write("            <li><a href=\"#\">Export</a></li>\n");
      out.write("          </ul>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("           <div class =\"main\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("  \n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("              <div id=\"barChart\" style=\"width:100%; height:400px\"></div>\n");
      out.write("           </div> \n");
      out.write("         <div class=\"col-sm-4\">\n");
      out.write("              <div id=\"pieChart\" style=\"width:100%; height:400px\"></div>\n");
      out.write("           </div> \n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("              <div id=\"lineChart\" style=\"width:100%; height:400px\"></div>\n");
      out.write("           </div> \n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("        \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                              \n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->\n");
      out.write("    <script src=\"../../assets/js/vendor/holder.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Optional theme -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
      out.write("  </body>\n");
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
