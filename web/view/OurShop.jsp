<%-- 
    Document   : OurShop
    Created on : Feb 14, 2022, 10:45:33 AM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>


<%--<%@taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>--%>

<!DOCTYPE html>
<html lang="en">

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
        <!-- Topbar Start -->
        <jsp:include page="Header.jsp"></jsp:include>


            <!-- Page Header End -->

            <div class="container-fluid pt-5">
                <div class="row px-xl-5">
                    <!-- Shop Sidebar Start -->
                    <div class="col-lg-3 col-md-12">
                        <!-- Price Start -->
                        <div class="border-bottom mb-4 pb-4">
                            <h5 class="font-weight-semi-bold mb-4">Thương hiệu</h5>
                            <form>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" checked id="price-all">
                                    <label class="custom-control-label" for="price-all">Tất cả</label>
                                </div>

                            </form>
                        </div>
                        <!-- Price End -->

                        <!-- Color Start -->
                        <div class="border-bottom mb-4 pb-4">
                            <h5 class="font-weight-semi-bold mb-4">Xuất xứ</h5>
                            <form>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" checked id="color-all">
                                    <label class="custom-control-label" for="price-all">Tất cả</label>
                                    <span class="badge border font-weight-normal">1000</span>
                                </div>

                            </form>
                        </div>
                        <!-- Color End -->

                        <!-- Size Start -->
                        <div class="mb-5">
                            <h5 class="font-weight-semi-bold mb-4">Giá</h5>
                            <form>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" checked id="size-all">
                                    <label class="custom-control-label" for="size-all">Tất cả</label>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" id="size-1">
                                    <label class="custom-control-label" for="size-1">0 - 100.000</label>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" id="size-2">
                                    <label class="custom-control-label" for="size-2">100.000 - 200.000</label>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" id="size-3">
                                    <label class="custom-control-label" for="size-3">200.000 - 300.000</label>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <input type="checkbox" class="custom-control-input" id="size-4">
                                    <label class="custom-control-label" for="size-4">300.000 - 400.000</label>
                                </div>
                                <div class="custom-control custom-checkbox d-flex align-items-center justify-content-between">
                                    <input type="checkbox" class="custom-control-input" id="size-5">
                                    <label class="custom-control-label" for="size-5">Trên 400.000</label>
                                </div>
                            </form>
                        </div>
                        <!-- Size End -->
                    </div>
                    <!-- Shop Sidebar End -->


                    <!-- Shop Product Start -->
                    <div class="col-lg-9 col-md-12">
                        <div class="row pb-3">
                            <div class="col-12 pb-1">
                                <div class=" align-items-center justify-content-between mb-4">
                                    <div class="dropdown ml-4">
                                        <button class="btn border dropdown-toggle" type="button" id="triggerId"
                                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            Sort by
                                        </button>
                                        <div class="dropdown-content dropdown-menu-right" aria-labelledby="triggerId">
                                            <a class="dropdown-item" href="#">Latest</a>
                                            <a class="dropdown-item" href="#">Popularity</a>
                                            <a class="dropdown-item" href="#">Best Rating</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        <c:forEach items="${requestScope.productSearch.listProduct}" var="pr" 
                                   begin="${requestScope.start}" end="${requestScope.end}">

                            <div class="col-lg-4 col-md-6 col-sm-12 pb-1">

                                <div class="card product-item border-0 mb-4">
                                    <div
                                        class="card-header product-img position-relative overflow-hidden bg-transparent border p-0">
                                        <img class="img-fluid w-100" src="${pageContext.request.contextPath}${pr.image}" alt="">
                                    </div>
                                    <div class="card-body border-left border-right text-center p-0 pt-4 pb-3">
                                        <h6 class="text-truncate mb-3">${pr.productName}</h6>
                                        <div class="d-flex justify-content-center">
                                            <h6>${pr.sellPrice}</h6>
                                            <h6 class="text-muted ml-2"><del>$123.00</del></h6>
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

                        <div class="col-12 pb-1">
                            <nav aria-label="Page navigation">
                                <c:if test="${first eq true}">
                                    <span><a href="SearchProductByHearder?index=${1}&numberRecordInPage=${requestScope.nrip}">Home</a></span>
                                    <span><a href="SearchProductByHearder?index=${page-1}&numberRecordInPage=${requestScope.nrip}">Pre</a></span>
                                </c:if>
                                <c:forEach var="i" begin="${pageStart}" end="${pageEnd}">
                                    <span>
                                        <a href="SearchProductByHearder?index=${i}&numberRecordInPage=${requestScope.nrip}">${i}</a>
                                    </span>
                                </c:forEach>
                                <c:if test="${last eq true}">
                                    <span><a href="SearchProductByHearder?index=${page+1}&numberRecordInPage=${requestScope.nrip}">Next</a></span>
                                    <span><a href="SearchProductByHearder?index=${totalPage}&numberRecordInPage=${requestScope.nrip}">End</a></span>
                                </c:if>
                            </nav><!--
                        </div>-->
                        </div>
                    </div>
                    <!-- Shop Product End -->
                </div>
            </div>



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
