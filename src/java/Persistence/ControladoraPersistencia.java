
package Persistence;

import Logic.Cuenta;
import Logic.Empleado;
import java.util.ArrayList;
import java.util.List;



public class ControladoraPersistencia {
    
    CuentaJpaController cuentaJpa = new CuentaJpaController();
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearCuenta(Cuenta cuenta) {
        cuentaJpa.create(cuenta);
    }
    
    public List<Cuenta> getCuenta() {
        
    /*  List<Cuenta>listaCuenta = new ArrayList<Cuenta>(); 
     
        
        listaCuenta = cuentaJpa.findCuentaEntities();
        return listaCuenta;
        
      */   
        return cuentaJpa.findCuentaEntities();
        
        // voy a relaizar crearun metodo getId, que va usar cuentaJpa con el metodo findCuenta
    }

    public void crearEmpleado(Empleado empleado) {
        empleJpa.create(empleado);
    }
    public List<Empleado> getEmpleado() {
        return empleJpa.findEmpleadoEntities();
    }
   public Cuenta obtenerCuentaId(int pedro){
       return cuentaJpa.findCuenta(pedro); 
   }
   
  }  
   
    
   
    

