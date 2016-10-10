<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnectionFactoryImp"%>
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
        <title>Inventory ISR</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/1.2.0/list.min.js"></script>
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


        <div class="col-md-10" id="my-cool-sortable-table-wrapper">
            <table class="table table-list-search">
                <thead>
                    <tr>

                        <th>Name <button class="sort glyphicon glyphicon-chevron-down" data-sort="name"></button></th>
                        <th>Product ID <button class="sort glyphicon glyphicon-chevron-down" data-sort="prodID"></button></th>
                        <th>Price <button class="sort glyphicon glyphicon-chevron-down" data-sort="price"></button></th>
                        <th>Quantity on Hand <button class="sort glyphicon glyphicon-chevron-down" data-sort="qoh"></button></th>
                        <th>Shelf Life <button class="sort glyphicon glyphicon-chevron-down" data-sort="sl"></button></th>

                    </tr>
                </thead>
                <tbody class="list">
                    <%
                      
                         ProductDB allproduct = new ProductDB();
                        
                       
                        ArrayList<Product> list = allproduct.getAllProducts();
                        
                        
                        for (int j = 0; j < list.size(); j++) {
                    %>
                    <tr>
                        <td class="name"><%= list.get(j).getName()%></td>
                        <td class="prodID"><%= list.get(j).getProductID()%></td>
                        <td class="price"><%= list.get(j).getPrice()%></td>
                        <td class="qoh"><%= list.get(j).getQuantityOnHand()%></td>
                        <td class="sl"><%= list.get(j).getShelfLife()%></td>
                    </tr>

                    <% }
                    %>

                </tbody>
            </table>   
        </div>
<script src="//cdnjs.cloudflare.com/ajax/libs/list.js/1.1.1/list.min.js"></script>
<script type="text/javascript">
    var options = {
        valueNames: [ 'name', 'prodID', 'price', 'qoh', 'sl' ]
    };
    var contactList = new List('my-cool-sortable-table-wrapper', options);
</script>
            


    </body>
</html>
