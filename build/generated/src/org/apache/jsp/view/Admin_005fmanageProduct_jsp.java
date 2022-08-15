package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fmanageProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
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
      out.write("              Product Admin CSS Template\n");
      out.write("              https://templatemo.com/tm-524-product-admin\n");
      out.write("        -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"reportsPage\">\n");
      out.write("        <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("            <div class=\"container h-100\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("                    <h1 class=\"tm-site-title mb-0\">Product Admin</h1>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler ml-auto mr-0\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                        aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fas fa-bars tm-nav-icon\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mx-auto h-100\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i> Dashboard\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                               aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"far fa-file-alt\"></i>\n");
      out.write("                                <span> Reports <i class=\"fas fa-angle-down\"></i> </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Daily Report</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Weekly Report</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Yearly Report</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"products.html\">\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i> Products\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"accounts.html\">\n");
      out.write("                                <i class=\"far fa-user\"></i> Accounts\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                               aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-cog\"></i>\n");
      out.write("                                <span> Settings <i class=\"fas fa-angle-down\"></i> </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Billing</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Customize</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link d-block\" href=\"login.html\">\n");
      out.write("                                Admin, <b>Logout</b>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row tm-content-row\">\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-8 col-xl-8 tm-block-col\">\n");
      out.write("                    <div class=\"tm-bg-primary-dark tm-block tm-block-products\">\n");
      out.write("                        <div class=\"tm-product-table-container\">\n");
      out.write("                            <table class=\"table table-hover tm-table-small tm-product-table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">&nbsp;</th>\n");
      out.write("                                        <th scope=\"col\">PRODUCT NAME</th>\n");
      out.write("                                        <th scope=\"col\">IMPORT PRICE</th>\n");
      out.write("                                        <th scope=\"col\">SALE PRICE</th>\n");
      out.write("                                        <th scope=\"col\">UNIT IN STOCK</th>\n");
      out.write("                                        <th scope=\"col\">DATE ADD</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\"><input type=\"checkbox\" /></th>\n");
      out.write("                                        <td class=\"tm-product-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                        <td>1,450</td>\n");
      out.write("                                        <td>550</td>\n");
      out.write("                                        <td>28 March 2019</td>\n");
      out.write("                                        <td>28 March 2019</td>\n");
      out.write("\n");
      out.write("                                        <td>\n");
      out.write("                                            <a href=\"#\" class=\"tm-product-delete-link\">\n");
      out.write("                                                <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <a href=\"add-product.html\" class=\"btn btn-primary btn-block text-uppercase mb-3\">Add new product</a>\n");
      out.write("                        <button class=\"btn btn-primary btn-block text-uppercase\">\n");
      out.write("                            Delete selected products\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-12 col-md-12 col-lg-4 col-xl-4 tm-block-col\">\n");
      out.write("                    <div class=\"tm-bg-primary-dark tm-block tm-block-product-categories\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Product Categories</h2>\n");
      out.write("                        <div class=\"tm-product-table-container\">\n");
      out.write("                            <table class=\"table tm-table-small tm-product-table\">\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"tm-product-name\">Product Category 1</td>\n");
      out.write("                                        <td class=\"text-center\">\n");
      out.write("                                            <a href=\"#\" class=\"tm-product-delete-link\">\n");
      out.write("                                                <i class=\"far fa-trash-alt tm-product-delete-icon\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- table container -->\n");
      out.write("                        <button class=\"btn btn-primary btn-block text-uppercase mb-3\">\n");
      out.write("                            Add new category\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"tm-footer row tm-mt-small\">\n");
      out.write("            <div class=\"col-12 font-weight-light\">\n");
      out.write("                <p class=\"text-center text-white mb-0 px-4 small\">\n");
      out.write("                    Copyright &copy; <b>2018</b> All rights reserved.\n");
      out.write("\n");
      out.write("                    Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/Admin/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <!-- https://jquery.com/download/ -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/view/Admin/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- https://getbootstrap.com/ -->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\".tm-product-name\").on(\"click\", function () {\n");
      out.write("                    window.location.href = \"edit-product.html\";\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
}
