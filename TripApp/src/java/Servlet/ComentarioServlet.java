/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.EntComentarioTripApp;
import Negocio.NegComentarioTripApp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEBASTIAN
 */
@WebServlet(name = "ComentarioServlet", urlPatterns = {"/ComentarioServlet"})
public class ComentarioServlet extends HttpServlet {

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

        NegComentarioTripApp comen = new NegComentarioTripApp();

        request.setAttribute("lista", null);
        request.setAttribute("datos", null);
        request.setAttribute("target", null);
        String mensaje = "";

        String nombre_persona = request.getParameter("txt_nombre");
        String comentario = request.getParameter("txt_comen");
        String id_lugar = request.getParameter("txt_id_lugar");
        int idLugar;
        if ("Agregar".equals(request.getParameter("Agregar"))) {
            idLugar = Integer.parseInt(id_lugar);
            try {
                comen.Registro(new EntComentarioTripApp(nombre_persona, comentario, idLugar));
                mensaje = "Registrado";
            } catch (Exception e) {
                Logger.getLogger(UsuarioTripAppServlet.class.getName()).log(Level.SEVERE, null, e);
                mensaje += "" + e.getMessage();
            }
            request.setAttribute("mensaje", mensaje);
        }
        
        String modulo = "./TripAppVer.jsp?idd="+id_lugar;
        request.getRequestDispatcher(modulo).forward(request, response);
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
