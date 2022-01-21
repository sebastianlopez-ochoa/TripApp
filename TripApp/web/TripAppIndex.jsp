<%-- 
    Document   : TripAppIndex
    Created on : 16/01/2022, 03:58:59 PM
    Author     : SEBASTIAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css">
    <link rel="stylesheet" href="css/Style.css">
    <link rel="stylesheet" href="css/StyleInicio.css">
    <link rel="stylesheet" href="css/icomoon/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TripApp</title>
</head>

<body>
    <header>
        <div class="menu"><a href="#" class="button-menu"><span class="icon-menu"></span></a></div>
        <nav>
            <li class="nav-logo"><a href="#" class="chinga" style="color: #09570a;">TripApp</a></li>
            <li><a href="#" class="gomitas" style="color: #3e7c17;">Inicio</a></li>
            <li><a href="TripAppMiCuenta.jsp" class="gomitas">Iniciar sesión/Registrarse</a></li>
        </nav>
    </header>

    <div id="contenedor">
        <div class="inicio">
            <h1 class="logo-inicio">TripApp</h1>
            <p class="texto">CORTOS, LARGOS PLANEADOS O SIN RUMBO... ¡LO IMPORTANTE ES VIAJAR!</p>
            <select name="select">
                <option value="SUR" selected>SUR</option>
                <option value="NORTE">NORTE</option>
                <option value="ORIENTE">ORIENTE</option>
                <option value="OCCIDENTE">OCCIDENTE</option>
            </select>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="menu.js"></script>
</body>

</html>
