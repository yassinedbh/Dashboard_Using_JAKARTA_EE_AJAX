package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/css.jsp");
    _jspx_dependants.add("/template/js.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("   ");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write(" \n");
      out.write(" <meta http-equiv=\"Cache-Control\"content=\"no-cache, no-store, must-revalidate\" />\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\" />\n");
      out.write("<meta http-equiv=\"Expires\" content=\"-1\" />\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>My_Dashboard</title>\n");
      out.write("  <!-- plugins:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/vendors/feather/feather.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/vendors/css/vendor.bundle.base.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin css for this page -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/vendors/datatables.net-bs4/dataTables.bootstrap4.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"template/js/select.dataTables.min.css\">\n");
      out.write("  <!-- End plugin css for this page -->\n");
      out.write("  <!-- inject:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/css/vertical-layout-light/style.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"template/images/favicon.png\" />");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <div class=\"container-scroller\">\n");
      out.write("    <div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("      <div class=\"content-wrapper d-flex align-items-center auth px-0\">\n");
      out.write("        <div class=\"row w-100 mx-0\">\n");
      out.write("          <div class=\"col-lg-4 mx-auto\">\n");
      out.write("            <div class=\"auth-form-light text-left py-5 px-4 px-sm-5\">\n");
      out.write("              <div class=\"brand-logo\">\n");
      out.write("                <img src=\"template/images/logo.svg\" alt=\"logo\">\n");
      out.write("              </div>\n");
      out.write("              <h4>Hello! let's get started</h4>\n");
      out.write("              <h6 class=\"font-weight-light\">Sign in to continue.</h6>\n");
      out.write("              <form class=\"pt-3\" method=\"GET\" action=\"AuthentificationController\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-lg\" name=\"username\" placeholder=\"Username\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control form-control-lg\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                                        <h6 class=\"text-center\" style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\n");
      out.write("                                    </div>\n");
      out.write("                <div class=\"mt-3\">\n");
      out.write("                  <button id=\"send\" type=\"submit\" class=\"btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn\" style=\"font-size: 15px\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"my-2 d-flex justify-content-between align-items-center\">\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <label class=\"form-check-label text-muted\">\n");
      out.write("                      <input type=\"checkbox\" class=\"form-check-input\">\n");
      out.write("                      Keep me signed in\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <a href=\"#\" class=\"auth-link text-black\">Forgot password?</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"text-center mt-4 font-weight-light\">\n");
      out.write("                  Don't have an account? <a href=\"Inscription.jsp\" class=\"text-primary\">Create</a>\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- content-wrapper ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("  </div>\n");
      out.write(" <!-- plugins:js -->\n");
      out.write("  <script src=\"template/vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin js for this page -->\n");
      out.write("  <script src=\"template/vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("  <script src=\"template/vendors/datatables.net/jquery.dataTables.js\"></script>\n");
      out.write("  <script src=\"template/vendors/datatables.net-bs4/dataTables.bootstrap4.js\"></script>\n");
      out.write("  <script src=\"template/js/dataTables.select.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- End plugin js for this page -->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"template/js/off-canvas.js\"></script>\n");
      out.write("  <script src=\"template/js/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"template/js/template.js\"></script>\n");
      out.write("  <script src=\"template/js/settings.js\"></script>\n");
      out.write("  <script src=\"template/js/todolist.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Custom js for this page-->\n");
      out.write("  <script src=\"template/js/dashboard.js\"></script>\n");
      out.write("  <script src=\"template/js/Chart.roundedBarCharts.js\"></script>\n");
      out.write("  \n");
      out.write("  <!-- End custom js for this page-->");
      out.write("\n");
      out.write("  <!-- endinject -->\n");
      out.write("</body>\n");
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
