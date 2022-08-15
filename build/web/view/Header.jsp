z<%-- 
    Document   : header
    Created on : Feb 19, 2022, 2:26:14 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>ATP Cosmetics Shop </title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
              rel="stylesheet">

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="/fontlib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="${pageContext.request.contextPath}/view/css/style.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row bg-secondary py-2 px-xl-5">
                <div class="col-lg-6 d-none d-lg-block">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-dark" href="">FAQs</a>
                        <span class="text-muted px-2">|</span>
                        <a class="text-dark" href="">Help</a>
                        <span class="text-muted px-2">|</span>
                        <a class="text-dark" href="">Support</a>
                    </div>
                </div>
                <div class="col-lg-6 text-center text-lg-right">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a class="text-dark px-2" href="">
                            <i class="fab fa-instagram"></i>
                        </a>
                        <a class="text-dark pl-2" href="">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="row align-items-center py-3 px-xl-5">
                <div class="col-lg-3 d-none d-lg-block">
                    <a href="DisplayNewProduct" class="text-decoration-none">
                        <h1 class="m-0 display-5 font-weight-semi-bold"><span
                                class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                    </a>
                </div>
                <div class="col-lg-6 col-6 text-left">
                    <form action="ProcessSearchAndPaging" method="Post">
                        <div class="input-group">
                            <input name="stringSearch" type="text" class="form-control" placeholder="Search for products">
                            <div class="input-group-append">
                                <button class="input-group-text bg-transparent text-primary" type="submit" >
                                    <i class="fa fa-search"></i>
                                </button>

                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-lg-3 col-6 text-right">
                    <a href="" class="btn border">
                        <i class="fas fa-heart text-primary"></i>
                        <span class="badge">0</span>
                    </a>
                    <a href="DisplayCart" class="btn border">
                        <i class="fas fa-shopping-cart text-primary"></i>
                        <span class="badge"></span>
                    </a>
                </div>
            </div>
        </div>
        <div style="margin-top:2%;" class="container-fluid ">
            <div style="padding-left: 0 !important;padding-right: 0 !important;" class=" border-top px-xl-5">

                <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                    <a href="" class="text-decoration-none d-block d-lg-none">
                        <h1 class="m-0 display-5 font-weight-semi-bold"><span
                                class="text-primary font-weight-bold border px-3 mr-1">E</span>Shopper</h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div style="margin-top:2%;margin-bottom:2%;" class="collapse navbar-collapse justify-content-between"
                         id="navbarCollapse">

                        <ul>

                            <li class=" dropdown-1">
                                <a href="DisplayNewProduct" id="button-home-1" class="nav-link" >Home</a>

                            </li>
                            <c:forEach items="${sessionScope.listCategory}" var="lc">
                                <c:if test="${lc.parentId eq 0}">
                                    <li class=" dropdown-1">
                                        <a href="" style="color:#A29896; border:3px solid #FFF8F8" class="nav-link"
                                           data-toggle="dropdown">${lc.typeName}</a>
                                        <div class=" dropdown-content  ">
                                            <c:forEach items="${sessionScope.listCategory}" var="lcc">
                                                <c:if test="${lcc.parentId eq lc.typeId}">
                                                    <a href="ProcessSearchAndPaging?type=1&typeID=${lcc.typeId}" class="a-drop ">${lcc.typeName}</a>
                                                </c:if>
                                            </c:forEach>
                                        </div>
                                    </li>
                                </c:if>
                            </c:forEach>
                        </ul>
                        <c:if test="${sessionScope.customerId == null}">
                            <div  style="width: 20%;margin-left:0 !important" class="navbar-nav ml-auto py-0">
                                <a href="LoginAccount" class="nav-item nav-link">Login</a>
                                <a style="max-width: 100%;" href="SignUpAccount" class="nav-item nav-link">Sign Up</a>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.customerId != null}">
                            <div  style="width: 20%;margin-left:0 !important" class="navbar-nav ml-auto py-0">
                                <!--<div style="margin-right: 200px" >${sessionScope.customerName}</div>-->
                                <a href="DisplayInformationCustomer" class="nav-item nav-link">Hello, ${sessionScope.customerName}</a>

                                <a href="LogOutAccount" class="nav-item nav-link">Log out</a>
                            </div>
                        </c:if>
                    </div>
                </nav>


            </div>
        </div>
        <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>
    </body>
</html>
