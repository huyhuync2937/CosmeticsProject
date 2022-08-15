package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fAddNewCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Product Page - Admin HTML Template</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" />\n");
      out.write("        <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/Admin/css/fontawesome.min.css\" />\n");
      out.write("        <!-- https://fontawesome.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/Admin/css/bootstrap.min.css\" />\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/Admin/css/templatemo-style.css\">\n");
      out.write("        <!--\n");
      out.write("                  Product Admin CSS Template\n");
      out.write("                  https://templatemo.com/tm-524-product-admin\n");
      out.write("        -->\n");
      out.write("    </head>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("        <div class=\"container h-100\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                <h1 class=\"tm-site-title mb-0\">Product Admin</h1>\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler ml-auto mr-0\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                    data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                    aria-label=\"Toggle navigation\">\n");
      out.write("                <i class=\"fas fa-bars tm-nav-icon\"></i>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mx-auto h-100\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                            <i class=\"fas fa-tachometer-alt\"></i> Dashboard\n");
      out.write("                            <span class=\"sr-only\">(current)</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <!--                        <li class=\"nav-item dropdown\">\n");
      out.write("                                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                                       aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                        <i class=\"far fa-file-alt\"></i>\n");
      out.write("                                                        <span> Reports <i class=\"fas fa-angle-down\"></i> </span>\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Daily Report</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Weekly Report</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Yearly Report</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>-->\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"AdminDisplayProduct\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart\"></i> Products\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <!--                        <li class=\"nav-item\">\n");
      out.write("                                                    <a class=\"nav-link\" href=\"accounts.html\">\n");
      out.write("                                                        <i class=\"far fa-user\"></i> Accounts\n");
      out.write("                                                    </a>\n");
      out.write("                                                </li>\n");
      out.write("                                                <li class=\"nav-item dropdown\">\n");
      out.write("                                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                                       aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                        <i class=\"fas fa-cog\"></i>\n");
      out.write("                                                        <span> Settings <i class=\"fas fa-angle-down\"></i> </span>\n");
      out.write("                                                    </a>\n");
      out.write("                                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Billing</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\">Customize</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </li>-->\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link d-block\" href=\"DisplayNewProduct\">\n");
      out.write("                            Admin, <b>Logout</b>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container tm-mt-big tm-mb-big\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto\">\n");
      out.write("                <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <h2 class=\"tm-block-title d-inline-block\">Add category</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row tm-edit-product-row\">\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-12\">\n");
      out.write("                            <form action=\"\" class=\"tm-edit-product-form\">\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <label for=\"name\">Add new category\n");
      out.write("                                    </label>\n");
      out.write("                                    <input id=\"name\" name=\"name\" type=\"text\" class=\"form-control validate\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add new\n");
      out.write("                                    category</button>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\n");
      out.write("                            <form action=\"\" class=\"tm-edit-product-form\">\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <div class=\"form-group mb-3\">\n");
      out.write("                                        <label for=\"name\">Add new type of Category</label>\n");
      out.write("                                        <select class=\"custom-select tm-select-accounts\" id=\"category\">\n");
      out.write("                                            <option selected>Select category</option>\n");
      out.write("                                            <option value=\"1\">New Arrival</option>\n");
      out.write("                                            <option value=\"2\">Most Popular</option>\n");
      out.write("                                            <option value=\"3\">Trending</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <label for=\"name\">Add new type of Category\n");
      out.write("                                    </label>\n");
      out.write("                                    <input id=\"name\" name=\"name\" type=\"text\" class=\"form-control validate\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add new\n");
      out.write("                                    type</button>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- <div class=\"col-12\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add Product Now</button>\n");
      out.write("            </div> -->\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"tm-footer row tm-mt-small\">\n");
      out.write("        <div class=\"col-12 font-weight-light\">\n");
      out.write("            <p class=\"text-center text-white mb-0 px-4 small\">\n");
      out.write("                Copyright &copy; <b>2018</b> All rights reserved.\n");
      out.write("\n");
      out.write("                Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- https://jquery.com/download/ -->\n");
      out.write("    <script src=\"jquery-ui-datepicker/jquery-ui.min.js\"></script>\n");
      out.write("    <!-- https://jqueryui.com/download/ -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("\n");
      out.write("</body>\n");
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
}
