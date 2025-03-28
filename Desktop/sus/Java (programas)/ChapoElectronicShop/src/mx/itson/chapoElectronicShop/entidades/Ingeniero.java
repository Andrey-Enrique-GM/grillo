
package mx.itson.chapoElectronicShop.entidades;

// @author Andrey

import java.util.List;
import mx.itson.chapoElectronicShop.enums.Especialidad;


public class Ingeniero 
{

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the circuitosDiseñados
     */
    public List<Circuito> getCircuitosDiseñados() {
        return circuitosDiseñados;
    }

    /**
     * @param circuitosDiseñados the circuitosDiseñados to set
     */
    public void setCircuitosDiseñados(List<Circuito> circuitosDiseñados) {
        this.circuitosDiseñados = circuitosDiseñados;
    }
    
    private String nombre;
    private Especialidad especialidad;
    private List<Circuito> circuitosDiseñados;

    public Ingeniero(String nombre, Especialidad especialidad, List<Circuito> circuitosDiseñados)
    {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.circuitosDiseñados = circuitosDiseñados;
    }
    
}
