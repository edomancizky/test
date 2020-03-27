<%-- 
    Document   : newjsp
    Created on : 19/08/2019, 10:39:49 AM
    Author     : Usuario
--%>

<%@page import="prg.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
           <style>
        body{ background-image:url("imagenes/fondo1.png")}
        
        
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda Formula Detalle</title>
    </head>
    <script>
        function retornar(id,prod,mat,acc,det) {
            if (!window.opener.closed) {
                window.opener.document.forms[0].id_producto.value = id;
                window.opener.document.forms[0].descripcion.value = prod;
                window.opener.document.forms[0].descripcion.value = mat;
                window.opener.document.forms[0].descripcion.value = acc;
                window.opener.document.forms[0].descripcion.value = det;
              
                window.opener.focus();
                window.close();
            }
        }

        function myFunction() {
            // Declare variables 
            var input, filter, table, tr, td, i, txtValue;
            input = document.getElementById("myInput");
            filter = input.value.toUpperCase();
            table = document.getElementById("myTable");
            tr = table.getElementsByTagName("tr");

            // Loop through all table rows, and hide those who don't match the search query
            for (i = 0; i < tr.length; i++) {
                td = tr[i].getElementsByTagName("td")[1];
                if (td) {
                    txtValue = td.textContent || td.innerText;
                    if (txtValue.toUpperCase().indexOf(filter) > -1) {
                        tr[i].style.display = "";
                    } else {
                        tr[i].style.display = "none";
                    }
                }
            }
        }
    </script>
    <body>

    <center>
        <h1><p style="color:black";> Busqueda Formula Detalle  </p></h1><br>
        <p style ="color:black";>Buscar : <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Ingrese descripcion"> </p>
        <br>


        <table border="1" width="50%" id="myTable" style="color: black">
            <tr class="header">
                <th style="width:50%;">Código</th>
                <th style="width:40%;">Producto</th>
                <th style="width:40%;">Material</th>
                <th style="width:40%;">Accesorios</th>
                <th style="width:40%;">Detalles</th>
                
                
                <th style="width:40%;">Seleccionar</th>
            </tr>
            <%
                conexion bd = new conexion();
                bd.conecta();

                try {
                    bd.listar_datos("select * from vs_formula_detalles");
                    while (bd.resultado.next()) {
                        out.println("<tr>");

                        out.println("<td>");
                        out.println(bd.resultado.getString("id_formula_det"));
                        out.println("</td>");

                        out.println("<td>");
                        out.println(bd.resultado.getString("producto"));
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(bd.resultado.getString("material"));
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(bd.resultado.getString("accesorios"));
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(bd.resultado.getString("detalles"));
                        out.println("</td>");
                        
                        

                        out.println("<td>");
                        out.println("<a href=\"javascript:retornar(" + bd.resultado.getString("id_formula_det") + ",'" + bd.resultado.getString("producto")+ ",'" + bd.resultado.getString("material")+ ",'" + bd.resultado.getString("accesorios")+ ",'" + bd.resultado.getString("detalles")+ "');\"> "
                                + "<img src='imagenes/agregar.png' border='0'> "
                                + "</a>");
                        out.println("</td>");

                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    out.println("Error al cargar tabla" + e);
                }
            %>
        </table>
    </center>
</body>
</html>
