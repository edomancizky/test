package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import prg.conexion;

public final class personal_005fabm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String vid = "", vnroips = "", vfecha = "", vdescriA = "", vnombre = "", vapellido = "", vci = "", vdirecc = "", vtel = "", vciudad = "", vcar = "", vsueld = "", vnac = "", vgrupo = "", vemail = "", vec = "", vcondicion = "";
    vid = request.getParameter("txtid"); //pk de tabla
    vnombre = request.getParameter("txtnombre");   //nombre
    vapellido = request.getParameter("txtapellido"); //apellido
    vci = request.getParameter("txtci"); //cedula
    vnroips = request.getParameter("txtnroips"); //ips
    vfecha = request.getParameter("txtfechanac"); //fecha nacimiento
    vdirecc = request.getParameter("txtdireccion");   //Direccion
    vtel = request.getParameter("txttelefono");   //telefono
    vciudad = request.getParameter("txtciudad");   //Ciudad
    vcar = request.getParameter("txtcargo");   //Cargo
    vsueld = request.getParameter("txtsueldo"); //sueldo
    vnac = request.getParameter("txtnacionalidad");  //Nacionalidad
    vgrupo = request.getParameter("txtgrupo");   //Grupo Sanguineo
    vemail = request.getParameter("txtemail"); //Email 
    vec = request.getParameter("txtec"); // Estado Civil

    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();
    out.println(vcar + "\n");

    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO personal( "
                    + " id_personal,nombre,apellido,id_cargo,ci,direccion,email,telefono,ecivil,fecha_nacimiento,id_ciudad,salario,id_nacionalidad)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setString(2, vnombre);                               
            p.setString(3, vapellido); 
            p.setString(4, vcar); 
            p.setInt(5,Integer.parseInt(vci));  
            p.setString(6, vdirecc);
            p.setString(7, vemail);
            p.setString(8, vtel);  
            p.setString(9, vec);  
            p.setDate(10, java.sql.Date.valueOf(vfecha));        
            p.setString(11, vciudad); 
            p.setInt(12, Integer.parseInt(vsueld));
            p.setString(13, vnac); 

            p.executeUpdate();
            response.sendRedirect("personal_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update personal set nombre=?,apellido=?,id_cargo=?ci=?,direccion=?,email=?,telefono=?, "
                    + "ecivil=?,fecha_nacimiento=?,id_ciudad=?,salario=?,id_nacionalidad=? "
                    + " where id_personal=? ");
            //pk empleados
            pm.setString(1, vnombre);                                
            pm.setString(2, vapellido); 
            pm.setInt(3, Integer.parseInt(vcar.trim()));    
            pm.setInt(4, Integer.parseInt(vci));       
            pm.setString(5, vdirecc); 
            pm.setString(6, vemail);  
            pm.setString(7, vtel);  
            pm.setInt(8, Integer.parseInt(vec.trim()));  
            pm.setDate(9, java.sql.Date.valueOf(vfecha));         
            pm.setInt(10, Integer.parseInt(vciudad.trim()));  
            pm.setInt(11, Integer.parseInt(vsueld));
           pm.setInt(12, Integer.parseInt(vnac.trim()));  
            pm.setInt(13, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("personal_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from personal "
                    + " where id_personal=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("personal_mantener.jsp");

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
