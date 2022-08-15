<%-- 
    Document   : Home
    Created on : Feb 17, 2022, 10:02:14 AM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>ATP Cosmectics</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
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
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="${pageContext.request.contextPath}/view/css/style.css" type="text/css" rel="stylesheet">

        <!-- <link href="bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet"> -->
    </head>

    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div id="header-carousel" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active" style="height: 410px;">
                        <img class="img-fluid" src="img/senka-logo.jpg" alt="Image">
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                            <div class="p-3" style="max-width: 100%;">
                                <h4 class="text-light text-uppercase font-weight-medium mb-3">10% Off Your First
                                    Order</h4>
                                <h3 class="display-4 text-white font-weight-semi-bold mb-4">Fashionable Dress</h3>
                                <a href="" class="btn btn-light py-2 px-3">Shop Now</a>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item" style="height: 410px;">
                        <img class="img-fluid" src="https://www.google.com.vn/imgres?imgurl=https%3A%2F%2Fcdn.diemnhangroup.com%2Fthegioilamdep%2F946ed07aa3013224f8b357c1796c20d4.jpeg&imgrefurl=https%3A%2F%2Fthegioilamdep.vn%2Fsan-pham%2Fsua-tam-xich-y-tesori-doriente-huong-sen-thom-mat-500ml%2F&tbnid=nn68cQHCux-Z0M&vet=12ahUKEwiQ3bnZmLf2AhVa_jgGHQ0OAtIQMygCegUIARC2AQ..i&docid=eYfDjm0vCwLdJM&w=800&h=800&q=t%C3%A1c%20d%E1%BB%A5ng%20s%E1%BB%AFa%20t%E1%BA%AFm%20x%C3%ADch%20%C3%BD%20tesori&hl=vi&authuser=0&ved=2ahUKEwiQ3bnZmLf2AhVa_jgGHQ0OAtIQMygCegUIARC2AQ" alt="Image">
                        <div class="carousel-caption d-flex flex-column align-items-center justify-content-center">
                            <div class="p-3" style="max-width: 100%;">
                                <h4 class="text-light text-uppercase font-weight-medium mb-3">10% Off Your First
                                    Order</h4>
                                <h3 class="display-4 text-white font-weight-semi-bold mb-4">Reasonable Price</h3>
                                <a href="" class="btn btn-light py-2 px-3">Shop Now</a>
                            </div>
                        </div>
                    </div>

                </div>
                <a class="carousel-control-prev" href="#header-carousel" data-slide="prev">
                    <div class="btn btn-dark" style="width: 45px; height: 45px;">
                        <span class="carousel-control-prev-icon mb-n2"></span>
                    </div>
                </a>
                <a class="carousel-control-next" href="#header-carousel" data-slide="next">
                    <div class="btn btn-dark" style="width: 45px; height: 45px;">
                        <span class="carousel-control-next-icon mb-n2"></span>
                    </div>
                </a>
            </div>
            <!-- Topbar Start -->

            <!-- Navbar End -->



            <!-- Conten -->
            <div class="container-fluid pt-5">
                <div class="text-center mb-4">
                    <h2 class="section-title px-5"><span class="px-2">New Products</span></h2>
                </div>
                <div class="row px-xl-5 pb-3">
                <c:forEach items="${requestScope.productNewAdd}" var="pr">
                    <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                        <div class="card product-item border-0 mb-4">
                            <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                <img class="img-fluid w-100" src="${pageContext.request.contextPath}${pr.image}" alt="${pr.productName}">
                            </div>
                            <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                <h6 class="text-truncate mb-3">${pr.productName}</h6>


                                <div class="d-flex justify-content-center">
                                    <h6>${pr.sellPrice}</h6>
                                    <!--<h6 class="text-muted ml-2"><del></del></h6>-->
                                </div>
                            </div>
                            <div class="card-footer d-flex justify-content-between bg-light border">
                                <a href="DisplayDetailProduct?type=1&Detail=${pr.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-eye text-primary mr-1"></i>View Detail</a>
                                <c:if test="${pr.numberOfInventory == 0}">
                                    <a  class="btn btn-sm text-dark p-0"><i class="fas fa-shopping-cart text-primary mr-1"></i>Out of stock</a>

                                </c:if>
                                <c:if test="${pr.numberOfInventory != 0}">
                                    <a href="AddProductToCart?type=1&AddCartProductID=${pr.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-shopping-cart text-primary mr-1"></i>Add To Cart</a>

                                </c:if>

                            </div>

                        </div>
                    </div>
                </c:forEach>

            </div>
            <div class="text-center mb-4">
                <h2 class="section-title px-5"><span class="px-2">Best Seller</span></h2>
            </div>
            <div class="row px-xl-5 pb-3">
                <c:forEach items="${listBestSell}" var="ls">
                    <div class="col-lg-3 col-md-6 col-sm-12 pb-1">
                        <div class="card product-item border-0 mb-4">
                            <div class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                <img class="img-fluid w-100" src="${pageContext.request.contextPath}${ls.image}" alt="">
                            </div>
                            <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                <h6 class="text-truncate mb-3">${ls.productName}</h6>
                                <div class="d-flex justify-content-center">
                                    <h6>${pr.sellPrice}</h6>
                                    <!--<h6 class="text-muted ml-2"><del>$123.00</del></h6>-->
                                </div>
                            </div>
                            <div class="card-footer d-flex justify-content-between bg-light border">
                                <a href="DisplayDetailProduct?type=1&Detail=${ls.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-eye text-primary mr-1"></i>View Detail</a>
                                <c:if test="${ls.numberOfInventory == 0}">
                                    <a  class="btn btn-sm text-dark p-0"><i class="fas fa-shopping-cart text-primary mr-1"></i> Out of stock</a>

                                </c:if>
                                <c:if test="${ls.numberOfInventory != 0}">
                                    <a href="AddProductToCart?type=1&AddCartProductID=${pr.productID}" class="btn btn-sm text-dark p-0"><i class="fas fa-shopping-cart text-primary mr-1"></i> Add To Cart</a>

                                </c:if>

                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        <div id="header-carousel-two" class="carousel slide" data-ride="carousel">
            <div class="text-center mb-4">
                <h2 class="section-title px-5"><span class="px-2">Brand</span></h2>
            </div>
            <div class="carousel-inner">
                <div class="logo-thuonghieu carousel-item active">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/3ce-logo.jpg" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/Banobagi-logo.png" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/bioderma-logo.jpg" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/Black-Rouge-logo.png" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/dhc-logo.jpg" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/hadalabo-logo.png" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/innisfree-logo.jpg" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/klairs-logo.png" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/laroche-logo.png" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/LOreal-Logo-1962-present.jpg" alt="Image">
                    <img class="img-fluid" src="${pageContext.request.contextPath}/view/img/Naruko_logo_2048x2048.jpg" alt="Image">




                </div>
            </div>

        </div>
    </div>
    <!-- Content End 
    
    <!-- Footer Start -->
    <jsp:include page="footer.jsp"></jsp:include>
    <!-- Footer End -->


    <!-- Back to Top -->
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
