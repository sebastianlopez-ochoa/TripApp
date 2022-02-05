<%-- 
    Document   : TripAppVer
    Created on : 4/02/2022, 03:29:09 PM
    Author     : SEBASTIAN
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="Utilidades.ConexionBDA"%>
<%@page import="java.sql.Connection"%>
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
            int id = Integer.parseInt(request.getParameter("idd"));
            smt = con.createStatement();
            rs = smt.executeQuery("select * from lugar where id_lugar=" + id);
            while (rs.next()) {
        %>
        <div class="container">

            <form action="" method="post" class="form-control"
                  style="width: 100%; height: auto; border: none; padding-bottom: 30px;">
                <h4 class="texto10"><a href="TripAppIndex.jsp"  style="color: #3e7c17;"><-</a></h4>
                <article class="col-sm-6 col-md-6">

                    <h1 style="font-size: 25px; font-weight: 1000; color: black;" ><%= rs.getInt("id_lugar")%>-<%= rs.getString("nombre_lugar")%></h1>
                    <br>
                    <h1  style="font-size: 20px; color: black;">Punto cardinal <%= rs.getString("punto_cardinal")%></h1>
                    <h1  style="font-size: 20px; color: black;">Ubicado en <%= rs.getString("ubicacion")%></h1>


                </article>
                <article class="col-sm-6 col-md-6">

                </article>

                <br>
                <br>

                <article class="col-sm-6 col-md-12">
                    <td style="width: auto; height: auto; border: 0;"><h1 style="color: black; font-size: 20px"><%= rs.getString("descripcion")%></h1></td>
                </article>
            </form>            
        </div>




        <div class="container">
            <form action="ComentarioServlet" method="post" class="form-control"
                  style="width: 100%; height: auto; border: none; padding-bottom: 30px;">  
                <input type="text" style="display: none;" name="txt_id_lugar"  value="<%= rs.getInt("id_lugar")%>" />

                <%}%>
                <h4 class="texto10">Agregar comentario</h4>
                <h4 class="texto9">Nombre:</h4>
                <input type="text" name="txt_nombre" class="form-control" placeholder="Nombre" />
                <h4 class="texto9">Comentario:</h4>
                <input type="text" name="txt_comen" class="form-control" placeholder="Comentario" />
                <br>
                <input type="submit" class="btn btn-primary btn-lg" name="Agregar" id="Agregar" value="Agregar"
                       style="background: #3e7c17; width: auto; height: auto; font-size: 15px;" />
            </form>
        </div>


    <center>
        <div class="col-sm-14 col-md-14">
            <div class="container">               
                <table class="table table-bordered"  id="tablaDatos">
                    <thead>
                        <tr>
                            <th class="text-center">Nombre</th>
                            <th class="text-center">Comentario</th>
                        </tr>
                    </thead>
                    <tbody id="tbodys">
                        <%
                            rs = smt.executeQuery("select * from comentario where id_lugar=" + id);
                            while (rs.next()) {
                        %>
                        <tr>
                            <td><%= rs.getString("nombre_persona")%></td>
                            <td><%= rs.getString("comentario")%></td>
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
