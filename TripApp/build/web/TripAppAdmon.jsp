<%-- 
    Document   : TripAppAdmon
    Created on : 16/01/2022, 03:54:52 PM
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
    <link rel="stylesheet" href="css/StyleGominolas.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TripApp</title>
</head>

<body>
    <header>
        <div class="menu"><a href="#" class="button-menu"><span class="icon-menu"></span></a></div>
        <nav>
            <li class="gomitaAs"><a href="#" class="chinga" style="color: #09570a;">TripApp</a></li>
        </nav>
    </header>

    <div id="contenedor">
        <div class="hombres">
            <h2 name="cuenta" class="pueblo">ADMINISTRADOR</h2>
        </div>
    </div>

    <div>
        <h4 class="solteraCasada">ADMINISTRACIÓN DE LOS SITIOS TURÍSTICOS</h4>
        <form action="" class="form-control" style="width: 100%; height: auto; border: none; text-align: center;">
            <a href="TripAppAgregar.jsp" class="btn btn-default"
                style="background: #3e7c17; width: auto; height: auto; font-size: 15px; color: white; border-color: black;">Agregar</a>
            <a href="TripAppActualizar.jsp" class="btn btn-default"
                style="background: #3e7c17; width: auto; height: auto; font-size: 15px; color: white; border-color: black;">Actualizar</a>
            <a href="TripAppEliminar.jsp" class="btn btn-default"
                style="background: #3e7c17; width: auto; height: auto; font-size: 15px; color: white; border-color: black;">Eliminar</a>
            <a href="TripAppIndex.jsp" class="btn btn-default"
                style="background: #3e7c17; width: auto; height: auto; font-size: 15px; color: white; border-color: black;">Cerrar sesión</a>
        </form>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="menu.js"></script>
</body>

</html>
