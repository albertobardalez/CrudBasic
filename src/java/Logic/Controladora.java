
package Logic;

import static Logic.Cuenta_.idCuenta;
import Persistence.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia  controlPers = new ControladoraPersistencia(); 
    
    public void crearCuenta(Cuenta cuenta){
        
        controlPers.crearCuenta(cuenta);
        
    }

    public List<Cuenta> getCuenta() {
        
        return controlPers.getCuenta();
    }

   
    public void crearEmpleado(Empleado empleado) {
        controlPers.crearEmpleado(empleado);
    }

    public List<Empleado> getEmpleado() {
        return controlPers.getEmpleado();
    }
    public Cuenta obtenerCuentaId(int polenta){
         return controlPers.obtenerCuentaId(polenta);
    }

   
   
}
