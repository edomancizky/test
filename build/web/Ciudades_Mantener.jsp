<%-- 
     Document   : Ciudades_Mantener
    Created on : Jul 31, 2019, 9:47:48 AM
    Author     : edomaniczky
--%>

<%@page import="prg.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantener Ciudades</title>
    </head>
    <body>
    <center>
        <h1>Mantener ciudades</h1>
        <br>
        <table width="50%">
            <tr>
            
                <th> <a href="ciudades_nuevo.jsp"> <input type="image" src="imagenes/agregar.png"> Nuevo</a></th>
                <th> <a href="menu_principal.jsp"> <input type="image" src="imagenes/editar.png">Volver al menu</a> </th>
                <th> <a href="Imprimir.jsp?condicion=ciudad&nombre_reporte=ciudad"> <input type="image" src="imagenes/editar.png">Imprimir</a> </th>
                
            </tr>
        </table>
        <br>
        
        
        <table border="1" width="50%">
            <tr>


                <th>
                    Codigo
                </th>
                <th>
                    User
                </th>
                <th>
                    Pass
                </th>
            
            </tr>
            <%
                conexion bd = new conexion();
                bd.conecta();
                try {
                        bd.listar_datos("select * from login");
                        while (bd.resultado.next()) {   
                            out.println("<tr>"); //columna codigo
                            
                            out.println("<th>"); //fila codigo
                            out.println(bd.resultado.getString("id_login"));
                            out.println("</th>");
                            
                            out.println("<th>"); //fila Descripcion
                            out.println(bd.resultado.getString("user"));
                            out.println("</th>");
                            
                            out.println("<th>"); //fila Descripcion
                            out.println(bd.resultado.getString("pass"));
                            out.println("</th>");
                            
                           
                            
                            }
                    } catch (Exception e) {
                        out.println("error al cargar tabla");
                    }


            %>
        </table>

    </center>
</body>
</html>
