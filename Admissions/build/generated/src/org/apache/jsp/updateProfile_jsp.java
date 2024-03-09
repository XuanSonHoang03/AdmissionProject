package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/setting/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form action=\"updateProfile\" method=\"post\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"main-body\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("l");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                        <!-- Breadcrumb -->\n");
          out.write("                        <nav aria-label=\"breadcrumb\" class=\"main-breadcrumb\">\n");
          out.write("                            <ol class=\"breadcrumb\">\n");
          out.write("                                <li class=\"breadcrumb-item\"><a href=\"/Admissions/UserPage.jsp\">Home</a></li>\n");
          out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">User Profile</li>\n");
          out.write("                                <li class=\"breadcrumb-item active\" aria-current=\"page\">Edit Profile</li>\n");
          out.write("                            </ol>\n");
          out.write("                        </nav>\n");
          out.write("                        <!-- /Breadcrumb -->\n");
          out.write("\n");
          out.write("                        <div class=\"row gutters-sm\">\n");
          out.write("                            <div class=\"col-md-4 mb-3\">\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <div class=\"d-flex flex-column align-items-center text-center\">\n");
          out.write("                                            <img src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" alt=\"Admin\"\n");
          out.write("                                                 class=\"rounded-circle\" width=\"150\">\n");
          out.write("                                            <div class=\"mt-3\">\n");
          out.write("                                                <h4>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                <p class=\"text-secondary mb-1\">Student</p>\n");
          out.write("                                                <p class=\"text-muted font-size-sm\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.location}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - Viet Nam</p>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"card mt-3\">\n");
          out.write("                                    <ul class=\"list-group list-group-flush\">\n");
          out.write("                                        <li class=\"list-group-item d-flex justify-content-between align-items-center flex-wrap\">\n");
          out.write("                                            <h6 class=\"mb-0\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\"\n");
          out.write("                                                                  viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\"\n");
          out.write("                                                                  stroke-linecap=\"round\" stroke-linejoin=\"round\"\n");
          out.write("                                                                  class=\"feather feather-globe mr-2 icon-inline\">\n");
          out.write("                                                <circle cx=\"12\" cy=\"12\" r=\"10\"></circle>\n");
          out.write("                                                <line x1=\"2\" y1=\"12\" x2=\"22\" y2=\"12\"></line>\n");
          out.write("                                                <path\n");
          out.write("                                                    d=\"M12 2a15.3 15.3 0 0 1 4 10 15.3 15.3 0 0 1-4 10 15.3 15.3 0 0 1-4-10 15.3 15.3 0 0 1 4-10z\">\n");
          out.write("                                                </path>\n");
          out.write("                                                </svg>Website</h6>\n");
          out.write("                                            <span class=\"text-secondary\"><a href=\"/Admissions/UserPage.jsp\">Admissions</a></span>\n");
          out.write("                                        </li>\n");
          out.write("\n");
          out.write("                                    </ul>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"col-md-8\">\n");
          out.write("                                <div class=\"card mb-3\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">Full Name</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" hidden>\n");
          out.write("                                                <input name=\"name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">Gender</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"gender\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">Email</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"email\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">Phone</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"phone\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">DOB</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"dob\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-3\">\n");
          out.write("                                                <h6 class=\"mb-0\">Address</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-9 text-secondary\">\n");
          out.write("                                                <input name=\"location\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.location}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <hr>\n");
          out.write("\n");
          out.write("                                        <div class=\"row\">\n");
          out.write("                                            <div class=\"col-sm-12\">\n");
          out.write("                                                <button class=\"btn btn-info \" target=\"__blank\"\n");
          out.write("                                                        href=\"#\">Edit</button>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("\n");
          out.write("                            ");
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
