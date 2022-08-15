<%-- 
    Document   : Customer_DisplayAddress
    Created on : Mar 18, 2022, 3:06:14 PM
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

                        <div class="mb-5">
                            <h5 class="font-weight-semi-bold mb-4">Profile customer</h5>
                            <form>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <a href="DisplayInformationCustomer" class="" for="size-all">Information</a>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <a href="DisplayAddress" class="" for="size-all">Address</a>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <a href="ChangePassword" class="" for="size-all">Change password</a>
                                </div>
                                <div
                                    class="custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3">
                                    <a href="DisplayHistotyBill" class="" for="size-all">History</a>
                                </div>


                            </form>
                        </div>
                        <!-- Size End -->
                    </div>
                <c:forEach items="" var="la">
                    <c:if test="${type==0}">
                    <form action="" method="post" class="col-lg-9 col-md-12">
                        <div class="row">
                            <h4 class="font-weight-semi-bold mb-4">Address ship</h4>

                            <div class="col-md-6 form-group">
                                <label>Name</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="name" class="form-control" type="text" placeholder="Name" >${account.email}</div>
                                </div>
                            </div>
                            <div class="col-md-6 form-group">
                                <label>Phone</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="phone" class="form-control" type="text" placeholder="Phone">${account.email}</div>
                                </div>
                            </div>                            <div class="col-md-6 form-group">
                                <label>Address</label>
                                <div class="input-group form-group  mx-auto">
                                    <div name="Address" class="form-control" type="text" placeholder="Address" >${account.email}</div>
                                </div>
                            </div>

                            <button style="background-color: papayawhip;color: palevioletred; border-color: white; margin-left: 50%" type="submit">Submit</button>

                        </div>
                    </form>
                    </c:if>
                     <c:if test="${type eq 1}">
                    <form action="" method="post" class="col-lg-9 col-md-12">
                        <div class="row">
                            <h4 class="font-weight-semi-bold mb-4">Address ship</h4>

                            <div class="col-md-6 form-group">
                                <label>Name</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="name" class="form-control" type="text" placeholder="Name" value="${account.nam}">
                                </div>
                            </div>
                            <div class="col-md-6 form-group">
                                <label>Phone</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="phone" class="form-control" type="text" placeholder="Phone" value="${account.email}">
                                </div>
                            </div>                            <div class="col-md-6 form-group">
                                <label>Address</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="Address" class="form-control" type="text" placeholder="Address" value="${account.email}">
                                </div>
                            </div>

                            <button style="background-color: papayawhip;color: palevioletred; border-color: white; margin-left: 50%" type="submit">Submit</button>

                        </div>
                    </form>
                    </c:if>
                </c:forEach>


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

