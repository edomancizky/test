package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.conexion;

public final class formula_005fdetalles_005feditar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Formula Detalles editar</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
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
      out.write("        <h1> Formula Detalles Editar</h1>\n");
      out.write("        <br>\n");
      out.write("        ");

            String vid = "", vcondicion="",vprod ="",vmat ="", vacc="",vdet ="", vcodigo="";
            
            vcodigo = request.getParameter("vcod");
            conexion bd = new conexion();
            bd.conecta();
            try {
                bd.listar_datos("select * from formula_det "
                        + " where id_formula_det =" + vcodigo
                        + "order by id_formula_det");
                bd.resultado.next();
                
                vprod = bd.resultado.getString("id_producto");
                vmat = bd.resultado.getString("material");
                vacc = bd.resultado.getString("accesorios");
                vdet = bd.resultado.getString("detalles");
                
            
                
            } catch (Exception e) {
                out.println("Error al recuperar " + e);
            }
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"formula_detalles_abm.jsp?condicion=modificar\">\n");
      out.write("            <table border=\"1\" width=\"50%\">\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                    <td>Codigo</td>\n");
      out.write("                    <td><input value=\"");
      out.print(vcodigo);
      out.write("\" name=\"txtid\" size=\"10\" readonly=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("          <tr>\n");
      out.write("\n");
      out.write("                     <td>\n");
      out.write("                         Producto :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input required=\"\" name=\"id_producto\"\n");
      out.write("                               type=\"hidden\"\n");
      out.write("                               size=\"5\"\n");
      out.write("                               id=\"id_cliente\"\n");
      out.write("                               value=\"\" maxlength=\"0\" >\n");
      out.write("                        <input  name=\"descripcion\"\n");
      out.write("                               type=\"text\"\n");
      out.write("                               id=\"descripcion\"\n");
      out.write("                              value=\"\" \n");
      out.write("                               size=\"30\"\n");
      out.write("                               maxlength=\"50\"\n");
      out.write("                               STYLE=\"text-transform:uppercase\" readonly >\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                        <a href=\"javascript:AbrirCentrado('busqueda_producto.jsp','articulo','950','550','');\">\n");
      out.write("                  <img src=\"imagenes/buscar.png\" border=\"0\" alt=\"Buscar\" /> \n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                    <td> Material</td> \n");
      out.write("                    <td> <input value=\"");
      out.print(vmat);
      out.write("\" name =\"txtmat\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                  <tr>\n");
      out.write("                    <td> Accesorios</td> \n");
      out.write("                    <td> <input value=\"");
      out.print(vacc);
      out.write("\" name =\"txtacc\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                      <tr>\n");
      out.write("                    <td> Detalles</td> \n");
      out.write("                    <td> <input value=\"");
      out.print(vdet);
      out.write("\" name =\"txtdet\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("               \n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Guardar\">\n");
      out.write("                        &nbsp;&nbsp;\n");
      out.write("                        <input type=\"reset\" value=\"Limpiar campos\">       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
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
