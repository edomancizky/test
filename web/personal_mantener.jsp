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
        <title>Empleados</title>
    </head>
    <body>
    <center>
        <h1>Empleados</h1>
        <br>
        <table width="50%">
            <tr>

                <th> <a href="personal_nuevo.jsp"> <input type="image" src="imagenes/agregar.png"> Nuevo</a></th>
                <th> <a href="menu_principal.jsp"> <input type="image" src="imagenes/editar.png">Volver al menu</a> </th>

            </tr>
        </table>
        <br>


        <table border="1" width="50%">
            <tr>


                      
                    <th>Codigo</th>
                  
                
                
                
                    <th> Nombres  </th> 
                   
                
                 
                
                    <th> Apellidos</th> 
                    
                
                
              
                    <th> Cedula</th> 
                 
    
                
                
              
                    <th> Direccion</th> 
                
             
                
                
                    <th> Email</th> 
                    
                
                 
                    <th> Telefono</th> 
             
       
                
                 
                    <th> Estado Civil</th> 
                   
              
                
                 
                    <th> Fecha nacimiento</th> 
              
                
                
              
                    <th> Ciudad</th> 
           
                
                
                    <th> Cargo</th> 
                    
                    
                    <th> Nacionalidad</th> 
                    
                    
                    
                    <th> Editar</th> 
                    <th> Eliminar</th> 
    
                
                    

            </tr>
            <%
                conexion bd = new conexion();
                bd.conecta();
                try {
                    bd.listar_datos("select * from vs_empleados");
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
                        
                     
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("ci"));
                        out.println("</th>");
                       
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("direccion"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("email"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("telefono"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("descripcion"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("fecha_nacimiento"));
                        out.println("</th>");
                        
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("ciudad"));
                        out.println("</th>");
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("cargo"));
                        out.println("</th>");
                           
                           
                        
                        out.println("<th>"); //fila Descripcion
                        out.println(bd.resultado.getString("nacionalidad"));
                        out.println("</th>");
                        
                       
                
                        
                        out.println("<th>");
                        out.println("<a href='personal_editar.jsp?vcod=" + bd.resultado.getString("id_personal") + "'> <input type='image' src='imagenes/editar.png'></a>");
                        out.println("</th>");

                        out.println("<th>");
                         out.println("<a href='personal_abm.jsp?condicion=eliminar&txtid="+bd.resultado.getString("id_personal") + "'> <input type='image' src='imagenes/eliminar.png'></a>");
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
