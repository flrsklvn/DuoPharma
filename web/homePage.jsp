<%-- 
    Document   : homePage
    Created on : 09 24, 16, 1:42:23 AM
    Author     : Klvn Flrs
--%>

<%@page import="Entities.Location"%>
<%@page import="DB.LocationDB"%>
<%@page import="Entities.Customer"%>
<%@page import="DB.CustomerDB"%>
<%@page import="DB.DBConnectionFactoryImp"%>
<%@page import="DB.DBConnectionFactory"%>
<%@page import="Entities.Product"%>
<%@page import="java.sql.*"%>
<%@page import="DB.ProductDB"%>
<%@page import="DB.OrderDB"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>DuoPharma Inc.</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/list.js/1.2.0/list.min.js"></script>

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

            /* The Modal (background) */
            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                padding-top: 100px; /* Location of the box */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }

            /* Modal Content */
            .modal-content {
                background-color: #fefefe;
                margin: auto;
                padding: 20px;
                border: 1px solid #888;
                width: 80%;
            }

            /* The Close Button */
            .close {
                color: #aaaaaa;
                float: right;
                font-size: 28px;
                font-weight: bold;
            }

            .close:hover,
            .close:focus {
                color: #000;
                text-decoration: none;
                cursor: pointer;
            }



            .dropbtn {
                background-color: #FFFFFF;
                color: white;
                font-size: 12px;
                cursor: pointer;
            }

            .dropbtn:hover, .dropbtn:focus {
                background-color: #000;
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                overflow: auto;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
            }

            .dropdown a:hover {background-color: #f1f1f1}

            .show {display:block;}











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
                    <a class="navbar-brand" href="homePage.jsp">Logo</a>
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

        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">Accounting</div>
                        <div class="panel-body"><img src="images/accounting.png" class="img-responsive" style="width:100%" alt="Image"></div>
                        <a href="isrAccountingReportPage.jsp"><div class="panel-footer"><button id="actBtn">View Report</button></div></a>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="panel panel-danger">
                        <div class="panel-heading">Inventory</div>
                        <div class="panel-body"><img src="images/inventory.png" class="img-responsive" style="width:100%" alt="Image"></div>
                        <a href="isrInventoryReportPage.jsp"> <div class="panel-footer"><button id="invBtn">View Report</button></div></a>
                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="panel panel-success">
                        <div class="panel-heading">Sales</div>
                        <div class="panel-body"><img src="images/sales.png" class="img-responsive" style="width:100%" alt="Image"></div>
                        <div class="panel-footer">
                            <!-- Trigger/Open The Modal -->
                            <button id="myBtn">Add Order</button>

                            <!-- The Modal -->
                            <div id="myModal" class="modal">

                                <!-- Modal content -->
                                <div class="modal-content">
                                    <span class="close">×</span>

                                    <p><select name = "typeOfCustomer" required>
                                            <option value = "">Select the Type Of Customer</option>
                                            <option value = "1">Existing Customer</option>
                                            <option value = "2">New Customer</option>
                                            
                                        </select>
                                    </p>
                                    
                                    
                                    <div id="div3" style="display:none">
                                                    
                                                        <td>Due Date: </td>
                                                        <td><input  id="mopDate" type="date" name="mopDate" max="2016-12-31" required></td>
                                                        
                                                   
                                                </div>
                                    <div id="div1" style="display:none">  <form name="addOrderForm" action="${pageContext.request.contextPath}/addOrderServlet" method="POST">
                                            <table border="0">

                                                <tbody >
                                                    <tr>
                                                        <td>Date: </td>
                                                        <td><input  id="orderDateName" type="date" name="orderDate" max="2016-12-31" required></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>

                                                        <td>Customer Name: </td>
                                                        <td>  <%
                                                            CustomerDB allcustomers = new CustomerDB();
                                                            ArrayList<Customer> customerList = allcustomers.getAllCustomers();
                                                            System.out.println(customerList.size());
                                                            %>


                                                            <select name="orderedBy" required>
                                                                <option value="">Select a Customer</option>
                                                                <%    for (int i = 0; i < customerList.size(); i++) {%>



                                                                <option value="<%= customerList.get(i).getCustomerID()%>"><%= customerList.get(i).getCustomerName()%></option>
                                                                <%}%>
                                                                

                                                            </select>  </td>  

                                                    </tr>
                                                    <tr>
                                                        <td>Product: </td>


                                                        <td>
                                                            <%
                                                                ProductDB allproduct = new ProductDB();
                                                                ArrayList<Product> list = allproduct.getAllProducts();
                                                            %>

                                                            <select name="productOrdered"  id="productOrdered" required>
                                                                <option value="">Select a Product</option>
                                                                <%    for (int i = 0; i < list.size(); i++) {%>



                                                                <option value="<%= list.get(i).getProductID()%>"><%= list.get(i).getName()%></option>
                                                                <%}%>
                                                              

                                                            </select>  

                                                        </td>
                                                        <td>Quantity: </td>
                                                        <td><input min="0" id="quantityOrdered" type="number" pattern=" 0+\.[0-9]*[1-9][0-9]*$" name="quantityOrdered" onkeypress="return event.charCode >= 48 && event.charCode <= 57" required</input></td>



                                                    </tr>
                                                    
                                                    <tr>
<!--                                                        <td>Mode Of Payment: </td>
                                                        <td><select name = "modeOfPayment" required>
                                            <option value = "0">Select the Mode of Payment</option>
                                            <option value = "1">Cash-On Delivery</option>
                                            <option value = "2">On Account</option>
                                            
                                        </select></td>-->
                                             <p><select name = "modeOfPayment" required>
                                            <option value = "0">Select the Mode of Payment</option>
                                            <option value = "1">Cash-On Delivery</option>
                                            <option value = "2">On Account</option>
                                            
                                        </select>
                                    </p>
                                                    
                                                        
                                                   


                                                    <tr>

                                                        <td><input type="submit" value="Confirm" name="confirmButton" action="addOrderServlet.java"/></td>
                                                        <td>  </td>
                                                        <td><input type="reset" value="Clear Form" name="clearForm" /></td>

                                                    </tr>
                                                    
                                                    <tr>


                                                    </tr>

                                                </tbody>
                                            </table>


                                        </form></div>
                                                                    
                                    <div id="div2" style="display:none">
                                        <form name="addCustomerForm" action="${pageContext.request.contextPath}/addCustomerServlet" method="POST">
                                            
                                            <table border="0">
                                                <% 
                                                
                                                
                                                
                                                
                                                %>
                                                <tbody>
                                                    <tr>
                                                        <td>Customer ID </td>
                                                        <td><input type="text" name="customerID" value="" size="45" required/></td>
                                                        <td></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Customer Name: </td>
                                                        <td><input type="text" name="customerName" value="" size="45" required/></td>
                                                        <td></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Phone Number: </td>
                                                        <td><input type="text" name="phoneNo" value="" size="45" required/></td>
                                                        <td></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Customer Type: </td>
                                                        <td><select name="type" required>
                                                                <option>Direct Sales</option>
                                                                <option>Distribution Sales</option>

                                                            </select></td>
                                                        <td></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>
                                                        <td>Customer Location: </td>
                                                        <td>  <%
                                                            LocationDB alllocation = new LocationDB();
                                                            ArrayList<Location> locationList = alllocation.getAllLocations();
                                                            System.out.println(locationList.size());
                                                            %>


                                                            <select name="location" required>
                                                                <option value="">Select a Location</option>
                                                                <%    for (int i = 0; i < locationList.size(); i++) {%>



                                                                <option value="<%= locationList.get(i).getLocationID()%>"><%= locationList.get(i).getName()%></option>
                                                                <%}%>
                                                                <option><%= locationList.size()%></option>

                                                            </select>  </td> 
                                                        <td></td>
                                                        <td></td>
                                                    </tr>
                                                    <tr>
                                                        <td><input type="submit" value="Register" name="registerButton" action="addCustomerServlet.java"/></td>
                                                        <td></td>
                                                        <td></td>
                                                        <td></td>
                                                    </tr>

                                                </tbody>
                                            </table>
                                       <% 
                                       OrderDB order = new OrderDB();
                                       ProductDB prod = new ProductDB();
                                       
                                       
                                       
                                       
                                       
                                       %>

                                        </form>
                                    </div>

                                </div>



                            </div>    







                        </div>









                    </div>
                </div>
            </div>
        </div><br>

        <br><br>


        <script>
            // Get the modal
            var modal = document.getElementById('myModal');
            // Get the button that opens the modal
            var btn = document.getElementById("myBtn");
            // Get the <span> element that closes the modal
            var span = document.getElementsByClassName("close")[0];
            // When the user clicks the button, open the modal
            btn.onclick = function () {
                modal.style.display = "block";
            }

            // When the user clicks on <span> (x), close the modal
            span.onclick = function () {
                modal.style.display = "none";
            }

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }



            // DROPDOWN

            /* When the user clicks on the button,
             toggle between hiding and showing the dropdown content */
            function myFunction() {
                document.getElementById("myDropdown").classList.toggle("show");
            }

            // Close the dropdown if the user clicks outside of it
            window.onclick = function (event) {
                if (!event.target.matches('.dropbtn')) {

                    var dropdowns = document.getElementsByClassName("dropdown-content");
                    var i;
                    for (i = 0; i < dropdowns.length; i++) {
                        var openDropdown = dropdowns[i];
                        if (openDropdown.classList.contains('show')) {
                            openDropdown.classList.remove('show');
                        }
                    }
                }
            }

            function addRow(btn) {
                var parentRow = btn.parentNode.parentNode;
                var table = parentRow.parentNode;
                var rowCount = table.rows.length;

                var row = table.insertRow(rowCount);

                var cell1 = row.insertCell(0);
                var element1 = document.createElement("select");
                element1.type = "text";
                cell1.appendChild(element1);

                var array = new Array();
                var plist = new ProductDB();
                plist.getAllProducts();
                for (var j = 0; j < plist.getAllProducts().size(); j++) {
                    var product = plist.getAllProducts().get(i);
                    array.push(product);

                }
                for (var i = 0; i < array.length; i++) {
                    var option = document.createElement("option");
                    // option.value = array[i].getName();
                    option.text = array[i].getName();
                    selectList.appendChild(option);
                }


            }


            var summary = {
                valueNames: ['name', 'status', 'date']
            };
            var summaryList = new List('status', summary);

//
//            function showfield(name) {
//                if (name == 'Existing') {
//                    document.getElementById('div1').innerHTML = 'Other: <input type="text" name="other" />';
//
//                } else
//                    document.getElementById('div1').innerHTML = '';
//            }

            
            $('select[name=typeOfCustomer]').change(function () {
                if ($(this).val() != '') {
                    $('#div2').hide();
                    $('#div1').hide();
                }
                 if ($(this).val() != '1') {
                    $('#div2').show();
                    $('#div1').hide();
                }
                    
                
                if ($(this).val() != '2') {
                    $('#div1').show();
                    $('#div2').hide();
                } 
             
                
            });
            
            $('select[name=modeOfPayment]').change(function () {
                if ($(this).val() != '1') {
                    $('#div3').show();
         
                }
                if ($(this).val() != '2') {
                    $('#div3').hide();
         
                }
                
                
            });

         



        </script>








    </body>
</html>

