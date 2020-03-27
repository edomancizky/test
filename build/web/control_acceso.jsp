<%@page import="java.sql.PreparedStatement"%>
<%@page import="prg.conexion"%>
<%
    conexion bd = new conexion();
    bd.conecta();

    String vusuario = request.getParameter("txtusuario");
    String vclave = request.getParameter("txtclave");

    try {
        bd.listar_datos("SELECT *  FROM login where id_user='" + vusuario + "' "
                + " and pass='" + vclave + "'");
        if (bd.resultado.next()) {
            response.sendRedirect("menu_principal.jsp");
        } else {
            response.sendRedirect("acceso.jsp");
        }
    } catch (Exception e) {
        out.println(e);
    }
    
%>