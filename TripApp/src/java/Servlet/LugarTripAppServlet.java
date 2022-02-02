/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.EntLugarTripApp;
import Negocio.NegLugarTripApp;
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
 * @author SEBASTIAN
 */
public class LugarTripAppServlet extends HttpServlet {

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

        String modulo = "./TripAppAdmon.jsp";

        NegLugarTripApp lugar = new NegLugarTripApp();
        EntLugarTripApp entLugar = new EntLugarTripApp();

        request.setAttribute("lista", null);
        request.setAttribute("datos", null);
        request.setAttribute("target", null);

        String id_lugar = request.getParameter("txtid_turistico");
        String nombre_lugar = request.getParameter("txtnombre_turistico");
        String punto_cardinal = request.getParameter("txtpunto_turistico");
        String ubicacion = request.getParameter("txtubicacion_turistico");
        Object imagen = request.getParameter("fileimagen_turistico");
        String descripcion = request.getParameter("txtdescripcion_turistico");
        String mensaje = "";
        int idLugar = 0;
        

        if ("Agregar".equals(request.getParameter("Agregar"))) {
            idLugar = Integer.parseInt(id_lugar);
            try {
                lugar.Registro(new EntLugarTripApp(idLugar, nombre_lugar, punto_cardinal, ubicacion, imagen, descripcion));
                mensaje = "Registrado";
            } catch (Exception e) {
                Logger.getLogger(UsuarioTripAppServlet.class.getName()).log(Level.SEVERE, null, e);
                mensaje += "" + e.getMessage();
            }
            request.setAttribute("mensaje", mensaje);
        }
        
        if ("Actualizar".equals(request.getParameter("Actualizar"))) {
            idLugar = Integer.parseInt(id_lugar);
            try {
                lugar.actualizarLugar(new EntLugarTripApp(idLugar, nombre_lugar, punto_cardinal, ubicacion, imagen, descripcion));
                //admin.(codigo_admin, nombre_admin, correo_admin, contra_admin);
                mensaje = "Editado";
                List<EntLugarTripApp> listProductos = lugar.ListaLugar();
            } catch (Exception e) {
                Logger.getLogger(LugarTripAppServlet.class.getName()).log(Level.SEVERE, null, e);
                mensaje += "" + e.getMessage();
            }
            request.setAttribute("mensaje", mensaje);
        }
        
        if ("Eliminar".equals(request.getParameter("Eliminar"))) {
            idLugar = Integer.parseInt(id_lugar);
            try {
                 lugar.EliminarLugar(idLugar);
                 mensaje = "Borrado";
                
            } catch (Exception e) {
                Logger.getLogger(LugarTripAppServlet.class.getName()).log(Level.SEVERE, null, e);
                mensaje += "" + e.getMessage();
            }
            request.setAttribute("mensaje", mensaje);
        }
        
        request.getRequestDispatcher(modulo).forward(request, response);//Redireciona a la pagina

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
