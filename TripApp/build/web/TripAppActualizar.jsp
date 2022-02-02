<%-- 
    Document   : TripAppActualizar
    Created on : 16/01/2022, 03:52:57 PM
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
            <h2 class="pueblo">ADMINISTRADOR</h2>
        </div>
    </div>

    <div class="container">
        <form action="LugarTripAppServlet" method="post" class="form-control"
            style="width: 100%; height: auto; border: none; padding-bottom: 30px;">
            <h4 class="texto10"><a href="TripAppAdmon.jsp"  style="color: #3e7c17;"><-</a>ACTUALIZAR SITIO TURÍSTICO</h4>
            <h4 class="texto9">Id sitio turístico:</h4>
            <input type="text" name="txtid_turistico" class="form-control" placeholder="Id sitio turístico" />
            <h4 class="texto9">Nombre sitio turístico:</h4>
            <input type="text" name="txtnombre_turistico" class="form-control" placeholder="Nombre sitio turístico" />
            <h4 class="texto9">Punto cardinal:</h4>
            <input type="text" name="txtpunto_turistico" class="form-control" placeholder="Puto cardinal" />
            <h4 class="texto9">Ubicación:</h4>
            <input type="text" name="txtubicacion_turistico" class="form-control" placeholder="Ubicación" />
            <h4 class="texto9">Imagen:</h4>
            <input type="file" name="fileimagen_turistico" class="form-control" accept=".jpg, .jpeg, .png, .svg, .gif" />
            <h4 class="texto9">Descripción:</h4>
            <input type="text" name="txtdescripcion_turistico" class="form-control" placeholder="Descripción" />
            <br>
            <input type="submit" class="btn btn-primary btn-lg" name="Actualizar" id="Actualizar" value="Actualizar"
                style="background: #3e7c17; width: auto; height: auto; font-size: 15px;" />
        </form>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="menu.js"></script>
</body>

</html>
