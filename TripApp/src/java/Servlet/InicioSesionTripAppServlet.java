/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Negocio.NegUsuarioTripApp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEBASTIAN
 */
@WebServlet(name = "InicioSesionTripAppServlet", urlPatterns = {"/InicioSesionTripAppServlet"})
public class InicioSesionTripAppServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        NegUsuarioTripApp co = new NegUsuarioTripApp();
        String email_inicio_sesion = request.getParameter("txtCorreo");
        String contrasena_inicio_sesion = request.getParameter("txtContrasena");

        if (co.AutenticarRegistro(email_inicio_sesion, contrasena_inicio_sesion)) {
            if (co.AutenticarTipoUsuario(email_inicio_sesion, contrasena_inicio_sesion).getId_rol() == 2) {
                //Pantalla ??? jsp
                response.sendRedirect("TripAppAdmon.jsp");
            } else {
                //Pantalla Admin jsp
                response.sendRedirect("TripAppCliente.jsp");
            }

        } else {
            response.sendRedirect("TripAppMiCuenta.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
