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
            out.println("<meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                    "    <title>CoCoffe</title>\n" +
                    "    <link rel=\"shortcut icon\" href=\"img/icon.png\" type=\"image/x-icon\">\n" +
                    "    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800&display=swap\" rel=\"stylesheet\"> \n" +
                    "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">");            
            out.println("</head>");
            
            out.println("<body>");
            out.println("<header>\n" +
                    "      <!--  <nav>\n" +
                    "            <a href=\"\"></a>\n" +
                    "            <a href=\"\"></a>\n" +
                    "        </nav>-->\n" +
                    "        <section class=\"textos-header\">\n" +
                    "            <h1>CoCoffe</h1>\n" +
                    "            <h2>El cliente ingresado se encuentra en estado: " +Client.getClients().get(Client.getClients().size()-1).getInfo().get(Client.getClients().get(Client.getClients().size()-1).getInfo().size()-1) + "</h2>\n" +
                    "        </section>\n" +
                    "        <div class=\"wave\" style=\"height: 150px; overflow: hidden;\"><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\"\n" +
                    "                style=\"height: 100%; width: 100%;\">\n" +
                    "                <path d=\"M0.00,49.98 C150.00,150.00 349.20,-50.00 500.00,49.98 L500.00,150.00 L0.00,150.00 Z\"\n" +
                    "                    style=\"stroke: none; fill: #fff;\"></path>\n" +
                    "            </svg></div>\n" +
                    "    </header>");
            out.println("<main>\n" +
                    "        <section class=\"contenedor sobre-nosotros\">\n" +
                    "            <h2 class=\"titulo\">Informacion</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://images.unsplash.com/photo-1441109296207-fd911f7cd5e5?ixlib=rb-1.2.1&auto=format&fit=crop&w=1371&q=80\" alt=\"\" class=\"imagen-about-us\">\n" +
                    "                <div class=\"contenido-textos\">\n" +
                    "                    <h3><span>1</span>Sobre lo que has pedido:</h3>");
            if(Client.getClients().get(Client.getClients().size()-1).getInfo().get(Client.getClients().get(Client.getClients().size()-1).getInfo().size()-1).equals("Recovered")){
                out.println("<p>El cliente ingresado ya existe, se agregó una nueva petición </p>");
            }else{
                out.println("<p>El cliente ingresado aun no existe, se ha creado </p>");
            }
            out.println("<h3><span>2</span>Mas opciones</h3>\n" +
                    "                    <a href=\"Orders\" type=\"button\" class=\"btn btn-outline-warning\">Reservados</a>\n" +
                    "                    <a href=\"index.jsp\" type=\"button\" class=\"btn btn-outline-warning\">Inicio</a>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </section>\n" +
                    "    </main>");
            //out.println("<input type=\"submit\" value=\"Continuar\">");
            //out.println("<form action=\"Orders\" method=\"GET\">");
            //out.println("<a href=\"index.jsp\">Inicio</a>" );
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
