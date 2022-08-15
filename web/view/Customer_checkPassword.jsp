<%-- 
    Document   : Customer_checkPassword
    Created on : Mar 17, 2022, 4:18:18 PM
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

                <c:if test="${type eq 1}">
                    <form action="CheckPassword" method="post" class="col-lg-9 col-md-12">
                        <h4 class="font-weight-semi-bold mb-4">Change phone</h4>
                        <input name="type" value="1" hidden="">
                        <div class="row">
                            <div class="col-md-12 form-group">
                                <label>Mobile No</label>
                                <div class="input-group form-group  mx-auto">
                                    <div class="form-control" type="text" placeholder="+123 45 678"
                                         pattern="[0-9]{3}[0-9]{2}[0-9]{3}" value="${phone}">${phone}</div>
                                    <input name="phone" value="${phone}" hidden="">
                                </div>
                            </div>
                            <div class="col-md-12 form-group">
                                <label>Password</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="password" class="form-control" type="password" required="required" >
                                </div>
                            </div>
                            <button style="background-color: papayawhip;color: palevioletred; border-color: white; margin-left: 50%" type="submit">Submit</button>
                        </div>
                    </form>
                </c:if>


                <c:if test="${type eq 0}">
                    <form action="CheckPassword" method="post" class="col-lg-9 col-md-12">
                        <h4 class="font-weight-semi-bold mb-4">Change email</h4>
                        <input name="type" value="0" hidden="">
                        <div class="row">
                            <div class="col-md-12 form-group">
                                <label>E-mail</label>
                                <div class="input-group form-group  mx-auto">
                                    <div class="form-control" type="text" placeholder="example@email.com" >${email}</div>
                                    <input name="email" value="${email}" hidden="">

                                </div>
                            </div>
                            <div class="col-md-12 form-group">
                                <label>Password</label>
                                <div class="input-group form-group  mx-auto">
                                    <input name="password" class="form-control" type="password" required="required" >
                                </div>
                            </div>
                            <button style="background-color: papayawhip;color: palevioletred; border-color: white; margin-left: 50%" type="submit">Submit</button>
                        </div>
                    </form>

                </c:if>

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
