/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

/* 
    
    Author     : Angel Vargas
*/

import Clases.ArrayRegistro;
import Clases.RegistroClase;
import Clases.ConexionBaseDeDatos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Angel Vargas
 */
@WebServlet(urlPatterns = {"/RegistroController"})
public class RegistroController extends HttpServlet {
RegistroClase usuario;
ArrayRegistro registroUsuario;

StringBuffer objetoRespuesta1 = new StringBuffer();
    

        
    
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
        try ( PrintWriter respuesta = response.getWriter()) {            
           
           registroUsuario=new ArrayRegistro();
           String control = request.getParameter("control");
           
           if(control.toUpperCase().equals("GUARDAR")){
               usuario=new RegistroClase(
                Integer.parseInt(request.getParameter("codigo_usuario")),
                request.getParameter("nombre_usuario"),
                request.getParameter("correo"),
                request.getParameter("telefono"));       
               
                registroUsuario.guardarUsuario2(usuario);//almacenarlo en BD                 
           }else if(control.toUpperCase().equals("ELIMINAR")){
               int codigoEliminar= Integer.parseInt(request.getParameter("codigo_usuario"));
               registroUsuario.eliminarUsuario(codigoEliminar);
           }
         
           registroUsuario.getUsuarios2(objetoRespuesta1);//consultar alumnos en la BD
           respuesta.write(objetoRespuesta1.toString());             
  
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
