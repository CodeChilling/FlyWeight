/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import client.*;
/**
 *
 * @author jackl
 */
public class Orders extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                    "    <title>CoCoffe</title>\n" +
                    "    <link rel=\"shortcut icon\" href=\"img/icon.png\" type=\"image/x-icon\">\n" +
                    "    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n" +
                    "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800&display=swap\" rel=\"stylesheet\"> \n" +
                    "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n" +
                    "</head>");            
            out.println("<body>");
            out.println("<header>\n" +
                    "      <!--  <nav>\n" +
                    "            <a href=\"\"></a>\n" +
                    "            <a href=\"\"></a>\n" +
                    "        </nav>-->\n" +
                    "        <section class=\"textos-header\">\n" +
                    "            <h1>CoCoffe</h1>\n" +
                    "            <h2>Pedidos obtenidos con anterioridad</h2>\n" +
                    "        </section>\n" +
                    "        <div class=\"wave\" style=\"height: 150px; overflow: hidden;\"><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\"\n" +
                    "                style=\"height: 100%; width: 100%;\">\n" +
                    "                <path d=\"M0.00,49.98 C150.00,150.00 349.20,-50.00 500.00,49.98 L500.00,150.00 L0.00,150.00 Z\"\n" +
                    "                    style=\"stroke: none; fill: #fff;\"></path>\n" +
                    "            </svg></div>\n" +
                    "    </header>");
            out.println("<main>\n" +
                                        "<section class=\"portafolio\">\n" +
                    "            <div class=\"contenedor\">\n" +
                    "                <h2 class=\"titulo\">Reservas</h2>\n" +
                    "                <div class=\"galeria-port\">");
                    //aqui
            for(int i=0; i < Client.getClients().size(); i++ ){
                out.println("<div class=\"imagen-port\">\n" +
                "                        <img src=\"https://images.unsplash.com/photo-1506193029-6cb2e0c90e36?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80\" alt=\"\">\n" +
                "                        <div class=\"hover-galeria\">\n" +
                "                            <img src=\"img/seleccion.png\" alt=\"\">");
                
                for(int j=0; j < 7; j++ ){
                    switch(j){
                        case 0:
                            out.println("<p><strong>DIRECCION: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 1:
                            out.println("<p><strong>NOMBRE: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 2:
                            out.println("<p><strong>CAFE: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 3:
                            out.println("<p><strong>DESCUENTO: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 4:
                            out.println("<p><strong>PRECIO: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 5:
                            out.println("<p><strong>CANTIDAD: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                        case 6:
                            out.println("<p><strong>ESTADO: </strong>"+Client.getClients().get(i).getInfo().get(j)+"</p>");
                            break;
                    }
                    
                }
                
                out.println("</div>\n" +
    "                    </div>");
            }        
            
            out.println("           </div>\n" +
                    "            </div>\n" +
                    "        </section>\n" +
                    "    </main>");
            out.println("</body>");
            out.println("</html>");
            //out.println("<h1>Servlet Orders at " + request.getContextPath() + "</h1>");
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
