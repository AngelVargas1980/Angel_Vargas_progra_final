<%-- 
    Document   : home.jsp
    
    Author     : Angel Vargas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PrograII - App Web</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        
        <script src="js/script.js"></script>
        
    </head>
    <body>  
      
        <img src="imagenes/logoMiumg3.png" align="center" alt=""/>
        <img src="imagenes/cabecera.jpg" align="center" alt=""/>
        <img src="imagenes/logoMiumg2.jpg" align="center" alt=""/>
        
   
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <a class="navbar-brand" href="https://www.canva.com/design/DAFRBGsJ7WY/GopQndEpzUBWSFznj2fgJA/view?utm_content=DAFRBGsJ7WY&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink">QUIENES SOMOS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="home.jsp">Home</a>
          </li>
          
        <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="FormularioLibro.jsp">Registro Libro</a>
         </li>
         
         <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="FormularioRegistro.jsp">Registro Usuario</a>
         </li>
         
         <li class="nav-item active">
            <a class="nav-link" aria-current="page" href="FormularioEgreso.jsp">Registro de Egreso</a>
         </li>
         
         
          
<%--          
          <li class="nav-item">
            <a class="nav-link" href="#">Link</a>
          </li>
          
                    
          <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
                  MENU
              </a>


            <ul class="dropdown-menu dropdown-menu-dark" id="menu-navbar">
              <li><a class="dropdown-item" href="homeLibro.jsp">Registro Libro</a></li>              
              <li><a class="dropdown-item" href="homeUsuario.jsp">Registro Usuario</a></li>
              <li><hr class="dropdown-divider"></li>
                  
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>

          </li>
            --%>

 <%-- 
          <li class="nav-item">
            <a class="nav-link disabled">Disabled</a>
          </li>
 --%>          
          
        </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>    

    </div>
    <div>
    <img src="imagenes/homeImagen.gif" align="center" width="1400" height="700" />   
    </div>
    
    
    
    </body>
</html>
