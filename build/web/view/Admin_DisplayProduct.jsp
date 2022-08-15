<%-- 
    Document   : Admin_manageProduct
    Created on : Mar 7, 2022, 3:44:09 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

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

    <body id="reportsPage">
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
        <div class="container mt-5">
            <div class="row tm-content-row">
                <div class="col-sm-12 col-md-12 col-lg-7 col-xl-7 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-products">
                        <div class="tm-product-table-container">
                            <table class="table table-hover tm-table-small tm-product-table">

                                <thead>
                                    <tr>
                                        <th scope="col">&nbsp;</th>
                                        <th scope="col">PRODUCT NAME</th>
                                        <th scope="col">IMPORT PRICE</th>
                                        <th scope="col">SALE PRICE</th>
                                        <th scope="col">UNIT IN STOCK</th>
                                        <th scope="col">DATE ADD</th>
                                    </tr>
                                </thead>
                                <c:forEach items="${listProduct}" var="pr">
                                    <tbody>
                                        <tr>
                                            <th scope="row"><input type="radio" /></th>
                                            <td id="${pr.productID}" name="${pr.productName}" class="tm-product-name">
                                                ${pr.productName}</td>
                                            <td>${pr.importPrice}</td>
                                            <td>${pr.sellPrice}</td>
                                            <td>${pr.numberOfInventory}</td>
                                            <td>${pr.dateAdd}</td>

                                            <td>
                                                <a href="AdminDeleteProduct?type=0&productID=${pr.productID}"
                                                   class="tm-product-delete-link">
                                                    <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                                </a>
                                            </td>
                                            <td>
                                                <a href="AdminUpdateProduct?type=0&productIdUpdate=${pr.productID}"
                                                   class="tm-product-delete-link">
                                                    <i class="	fas fa-edit fa-pen-to-square"></i></i>
                                                </a>
                                            </td>
                                        </tr>

                                    </tbody>
                                </c:forEach>
                            </table>
                        </div>
                        <!-- table container -->
                        <a href="AdminAddProduct" class="btn btn-primary btn-block text-uppercase mb-3">Add new product</a>
                        <button class="btn btn-primary btn-block text-uppercase">
                            <!--<a href="AdminDeleteProduct?type=0&&">  Delete selected products</a>-->
                        </button>
                    </div>
                </div>
                <div class="col-sm-12 col-md-12 col-lg-5 col-xl-5 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block tm-block-product-categories">
                        <h2 class="tm-block-title">Product Categories</h2>
                        <div class="tm-product-table-container">
                            <table class="table tm-table-small tm-product-table">

                                <thead>
                                    <!--                                    <tr>
                                                                                <th scope="col">Delete Category</th>
                                                                                <th scope="col">Category</th>
                                                                                <th scope="col" class="text-center">Type</th>
                                                                                <th scope="col">Delate Type</th>
                                        
                                                                            </tr>-->
                                </thead>
                                <tbody>
                                    <c:forEach items="${listType}" var="t">
                                        <c:if test="${t.parentId == 0}">

                                            <tr>
                                                <td rowspan="${t.numberTypeChild}">
                                                    <a href="AdminDeleteCategory?typeC=1&CategoryProductID=${t.typeId}" class="tm-product-delete-link">
                                                        <i class="far fa-trash-alt tm-product-delete-icon  "></i>
                                                    </a>
                                                </td>
                                                <td rowspan="${t.numberTypeChild}">${t.typeName}</td>
                                                <td>Type name </td>
                                                <td>Delete type</td>

                                            </tr>
                                            <c:forEach items="${listType}" var="tc">
                                                <c:if test="${tc.parentId != 0 && tc.parentId == t.typeId }">
                                                    <tr>
                                                        <td>${tc.typeName}</td>
                                                        <td>
                                                            <a href="AdminDeleteCategory?typeC=0&TypeProductID=${tc.typeId}&TypeName=${tc.typeName}" class="tm-product-delete-link">
                                                                <i class="far fa-trash-alt fa fa-remove "></i>
                                                            </a>
                                                        </td>
                                                    <tr>
                                                    </c:if>
                                                </c:forEach>
                                            </c:if>
                                        </c:forEach>



                                </tbody>
                            </table>
                        </div>
                        <!-- table container -->
                        <form action="AdminAddNewCategory" method="get">
                            <button type="submit" class="btn btn-primary btn-block text-uppercase mb-3">
                                Add new category
                            </button>
                        </form>
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

        <script src="${pageContext.request.contextPath}/view/Admin/js/jquery-3.3.1.min.js"></script>
        <!-- https://jquery.com/download/ -->
        <script src="${pageContext.request.contextPath}/view/Admin/js/bootstrap.min.js"></script>
        <!-- https://getbootstrap.com/ -->
        <!--        <script>
                        $(function () {
                            $(".tm-product-name").on("click", function () {
                                document.getElementById(id)	;
                                window.location.href = "view/Admin_UpdateProduct.jsp?productId=";
                            });
                        });
                    </script>-->
    </body>

</html>