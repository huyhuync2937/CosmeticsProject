<%-- 
    Document   : Cart
    Created on : Mar 6, 2022, 12:08:27 AM
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
        <link href="${pageContext.request.contextPath}/view/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="${pageContext.request.contextPath}/view/css/style.css" type="text/css" rel="stylesheet">

        <!-- <link href="bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet"> -->
    </head>

    <body>
        <jsp:include page="Header.jsp"></jsp:include>


            <div class="container-fluid pt-5">
                <div class="row px-xl-5">
                    <div class="col-lg-8 table-responsive mb-5">
                        <table class="table table-bordered text-center mb-0">
                            <thead class="bg-secondary text-dark">
                                <tr>
                                    <th>Products</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>Total</th>
                                    <th>Remove</th>
                                </tr>
                            </thead>
                            <tbody class="align-middle">
                            <c:forEach items="${requestScope.listBill}" var="pr">
                                <tr>
                            <form action="UpdateQuantityCart" method="post">
                                <input name="billID" hidden="" value="${pr.billId}">
                                <td class="align-middle"><img src="${pageContext.request.contextPath}${pr.image}" alt=" ${pr.productName}" style="width: 50px;"> ${pr.productName}</td>
                                <td class="align-middle">${pr.price}</td>
                                <td class="align-middle">
                                    <div class="input-group  mx-auto" style="width: 100px;">

                                        <input type="number" name="quantity" class="form-control form-control-sm bg-secondary text-center" value="${pr.quantity}">
                                        
                                            <button type="submit" >
                                                <i class="fa fa-save"></i>
                                            </button>
                                    </div>
                                </td>
                                <td class="align-middle-total">${pr.total}</td>
                                <td class="align-middle"><a href="AddProductToCart?type=0&billID=${pr.billId}" class="btn btn-sm btn-primary"><i class="fa fa-times"></i></a></td>
                            </form>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-lg-4">
                    <!-- <form class="mb-5" action="">
                        <div class="input-group">
                            <input type="text" class="form-control p-4" placeholder="Coupon Code">
                            <div class="input-group-append">
                                <button class="btn btn-primary">Apply Coupon</button>
                            </div>
                        </div>
                    </form> -->
                    <div class="card border-secondary mb-5">
                        <div class="card-header bg-secondary border-0">
                            <h4 class="font-weight-semi-bold m-0">Cart Summary</h4>
                        </div>
                        <div class="card-body">
                            <div class="d-flex justify-content-between mb-3 pt-1">
                                <h6 class="font-weight-medium">Subtotal</h6>
                                <h6 class="font-weight-medium">${priceBill}</h6>
                            </div>
<!--                            <div class="d-flex justify-content-between">
                                <h6 class="font-weight-medium">Shipping</h6>
                                <h6 class="font-weight-medium">$10</h6>
                            </div>-->
                        </div>
                        <div class="card-footer border-secondary bg-transparent">
                            <div class="d-flex justify-content-between mt-2">
                                <h5 class="font-weight-bold">Total</h5>
                                <h5 class="font-weight-bold">${priceBill}</h5>
                            </div>
                            <button class="btn btn-block btn-primary my-3 py-3">Proceed To Checkout</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>




        <jsp:include page="footer.jsp"></jsp:include>
            <!-- Footer End -->


            <!-- Back to Top -->
            <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>


            <!-- JavaScript Libraries -->
            <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
            <script src="${pageContext.request.contextPath}/view/lib/easing/easing.min.js"></script>
        <script src="${pageContext.request.contextPath}/view/lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="${pageContext.request.contextPath}/view/mail/jqBootstrapValidation.min.js"></script>
        <script src="${pageContext.request.contextPath}/view/mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="${pageContext.request.contextPath}/view/js/main.js"></script>
    </body>

</html>