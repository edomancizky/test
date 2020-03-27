

<html>
<head>
    <link rel="stylesheet" href="css/font-awesome.css" type="text/css">
    <style>
        
        *{
            margin: 0px;
            padding: 0px;
        }
        
        .main{
            
            margin: 50px;
        }
        .main ul{
            list-style: none;
        }
        
        .main ul li{
            background-color: rgb(80,80,80);
            width: 250px;
            position: relative;
            float: left;  
            font-size: 26px;
        }
        
        .main ul li a{
            text-decoration: none;
            color: white;
            padding: 16px 0px 16px 40px;
            display: block;
        }
        .main ul li a:hover{
            background-color: rgb(13,124,220);
            
        }
        i{
            margin-right: 15px;
        }
        
        .main ul ul{
            margin-top: 7px;
            display: none;
            position: absolute;
        }
        .main ul li:hover ul{
            display: block;
        }
        
        .main ul ul ul{
            
            margin-left: 250px;
            margin-top: -65px;
        }
        
        .main ul > li>a{
            
            border-right:2px solid grey;
        }
        
        .main >ul >li{
            
            border-bottom: 7px solid rgb(13,124,220);
        }
        
        main>ul>li>ul li{
            
           border-bottom: 2px solid grey;
        }
        
        .main ul ul ul {
            
            display: none;
            visibility: hidden;
        }
        .main >ul> li> ul> li:hover ul{
            visibility: visible;
            display: block;
        }
    </style>
    


</head>

<boby>
    <div class="main">
        
        <ul>
        
            <li><a href=""><i class="fa fa-user"></i>Inicio</a></li>
            <li><a href=""><i class="fa fa-user"></i>Clientes</a>
            <li><a href=""><i class="fa fa-user"></i>Produccion</a>
                <ul>
                  <li><a href=""><i class="fa fa-user"></i>Nuevo</a></li>  
                  <li><a href=""><i class="fa fa-user"></i>Editar</a>
                  
                  
                  <ul>
                      <li><a href=""><i class="fa fa-user"></i>Photo</a></li>
                      <li><a href=""><i class="fa fa-user"></i>Video</a></li>
                      <li><a href=""><i class="fa fa-user"></i>Text</a></li>
                      <li><a href=""><i class="fa fa-user"></i>Effects</a></li>
                      
                  </ul>
                  </li>
                      <li><a href=""><i class="fa fa-user"></i>Eliminar</a></li>
                      
                      </ul>
                  </li>
                  
             <li><a href=""><i class="fa fa-user"></i>Presupuesto</a></li>
             <li><a href=""><i class="fa fa-user"></i>Web Design</a></li>
            
        </ul>
        
        
        
        
    </div>
    
    
    </boby>
</html>
