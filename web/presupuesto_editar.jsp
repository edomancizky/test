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
        <title> Presupuesto editar</title>
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
        <h1> Presupuesto Editar</h1>
        <br>
        <%
            String vid = "", vcli ="",vfecha ="", vestado="",vpersonal ="", vcondicion="",vcodigo="";
            
            vcodigo = request.getParameter("vcod");
            conexion bd = new conexion();
            bd.conecta();
            try {
                bd.listar_datos("select * from presupuesto "
                        + " where id_presupuesto =" + vcodigo
                        + "order by id_presupuesto");
                bd.resultado.next();
                
                vcli = bd.resultado.getString("id_cliente");
                vfecha = bd.resultado.getString("fecha");
                vestado = bd.resultado.getString("estado");
                vpersonal = bd.resultado.getString("id_personal");
                
            
                
            } catch (Exception e) {
                out.println("Error al recuperar " + e);
            }
        %>
        <form method="post" action="presupuesto_abm.jsp?condicion=modificar">
            <table border="1" width="50%">
                   
                    <tr>
                    <td>Codigo</td>
                    <td><input value="<%=vcodigo%>" name="txtid" size="10" readonly=""></td>
                    </tr>
                    
                     <tr>

                     <td>
                         Cliente :
                    </td>
                    <td>
                        <input required="" name="id_cliente"
                               type="hidden"
                               size="5"
                               id="id_cliente"
                               value="" maxlength="0" >
                        <input  name="nombre1"
                               type="text"
                               id="nombre1"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        <input  name="ruc"
                               type="text"
                               id="ruc"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >

                        <a href="javascript:AbrirCentrado('busqueda_clientes.jsp','articulo','950','550','');">
                  <img src="imagenes/buscar.png" border="0" alt="Buscar" /> 
                        </a>
                    </td>
                </tr>
                 
                <tr>
                    <td> Fecha</td> 
                    <td> <input value="<%=vfecha%>" name ="txtfecha" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                  <tr>
                    <td> Estado</td> 
                    <td> <input value="<%=vestado%>" name ="txtestado" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                
                
                
                    <td>
                         Personal :
                    </td>
                    <td>
                        <input required="" name="id_personal"
                               type="hidden"
                               size="5"
                               id="id_personal"
                               value="" maxlength="0" >
                        <input  name="nombre"
                               type="text"
                               id="nombre"
                              value="" 
                               size="30"
                               maxlength="50"
                               STYLE="text-transform:uppercase" readonly >
                        <input  name="apellido"
                               type="text"
                               id="apellido"
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
