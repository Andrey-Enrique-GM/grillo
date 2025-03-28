
package mx.itson.chapoElectronicShop.entidades;

// @author Andrey

import mx.itson.chapoElectronicShop.enums.TipoComponente;


public class Componente 
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
     * @return the tipo
     */
    public TipoComponente getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoComponente tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the voltaje
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * @param voltaje the voltaje to set
     */
    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    /**
     * @return the resistencia
     */
    public double getResistencia() {
        return resistencia;
    }

    /**
     * @param resistencia the resistencia to set
     */
    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    private String nombre;
    private TipoComponente tipo;
    private double voltaje;
    private double resistencia;
    private int cantidad;

    public Componente(String nombre, TipoComponente tipo, double voltaje, double resistencia, int cantidad)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.voltaje = voltaje;
        this.resistencia = resistencia;
        this.cantidad = cantidad;
    }
    
}
