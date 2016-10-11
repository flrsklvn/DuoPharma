<%-- 
    Document   : salesSalesCharts
    Created on : Oct 11, 2016, 12:17:45 AM
    Author     : r.chua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <!-- Highcharts script for charts and graphs! -->     
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
        <script src="https://code.highcharts.com/highcharts.js"></script>
        <script src="https://code.highcharts.com/modules/exporting.js"></script>
        
        <title>Sales Report</title>

        <script type="text/javascript">
            $(function () { 
                var myChart = Highcharts.chart('barChart', {
                    chart: {
                        type: 'bar'
                    },
                    title: {
                        text: 'Fruit Consumption'
                    },
                    xAxis: {
                        categories: ['Apples', 'Bananas', 'Oranges']
                    },
                    yAxis: {
                        title: {
                            text: 'Fruit eaten'
                        }
                    },
                    series: [{
                        name: 'Jane',
                        data: [1, 0, 4]
                    }, {
                        name: 'John',
                        data: [5, 7, 3]
                    }]
                });
                var myChart = Highcharts.chart('pieChart',{
                      chart: {
                          plotBackgroundColor: null,
                          plotBorderWidth: null,
                          plotShadow: false,
                          type: 'pie'
                      },
                      title: {
                          text: 'Browser market shares January, 2015 to May, 2015'
                      },
                      tooltip: {
                          pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
                      },
                      plotOptions: {
                          pie: {
                              allowPointSelect: true,
                              cursor: 'pointer',
                              dataLabels: {
                                  enabled: false
                              },
                              showInLegend: true
                          }
                      },
                      series: [{
                          name: 'Brands',
                          colorByPoint: true,
                          data: [{
                              name: 'Microsoft Internet Explorer',
                              y: 56.33
                          }, {
                              name: 'Chrome',
                              y: 24.03,
                              sliced: true,
                              selected: true
                          }, {
                              name: 'Firefox',
                              y: 10.38
                          }, {
                              name: 'Safari',
                              y: 4.77
                          }, {
                              name: 'Opera',
                              y: 0.91
                          }, {
                              name: 'Proprietary or Undetectable',
                              y: 0.2
                          }]
                      }]
                  });
                  var myChart = Highcharts.chart('lineChart',{
                      title: {
                          text: 'Monthly Average Temperature',
                          x: -20 //center
                      },
                      subtitle: {
                          text: 'Source: WorldClimate.com',
                          x: -20
                      },
                      xAxis: {
                          categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                              'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
                      },
                      yAxis: {
                          title: {
                              text: 'Temperature (°C)'
                          },
                          plotLines: [{
                              value: 0,
                              width: 1,
                              color: '#808080'
                          }]
                      },
                      tooltip: {
                          valueSuffix: '°C'
                      },
                      legend: {
                          layout: 'vertical',
                          align: 'right',
                          verticalAlign: 'middle',
                          borderWidth: 0
                      },
                      series: [{
                          name: 'Tokyo',
                          data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
                      }, {
                          name: 'New York',
                          data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
                      }, {
                          name: 'Berlin',
                          data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
                      }, {
                          name: 'London',
                          data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
                      }]
                  });
            });
        </script>
        
        <style>
            .nav-side-menu {
                overflow: auto;
                font-family: verdana;
                font-size: 12px;
                font-weight: 200;
                background-color: #2e353d;
                position: fixed;
                top: 0px;
                width: 300px;
                height: 100%;
                color: #e1ffff;
            }
            .nav-side-menu .brand {
                background-color: #23282e;
                line-height: 50px;
                display: block;
                text-align: center;
                font-size: 14px;
            }
            .nav-side-menu .toggle-btn {
                display: none;
            }
            .nav-side-menu ul,
            .nav-side-menu li {
                list-style: none;
                padding: 0px;
                margin: 0px;
                line-height: 35px;
                cursor: pointer;
                /*    
                  .collapsed{
                     .arrow:before{
                               font-family: FontAwesome;
                               content: "\f053";
                               display: inline-block;
                               padding-left:10px;
                               padding-right: 10px;
                               vertical-align: middle;
                               float:right;
                          }
                   }
                */
            }
            .nav-side-menu ul :not(collapsed) .arrow:before,
            .nav-side-menu li :not(collapsed) .arrow:before {
                font-family: FontAwesome;
                content: "\f078";
                display: inline-block;
                padding-left: 10px;
                padding-right: 10px;
                vertical-align: middle;
                float: right;
            }
            .nav-side-menu ul .active,
            .nav-side-menu li .active {
                border-left: 3px solid #d19b3d;
                background-color: #4f5b69;
            }
            .nav-side-menu ul .sub-menu li.active,
            .nav-side-menu li .sub-menu li.active {
                color: #d19b3d;
            }
            .nav-side-menu ul .sub-menu li.active a,
            .nav-side-menu li .sub-menu li.active a {
                color: #d19b3d;
            }
            .nav-side-menu ul .sub-menu li,
            .nav-side-menu li .sub-menu li {
                background-color: #181c20;
                border: none;
                line-height: 28px;
                border-bottom: 1px solid #23282e;
                margin-left: 0px;
            }
            .nav-side-menu ul .sub-menu li:hover,
            .nav-side-menu li .sub-menu li:hover {
                background-color: #020203;
            }
            .nav-side-menu ul .sub-menu li:before,
            .nav-side-menu li .sub-menu li:before {
                font-family: FontAwesome;
                content: "\f105";
                display: inline-block;
                padding-left: 10px;
                padding-right: 10px;
                vertical-align: middle;
            }
            .nav-side-menu li {
                padding-left: 0px;
                border-left: 3px solid #2e353d;
                border-bottom: 1px solid #23282e;
            }
            .nav-side-menu li a {
                text-decoration: none;
                color: #e1ffff;
            }
            .nav-side-menu li a i {
                padding-left: 10px;
                width: 20px;
                padding-right: 20px;
            }
            .nav-side-menu li:hover {
                border-left: 3px solid #d19b3d;
                background-color: #4f5b69;
                -webkit-transition: all 1s ease;
                -moz-transition: all 1s ease;
                -o-transition: all 1s ease;
                -ms-transition: all 1s ease;
                transition: all 1s ease;
            }
            @media (max-width: 767px) {
                .nav-side-menu {
                    position: relative;
                    width: 100%;
                    margin-bottom: 10px;
                }
                .nav-side-menu .toggle-btn {
                    display: block;
                    cursor: pointer;
                    position: absolute;
                    right: 10px;
                    top: 10px;
                    z-index: 10 !important;
                    padding: 3px;
                    background-color: #ffffff;
                    color: #000;
                    width: 40px;
                    text-align: center;
                }
                .brand {
                    text-align: left !important;
                    font-size: 22px;
                    padding-left: 20px;
                    line-height: 50px !important;
                }
            }
            @media (min-width: 767px) {
                .nav-side-menu .menu-list .menu-content {
                    display: block;
                }
                #main {
                    width:calc(100% - 300px);
                    float: right;
                }
            }

            body {
                margin: 0px;
                padding: 0px;
            }

            aside {
                float: right;
                margin: 0 1.5%;
                width: 30%;
            }

        </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">

                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> VP Sales </a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
                </ul>
            </div>
        </nav>
        <div class="nav-side-menu">
            <div class="brand">Duopharma</div>
            <i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse" data-target="#menu-content"></i>
            <div class="menu-list">
                <ul id="menu-content" class="menu-content collapse out">
                    <li>
                        <a href="salesHomeView.jsp">
                            Home
                           </a>
                    </li>
                    <li data-toggle="collapse" data-target="#products" class="collapsed">
                        <a href="#"><i class="fa fa-gift fa-lg"></i> Reports Library <span class="arrow"></span></a>
                    </li>
                    <li>
                    <ul class="sub-menu collapsed" id="products">
                        <li><a href="salesAccntngCharts.jsp">Accounting</a></li>
                        <li><a href="salesInventoryCharts.jsp">Inventory</a></li>
                        <li class="active"><a href="salesSalesCharts.jsp">Sales</a></li>
                    </ul>
                        </li>
                    <li data-toggle="collapse" data-target="#service" class="collapsed">
                        <a href="#"><i class="fa fa-globe fa-lg"></i> Data Analysis <span class="arrow"></span></a>
                    </li>
                    <li>
                    <ul class="sub-menu collapse" id="service">
                        <li>Accounting</li>
                        <li>Inventory</li>
                        <li>Sales</li>
                    </ul>
                        </li>


                </ul>
            </div>
        </div>
        
        <!-- CHARTS -->
        <div class="container" id="main">
            <div class="row">
                
                <div class="col-sm-4">
                    <div id="barChart" style="width:100%; height:400px"></div>
                 </div> 
                
                <div class="col-sm-4">
                    <div id="pieChart" style="width:100%; height:400px"></div>
                 </div> 
                
                <div class="col-sm-4">
                    <div id="lineChart" style="width:100%; height:400px"></div>
                 </div> 
            </div>
        </div>

    </body>
</html>
