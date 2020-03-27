<%-- 
    Document   : ciudades_nuevo
    Created on : Aug 1, 2019, 9:21:35 AM
    Author     : edomaniczky
--%>

<%@page import="prg.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de clientes</title>
    </head>
    <body>
    <center>
        <h1>Registro de clientes</h1>
        <br>
        <%
            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_cliente),0) +1 as codigo from clientes");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        %>


        <form method="post" action="clientes_abm.jsp?condicion=nuevo">
            <table border="1" width="50%">
                <tr>
                    <td>Id</td>
                    <td><input value="<%=vcod%>" name="txtid" size="10" type="text" readonly=""> </td>
                </tr>
                
                 <tr>
                    <td> Nombres  </td> 
                    <td> <input name ="txtnombre" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                 
                <tr>
                    <td> Apellidos</td> 
                    <td> <input name ="txtapellido" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                
                
                 <tr>
                    <td> Cedula</td> 
                    <td> <input name ="txtci" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
                  <tr>
                    <td> Direccion</td> 
                    <td> <input name ="txtdireccion" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                <tr>
                    <td> Telefono</td> 
                    <td> <input name ="txttelefono" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
                 <tr>
                    <td> Email</td> 
                    <td> <input name ="txtemail" size="30" maxlength="50" type="text" required=""</td>
                </tr>
               
               
                 <tr>
                    <td>RUC</td> 
                    <td> <input name ="txtruc" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
               
                
       
            
                <tr>
                    <td></td>
                    <td>
                        <input value="Guardar" type="submit">
                        &nbsp;&nbsp;
                        <input value="Limpiar campo" type="reset"> 
                    </td>
                </tr>

            </table>
        </form>    
    </center>
</body>
</html>
