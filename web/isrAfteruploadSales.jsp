<%-- 
    Document   : isrview
    Created on : 10 6, 16, 3:06:38 PM
    Author     : mvcalsado
--%>

<%@page import="DB.SalesDB"%>
<%@page import="Entities.Sales"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Sales Report Summary</title>

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
        </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
               
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><span class="glyphicon glyphicon-user"></span> ISR </a></li>
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
                        <a href="isrview.jsp">
                            <i class="fa fa-dashboard fa-lg"></i> Home
                        </a>
                    </li>
                    <li data-toggle="collapse" data-target="#products" class="collapsed active">
                        <a href="#"><i class="fa fa-gift fa-lg"></i> Upload Facility <span class="arrow"></span></a>
                    </li>
                    
                    <li>
                    <ul class="sub-menu collapse" id="products">
                          <li><a href="isrAccountingUpload.jsp">Accounting</a></li>
                        <li><a href="isrInventoryUpload.jsp">Inventory</a></li>
                        <li><a href="isrSalesUpload.jsp" class="active">Sales</a></li>
                    </ul>
                    </li>
                    <li data-toggle="collapse" data-target="#service" class="collapsed">
                        <a href="#"><i class="fa fa-globe fa-lg"></i> Reports Library <span class="arrow"></span></a>
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
        <div class="container" id="main">
            <div class="row">
                <div class="col-md-12">
                    <center><h4>Sales Report Summary</h4></center>
                    <form action="${pageContext.request.contextPath}/UploadSalesForApprovalServlet" method="post">
                    <table class="table table-list-search">
                          
                        <thead>
                            <tr>
                                <th>Amount</th>
                                <th>Created by</th>
                                <th>Location</th>
                            
                      


                            </tr>
                        </thead>
                        <%
                        ArrayList<Sales> sales = (ArrayList<Sales>) request.getAttribute("arrSales");
                        SalesDB salesDB = new SalesDB();
                        
                      %>
                        <tbody>
                            
                                 <%    for(int k=0; k<sales.size(); k++){%>
                                 <tr>
                                <td><%= sales.get(k).getSalesAmmount()%></td>
                                <td><%= sales.get(k).getCreatedBy()%></td>
                                <td><%= sales.get(k).getLocation()%></td>
                                 </tr>
                              <%   
                             }%>
                             
                        </tbody>
                          
                    </table>
                       <%--      <%    for(int i=0; i<sales.size(); i++){
                                salesDB.addSales(sales.get(i));
                            
                          }%> --%>
                              <button type="submit" id="js-upload-submit">Submit For Approval</button>
                    </form>
                    
               
                </div>
            </div>
        </div>
    
    </body>
</html>
