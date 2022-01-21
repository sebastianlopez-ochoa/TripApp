/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.EntUsuarioTripApp;
import Negocio.NegUsuarioTripApp;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class UsuarioTripAppServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
       
        String modulo = "./TripAppMiCuenta.jsp";
        
        NegUsuarioTripApp registro = new NegUsuarioTripApp();
        EntUsuarioTripApp entRegistro = new EntUsuarioTripApp();
        
        request.setAttribute("lista", null);
        request.setAttribute("datos", null);
        request.setAttribute("target", null);
        
        String email_registro = request.getParameter("txtemail_registro");
        String contraseña_registro = request.getParameter("txtcontra_registro");
        String mensaje = "";
        

        
        //Registro Regsitro
        //Funciona
        if ("Registrarse".equals(request.getParameter("Registrarse"))) {            
            try {
               registro.Registro(new EntUsuarioTripApp(email_registro, contraseña_registro));
               mensaje = "Registrado";
            } catch (Exception e) {
                Logger.getLogger(UsuarioTripAppServlet.class.getName()).log(Level.SEVERE, null, e);
                mensaje += "" + e.getMessage();
            }
            request.setAttribute("mensaje", mensaje);
        }//fin Registro
       
        request.getRequestDispatcher(modulo).forward(request, response);
    }//fin processRequest
    

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
