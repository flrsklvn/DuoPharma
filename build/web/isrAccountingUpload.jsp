<%-- 
    Document   : isrview
    Created on : 10 6, 16, 3:06:38 PM
    Author     : mvcalsado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>ISR View</title>

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
            /* layout.css Style */
            .upload-drop-zone {
                height: 200px;
                border-width: 2px;
                margin-bottom: 20px;
            }

            /* skin.css Style*/
            .upload-drop-zone {
                color: #ccc;
                border-style: dashed;
                border-color: #ccc;
                line-height: 200px;
                text-align: center
            }
            .upload-drop-zone.drop {
                color: #222;
                border-color: #222;
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
                          Home
                        </a>
                    </li>
                    <li data-toggle="collapse" data-target="#products" class="collapsed active">
                        <a href="#"><i class="fa fa-gift fa-lg"></i> Upload Facility <span class="arrow"></span></a>
                    </li>
                    <li>
                    <ul class="sub-menu collapse" id="products">
                        <li><a href="isrAccountingUpload.jsp" class="active">Accounting</a></li>
                        <li><a href="isrInventoryUpload.jsp">Inventory</a></li>
                        <li><a href="isrSalesUpload.jsp">Sales</a></li>

                    </ul>
                    <li data-toggle="collapse" data-target="#service" class="collapsed">
                        <a href="#"><i class="fa fa-globe fa-lg"></i> Reports Library <span class="arrow"></span></a>
                    </li>
                    <li>
                    <ul class="sub-menu collapse" id="service">
                        <li>Accounting</li>
                        <li>Inventory</li>
                        <li>Sales</li>
                    </ul>                 
                </ul>
            </div>
        </div>
        <div class="container" id="main">
            <div class="row">
                <div class="col-md-12">

                    <div class="panel panel-default">
                        <div class="panel-heading"><strong>Upload Accounting File</strong></div>
                        <div class="panel-body">

                            <!-- Standar Form -->
                            <h4>Select files from your computer</h4>
                            <form action="${pageContext.request.contextPath}/UploadAccountingServlet" method="post" enctype="multipart/form-data" id="js-upload-form">
                                <div class="form-inline">
                                    <div class="form-group">
                                        <input type="file" name="files[]" id="js-upload-files" multiple>
                                    </div>
                                    <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit"><a href="isrAfteruploadAccounting.jsp">Upload files</a></button>
                                </div>
                                </form>

           

                        </div>
                    </div>
                </div> <!-- /container -->
            </div>
        </div>


        <script>
            +function ($) {
                'use strict';

                // UPLOAD CLASS DEFINITION
                // ======================

                var uploadForm = document.getElementById('js-upload-form');

                var startUpload = function (files) {
                    console.log(files)
                }

                uploadForm.addEventListener('submit', function (e) {
                    var uploadFiles = document.getElementById('js-upload-files').files;
                    e.preventDefault()

                    startUpload(uploadFiles)
                })

                dropZone.ondrop = function (e) {
                    e.preventDefault();
                    this.className = 'upload-drop-zone';

                    startUpload(e.dataTransfer.files)
                }

                dropZone.ondragover = function () {
                    this.className = 'upload-drop-zone drop';
                    return false;
                }

                dropZone.ondragleave = function () {
                    this.className = 'upload-drop-zone';
                    return false;
                }

            }(jQuery);
        </script>

    </body>

</html>
