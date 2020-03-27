<%-- 
    Document   : acceso
    Created on : 29/09/2019, 04:28:06 PM
    Author     : DAVID
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceso</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <style>
    body { background-image: url("imagenes/red2.jpg") }
    </style>
    
    <body>
        
        <div class="container well" id="containerLogin">
            
            <center> <img src="imagenes/user1.png" alt="" class="img-circle"/> </center>
            
            
            
            <form id="form1" name="frm_acceso" action="control_acceso.jsp" method="post">
  <div class="form-group">
    
      <input name="txtusuario" type="text" class="form-control" id="exampleInputEmail1" placeholder="Usuario">
  </div>
  <div class="form-group">
    
      <input name="txtclave" type="text" class="form-control" id="exampleInputPassword1" placeholder="Contraseña">
  </div>
  
  <div class="checkbox">
    <label>
      <input type="checkbox"> Guardar contraseña
    </label>
  </div>
                <button type="submit" class="btn btn-danger" id="botonLogin">Submit</button>
</form>
            
        </div>
        
        
        
        
    </body>
</html>
