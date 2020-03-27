

<%@page import="prg.conexion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="javax.swing.JOptionPane"%>
<<%@ page language="java" import="java.sql.*" %>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.engine.JRException"%>
<%@page import="net.sf.jasperreports.engine.util.JRLoader"%>
<%@page import="net.sf.jasperreports.engine.util.*"%>
<%@page import="net.sf.jasperreports.engine.JasperReport"%>
<%@page import="net.sf.jasperreports.engine.JRRuntimeException"%>


<%

    String v_condicion = request.getParameter("condicion");
    String v_nombre_reporte=request.getParameter("nombre_reporte");
   
    ResultSet resultado=null ;

    conexion bd =new conexion(); // instancia conexion
    bd.conecta(); // conecta a la base de datos
    



%>

<%


    File reporte = new File(application.getRealPath("/reportes/"+v_nombre_reporte+".jasper"));
    if (!reporte.exists()) {
        throw new JRRuntimeException("No se encuentra el archivo reporte.");
    } else {
        JasperReport masterReport = null;
        try {
            masterReport = (JasperReport) JRLoader.loadObject(reporte);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            e.printStackTrace();
            System.exit(3);
        }
    }
    try {


        Statement st = bd.conexion.createStatement();
        if(v_condicion.equals("mercaderias")){
             resultado = st.executeQuery("select * from vs_mercaderias");
        }
        
       
        
       
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "error de conexion" + e);
    }
    JRResultSetDataSource jrRS = new JRResultSetDataSource(resultado);
    Map masterParams = new HashMap();
    //Aqui se envia los parametros al jasper
    //masterParams.put("anho", ano);
    byte[] bytes = JasperRunManager.runReportToPdf(reporte.getPath(), masterParams, jrRS);

    response.setContentType(
            "application/pdf");
    response.setContentLength(bytes.length);
    ServletOutputStream ouputStream = response.getOutputStream();

    ouputStream.write(bytes,
            0, bytes.length);
    ouputStream.flush();

    ouputStream.close();
    //  }
%>