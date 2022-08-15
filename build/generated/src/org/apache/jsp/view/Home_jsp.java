package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>ATP Cosmectics</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/css/style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- <link href=\"bootstrap-5.1.3-dist/css/bootstrap.css\" rel=\"stylesheet\"> -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div id=\"header-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\" style=\"height: 410px;\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/senka-logo.jpg\" alt=\"Image\">\n");
      out.write("                        <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                            <div class=\"p-3\" style=\"max-width: 100%;\">\n");
      out.write("                                <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First\n");
      out.write("                                    Order</h4>\n");
      out.write("                                <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Fashionable Dress</h3>\n");
      out.write("                                <a href=\"\" class=\"btn btn-light py-2 px-3\">Shop Now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" style=\"height: 410px;\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"https://www.google.com.vn/imgres?imgurl=https%3A%2F%2Fcdn.diemnhangroup.com%2Fthegioilamdep%2F946ed07aa3013224f8b357c1796c20d4.jpeg&imgrefurl=https%3A%2F%2Fthegioilamdep.vn%2Fsan-pham%2Fsua-tam-xich-y-tesori-doriente-huong-sen-thom-mat-500ml%2F&tbnid=nn68cQHCux-Z0M&vet=12ahUKEwiQ3bnZmLf2AhVa_jgGHQ0OAtIQMygCegUIARC2AQ..i&docid=eYfDjm0vCwLdJM&w=800&h=800&q=t%C3%A1c%20d%E1%BB%A5ng%20s%E1%BB%AFa%20t%E1%BA%AFm%20x%C3%ADch%20%C3%BD%20tesori&hl=vi&authuser=0&ved=2ahUKEwiQ3bnZmLf2AhVa_jgGHQ0OAtIQMygCegUIARC2AQ\" alt=\"Image\">\n");
      out.write("                        <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                            <div class=\"p-3\" style=\"max-width: 100%;\">\n");
      out.write("                                <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First\n");
      out.write("                                    Order</h4>\n");
      out.write("                                <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Reasonable Price</h3>\n");
      out.write("                                <a href=\"\" class=\"btn btn-light py-2 px-3\">Shop Now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#header-carousel\" data-slide=\"prev\">\n");
      out.write("                    <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                        <span class=\"carousel-control-prev-icon mb-n2\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#header-carousel\" data-slide=\"next\">\n");
      out.write("                    <div class=\"btn btn-dark\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                        <span class=\"carousel-control-next-icon mb-n2\"></span>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Topbar Start -->\n");
      out.write("\n");
      out.write("            <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Conten -->\n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("                <div class=\"text-center mb-4\">\n");
      out.write("                    <h2 class=\"section-title px-5\"><span class=\"px-2\">New Products</span></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row px-xl-5 pb-3\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mb-4\">\n");
      out.write("                <h2 class=\"section-title px-5\"><span class=\"px-2\">Trending Products</span></h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row px-xl-5 pb-3\">\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-2.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-3.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-4.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-5.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-6.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-7.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
      out.write("                    <div class=\"card product-item border-0 mb-4\">\n");
      out.write("                        <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
      out.write("                            <img class=\"img-fluid w-100\" src=\"img/product-8.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-truncate mb-3\">Colorful Stylish Shirt</h6>\n");
      out.write("                            <div class=\"d-flex justify-content-center\">\n");
      out.write("                                <h6>$123.00</h6>\n");
      out.write("                                <h6 class=\"text-muted ml-2\"><del>$123.00</del></h6>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View\n");
      out.write("                                Detail</a>\n");
      out.write("                            <a href=\"\" class=\"btn btn-sm text-dark p-0\"><i\n");
      out.write("                                    class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"header-carousel-two\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"text-center mb-4\">\n");
      out.write("                    <h2 class=\"section-title px-5\"><span class=\"px-2\">Brand</span></h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"logo-thuonghieu carousel-item active\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/3ce-logo.jpg\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/Banobagi-logo.png\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/bioderma-logo.jpg\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/Black-Rouge-logo.png\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/dhc-logo.jpg\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/hadalabo-logo.png\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/innisfree-logo.jpg\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/klairs-logo.png\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/laroche-logo.png\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/LOreal-Logo-1962-present.jpg\" alt=\"Image\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/img/Naruko_logo_2048x2048.jpg\" alt=\"Image\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Content End \n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.productNewAdd}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pr");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-lg-3 col-md-6 col-sm-12 pb-1\">\n");
          out.write("                        <div class=\"card product-item border-0 mb-4\">\n");
          out.write("                            <div class=\"card-header product-img position-relative overflow-hidden bg-transparent border p-0\">\n");
          out.write("                                <img class=\"img-fluid w-100\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"card-body border-left border-right text-center p-0 pt-4 pb-3\">\n");
          out.write("                                <h6 class=\"text-truncate mb-3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                <div class=\"d-flex justify-content-center\">\n");
          out.write("                                    <h6>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.sellPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                    <!--<h6 class=\"text-muted ml-2\"><del></del></h6>-->\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"card-footer d-flex justify-content-between bg-light border\">\n");
          out.write("                                <a href=\"DisplayDetailProduct?type=1&Detail=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-eye text-primary mr-1\"></i>View Detail</a>\n");
          out.write("                                <a href=\"AddProductToCart?type=1&AddCartProductID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pr.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-sm text-dark p-0\"><i class=\"fas fa-shopping-cart text-primary mr-1\"></i>Add To Cart</a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
