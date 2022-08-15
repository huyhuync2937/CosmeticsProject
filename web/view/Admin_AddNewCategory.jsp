<%-- 
    Document   : Admin_AddNewCategory
    Created on : Mar 11, 2022, 11:28:59 AM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Product Page - Admin HTML Template</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700" />
        <!-- https://fonts.google.com/specimen/Roboto -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/view/Admin/css/fontawesome.min.css" />
        <!-- https://fontawesome.com/ -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/view/Admin/css/bootstrap.min.css" />
        <!-- https://getbootstrap.com/ -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/view/Admin/css/templatemo-style.css">
        <!--
                  Product Admin CSS Template
                  https://templatemo.com/tm-524-product-admin
        -->
    </head>
</head>

<body>
    <nav class="navbar navbar-expand-xl">
        <div class="container h-100">
            <a class="navbar-brand" href="index.html">
                <h1 class="tm-site-title mb-0">Product Admin</h1>
            </a>
            <button class="navbar-toggler ml-auto mr-0" type="button" data-toggle="collapse"
                    data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                <i class="fas fa-bars tm-nav-icon"></i>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mx-auto h-100">
                    <li class="nav-item">
                        <a class="nav-link" href="index.html">
                            <i class="fas fa-tachometer-alt"></i> Dashboard
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <!--                        <li class="nav-item dropdown">
                                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                                                       aria-haspopup="true" aria-expanded="false">
                                                        <i class="far fa-file-alt"></i>
                                                        <span> Reports <i class="fas fa-angle-down"></i> </span>
                                                    </a>
                                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                                        <a class="dropdown-item" href="#">Daily Report</a>
                                                        <a class="dropdown-item" href="#">Weekly Report</a>
                                                        <a class="dropdown-item" href="#">Yearly Report</a>
                                                    </div>
                                                </li>-->
                    <li class="nav-item">
                        <a class="nav-link active" href="AdminDisplayProduct">
                            <i class="fas fa-shopping-cart"></i> Products
                        </a>
                    </li>

                    <!--                        <li class="nav-item">
                                                    <a class="nav-link" href="accounts.html">
                                                        <i class="far fa-user"></i> Accounts
                                                    </a>
                                                </li>
                                                <li class="nav-item dropdown">
                                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                                                       aria-haspopup="true" aria-expanded="false">
                                                        <i class="fas fa-cog"></i>
                                                        <span> Settings <i class="fas fa-angle-down"></i> </span>
                                                    </a>
                                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                                        <a class="dropdown-item" href="#">Profile</a>
                                                        <a class="dropdown-item" href="#">Billing</a>
                                                        <a class="dropdown-item" href="#">Customize</a>
                                                    </div>
                                                </li>-->
                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link d-block" href="DisplayNewProduct">
                            Admin, <b>Logout</b>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container tm-mt-big tm-mb-big">
        <div class="row">
            <div class="col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto">
                <div class="tm-bg-primary-dark tm-block tm-block-h-auto">
                    <div class="row">
                        <div class="col-12">
                            <h2 class="tm-block-title d-inline-block">Add category</h2>
                        </div>
                    </div>
                    <div class="row tm-edit-product-row">
                        <div class="col-xl-6 col-lg-6 col-md-12">
                            <form action="AdminAddNewCategory" method="post" class="tm-edit-product-form">
                                <div class="form-group mb-3">
                                    <label for="name">Add new category
                                    </label>
                                    <input id="name" name="categoryNew" type="text" class="form-control validate"  />
                                </div>
                                 <c:if test="${check1 == false}">
                                    <div  style="color: red;text-align: center">${mes1}</div>
                                </c:if>
                                <button type="submit" class="btn btn-primary btn-block text-uppercase">Add new
                                    category</button>
                            </form>

                        </div>
                        <div class="col-xl-6 col-lg-6 col-md-12 mx-auto mb-4">
                            <form action="AdminAddNewType" method="post" class="tm-edit-product-form">
                                <input name="type" value="1" hidden="">

                                <div class="form-group mb-3">
                                    <div class="form-group mb-3">
                                        <label for="name">Add new type of Category</label>
                                        <select name="categoryParent" class="custom-select tm-select-accounts" id="category">
                                            <c:forEach items="${listType}" var="pr" >
                                                <option value="${pr.typeId}">${pr.typeName}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <label for="name">Add new type of Category
                                    </label>
                                    <input id="name" name="typeNew" type="text" class="form-control validate"  />
                                </div>
                                <c:if test="${check2 == false}">
                                    <div style="color: red;text-align: center">${mes2}</div>
                                </c:if>
                                <button type="submit" class="btn btn-primary btn-block text-uppercase">Add new
                                    type</button>
                            </form>
                        </div>
                        <!-- <div class="col-12">
              <button type="submit" class="btn btn-primary btn-block text-uppercase">Add Product Now</button>
            </div> -->

                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="tm-footer row tm-mt-small">
        <div class="col-12 font-weight-light">
            <p class="text-center text-white mb-0 px-4 small">
                Copyright &copy; <b>2018</b> All rights reserved.

                Design: <a rel="nofollow noopener" href="https://templatemo.com" class="tm-footer-link">Template Mo</a>
            </p>
        </div>
    </footer>

    <!--    <script src="js/jquery-3.3.1.min.js"></script>
         https://jquery.com/download/ 
        <script src="jquery-ui-datepicker/jquery-ui.min.js"></script>
         https://jqueryui.com/download/ 
        <script src="js/bootstrap.min.js"></script>
         https://getbootstrap.com/ -->

</body>
</html>
