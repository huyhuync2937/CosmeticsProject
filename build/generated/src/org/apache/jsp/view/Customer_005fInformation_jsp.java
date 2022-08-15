package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customer_005fInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>ATP Cosmetics Shop </title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
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
      out.write("        <link href=\"/fontlib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/css/style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Topbar Start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page Header End -->\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("                <div class=\"row px-xl-5\">\n");
      out.write("                    <!-- Shop Sidebar Start -->\n");
      out.write("                    <div class=\"col-lg-3 col-md-12\">\n");
      out.write("\n");
      out.write("                        <div class=\"mb-5\">\n");
      out.write("                            <h5 class=\"font-weight-semi-bold mb-4\">Profile customer</h5>\n");
      out.write("                            <form>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\n");
      out.write("                                    <a class=\"\" for=\"size-all\">Information</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\n");
      out.write("                                    <a class=\"\" for=\"size-all\">Address</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\n");
      out.write("                                    <a class=\"\" for=\"size-all\">Change password</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div\n");
      out.write("                                    class=\"custom-control custom-checkbox d-flex align-items-center justify-content-between mb-3\">\n");
      out.write("                                    <a class=\"\" for=\"size-all\">History</a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Size End -->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <form action=\"\" class=\"col-lg-9 col-md-12\">\n");
      out.write("\n");
      out.write("                        <h4 class=\"font-weight-semi-bold mb-4\">Shipping Address</h4>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"John\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group\">\n");
      out.write("                                <label>Address</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"Doe\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group\">\n");
      out.write("                                <label>E-mail</label>\n");
      out.write("                                <div class=\"input-group form-group  mx-auto\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"example@email.com\">\n");
      out.write("                                    <a >Change</a>\n");
      out.write("                                </div>>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group\">\n");
      out.write("                                <label>Mobile No</label>\n");
      out.write("                                <div class=\"input-group form-group  mx-auto\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"+123 45 678\"\n");
      out.write("                                           pattern=\"[0-9]{3}[0-9]{2}[0-9]{3}\">\n");
      out.write("                                    <a>Change</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 form-group\">\n");
      out.write("                                <label>Birthday</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" placeholder=\"YYYY-MM-DD\"\n");
      out.write("                                       pattern=\"(?:19|20)(?:[0-9]{2}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:(?!02)(?:0[1-9]|1[0-2])-(?:29|30))|(?:(?:0[13578]|1[02])-31))|(?:[13579][26]|[02468][048])-02-29)\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <button style=\"background-color: papayawhip;color: palevioletred; border-color: white; margin-left: 60%\" type=\"submit\">Save</button>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Footer Start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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
      out.write("</html>");
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
}
