<%-- 
    Document   : salesHomeView
    Created on : Oct 10, 2016, 9:28:53 PM
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
        <title>Sales View</title>

        <script>           
            $(function () {

                // Prepare demo data
                var data = [
                    {
                        //Misamis Oriental
                        "hc-key": "ph-mn",
                        "value": 0
                    },
                    {
                        "hc-key": "ph-4218",
                        "value": 1
                    },
                    {
                        //tawi tawi
                        "hc-key": "ph-tt",
                        "value": 2
                    },
                    {
                        //bohol
                        "hc-key": "ph-bo",
                        "value": 3
                    },
                    {
                        //cebu
                        "hc-key": "ph-cb",
                        "value": 4
                    },
                    {
                        //Basilan
                        "hc-key": "ph-bs",
                        "value": 5
                    },
                    {
                        //Zamboanga Sibugay
                        "hc-key": "ph-2603",
                        "value": 6
                    },
                    {
                        //sulu
                        "hc-key": "ph-su",
                        "value": 7
                    },
                    {
                        //antique
                        "hc-key": "ph-aq",
                        "value": 8
                    },
                    {
                        //palawan
                        "hc-key": "ph-pl",
                        "value": 9
                    },
                    {
                        //romblon
                        "hc-key": "ph-ro",
                        "value": 10
                    },
                    {
                        //albay
                        "hc-key": "ph-al",
                        "value": 11
                    },
                    {
                        //Camarines Sur
                        "hc-key": "ph-cs",
                        "value": 12
                    },
                    {
                        //naga
                        "hc-key": "ph-6999",
                        "value": 13
                    },
                    {
                        //batanes
                        "hc-key": "ph-bn",
                        "value": 14
                    },
                    {
                        //cagayan
                        "hc-key": "ph-cg",
                        "value": 15
                    },
                    {
                        //pangasinan
                        "hc-key": "ph-pn",
                        "value": 16
                    },
                    {
                        //batangas
                        "hc-key": "ph-bt",
                        "value": 17
                    },
                    {
                        //mindoro occidental
                        "hc-key": "ph-mc",
                        "value": 18
                    },
                    {
                        //quezon
                        "hc-key": "ph-qz",
                        "value": 19
                    },
                    {
                         //eastern samar
                        "hc-key": "ph-es",
                        "value": 20
                    },
                    {
                        //leyte
                        "hc-key": "ph-le",
                        "value": 21
                    },
                    {
                        //samar
                        "hc-key": "ph-sm",
                        "value": 22
                    },
                    {
                        //northern samar
                        "hc-key": "ph-ns",
                        "value": 23
                    },
                    {
                        //camiguin
                        "hc-key": "ph-cm",
                        "value": 24
                    },
                    {
                        //surigao del norte
                        "hc-key": "ph-di",
                        "value": 25
                    },
                    {
                        //davao del sur
                        "hc-key": "ph-ds",
                        "value": 26
                    },
                    {
                        //isabela
                        "hc-key": "ph-6457",
                        "value": 27
                    },
                    {
                        //lapu-lapu
                        "hc-key": "ph-6985",
                        "value": 28
                    },
                    {
                        //iloilo
                        "hc-key": "ph-ii",
                        "value": 29
                    },
                    {
                        //angeles
                        "hc-key": "ph-7017",
                        "value": 30
                    },
                    {
                        //baguio
                        "hc-key": "ph-7021",
                        "value": 31
                    },
                    {
                        //laguna
                        "hc-key": "ph-lg",
                        "value": 32
                    },
                    {
                        //rizal
                        "hc-key": "ph-ri",
                        "value": 33
                    },
                    {
                        //lanao del norte
                        "hc-key": "ph-ln",
                        "value": 34
                    },
                    {
                        //iligan
                        "hc-key": "ph-6991",
                        "value": 35
                    },
                    {
                        //lanao del sur
                        "hc-key": "ph-ls",
                        "value": 36
                    },
                    {
                        //cotabato
                        "hc-key": "ph-nc",
                        "value": 37
                    },
                    {
                        //maguindanao
                        "hc-key": "ph-mg",
                        "value": 38
                    },
                    {
                        //Sultan Kudurat
                        "hc-key": "ph-sk",
                        "value": 39
                    },
                    {
                        //south cotabato
                        "hc-key": "ph-sc",
                        "value": 40
                    },
                    {
                        //sarangani
                        "hc-key": "ph-sg",
                        "value": 41
                    },
                    {
                        //agusan del norte
                        "hc-key": "ph-an",
                        "value": 42
                    },
                    {
                        //surigao del sur
                        "hc-key": "ph-ss",
                        "value": 43
                    },
                    {
                        //agusan del sur
                        "hc-key": "ph-as",
                        "value": 44
                    },
                    {
                        //davao oriental
                        "hc-key": "ph-do",
                        "value": 45
                    },
                    {
                        //davao del norte
                        "hc-key": "ph-dv",
                        "value": 46
                    },
                    {
                        //bukidnon
                        "hc-key": "ph-bk",
                        "value": 47
                    },
                    {
                        //compostella valley
                        "hc-key": "ph-cl",
                        "value": 48
                    },
                    {
                        //cebu
                        "hc-key": "ph-6983",
                        "value": 49
                    },
                    {
                        //mandaue
                        "hc-key": "ph-6984",
                        "value": 50
                    },
                    {
                        //bacolod
                        "hc-key": "ph-6987",
                        "value": 51
                    },
                    {
                        //iloilo
                        "hc-key": "ph-6986",
                        "value": 52
                    },
                    {
                        //Cotabato
                        "hc-key": "ph-6988",
                        "value": 53
                    },
                    {
                        //davao
                        "hc-key": "ph-6989",
                        "value": 54
                    },
                    {
                        //general santos
                        "hc-key": "ph-6990",
                        "value": 55
                    },
                    {
                        //cagayan de oro
                        "hc-key": "ph-6992",
                        "value": 56
                    },
                    {
                        //butuan
                        "hc-key": "ph-6995",
                        "value": 57
                    },
                    {
                        //puerto princesa
                        "hc-key": "ph-6996",
                        "value": 58
                    },
                    {
                        //ormoc
                        "hc-key": "ph-6997",
                        "value": 59
                    },
                    {
                        //tacloban
                        "hc-key": "ph-6998",
                        "value": 60
                    },
                    {
                        //nueva vizcaya
                        "hc-key": "ph-nv",
                        "value": 61
                    },
                    {
                        //santiago
                        "hc-key": "ph-7020",
                        "value": 62
                    },
                    {
                        //olongapo
                        "hc-key": "ph-7018",
                        "value": 63
                    },
                    {
                        //dagupan
                        "hc-key": "ph-7022",
                        "value": 64
                    },
                    {
                        //Mandaluyong City
                        "hc-key": "ph-1852",
                        "value": 65
                    },
                    {
                        //manila
                        "hc-key": "ph-7000",
                        "value": 66
                    },
                    {
                        //navotas
                        "hc-key": "ph-7001",
                        "value": 67
                    },
                    {
                        //caloocan
                        "hc-key": "ph-7002",
                        "value": 68
                    },
                    {
                        //Malabon
                        "hc-key": "ph-7003",
                        "value": 69
                    },
                    {
                        //Valenzuela
                        "hc-key": "ph-7004",
                        "value": 70
                    },
                    {
                        //Quezon City
                        "hc-key": "ph-7006",
                        "value": 71
                    },
                    {
                        //Marikina
                        "hc-key": "ph-7007",
                        "value": 72
                    },
                    {
                        //San Juan
                        "hc-key": "ph-7008",
                        "value": 73
                    },
                    {
                        //Pasig
                        "hc-key": "ph-7009",
                        "value": 74
                    },
                    {
                        //Makati
                        "hc-key": "ph-7010",
                        "value": 75
                    },
                    {
                        //Pasay
                        "hc-key": "ph-7011",
                        "value": 76
                    },
                    {
                        //Paranaque
                        "hc-key": "ph-7012",
                        "value": 77
                    },
                    {
                        //Las Pinas
                        "hc-key": "ph-7013",
                        "value": 78
                    },
                    {
                        //Muntinlupa
                        "hc-key": "ph-7014",
                        "value": 79
                    },
                    {
                        //Taguig
                        "hc-key": "ph-7015",
                        "value": 80
                    },
                    {
                        //pateros
                        "hc-key": "ph-7016",
                        "value": 81
                    },
                    {
                        //lucena
                        "hc-key": "ph-7019",
                        "value": 82
                    },
                    {
                        //zamboanga
                        "hc-key": "ph-6456",
                        "value": 83
                    },
                    {
                        //zamboanga del sur
                        "hc-key": "ph-zs",
                        "value": 84
                    },
                    {
                        //negros occidental
                        "hc-key": "ph-nd",
                        "value": 85
                    },
                    {
                        //zamboanga del norte
                        "hc-key": "ph-zn",
                        "value": 86
                    },
                    {
                        //misamis occidental
                        "hc-key": "ph-md",
                        "value": 87
                    },
                    {
                        //abra
                        "hc-key": "ph-ab",
                        "value": 88
                    },
                    {
                        //apayao
                        "hc-key": "ph-2658",
                        "value": 89
                    },
                    {
                        //kalinga
                        "hc-key": "ph-ap",
                        "value": 90
                    },
                    {
                        //aurora
                        "hc-key": "ph-au",
                        "value": 91
                    },
                    {
                        //isabela
                        "hc-key": "ph-ib",
                        "value": 92
                    },
                    {
                        //ifugao
                        "hc-key": "ph-if",
                        "value": 93
                    },
                    {
                        //mountain province
                        "hc-key": "ph-mt",
                        "value": 94
                    },
                    {
                        //quirino
                        "hc-key": "ph-qr",
                        "value": 95
                    },
                    {
                        //nueva ecija
                        "hc-key": "ph-ne",
                        "value": 96
                    },
                    {
                        //pampanga
                        "hc-key": "ph-pm",
                        "value": 97
                    },
                    {
                        //bataan
                        "hc-key": "ph-ba",
                        "value": 98
                    },
                    {
                        //benguet
                        "hc-key": "ph-bg",
                        "value": 99
                    },
                    {
                        //zambales
                        "hc-key": "ph-zm",
                        "value": 100
                    },
                    {
                        //cavite
                        "hc-key": "ph-cv",
                        "value": 101
                    },
                    {
                        //bulucan
                        "hc-key": "ph-bu",
                        "value": 102
                    },
                    {
                        //mindoro oriental
                        "hc-key": "ph-mr",
                        "value": 103
                    },
                    {
                        //siquijor
                        "hc-key": "ph-sq",
                        "value": 104
                    },
                    {
                        //guimaras
                        "hc-key": "ph-gu",
                        "value": 105
                    },
                    {
                        //catanduanes
                        "hc-key": "ph-ct",
                        "value": 106
                    },
                    {
                        //masbate
                        "hc-key": "ph-mb",
                        "value": 107
                    },
                    {
                        //marinduque
                        "hc-key": "ph-mq",
                        "value": 108
                    },
                    {
                        //biliran
                        "hc-key": "ph-bi",
                        "value": 109
                    },
                    {
                        //southern leyte
                        "hc-key": "ph-sl",
                        "value": 110
                    },
                    {
                        //negros oriental
                        "hc-key": "ph-nr",
                        "value": 111
                    },
                    {
                        //aklan
                        "hc-key": "ph-ak",
                        "value": 112
                    },
                    {
                        //capiz
                        "hc-key": "ph-cp",
                        "value": 113
                    },
                    {
                        //camarines norte
                        "hc-key": "ph-cn",
                        "value": 114
                    },
                    {
                        //sorsogon
                        "hc-key": "ph-sr",
                        "value": 115
                    },
                    {
                        //ilocos norte
                        "hc-key": "ph-in",
                        "value": 116
                    },
                    {
                        //ilocos sur
                        "hc-key": "ph-is",
                        "value": 117
                    },
                    {
                        //tarlac
                        "hc-key": "ph-tr",
                        "value": 118
                    },
                    {
                        //la union
                        "hc-key": "ph-lu",
                        "value": 119
                    }
                ];

                // Initiate the chart
                $('#container').highcharts('Map', {

                    title : {
                        text : 'Highmaps basic demo'
                    },

                    subtitle : {
                        text : 'Source map: <a href="https://code.highcharts.com/mapdata/countries/ph/ph-all.js">Philippines</a>'
                    },

                    mapNavigation: {
                        enabled: true,
                        buttonOptions: {
                            verticalAlign: 'bottom'
                        }
                    },

                    colorAxis: {
                        min: 0
                    },

                    series : [{
                        data : data,
                        mapData: Highcharts.maps['countries/ph/ph-all'],
                        joinBy: 'hc-key',
                        name: 'Random data',
                        states: {
                            hover: {
                                color: '#BADA55'
                            }
                        },
                        dataLabels: {
                            enabled: true,
                            format: '{point.name}'
                        }
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
            #container {
                width:calc(100% - 300px);
                float: left;
                height: 500px; 
                min-width: 310px; 
                max-width: 800px; 
                margin: 0 auto; 
                align-content: center
            }
            .loading {
                margin-top: 10em;
                text-align: center;
                color: gray;
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
                    <li class="active" >
                        <a href="salesHomeView.jsp">
                            Home
                           </a>
                    </li>
                    <li data-toggle="collapse" data-target="#products" class="collapsed">
                        <a href="#"><i class="fa fa-gift fa-lg"></i> Reports Library <span class="arrow"></span></a>
                    </li>
                    <li>
                    <ul class="sub-menu collapse" id="products">
                        <li><a href="salesAccntngCharts.jsp">Accounting</a></li>
                        <li><a href="salesInventoryCharts.jsp">Inventory</a></li>
                        <li><a href="salesSalesCharts.jsp">Sales</a></li>
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
        
        <!-- MAP -->
        <div id="main" class="col-md-9">
            <div id="container"></div>
       
            
            <div class="col-sm-3 sidenav">
                <div class="well">
                    <p><b>Reports for Approval</b></p>
                    <table class="table table-list-search">
                        <thead>
                            <tr>
                                <th>Report ID</th>
                                <th>Status</th>
                            </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td>123123213</td>
                                <td>Incomplete</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
         </div>
        
        <script src="https://code.highcharts.com/maps/highmaps.js"></script>
        <script src="https://code.highcharts.com/maps/modules/exporting.js"></script>
        <script src="https://code.highcharts.com/mapdata/countries/ph/ph-all.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/jquery-ui.min.js"></script>
   
        <link href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.9.2/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
        <link href="https://netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet" type="text/css" />

    </body>
</html>
