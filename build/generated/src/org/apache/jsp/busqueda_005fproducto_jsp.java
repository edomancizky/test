package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import prg.conexion;

public final class busqueda_005fproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <style>\n");
      out.write("        body{ background-image:url(\"imagenes/fondo1.png\")}\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Busqueda Personal</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        function retornar(id, desc,) {\n");
      out.write("            if (!window.opener.closed) {\n");
      out.write("                window.opener.document.forms[0].id_producto.value = id;\n");
      out.write("                window.opener.document.forms[0].descripcion.value = desc;\n");
      out.write("              \n");
      out.write("                window.opener.focus();\n");
      out.write("                window.close();\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function myFunction() {\n");
      out.write("            // Declare variables \n");
      out.write("            var input, filter, table, tr, td, i, txtValue;\n");
      out.write("            input = document.getElementById(\"myInput\");\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            table = document.getElementById(\"myTable\");\n");
      out.write("            tr = table.getElementsByTagName(\"tr\");\n");
      out.write("\n");
      out.write("            // Loop through all table rows, and hide those who don't match the search query\n");
      out.write("            for (i = 0; i < tr.length; i++) {\n");
      out.write("                td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("                if (td) {\n");
      out.write("                    txtValue = td.textContent || td.innerText;\n");
      out.write("                    if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                        tr[i].style.display = \"\";\n");
      out.write("                    } else {\n");
      out.write("                        tr[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1><p style=\"color:black\";> Busqueda Personal  </p></h1><br>\n");
      out.write("        <p style =\"color:black\";>Buscar : <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Ingrese descripcion\"> </p>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"50%\" id=\"myTable\" style=\"color: black\">\n");
      out.write("            <tr class=\"header\">\n");
      out.write("                <th style=\"width:50%;\">Código</th>\n");
      out.write("                <th style=\"width:40%;\">Producto</th>\n");
      out.write("                <th style=\"width:40%;\">Seleccionar</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                conexion bd = new conexion();
                bd.conecta();

                try {
                    bd.listar_datos("select * from producto");
                    while (bd.resultado.next()) {
                        out.println("<tr>");

                        out.println("<td>");
                        out.println(bd.resultado.getString("id_producto"));
                        out.println("</td>");

                        out.println("<td>");
                        out.println(bd.resultado.getString("descripcion"));
                        out.println("</td>");

                        out.println("<td>");
                        out.println("<a href=\"javascript:retornar(" + bd.resultado.getString("id_producto") + ",'" + bd.resultado.getString("nombre")+");\"> "
                                + "<img src='imagenes/agregar.png' border='0'> "
                                + "</a>");
                        out.println("</td>");

                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    out.println("Error al cargar tabla" + e);
                }
            
      out.write("\n");
      out.write("        </table>\n");
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
