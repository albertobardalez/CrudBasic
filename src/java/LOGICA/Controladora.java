
package LOGICA;

import PERSISTENCIA.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia  controlPers = new ControladoraPersistencia(); 
    
    public void crearCuenta(Cuenta cuenta){
        
        controlPers.crearCuenta(cuenta);
        
    }
}
