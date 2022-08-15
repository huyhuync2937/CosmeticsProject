<%-- 
    Document   : Admin_DisplayAccountUser
    Created on : Mar 13, 2022, 9:20:42 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
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
                        <li class="nav-item">
                            <a class="nav-link active" href="AdminDisplayProduct">
                                <i class="fas fa-shopping-cart"></i> Products
                            </a>
                        </li>


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
        <div class="col-12 tm-block-col">
            <div class="tm-bg-primary-dark tm-block tm-block-taller tm-block-scroll">
                <h2 class="tm-block-title">Orders List</h2>
                <table class="table">
                    <thead>

                        <tr>
                            <th scope="col">User name </th>
                            <th scope="col">Adddress</th>
                            <th scope="col">Birthday</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Email</th>
                            <th scope="col">Admin</th>
                            <th scope="col">Delete</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listAccount}" var="la">
                            <tr>
                                <th scope="row"><b>${la.name}</b></th>
                                <td>${la.address}</td>
                                <td><b>${la.birthday}</b></td>
                                <td><b>${la.phone}</b></td>
                                <td><b>${la.email}</b></td>
                                <td>
                                    <select onchange="window.location.href=this.value;" class="custom-select tm-select-accounts" id="category">
                                       
                                        <c:if test="${la.isAdmin ==1}">
                                            <option value="AdminChangeIsAdmin?type=1&accountID=${la.customerId}" selected="">Admin </option>
                                            <option value="AdminChangeIsAdmin?type=0&accountID=${la.customerId}">Customer</option>

                                        </c:if>
                                        <c:if test="${la.isAdmin ==0}">
                                            <option value="AdminChangeIsAdmin?type=1&accountID=${la.customerId}" >Admin</option>
                                            <option value="AdminChangeIsAdmin?type=0&accountID=${la.customerId}" selected="">Customer</option>

                                        </c:if>
                                    </select>
                                </td>
                                <td> 
                                    <a href="AdminDeleteAccount?accountID=${la.customerId}"
                                       class="tm-product-delete-link">
                                        <i class="far fa-trash-alt tm-product-delete-icon"></i>
                                    </a>
                                </td>
                               
                            </tr>
                        </c:forEach>

                    </tbody>
                </table>
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

    </body>

</html>
