package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class acceso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Acceso</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    body { background-image: url(\"imagenes/red2.jpg\") }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container well\" id=\"containerLogin\">\n");
      out.write("            \n");
      out.write("            <center> <img src=\"imagenes/user1.png\" alt=\"\" class=\"img-circle\"/> </center>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <form id=\"form1\" name=\"frm_acceso\" action=\"control_acceso.jsp\" method=\"post\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    \n");
      out.write("      <input name=\"txtusuario\" type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" placeholder=\"Usuario\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    \n");
      out.write("      <input name=\"txtclave\" type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Contraseña\">\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"checkbox\">\n");
      out.write("    <label>\n");
      out.write("      <input type=\"checkbox\"> Guardar contraseña\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-danger\" id=\"botonLogin\">Submit</button>\n");
      out.write("</form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
