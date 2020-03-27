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
        <title>Registro de empleados</title>
    </head>
    <body>
    <center>
        <h1>Registro de empleados</h1>
        <br>
        <%
            conexion bd = new conexion();
            bd.conecta();
            String vcod = "";
            try {
                bd.listar_datos("Select coalesce(max(id_personal),0) +1 as codigo from personal");
                bd.resultado.next();
                vcod = bd.resultado.getString("codigo");

            } catch (Exception e) {
                out.println("Error en el auto nunerico" + e);
            }
        %>


        <form method="post" action="personal_abm.jsp?condicion=nuevo">
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
                    <td> <input name ="txtci" size="30" maxlength="50" type="number" required=""</td>
                </tr>
                
                  <tr>
                    <td> Direccion</td> 
                    <td> <input name ="txtdireccion" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                 <tr>
                    <td> Email</td> 
                    <td> <input name ="txtemail" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                <tr>
                    <td> Telefono</td> 
                    <td> <input name ="txttelefono" size="30" maxlength="50" type="text" required=""</td>
                </tr>
                
                   <tr>
                    <td>
                        Estado Civil :
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
                    <td> <input name ="txtfechanac" size="30" maxlength="50" type="date" required=""</td>
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
                    <td> <input name ="txtsueldo" size="30" maxlength="50" type="number" required=""</td>
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
