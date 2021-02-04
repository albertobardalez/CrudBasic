
package PERSISTENCIA;

import LOGICA.Cuenta;


public class ControladoraPersistencia {
    
    CuentaJpaController cuentaJpa = new CuentaJpaController();
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearCuenta(Cuenta cuenta) {
        cuentaJpa.create(cuenta);
    }
    
    
}
