<%-- 
    Document   : TripAppMiCuenta
    Created on : 16/01/2022, 03:59:40 PM
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
            <li class="nav-logo"><a href="#" class="chinga" style="color: #09570a;">TripApp</a></li>
            <li><a href="TripAppIndex.jsp" class="gomitas">Inicio</a></li>
            <li><a href="#" class="gomitas"style="color: #3e7c17;">Iniciar sesión/Registrarse</a></li>
        </nav>
    </header>

    <div id="contenedor">
        <div class="hombres">
            <h2 class="pueblo">MI CUENTA</h2>
        </div>
    </div>

    <div class="container">
        <div class="row">
            <article class="col-sm-6 col-md-6">
                <form action="InicioSesionTripAppServlet" class="form-control" style="width: 100%; height: auto; border: none;">
                    <h4 class="texto10">INICIAR SESIÓN</h4>
                    <h4 class="texto9">Email:</h4>
                    <input type="text" name="txtCorreo" class="form-control" placeholder="Email" />
                    <h4 class="texto9">Contraseña:</h4>
                    <input type="password" name="txtContrasena" class="form-control" placeholder="Contraseña" />
                    <br>
                    <input type="submit" class="btn btn-primary btn-lg" id="login" value="Log in"
                        style="background: #3e7c17; width: auto; height: auto; font-size: 15px; border-color: black;" />
                </form>
            </article>
            <article class="col-sm-6 col-md-6">
                <form action="UsuarioTripAppServlet" method="post" class="form-control"
                    style="width: 100%; height: auto; border: none; padding-bottom: 30px;">
                    <h4 class="texto10">REGISTRARSE</h4>
                    <h4 class="texto9">Email:</h4>
                    <input type="email" name="txtemail_registro" class="form-control" placeholder="Email" />
                    <h4 class="texto9">Contraseña:</h4>
                    <input type="password" name="txtcontra_registro" class="form-control" placeholder="Contraseña" />
                    <br>
                    <input type="submit" class="btn btn-primary btn-lg" name="Registrarse" id="Registrarse" value="Registrarse"
                        style="background: #3e7c17; width: auto; height: auto; font-size: 15px; border-color: black;" />
                </form>
            </article>
        </div>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="menu.js"></script>
</body>

</html>
