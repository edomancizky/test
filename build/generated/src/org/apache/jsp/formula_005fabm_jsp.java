package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import prg.conexion;

public final class formula_005fabm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    //Declarar variables para reutilizar
    String vid = "", vprod ="",vmat ="", vacc="",vdet ="", vcondicion="";
    vid = request.getParameter("txtid"); 
    vprod = request.getParameter("id_producto");   
    vmat = request.getParameter("txtmat"); 
    vacc = request.getParameter("txtacc");
    vdet = request.getParameter("txtdet");
    
    



    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();


    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO formula_det( "
                    + " id_formula_det,id_producto,material,accesorios,detalles)"
                    + " VALUES(?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setInt(2, Integer.parseInt(vprod)); 
            p.setString(3, vmat); 
            p.setString(4, vacc);           
             p.setString(5, vdet);  
            
            
            p.executeUpdate();
            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update formula_det set id_producto=?,material=?,accesorios=?,detallesw=? "
                    + " where id_formula_det=? ");
            //pk empleados
            pm.setInt(1, Integer.parseInt(vprod));                             
            pm.setString(2, vmat); 
            pm.setString(3, vacc);   
            pm.setString(4, vdet);  
            pm.setInt(5, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from formula_det "
                    + " where id_formula_det=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }



      out.write('\n');
      out.write('\n');
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
