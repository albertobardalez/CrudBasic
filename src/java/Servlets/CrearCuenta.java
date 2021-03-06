
package Servlets;

import Logic.Controladora;
import Logic.Cuenta;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CrearCuenta", urlPatterns = {"/CrearCuenta"})
public class CrearCuenta extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
        Controladora control = new Controladora();     
        Cuenta cuenta1 = new Cuenta();
        /*cuenta1.setUsuario("Exito, ");
        cuenta1.setContrasenia("25548");
        control.crearCuenta(cuenta1);
        response.sendRedirect("index.jsp");*/
        
        String user = request.getParameter("name");
        String pass = request.getParameter("pass");
        
        cuenta1.setUsuario(user);
        cuenta1.setContrasenia(pass);
        
        control.crearCuenta(cuenta1); //--> se comunica con la BD el control
        
        response.sendRedirect("index.jsp");
         
    }    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
