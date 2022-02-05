<%-- 
    Document   : TripAppIndex
    Created on : 16/01/2022, 03:58:59 PM
    Author     : SEBASTIAN
--%>
<%@page import="Utilidades.ConexionBDA"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Persistencia.LugarTripAppDaos" %>
<%@page import="Entidades.EntLugarTripApp" %>
<%@page import="java.util.ArrayList"%>
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
        <%
            Connection con;
            ConexionBDA cn = new ConexionBDA();
            String usuario = "root";
            String password = "";
            String host = "localhost";
            String nombre_db = "tripapp";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String servidor = "jdbc:mysql://" + host + "/" + nombre_db;
            con = DriverManager.getConnection(servidor, usuario, password);
            PreparedStatement ps;
            
            Statement smt;
            ResultSet rs;
            smt = con.createStatement();
            rs = smt.executeQuery("select * from lugar");  
        %>
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

                <center>
                    <form class="form">
                        <input type="search" name="txtBuscar" placeholder=">>¿Qué quieres buscar?">
                        <br>
                        <br>
                    <input type="submit" name="accion" value="Buscar" class="btn btn-outline-primary">
                </form>
            </center>
            </div>
        </div>


        <div class="navbar">
            

            <%                String texto = request.getParameter("txtBuscar");

                if (texto != null) {
                    smt = con.createStatement();
                    rs = smt.executeQuery("select * from lugar where id_lugar like '%" + texto + "%' or nombre_lugar like '%" + texto + "%' or punto_cardinal like '%" + texto + "%' or ubicacion like '%" + texto + "%'");
                } else {
                    System.out.println("error");
                }
            %>
        </div>
    <center>
        <div>
            <div class="container">               
                <table class="table table-bordered"  id="tablaDatos">
                    <thead>
                        <tr>
                            <th class="text-center">ID</th>
                            <th class="text-center">NOMBRE</th>
                            <th class="text-center">PUNTO CARDINAL</th>
                            <th class="text-center">UBICACION</th>
                            <th class="text-center">DESCRIPCION</th>
                        </tr>
                    </thead>
                    <tbody id="tbodys">
                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <td class="text-center"><%= rs.getInt("id_lugar")%></td>
                            <td><%= rs.getString("nombre_lugar")%></td>
                            <td class="text-center"><%= rs.getString("punto_cardinal")%></td>
                            <td class="text-center"><%= rs.getString("ubicacion")%></td>
                            <td><%= rs.getString("descripcion")%></td>
                            <td class="text-center">
                                <a href="TripAppVer.jsp?idd=<%= rs.getInt("id_lugar")%>" class="btn btn-warning btn-sm">Ver</a>
                            </td>
                            </td>
                        </tr>
                        <%}%>
                </table>
            </div>  

        </div>
    </center>


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="menu.js"></script>
</body>

</html>
