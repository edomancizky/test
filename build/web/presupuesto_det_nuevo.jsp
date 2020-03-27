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
        <title>Presupueso nuevo</title>
        
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
        <h1>Presupuesto detalles nuevo</h1>
        <br>
        <%
            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_presupuesto),0) +1 as codigo from presupuesto");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        %>


        <form method="post" action="presupuesto_abm.jsp?condicion=nuevo">
            <table border="1" width="50%">
                <tr>
                    <td>Id</td>
                    <td><input value="<%=vcod%>" name="txtid" size="10" type="text" readonly=""> </td>
                </tr>
                
                
                
                    <tr>

                     <td>
                         Presupuesto :
                    </td>
                    <td>
                        <input required="" name="id_presupuesto"
                               type="hidden"
                               size="5"
                               id="id_presupuesto"
                               value="" maxlength="0" >
                        <input  name="id_cliente"
                               type="text"
                               id="id_cliente"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        <input  name="fecha"
                               type="text"
                               id="fecha"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        <input  name="estado"
                               type="text"
                               id="estado"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        
                        <input  name="id_personal"
                               type="text"
                               id="id_personal"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >

                        <a href="javascript:AbrirCentrado('busqueda_clientes.jsp','articulo','950','550','');">
                  <img src="imagenes/buscar.png" border="0" alt="Buscar" /> 
                        </a>
                    </td>
                </tr>
                 
               
                
                  <td>
                         Producto :
                    </td>
                    <td>
                        <input required="" name="id_producto"
                               type="hidden"
                               size="5"
                               id="id_producto"
                               value="" maxlength="0" >
                        <input  name="nombre"
                               type="text"
                               id="nombre"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        <input  name="tipo_prod"
                               type="text"
                               id="tipo_prod"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        
                        <input  name="descripcion"
                               type="text"
                               id="descripcion"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                
               <a href="javascript:AbrirCentrado('busqueda_personal.jsp','articulo','950','550','');">
                  <img src="imagenes/buscar.png" border="0" alt="Buscar" /> 
                        </a>
               
                
       
            
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
