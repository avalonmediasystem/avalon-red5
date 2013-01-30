package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/fmt.tld");
    _jspx_dependants.add("/WEB-INF/tld/spring.tld");
    _jspx_dependants.add("/WEB-INF/tld/spring-form.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fhasBindErrors_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fhasBindErrors_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fhasBindErrors_0026_005fname.release();
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Red5 Admin</title>\n");
      out.write("  <meta content=\"text/html; charset=iso-8859-1\" http-equiv=\"Content-Type\" />\n");
      out.write("  <style type=\"text/css\" media=\"screen\">\n");
      out.write("html, body, #containerA, #containerB { height: 100%;\n");
      out.write("}\n");
      out.write(".formbg { background-color: rgb(238, 238, 238);\n");
      out.write("}\n");
      out.write(".formtable { border: 2px solid rgb(183, 186, 188);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".formtext { font-family: Arial,Helvetica,sans-serif;\n");
      out.write("    font-size: 12px;\n");
      out.write("    color: rgb(11, 51, 73);\n");
      out.write("}\n");
      out.write("\n");
      out.write("body { margin: 0pt;\n");
      out.write("padding: 0pt;\n");
      out.write("overflow: hidden;\n");
      out.write("background-color: rgb(250, 250, 250);\n");
      out.write("}\n");
      out.write(".error { \n");
      out.write("\tfont-family: Arial,Helvetica,sans-serif;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: red; \n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table style=\"text-align: left; width: 100%; height: 100%;\" border=\"0\" cellpadding=\"0\" cellspacing=\"10\">\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"54\"><img style=\"width: 136px; height: 54px;\" alt=\"\" src=\"assets/logo.png\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr class=\"formbg\">\n");
      out.write("      <td align=\"center\" valign=\"middle\">\n");
      out.write("      <table style=\"width: 400px;\" class=\"formtable\" border=\"0\" cellpadding=\"0\" cellspacing=\"2\">\n");
      out.write("      <tr>\n");
      out.write("      \t<td class=\"formtext\">&nbsp;<b>Register Admin User</b></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("      <td>\n");
      out.write("      <form method=\"post\" action=\"register.html\">\n");
      out.write("        <table style=\"width: 400px;\"  border=\"0\" cellpadding=\"0\" cellspacing=\"5\">\n");
      out.write("          <tbody>\n");
      out.write("            <tr>\n");
      out.write("              <td align=\"right\" width=\"20%\" class=\"formtext\">Username:</td>\n");
      out.write("\t\t      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f0 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_005fbind_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fbind_005f0.setParent(null);
      // /WEB-INF/jsp/register.jsp(54,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_spring_005fbind_005f0.setPath("userDetails.username");
      int[] _jspx_push_body_count_spring_005fbind_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fbind_005f0 = _jspx_th_spring_005fbind_005f0.doStartTag();
        if (_jspx_eval_spring_005fbind_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n");
            out.write("\t\t        <td width=\"20%\">\n");
            out.write("\t\t            <input name=\"username\" value=\"");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_spring_005fbind_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f0))
              return;
            out.write("\" />\n");
            out.write("\t\t        </td>\n");
            out.write("\t\t        <td width=\"60%\" class=\"error\">\n");
            out.write("\t\t            ");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_spring_005fbind_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f0))
              return;
            out.write("\n");
            out.write("\t\t        </td>\n");
            out.write("\t\t      ");
            int evalDoAfterBody = _jspx_th_spring_005fbind_005f0.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_005fbind_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fbind_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fbind_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fbind_005f0.doFinally();
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f0);
      }
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("\t\t\t  <td align=\"right\" width=\"20%\" class=\"formtext\">Password:</td>\n");
      out.write("\t\t      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_005fbind_005f1 = (org.springframework.web.servlet.tags.BindTag) _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_005fbind_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fbind_005f1.setParent(null);
      // /WEB-INF/jsp/register.jsp(65,8) name = path type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_spring_005fbind_005f1.setPath("userDetails.password");
      int[] _jspx_push_body_count_spring_005fbind_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fbind_005f1 = _jspx_th_spring_005fbind_005f1.doStartTag();
        if (_jspx_eval_spring_005fbind_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n");
            out.write("\t\t        <td width=\"20%\">\n");
            out.write("\t\t          <input type=\"password\" name=\"password\" value=\"");
            if (_jspx_meth_c_005fout_005f2(_jspx_th_spring_005fbind_005f1, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f1))
              return;
            out.write("\" />\n");
            out.write("\t\t        </td>\n");
            out.write("\t\t        <td width=\"60%\" class=\"error\">\n");
            out.write("\t\t          ");
            if (_jspx_meth_c_005fout_005f3(_jspx_th_spring_005fbind_005f1, _jspx_page_context, _jspx_push_body_count_spring_005fbind_005f1))
              return;
            out.write("\n");
            out.write("\t\t        </td>\n");
            out.write("\t\t      ");
            int evalDoAfterBody = _jspx_th_spring_005fbind_005f1.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_005fbind_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fbind_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fbind_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fbind_005f1.doFinally();
        _005fjspx_005ftagPool_005fspring_005fbind_0026_005fpath.reuse(_jspx_th_spring_005fbind_005f1);
      }
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td class=\"error\">\n");
      out.write("               ");
      //  spring:hasBindErrors
      org.springframework.web.servlet.tags.BindErrorsTag _jspx_th_spring_005fhasBindErrors_005f0 = (org.springframework.web.servlet.tags.BindErrorsTag) _005fjspx_005ftagPool_005fspring_005fhasBindErrors_0026_005fname.get(org.springframework.web.servlet.tags.BindErrorsTag.class);
      _jspx_th_spring_005fhasBindErrors_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fhasBindErrors_005f0.setParent(null);
      // /WEB-INF/jsp/register.jsp(78,15) name = name type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_spring_005fhasBindErrors_005f0.setName("userDetails");
      int[] _jspx_push_body_count_spring_005fhasBindErrors_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fhasBindErrors_005f0 = _jspx_th_spring_005fhasBindErrors_005f0.doStartTag();
        if (_jspx_eval_spring_005fhasBindErrors_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.validation.Errors errors = null;
          errors = (org.springframework.validation.Errors) _jspx_page_context.findAttribute("errors");
          do {
            out.write("\n");
            out.write("\t\t\t    <b>Please fix all errors!</b>\n");
            out.write("\t\t\t  ");
            int evalDoAfterBody = _jspx_th_spring_005fhasBindErrors_005f0.doAfterBody();
            errors = (org.springframework.validation.Errors) _jspx_page_context.findAttribute("errors");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_005fhasBindErrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fhasBindErrors_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fhasBindErrors_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fhasBindErrors_005f0.doFinally();
        _005fjspx_005ftagPool_005fspring_005fhasBindErrors_0026_005fname.reuse(_jspx_th_spring_005fhasBindErrors_005f0);
      }
      out.write("  \n");
      out.write("              </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("      </form>\n");
      out.write("      </td>\n");
      out.write("      </tr>\n");
      out.write("      </table>\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("<br />\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f0);
    // /WEB-INF/jsp/register.jsp(56,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f0);
    // /WEB-INF/jsp/register.jsp(59,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f1);
    // /WEB-INF/jsp/register.jsp(67,58) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fbind_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fbind_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fbind_005f1);
    // /WEB-INF/jsp/register.jsp(70,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.errorMessage}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }
}
