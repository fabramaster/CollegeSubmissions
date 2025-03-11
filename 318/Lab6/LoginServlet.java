/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danling
 */
public class LoginServlet extends HttpServlet {

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
      out.println("<html>\n" +
"    <head>\n" +
"        <title>Login Demo with JSP</title>\n" +
"    </head>\n" +
"    <body style=\"background-color: bisque\">\n" +
"        <form method=\"post\" action=\"validateServlet\">\n" +
"            <center>\n" +
"            <table border=\"1\" cellpadding=\"5\" cellspacing=\"2\">\n" +
"                <thead>\n" +
"                    <tr>\n" +
"                        <th colspan=\"2\">Login Here</th>\n" +
"                    </tr>\n" +
"                </thead>\n" +
"                <tbody>\n" +
"                    <tr>\n" +
"                        <td>Username</td>\n" +
"                        <td><input type=\"text\" name=\"username\" required/></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>Password</td>\n" +
"                        <td><input type=\"password\" name=\"password\" required/></td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"Login\" />\n" +
"                            &nbsp;&nbsp;\n" +
"                            <input type=\"reset\" value=\"Reset\" />\n" +
"                        </td>                        \n" +
"                    </tr>                    \n" +
"                </tbody>\n" +
"            </table>\n" +
"            </center>\n" +
"        </form>\n" +
"    </body>\n" +
"</html>");
            

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
