/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import client.Client;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jackl
 */
public class Existance extends HttpServlet {

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
        Client customer = new Client(request.getParameter("full-name"),request.getParameter("full-address"), request.getParameter("type_select"), request.getParameter("product_select"), Integer.parseInt(request.getParameter("full-ammount")));
        customer.order();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Existance</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El pedido ingresado se encuentra en estado: " + Client.getClients().get(Client.getClients().size()-1).getInfo().get(Client.getClients().get(Client.getClients().size()-1).getInfo().size()-1) + "</h1>");
            if(Client.getClients().get(Client.getClients().size()-1).getInfo().get(Client.getClients().get(Client.getClients().size()-1).getInfo().size()-1).equals("Recovered")){
                out.println("<h3>El pedido ingresado ya existe, se agregó una nueva petición </h3>");
            }else{
                out.println("<h3>El pedido ingresado aun no existe, se ha creado </h3>");
            }
            out.println("<input type=\"submit\" value=\"Continuar\">");
            out.println("<form action=\"Orders\" method=\"GET\">");
            out.println("<a href=\"index.jsp\">Inicio</a>" );
            out.println("</body>");
            out.println("</html>");
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
