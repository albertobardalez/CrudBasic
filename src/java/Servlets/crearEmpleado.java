
package Servlets;

import Logic.Controladora;
import Logic.Cuenta;
import Logic.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "crearUsuario", urlPatterns = {"/crearUsuario"})
public class crearEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        Controladora control = new Controladora();
        System.out.println("Entro");
        Empleado empleado = new Empleado();
        
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        int idCuenta = Integer.parseInt(request.getParameter("idCuenta")) ;
        Cuenta cuentaEmple = control.obtenerCuentaId(idCuenta); //---->--> se comunica con la BD el control
        
        
        empleado.setNombre(name);
        empleado.setApellido(lastName);
        empleado.setEdad(age);
        empleado.setCuentaEmple(cuentaEmple);
        
        
        
        control.crearEmpleado(empleado);
        
        response.sendRedirect("index.jsp");
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
