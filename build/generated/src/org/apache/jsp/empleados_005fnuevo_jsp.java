package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.conexion;

public final class empleados_005fnuevo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registro de empleados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registro de empleados</h1>\n");
      out.write("        <br>\n");
      out.write("        ");

            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_personal),0) +1 as codigo from personal");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"empleados_abm.jsp?condicion=nuevo\">\n");
      out.write("            <table border=\"1\" width=\"50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Id</td>\n");
      out.write("                    <td><input value=\"");
      out.print(vcod);
      out.write("\" name=\"txtid\" size=\"10\" type=\"text\" readonly=\"\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Nombres  </td> \n");
      out.write("                    <td> <input name =\"txtnombre\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                    <td> Apellidos</td> \n");
      out.write("                    <td> <input name =\"txtapellido\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Cedula</td> \n");
      out.write("                    <td> <input name =\"txtci\" size=\"30\" maxlength=\"50\" type=\"number\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Fecha de nac.</td> \n");
      out.write("                    <td> <input name =\"txtfechanac\" size=\"30\" maxlength=\"50\" type=\"date\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Direccion</td> \n");
      out.write("                    <td> <input name =\"txtdireccion\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Telefono</td> \n");
      out.write("                    <td> <input name =\"txttelefono\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Ciudad :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"txtciudad\">\n");
      out.write("                            ");
                            try {
                                    bd.listar_datos("select * from ciudad order by ciu_cod");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("ciu_cod") + ">" + bd.resultado.getString("ciu_desc") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Cargo :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"txtcargo\">\n");
      out.write("                            ");
                            try {
                                    bd.listar_datos("select * from cargo order by cargo_cod");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("cargo_cod") + ">" + bd.resultado.getString("cargo_desc") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Salario</td> \n");
      out.write("                    <td> <input name =\"txtsueldo\" size=\"30\" maxlength=\"50\" type=\"number\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("                              <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Nacionalidad :\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"txtnacionalidad\">\n");
      out.write("                            ");
                            try {
                                    bd.listar_datos("select * from nacionalidad order by nac_cod");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("nac_cod") + ">" + bd.resultado.getString("nac_desc") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Email</td> \n");
      out.write("                    <td> <input name =\"txtemail\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                    <td> Estado Civil</td> \n");
      out.write("                    <td> <input name =\"txtec\" size=\"30\" maxlength=\"50\" type=\"text\" required=\"\"</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                \n");
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
