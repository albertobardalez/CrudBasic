
package LOGICA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    private String edad;
    @OneToOne
    private Cuenta cuentaEmple;
    
    
    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String edad, Cuenta cuentaEmple) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentaEmple = cuentaEmple;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Cuenta getCuentaEmple() {
        return cuentaEmple;
    }

    public void setCuentaEmple(Cuenta cuentaEmple) {
        this.cuentaEmple = cuentaEmple;
    }

    
    
    
}
