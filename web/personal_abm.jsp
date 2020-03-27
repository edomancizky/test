<%@page import="java.sql.PreparedStatement"%>
<%@page import="prg.conexion"%>
<%
    //Declarar variables para reutilizar
    String vid = "", vnroips = "", vfecha = "", vdescriA = "", vnombre = "", vapellido = "", vci = "", vdirecc = "", vtel = "", vciudad = "", vcar = "", vsueld = "", vnac = "", vgrupo = "", vemail = "", vec = "", vcondicion = "";
    vid = request.getParameter("txtid"); //pk de tabla
    vnombre = request.getParameter("txtnombre");   //nombre
    vapellido = request.getParameter("txtapellido"); //apellido
    vci = request.getParameter("txtci"); //cedula
    vnroips = request.getParameter("txtnroips"); //ips
    vfecha = request.getParameter("txtfechanac"); //fecha nacimiento
    vdirecc = request.getParameter("txtdireccion");   //Direccion
    vtel = request.getParameter("txttelefono");   //telefono
    vciudad = request.getParameter("txtciudad");   //Ciudad
    vcar = request.getParameter("txtcargo");   //Cargo
    vsueld = request.getParameter("txtsueldo"); //sueldo
    vnac = request.getParameter("txtnacionalidad");  //Nacionalidad
    vgrupo = request.getParameter("txtgrupo");   //Grupo Sanguineo
    vemail = request.getParameter("txtemail"); //Email 
    vec = request.getParameter("txtec"); // Estado Civil

    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();
    out.println(vcar + "\n");

    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO personal( "
                    + " id_personal,nombre,apellido,id_cargo,ci,direccion,email,telefono,ecivil,fecha_nacimiento,id_ciudad,salario,id_nacionalidad)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setString(2, vnombre);                               
            p.setString(3, vapellido); 
            p.setInt(4, Integer.parseInt(vcar)); 
            p.setInt(5,Integer.parseInt(vci));  
            p.setString(6, vdirecc);
            p.setString(7, vemail);
            p.setInt(8, Integer.parseInt(vtel));  
            p.setInt(9, Integer.parseInt(vec));  
            p.setDate(10, java.sql.Date.valueOf(vfecha));        
            p.setString(11, vciudad); 
            p.setInt(12, Integer.parseInt(vsueld));
            p.setInt(13, Integer.parseInt(vnac));  

            p.executeUpdate();
            response.sendRedirect("personal_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update personal set nombre=?,apellido=?,id_cargo=?,ci=?,direccion=?,email=?,telefono=?, "
                    + "ecivil=?,fecha_nacimiento=?,id_ciudad=?,salario=?,id_nacionalidad=? "
                    + " where id_personal=? ");
            //pk empleados
            pm.setString(1, vnombre);                                
            pm.setString(2, vapellido); 
            pm.setInt(3, Integer.parseInt(vcar));     
            pm.setInt(4, Integer.parseInt(vci)); 
            pm.setString(5, vdirecc); 
            pm.setString(6, vemail);  
            pm.setInt(7, Integer.parseInt(vtel));
            pm.setInt(8, Integer.parseInt(vec));
            pm.setDate(9, java.sql.Date.valueOf(vfecha));         
            pm.setInt(10, Integer.parseInt(vciudad));
            pm.setInt(11, Integer.parseInt(vsueld)); 
            pm.setInt(12, Integer.parseInt(vnac));   
            pm.setInt(13, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("personal_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from personal "
                    + " where id_personal=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("personal_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }


%>

