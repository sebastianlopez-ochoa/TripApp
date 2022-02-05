/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.EntLugarTripApp;
import Negocio.NegLugarTripApp;
import Negocio.NegUsuarioTripApp;
import Persistencia.LugarTripAppDaos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEBASTIAN
 */
public class IndexTripAppServlet extends HttpServlet {

    EntLugarTripApp l = new EntLugarTripApp();
    LugarTripAppDaos dao = new LugarTripAppDaos();
    NegLugarTripApp co = new NegLugarTripApp();

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
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":
                
                
                List<EntLugarTripApp> lista = dao.Listaprueba();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("TripAppIndex.jsp").forward(request, response);

                break;
                
            case "Buscar":
                String dato = request.getParameter("txtBuscar");
                List<EntLugarTripApp> buscar = dao.buscar(dato);
                request.setAttribute("lista", buscar);
                request.getRequestDispatcher("TripAppIndex.jsp").forward(request, response);
                
                break;
            default:
                request.getRequestDispatcher("IndexTripAppServlet?accion=Listar").forward(request, response);
                break;

        }

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
