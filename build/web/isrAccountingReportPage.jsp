<%@page import="DB.AccountDB"%>
<%@page import="Entities.Account"%>
<%@page import="Entities.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DB.ProductDB"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Accounting ISR</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>





    <style>
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-bottom: 0;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
    </style>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Logo</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="homePage.jsp">Home</a></li>
                        <li><a href="#">Products</a></li>
                        <li><a href="#">Deals</a></li>
                        <li><a href="#">Stores</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="col-md-10">
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
                <tbody>
                    <% AccountDB allaccount = new AccountDB();
                        ArrayList<Account> list = allaccount.getAllAccount();


                        for (int j = 0; j < list.size(); j++) {
                    %>
                    <tr>
                 <%--  GETTING THE ACCOUNT NAME THROUGH ACCOUNT ID     <td><%= list.get(j).getAccountID().getName()%></td>   --%>
                        <td>Account Name</td> <%-- TO BE DELETED AFTER GETTING THE ACCOUNT NAME --%>
                        <td><%= list.get(j).getAccountID()%></td>
                        <td><%= list.get(j).getDueDate()%></td>
                        <td><%= list.get(j).getAgingDays()%></td>
                        <td><%= list.get(j).getStartDate()%></td>
                        <td><%= list.get(j).getOrderID()%></td>
                    </tr>

                    <% }
                    %>
                </tbody>
            </table>   























    </body>
</html>
