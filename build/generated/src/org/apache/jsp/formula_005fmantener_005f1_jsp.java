package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.conexion;

public final class formula_005fmantener_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Formula Mantener</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Formula Mantener</h1>\n");
      out.write("        <br>\n");
      out.write("        <table width=\"50%\">\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <th> <a href=\"personal_nuevo.jsp\"> <input type=\"image\" src=\"imagenes/agregar.png\"> Nuevo</a></th>\n");
      out.write("                <th> <a href=\"menu_principal.jsp\"> <input type=\"image\" src=\"imagenes/editar.png\">Volver al menu</a> </th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"50%\">\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                      \n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <th> Insumos  </th> \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <th> Descripcion  </th> \n");
      out.write("                    \n");
      out.write("                    <th> Detalles  </th> \n");
      out.write("                   \n");
      out.write("                \n");
      out.write("               \n");
      out.write("                    <th> Editar</th> \n");
      out.write("                    <th> Eliminar</th> \n");
      out.write("    \n");
      out.write("                \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                conexion bd = new conexion();
                bd.conecta();
                try {
                    bd.listar_datos("select * from vs_clientes");
                    while (bd.resultado.next()) {
                        out.println("<tr>"); //columna codigo

                        out.println("<th>"); //fila codigo
                        out.println(bd.resultado.getString("id_personal"));
                        out.println("</th>");

                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("nombre"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("apellido"));
                        out.println("</th>");
                        
                        out.println("<th>");
                         out.println("<a href='formula_detalles_mantener.jsp?condicion=&var"+bd.resultado.getString("id_formula") + "'> <input type='image' src='imagenes/eliminar.png'></a>");
                        out.println("</th>");
                        
                        
                        
                        out.println("<th>");
                        out.println("<a href='formula_editar.jsp?vcod=" + bd.resultado.getString("id_personal") + "'> <input type='image' src='imagenes/editar.png'></a>");
                        out.println("</th>");

                        out.println("<th>");
                         out.println("<a href='formula_abm.jsp?condicion=eliminar&txtid="+bd.resultado.getString("id_personal") + "'> <input type='image' src='imagenes/eliminar.png'></a>");
                        out.println("</th>");

                    }
                } catch (Exception e) {
                    out.println("error al cargar tabla");
                }


            
      out.write("\n");
      out.write("        </table>\n");
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
