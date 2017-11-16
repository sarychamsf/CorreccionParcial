package Controlador;

import dao.TrabajadorDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Trabajador;

public class Login extends HttpServlet {

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
        HttpSession sesionUsuario = request.getSession();
        Trabajador sesionTrab = (Trabajador) sesionUsuario.getAttribute("usuario");
        if (sesionTrab != null) {
            sesionUsuario.invalidate();
            response.sendRedirect("");
        }
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

        try {
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            //Validaciones que deben ser realizadas
            /*
            Parameters should be validated against positive specs:
            – Data type (string, integer, real, etc…)
            – Minimum and maximum length
            – Whether null is allowed
            – Whether the parameter is required or not
            – Numeric range
            – Specific patterns (regular expressions)
            - Modify default error pages (404, 401, etc.)
            - Error Handling - Measures
            - Use strong authentication mechanisms:
            – Password policies (strength, use, change control, storage). – Secure transport (SSL).
            – Carefully implement forgotten password functionality.
            – Remove default usernames
            https://www.owasp.org/images/8/83/Securing_Enterprise_Web_Applications_at_the_Source.pdf
            
             */

            Trabajador datosTrab = new Trabajador();
            datosTrab.setUsuarioT(usuario);
            datosTrab.setPasswordT(pass);

            //Validaciones
            TrabajadorDAO trabDao = new TrabajadorDAO();
            Trabajador sesion;

            sesion = trabDao.validar(datosTrab);

            HttpSession sesionUsuario = request.getSession();
            Trabajador sesionTrabajador = (Trabajador) sesionUsuario.getAttribute("usuario");
            if (sesionTrabajador == null) {
                if (sesion != null) {
                    sesionUsuario.setAttribute("usuario", sesion);
                    response.sendRedirect("aplicacion.jsp");
                } else {
                    response.sendRedirect("errorSesion.html");
                }

            } else {
                response.sendRedirect("aplicacion.jsp");
            }

            if (sesion != null) {

            } else {
                request.setAttribute("Error", "Revisar usuario/pass");
                RequestDispatcher rq = request.getRequestDispatcher("menu.html");
                rq.forward(request, response);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
