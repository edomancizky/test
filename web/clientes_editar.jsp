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
        <title> Clientes editar</title>
    </head>
    <body>
    <center>
        <h1> Clientes Editar</h1>
        <br>
        <%
            String vcodigo="",vid = "", vnroips = "",vfecha = "",vdescriA = "", vnombre = "",vapellido = "",vci = "",vdirecc = "",vtel = "",vciudad = "",vcar = "",vsueld = "",vnac = "",vgrupo = "",vemail = "",vec = "";
            vcodigo = request.getParameter("vcod");
            conexion bd = new conexion();
            bd.conecta();
            try {
                bd.listar_datos("select * from vs_empleados "
                        + " where id_personal =" + vcodigo
                        + "order by id_personal");
                bd.resultado.next();
                
                vnombre = bd.resultado.getString("nombre");
                vapellido = bd.resultado.getString("apellido");
                vcar = bd.resultado.getString("id_cargo");
                vci = bd.resultado.getString("ci");
                vdirecc = bd.resultado.getString("direccion");
                vemail = bd.resultado.getString("email");
                 vtel = bd.resultado.getString("telefono");
                 vec = bd.resultado.getString("ecivil");
                 vfecha = bd.resultado.getString("fecha_nacimiento");
                 vciudad = bd.resultado.getString("id_ciudad");
                 vsueld = bd.resultado.getString("salario");
                 vnac = bd.resultado.getString("id_nacionalidad");
 
                vcodigo = bd.resultado.getString("id_personal");
            
                
            } catch (Exception e) {
                out.println("Error al recuperar " + e);
            }
        %>
        <form method="post" action="clientes_abm.jsp?condicion=modificar">
            <table border="1" width="50%">
                   
                    <tr>
                    <td>Codigo</td>
                    <td><input value="<%=vcodigo%>" name="txtid" size="10" readonly=""></td>
                    </tr>
                    
                     <tr>
                    <td> Nombres  </td> 
                    <td> <input value="<%=vnombre%>" name="txtnombre" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                 
                <tr>
                    <td> Apellidos</td> 
                    <td> <input value="<%=vapellido%>" name ="txtapellido" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                <tr>
                    <td>
                        Cargo :
                    </td>
                    <td>
                        <select name="txtcargo">
                            <%                            try {
                                    bd.listar_datos("select * from cargo order by id_cargo");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("id_cargo") + ">" + bd.resultado.getString("cargo") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            %>


                        </select>
                    </td>
                </tr>
                
                 <tr>
                    <td> Cedula</td> 
                    <td> <input value="<%=vci%>" name ="txtci" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
                  <tr>
                    <td> Direccion</td> 
                    <td> <input value="<%=vdirecc%>" name ="txtdireccion" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                <tr>
                    <td> Email</td> 
                    <td> <input value="<%=vemail%>" name ="txtemail" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                 <tr>
                    <td> Telefono</td> 
                    <td> <input value="<%=vtel%>" name ="txttelefono" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
               <tr>
                    <td>
                        Estado civil :
                    </td>
                    <td>
                        <select name="txtec">
                            <%                            try {
                                    bd.listar_datos("select * from estado_civil order by ecivil");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("ecivil") + ">" + bd.resultado.getString("descripcion") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            %>


                        </select>
                    </td>
                </tr>
                
                
                 <tr>
                    <td> Fecha de nac.</td> 
                    <td> <input value="<%=vfecha%>" name ="txtfechanac" size="30" maxlength="50" type="date" required=""</td>
                </tr>
                
               
                
                
                
                
                <tr>
                    <td>
                        Ciudad :
                    </td>
                    <td>
                        <select name="txtciudad">
                            <%                            try {
                                    bd.listar_datos("select * from ciudad order by id_ciudad");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("id_ciudad") + ">" + bd.resultado.getString("ciudad") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            %>


                        </select>
                    </td>
                </tr>
                
                
                
                
                 <tr>
                    <td> Salario</td> 
                    <td> <input value="<%=vsueld%>" name ="txtsueldo" size="30" maxlength="50" type="number" required=""</td>
                </tr>
             
                
                              <tr>
                    <td>
                        Nacionalidad :
                    </td>
                    <td>
                        <select name="txtnacionalidad">
                            <%                            try {
                                    bd.listar_datos("select * from nacionalidad order by id_nacionalidad");
                                    while (bd.resultado.next()) {
                                        out.println("<option value=" + bd.resultado.getString("id_nacionalidad") + ">" + bd.resultado.getString("nacionalidad") + "</option>");
                                    }
                                } catch (Exception e) {
                                    out.println("Error al cargar marcas " + e);
                                }

                            %>


                        </select>
                    </td>
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
