<%@page import="java.sql.PreparedStatement"%>
<%@page import="prg.conexion"%>
<%
    //Declarar variables para reutilizar
    String vid = "", vprod ="",vmat ="", vacc="",vdet ="", vcondicion="";
    vid = request.getParameter("txtid"); 
    vprod = request.getParameter("id_producto");   
    vmat = request.getParameter("txtmat"); 
    vacc = request.getParameter("txtacc");
    vdet = request.getParameter("txtdet");
    
    



    vcondicion = request.getParameter("condicion");
    conexion bd = new conexion();
    bd.conecta();


    //Agregar nueva ciudad
    if (vcondicion.equals("nuevo")) {

        try {
            PreparedStatement p = bd.conexion.prepareStatement("INSERT INTO formula_det( "
                    + " id_formula_det,id_producto,material,accesorios,detalles)"
                    + " VALUES(?,?,?,?,?);");
            p.setInt(1, Integer.parseInt(vid));  
            p.setInt(2, Integer.parseInt(vprod)); 
            p.setString(3, vmat); 
            p.setString(4, vacc);           
             p.setString(5, vdet);  
            
            
            p.executeUpdate();
            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }
    }

    if (vcondicion.equals("modificar")) {

        try {
            PreparedStatement pm = bd.conexion.prepareStatement(""
                    + " update formula_det set id_producto=?,material=?,accesorios=?,detalles=? "
                    + " where id_formula_det=? ");
            //pk empleados
            pm.setInt(1, Integer.parseInt(vprod));                             
            pm.setString(2, vmat); 
            pm.setString(3, vacc);   
            pm.setString(4, vdet);  
            pm.setInt(5, Integer.parseInt(vid));
            

            pm.executeUpdate();

            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }
    if (vcondicion.equals("eliminar")) {

        try {
            PreparedStatement pe = bd.conexion.prepareStatement(""
                    + " delete from formula_det "
                    + " where id_formula_det=? ");
            pe.setInt(1, Integer.parseInt(vid));
            pe.executeUpdate();
            response.sendRedirect("formula_detalles_mantener.jsp");

        } catch (Exception e) {
            out.println("Error al insertar" + e);
        }

    }


%>

