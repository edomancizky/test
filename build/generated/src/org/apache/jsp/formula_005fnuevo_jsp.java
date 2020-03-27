package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.conexion;

public final class formula_005fnuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formula nuevo</title>\n");
      out.write("        \n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        function AbrirCentrado(Url, NombreVentana, width, height, extras) {\n");
      out.write("            var largo = width;\n");
      out.write("            var altura = height;\n");
      out.write("            var adicionales = extras;\n");
      out.write("            var top = (screen.height - altura) / 2;\n");
      out.write("            var izquierda = (screen.width - largo) / 2;\n");
      out.write("            nuevaVentana = window.open('' + Url + '', '' + NombreVentana + '', 'width=' + largo + ',height=' + altura + ',top=' + top + ',left=' + izquierda + ',features=' + adicionales + '' + ',status=yes, scrollbars=yes, resize=yes, menubar=no');\n");
      out.write("            nuevaVentana.focus();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1> Formula nuevo</h1>\n");
      out.write("        <br>\n");
      out.write("        ");

            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_formula_det),0) +1 as codigo from formula_det");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"formula_detalles_abm.jsp?condicion=nuevo\">\n");
      out.write("            <table border=\"1\" width=\"50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Id</td>\n");
      out.write("                    <td><input value=\"");
      out.print(vcod);
      out.write("\" name=\"txtid\" size=\"10\" type=\"text\" readonly=\"\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                     <td>\n");
      out.write("                         Detalles de formula :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input required=\"\" name=\"id_formula_det\"\n");
      out.write("                               type=\"hidden\"\n");
      out.write("                               size=\"5\"\n");
      out.write("                               id=\"id_cliente\"\n");
      out.write("                               value=\"\" maxlength=\"0\" >\n");
      out.write("                        <input  name=\"prod\"\n");
      out.write("                               type=\"text\"\n");
      out.write("                               id=\"prod\"\n");
      out.write("                              value=\"\" \n");
      out.write("                               size=\"30\"\n");
      out.write("                               maxlength=\"50\"\n");
      out.write("                               STYLE=\"text-transform:uppercase\" readonly >\n");
      out.write("                        \n");
      out.write("                        <input  name=\"mat\"\n");
      out.write("                               type=\"text\"\n");
      out.write("                               id=\"mat\"\n");
      out.write("                              value=\"\" \n");
      out.write("                               size=\"30\"\n");
      out.write("                               maxlength=\"50\"\n");
      out.write("                               STYLE=\"text-transform:uppercase\" readonly >\n");
      out.write("                        \n");
      out.write("                        <input  name=\"acc\"\n");
      out.write("                               type=\"text\"\n");
      out.write("                               id=\"acc\"\n");
      out.write("                              value=\"\" \n");
      out.write("                               size=\"30\"\n");
      out.write("                               maxlength=\"50\"\n");
      out.write("                               STYLE=\"text-transform:uppercase\" readonly >\n");
      out.write("                        <input  name=\"det\"\n");
      out.write("                               type=\"text\"\n");
      out.write("                               id=\"det\"\n");
      out.write("                              value=\"\" \n");
      out.write("                               size=\"30\"\n");
      out.write("                               maxlength=\"50\"\n");
      out.write("                               STYLE=\"text-transform:uppercase\" readonly >\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                        <a href=\"javascript:AbrirCentrado('busqueda_formula_detalle.jsp','articulo','950','550','');\">\n");
      out.write("                  <img src=\"imagenes/buscar.png\" border=\"0\" alt=\"Buscar\" /> \n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                    <td> Insumos</td> \n");
      out.write("                    <td> <input name =\"txtmat\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Descripcion</td> \n");
      out.write("                    <td> <input name =\"txtacc\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> Detalles</td> \n");
      out.write("                    <td> <input name =\"txtdet\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input value=\"Guardar\" type=\"submit\">\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <input value=\"Limpiar campo\" type=\"reset\"> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>    \n");
      out.write("    </center>\n");
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
