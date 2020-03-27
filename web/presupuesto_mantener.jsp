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
        <title>Presupuestos</title>
    </head>
    <body>
    <center>
        <h1>Presupuestos</h1>
        <br>
        <table width="50%">
            <tr>

                <th> <a href="presupuesto_nuevo.jsp"> <input type="image" src="imagenes/agregar.png"> Nuevo</a></th>
                <th> <a href="menu_principal.jsp"> <input type="image" src="imagenes/editar.png">Volver al menu</a> </th>

            </tr>
        </table>
        <br>


        <table border="1" width="50%">
            <tr>


                      
                    <th>Codigo</th>
                  
                
                
                
                    <th> Cliente  </th> 
                    
                    
                    <th> Ruc  </th> 
                   
                
                 
                
                    <th> Fecha</th> 
                    
                
                
              
                    <th> Estado</th> 
                 
               
                
                 
                
                    
                
                
              
                    <th> Personal</th> 
                
               
                    <th> Editar</th> 
                    <th> Eliminar</th> 
    
                

            </tr>
            <%
                conexion bd = new conexion();
                bd.conecta();
                try {
                    bd.listar_datos("select * from vs_presupuesto order by id_presupuesto ");
                    while (bd.resultado.next()) {
                        out.println("<tr>"); //columna codigo

                        out.println("<th>"); //fila codigo
                        out.println(bd.resultado.getString("id_presupuesto"));
                        out.println("</th>");

                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("nombrescli"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("ruc"));
                        out.println("</th>");
                        
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("fecha"));
                        out.println("</th>");
                        
                     
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("estado"));
                        out.println("</th>");
                       
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("nomper"));
                        out.println("</th>");
                   
                        
                        out.println("<th>");
                        out.println("<a href='presupuesto_editar.jsp?vcod=" + bd.resultado.getString("id_presupuesto") + "'> <input type='image' src='imagenes/editar.png'></a>");
                        out.println("</th>");

                        out.println("<th>");
                         out.println("<a href='presupuesto_abm.jsp?condicion=eliminar&txtid="+bd.resultado.getString("id_presupuesto") + "'> <input type='image' src='imagenes/eliminar.png'></a>");
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
