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
        <title>Fromula detalle nuevo</title>
        
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
        <h1> Fromula detalle nuevo</h1>
        <br>
        <%
            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_formula_det),0) +1 as codigo from formula_det");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        %>


        <form method="post" action="formula_detalles_abm.jsp?condicion=nuevo">
            <table border="1" width="50%">
                <tr>
                    <td>Id</td>
                    <td><input value="<%=vcod%>" name="txtid" size="10" type="text" readonly=""> </td>
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
                    <td> <input name ="txtmat" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                
                
                 <tr>
                    <td> Accesorios</td> 
                    <td> <input name ="txtacc" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                <tr>
                    <td> Detalles</td> 
                    <td> <input name ="txtdet" size="30" maxlength="50" type="text" required=""</td>
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
