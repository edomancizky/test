<%-- 
    Document   : ciudades_editar
    Created on : Aug 2, 2019, 10:07:09 AM
    Author     : edomaniczky
--%>

<%@page import="prg.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Formula Detalles editar</title>
        <script type="text/javascript">

        function AbrirCentrado(Url, NombreVentana, width, height, extras) {
            var largo = width;
            var altura = height;
            var adicionales = extras;
            var top = (screen.height - altura) / 2;
            var izquierda = (screen.width - largo) / 2;
            nuevaVentana = window.open('' + Url + '', '' + NombreVentana + '', 'width=' + largo + ',height=' + altura + ',top=' + top + ',left=' + izquierda + ',features=' + adicionales + '' + ',status=yes, scrollbars=yes, resize=yes, menubar=no');
            nuevaVentana.focus();
        }



    </script>
    </head>
    <body>
    <center>
        <h1> Formula Detalles Editar</h1>
        <br>
        <%
            String vid = "", vcondicion="",vprod ="",vmat ="", vacc="",vdet ="", vcodigo="";
            
            vcodigo = request.getParameter("vcod");
            conexion bd = new conexion();
            bd.conecta();
            try {
                bd.listar_datos("select * from formula_det "
                        + " where id_formula_det =" + vcodigo
                        + "order by id_formula_det");
                bd.resultado.next();
                
                vprod = bd.resultado.getString("id_producto");
                vmat = bd.resultado.getString("material");
                vacc = bd.resultado.getString("accesorios");
                vdet = bd.resultado.getString("detalles");
                
            
                
            } catch (Exception e) {
                out.println("Error al recuperar " + e);
            }
        %>
        <form method="post" action="formula_detalles_abm.jsp?condicion=modificar">
            <table border="1" width="50%">
                   
                    <tr>
                    <td>Codigo</td>
                    <td><input value="<%=vcodigo%>" name="txtid" size="10" readonly=""></td>
                    </tr>
                    
          <tr>

                     <td>
                         Producto :
                    </td>
                    <td>
                        <input required="" name="id_producto"
                               type="hidden"
                               size="5"
                               id="id_cliente"
                               value="" maxlength="0" >
                        <input  name="descripcion"
                               type="text"
                               id="descripcion"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                    

                        <a href="javascript:AbrirCentrado('busqueda_producto.jsp','articulo','950','550','');">
                  <img src="imagenes/buscar.png" border="0" alt="Buscar" /> 
                        </a>
                    </td>
                </tr>
                 
                <tr>
                    <td> Material</td> 
                    <td> <input value="<%=vmat%>" name ="txtmat" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                  <tr>
                    <td> Accesorios</td> 
                    <td> <input value="<%=vacc%>" name ="txtacc" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                      <tr>
                    <td> Detalles</td> 
                    <td> <input value="<%=vdet%>" name ="txtdet" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                
                
                   
               

                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="Guardar">
                        &nbsp;&nbsp;
                        <input type="reset" value="Limpiar campos">       
                    </td>
                </tr>
                
                
                
                
            </table>          



        </form>


    </center>
</body>
</html>
