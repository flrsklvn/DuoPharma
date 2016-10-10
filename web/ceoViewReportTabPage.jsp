<%@page import="Entities.Order"%>
<%@page import="DB.OrderDB"%>
<%@page import="DB.CustomerDB"%>
<%@page import="DB.ProductDB"%>
<%@page import="Entities.Product"%>
<%@page import="Entities.Account"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DB.AccountDB"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>CEO View Reports</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/1.2.0/list.min.js"></script>

        <style>


            /* Remove the navbar's default margin-bottom and rounded borders */
            .navbar {
                margin-bottom: 0;
                border-radius: 0;
            }









            .tabs-left > .nav-tabs {
                border-bottom: 0;
            }

            .tab-content > .tab-pane,
            .pill-content > .pill-pane {
                display: none;
            }

            .tab-content > .active,
            .pill-content > .active {
                display: block;
            }

            .tabs-left > .nav-tabs > li {
                float: none;
            }

            .tabs-left > .nav-tabs > li > a {
                min-width: 74px;
                margin-right: 0;
                margin-bottom: 3px;
            }

            .tabs-left > .nav-tabs {
                float: left;
                margin-right: 19px;
                border-right: 1px solid #ddd;
            }

            .tabs-left > .nav-tabs > li > a {
                margin-right: -1px;
                -webkit-border-radius: 4px 0 0 4px;
                -moz-border-radius: 4px 0 0 4px;
                border-radius: 4px 0 0 4px;
            }

            .tabs-left > .nav-tabs > li > a:hover,
            .tabs-left > .nav-tabs > li > a:focus {
                border-color: #eeeeee #dddddd #eeeeee #eeeeee;
            }

            .tabs-left > .nav-tabs .active > a,
            .tabs-left > .nav-tabs .active > a:hover,
            .tabs-left > .nav-tabs .active > a:focus {
                border-color: #ddd transparent #ddd #ddd;
                *border-right-color: #ffffff;


                table, th, td {
                    border: 1px solid black;
                    border-collapse: collapse;
                }
                th, td {
                    padding: 5px;
                }
                th {
                    text-align: left;




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
                <li class="active"><a href="ceoViewReportTabPage.jsp">Reports</a></li>
                <li><a href="dashboardCharts.jsp">Charts</a></li>
                <li><a href="#">DSS</a></li>
                <li><a href="#">Objective Setting</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
              </ul>
            </div>
          </div>
        </nav>


            <div class="tabbable tabs-left">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#accountingTab" data-toggle="tab">Accounting</a></li>
                    <li><a href="#inventoryTab" data-toggle="tab">Inventory</a></li>
                    <li><a href="#orderTab" data-toggle="tab">Order</a></li>

                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="accountingTab">                
                        <div class="">
                            <div class="col-md-9">
                                <table class="table table-list-search">
                                    <thead>
                                        <tr>
                                            <th>Name</th>
                                            <th>Account ID</th>
                                            <th>Due Date</th>
                                            <th>Aging Days</th>
                                            <th>Start Date</th>
                                            <th>Order ID</th>
                                        </tr>
                                    </thead>
                                    <tbody class="list">
                                        <%
                                            AccountDB allaccount = new AccountDB();
                                            ArrayList<Account> alist = allaccount.getAllAccountswithCustomerName();
                                        %>

                                        <%
                                            for (int j = 0; j < alist.size(); j++) {
                                        %>
                                        <tr>
                            <!-- HINDI PA RIN MAKUHA YUNG CUSTOMER NAME -->
                                            <td><%= alist.get(j).getCustomerName()%></td>
                                            <td><%= alist.get(j).getAccountID()%></td>
                                            <td class="name"><%= alist.get(j).getDueDate()%></td>
                                            <td><%= alist.get(j).getAgingDays()%></td>
                                            <td><%= alist.get(j).getStartDate()%></td>
                                            <td><%= alist.get(j).getOrderID()%></td>
                                        </tr>

                                        <% }
                                        %>
                                    </tbody>
                                </table>   
                            </div>


                        </div>
                    </div> 
                    <div class="tab-pane" id="inventoryTab"> 
                        <div class="">

                            <div class="col-md-9">
                                <table class="table table-list-search">
                                    <thead>
                                        <tr>
                                            <th>Name</th>
                                            <th>Product ID</th>
                                            <th>Price</th>
                                            <th>Quantity on Hand</th>
                                            <th>Shelf Life</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            ProductDB allproduct = new ProductDB();
                                            ArrayList<Product> plist = allproduct.getAllProducts();
                                        %>
                                        <%
                                            for (int i = 0; i < plist.size(); i++) {
                                        %>
                                        <tr>
                                            <td><%= plist.get(i).getName()%></td>
                                            <td><%= plist.get(i).getProductID()%></td>
                                            <td><%= plist.get(i).getPrice()%></td>
                                            <td><%= plist.get(i).getQuantityOnHand()%></td>
                                            <td><%= plist.get(i).getShelfLife()%></td>
                                        </tr>

                                        <% }
                                        %>
                                    </tbody>
                                </table>   
                            </div>
                        </div>
                    </div>

                    <div class="tab-pane" id="orderTab"> 
                        <div class="">
                            <div class="col-md-9">
                                <table class="table table-list-search"> <!-- put class list -->
                                    <thead>
                                        <tr>
                                            <th>Customer ID</th>
                                            <th>Product ID</th>
                                            <th>Order ID</th>
                                            <th>Quantity</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            OrderDB allorder = new OrderDB();
                                            ArrayList<Order> olist = allorder.getAllOrders();
                                        %>
                                        <%
                                            for (int k = 0; k < olist.size(); k++) {
                                        %>
                                        <tr>
                                            <td class="name"><%= olist.get(k).getOrderedBy()%></td>
                                            <td><%= olist.get(k).getProductOrdered()%></td>
                                            <td><%= olist.get(k).getOrderID()%></td>
                                            <td><%= olist.get(k).getQuantityOrdered()%></td>

                                        </tr>

                                        <% }
                                        %>  
                                    </tbody>
                                </table>   
                            </div>
                        </div>
                    </div>


                </div>
            </div>

            <script>

                var summary = {
                    valueNames: ['name', 'status', 'date']
                };
                var summaryList = new List('status', summary);


            </script>
        </body>
    </html>
