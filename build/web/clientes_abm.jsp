<%@page import="java.sql.PreparedStatement"%>
<%@page import="prg.conexion"%>
<%
    //Declarar variables para reutilizar
    String vid = "", vruc = "",  vnombre = "", vapellido = "", vci = "", vdirecc = "", vtel = "", vemail = "", vcondicion = "";
    vid = request.getParameter("txtid"); //pk de tabla
    vnombre = request.getParameter("txtnombre");   //nombre
    vapellido = request.getParameter("txtapellido"); //apellido
    vci = request.getParameter("txtci"); //cedula
    vdirecc = request.getParameter("txtdireccion");   //Direccion
    vtel = request.getParameter("txttelefono");   //telefono
    vemail = request.getParameter("txtemail"); //Email 
    vruc = request.getParameter("txtruc");

    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();


    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO clientes( "
                    + " id_cliente,nombre,apellido,ci,direccion,telefono,email,ruc)"
                    + " VALUES(?,?,?,?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setString(2, vnombre);                               
            p.setString(3, vapellido); 
            p.setInt(4,Integer.parseInt(vci));              
            p.setString(5, vdirecc);
             p.setInt(6,Integer.parseInt(vtel)); 
              p.setString(7, vemail);
             p.setInt(8,Integer.parseInt(vruc)); 
            
            p.executeUpdate();
            response.sendRedirect("clientes_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update clientes set nombre=?,apellido=?,ci=?,direccion=?,telefono=?,email=?,ruc=? "
                    + " where id_cliente=? ");
            //pk empleados
            pm.setString(1, vnombre);                                
            pm.setString(2, vapellido); 
            pm.setInt(3, Integer.parseInt(vci));     
            pm.setString(4, vdirecc); 
            pm.setString(5, vtel); 
            pm.setString(6, vemail);  
            pm.setInt(7, Integer.parseInt(vruc));   
            pm.setInt(8, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("clientes_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from clientes "
                    + " where id_cliente=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("clientes_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }


%>

