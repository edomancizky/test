<%@page import="java.sql.PreparedStatement"%>
<%@page import="prg.conexion"%>
<%
    //Declarar variables para reutilizar
    String vid = "", vcli ="",vfecha ="", vestado="",vpersonal ="", vcondicion="";
    vid = request.getParameter("txtid"); 
    vcli = request.getParameter("id_cliente");   
    vfecha = request.getParameter("txtfecha"); 
    vestado = request.getParameter("txtestado");
    vpersonal = request.getParameter("id_personal");
    
    



    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();


    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO presupuesto( "
                    + " id_presupuesto,id_cliente,estado,fecha,id_personal)"
                    + " VALUES(?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setInt(2, Integer.parseInt(vcli)); 
            p.setString(3, vestado); 
            p.setString(4, vfecha);           
            p.setInt(5, Integer.parseInt(vpersonal)); 
            
            
            p.executeUpdate();
            response.sendRedirect("presupuesto_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update presupuesto set id_cliente=?,fecha=?,estado=?,id_personal=? "
                    + " where id_presupuesto=? ");
            //pk empleados
            pm.setInt(1, Integer.parseInt(vcli));                             
            pm.setString(2, vfecha); 
            pm.setString(3, vestado);   
            pm.setInt(4, Integer.parseInt(vpersonal)); 
            pm.setInt(5, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("presupuesto_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from presupuesto "
                    + " where id_presupuesto=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("presupuesto_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }


%>

