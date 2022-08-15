package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"css/style.css\"> -->\n");
      out.write("\n");
      out.write("    <!-- <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" rel=\"stylesheet\">\n");
      out.write("    <title>Bootstrap Sign up Form with Icons</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> -->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>ATP Cosmectics</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            .form-control,\n");
      out.write("            .form-control:focus,\n");
      out.write("            .input-group-addon {\n");
      out.write("                border-color: #e1e1e1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-control,\n");
      out.write("            .btn {\n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form {\n");
      out.write("                width: 390px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 30px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form form {\n");
      out.write("                color: #999;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                background: #fff;\n");
      out.write("                box-shadow: 2px 2px 2px 2px rgba(0.3, 0.3, 0.3, 0.3);\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form h2 {\n");
      out.write("                color: #333;\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form hr {\n");
      out.write("                margin: 0 -30px 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .form-group {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form label {\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .form-control {\n");
      out.write("                min-height: 38px;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .input-group-addon {\n");
      out.write("                max-width: 42px;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form input[type=\"checkbox\"] {\n");
      out.write("                margin-top: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .btn {\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: #D9B9B0;\n");
      out.write("                border: none;\n");
      out.write("                min-width: 140px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .btn:hover,\n");
      out.write("            .signup-form .btn:focus {\n");
      out.write("                background: #D9B9B0;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form a {\n");
      out.write("                color: #A29896;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form form a {\n");
      out.write("                color: #D9B9B0;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form form a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .fa {\n");
      out.write("                font-size: 21px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .fa-paper-plane {\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .fa-check {\n");
      out.write("                color: #A29896;\n");
      out.write("                left: 17px;\n");
      out.write("                top: 18px;\n");
      out.write("                font-size: 7px;\n");
      out.write("                position: absolute;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"signup-form\">\n");
      out.write("            <form action=\"LoginAccount\" method=\"Post\">\n");
      out.write("                <h2 >Login</h2>\n");
      out.write("                <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Username\" required=\"required\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <a href=\"#\">Forgot Password ?</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\">Login</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"text-center\">Don't have an account? <a href=\"SignUpAccount\">Sign up here</a></div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
