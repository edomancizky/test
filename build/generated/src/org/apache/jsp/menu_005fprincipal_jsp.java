package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_005fprincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.css\" type=\"text/css\">\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        *{\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main{\n");
      out.write("            \n");
      out.write("            margin: 50px;\n");
      out.write("        }\n");
      out.write("        .main ul{\n");
      out.write("            list-style: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul li{\n");
      out.write("            background-color: rgb(80,80,80);\n");
      out.write("            width: 250px;\n");
      out.write("            position: relative;\n");
      out.write("            float: left;  \n");
      out.write("            font-size: 26px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul li a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: white;\n");
      out.write("            padding: 16px 0px 16px 40px;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        .main ul li a:hover{\n");
      out.write("            background-color: rgb(13,124,220);\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        i{\n");
      out.write("            margin-right: 15px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul ul{\n");
      out.write("            margin-top: 7px;\n");
      out.write("            display: none;\n");
      out.write("            position: absolute;\n");
      out.write("        }\n");
      out.write("        .main ul li:hover ul{\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul ul ul{\n");
      out.write("            \n");
      out.write("            margin-left: 250px;\n");
      out.write("            margin-top: -65px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul > li>a{\n");
      out.write("            \n");
      out.write("            border-right:2px solid grey;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main >ul >li{\n");
      out.write("            \n");
      out.write("            border-bottom: 7px solid rgb(13,124,220);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        main>ul>li>ul li{\n");
      out.write("            \n");
      out.write("           border-bottom: 2px solid grey;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .main ul ul ul {\n");
      out.write("            \n");
      out.write("            display: none;\n");
      out.write("            visibility: hidden;\n");
      out.write("        }\n");
      out.write("        .main >ul> li> ul> li:hover ul{\n");
      out.write("            visibility: visible;\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<boby>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("        \n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-user\"></i>Inicio</a></li>\n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-user\"></i>Clientes</a>\n");
      out.write("            <li><a href=\"\"><i class=\"fa fa-user\"></i>Produccion</a>\n");
      out.write("                <ul>\n");
      out.write("                  <li><a href=\"\"><i class=\"fa fa-user\"></i>Nuevo</a></li>  \n");
      out.write("                  <li><a href=\"\"><i class=\"fa fa-user\"></i>Editar</a>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  <ul>\n");
      out.write("                      <li><a href=\"\"><i class=\"fa fa-user\"></i>Photo</a></li>\n");
      out.write("                      <li><a href=\"\"><i class=\"fa fa-user\"></i>Video</a></li>\n");
      out.write("                      <li><a href=\"\"><i class=\"fa fa-user\"></i>Text</a></li>\n");
      out.write("                      <li><a href=\"\"><i class=\"fa fa-user\"></i>Effects</a></li>\n");
      out.write("                      \n");
      out.write("                  </ul>\n");
      out.write("                  </li>\n");
      out.write("                      <li><a href=\"\"><i class=\"fa fa-user\"></i>Eliminar</a></li>\n");
      out.write("                      \n");
      out.write("                      </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("             <li><a href=\"\"><i class=\"fa fa-user\"></i>Presupuesto</a></li>\n");
      out.write("             <li><a href=\"\"><i class=\"fa fa-user\"></i>Web Design</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </boby>\n");
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
