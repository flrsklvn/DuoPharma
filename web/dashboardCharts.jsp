

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Dashboard</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
    <link href="mine.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- Highcharts script for charts and graphs! -->     
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <script src="https://code.highcharts.com/modules/exporting.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript">
        $(function () { 
            var myChart = Highcharts.chart('barChart', {
                chart: {
                    type: 'bar'
                },
                title: {
                    text: 'Inventory Stocks'
                },
                xAxis: {
                    categories: ['Juice', 'Meds']
                },
                yAxis: {
                    title: {
                        text: 'Product Ordered'
                    }
                },
                series: [{
                    name: 'Kelvin',
                    data: [6, 3]
                }, {
                    name: 'Myron',
                    data: [9, 3]
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
                      text: 'Inventory'
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
                      text: 'Sales',
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
            body{
            	margin: 0;
            	padding-top: 0px;
            	background: #cccccc;
            }
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 70%;
            }
            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }
            tr:nth-child(even) {
                background-color: #dddddd;
            }
            .top {
                position:absolute;
                left:0; right:0;
                height: 92px;
            }
            .left {
                position:absolute;
                left:0; top:60px; bottom: 0;
                width: 178px;
            }
            .main {
            	position:relative;
            	top:0px;
                margin-left: 120px;
                border-left: 1px solid gray;
                padding: 1em;
                overflow: auto;
            }
</style>
  </head>

  <body>
  
        <nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Duopharma</a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
              <ul class="nav navbar-nav">
                <li><a href="ceoViewReportTabPage.jsp">Reports</a></li>
                <li class="active"><a href="dashboardCharts.jsp">Charts</a></li>
                <li><a href="#">DSS</a></li>
                <li><a href="#">Objective Setting</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
              </ul>
            </div>
          </div>
        </nav>
  
  
    <div class="container-fluid">
      <div class="row">
        <div class="left">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Inventory</a></li>
            <li><a href="#">Accounting</a></li>
            <li><a href="#">Sales</a></li>
          </ul>
           
          
        </div>
           <div class ="main">
                <div class="container-fluid">
  
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
    
      
        

                        
                              
         


     

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
 
  </body>

</html>
