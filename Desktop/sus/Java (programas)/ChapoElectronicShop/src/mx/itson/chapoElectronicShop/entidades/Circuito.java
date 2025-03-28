
package mx.itson.chapoElectronicShop.entidades;

// @author Andrey

import java.util.List;


public class Circuito 
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
     * @return the componentes
     */
    public List<Componente> getComponentes() {
        return componentes;
    }

    /**
     * @param componentes the componentes to set
     */
    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    /**
     * @return the ingeniero
     */
    public Ingeniero getIngeniero() {
        return ingeniero;
    }

    /**
     * @param ingeniero the ingeniero to set
     */
    public void setIngeniero(Ingeniero ingeniero) {
        this.ingeniero = ingeniero;
    }
    
    private String nombre;
    private List<Componente> componentes;
    private Ingeniero ingeniero;

    
    
    public Circuito(String nombre, List<Componente> componentes, Ingeniero ingeniero) {
        this.nombre = nombre;
        this.componentes = componentes;
        this.ingeniero = ingeniero;
    }
    
    
    
    /**
     * Calcula el consumo total de un circuito basado en los componentes que lo conforman.
     * El consumo se calcula sumando el voltaje de cada componente multiplicado por su cantidad.
     * @return El consumo total del circuito en voltios (V).
     */
    public double calcularConsumoTotal()
    {
        double consumo = 0;
        // Itera sobre los componentes del circuito
        for (Componente c : getComponentes())
        {
            // Suma el consumo de cada componente (voltaje * cantidad)
            consumo += c.getVoltaje() * c.getCantidad();
        }
        // Retorna el consumo total del circuito
        return consumo;
    }
    
    
    
    /**
     * Calcula la resistencia total de un circuito en funcion de como estan conectados los componentes:
     * en serie o en paralelo.
     * 
     * Si el circuito esta en serie, la resistencia total es la suma de las resistencias de todos los componentes.
     * Si el circuito esta en paralelo, la resistencia total se calcula como el inverso de la suma de los inversos
     * de las resistencias de los componentes.
     * @param enSerie enSerie Un valor booleano que indica si los componentes estan conectados en serie (true) o en paralelo (false).
     * @return La resistencia total del circuito en ohmios (Ω).
     */
    public double calcularResistenciaTotal(boolean enSerie) 
    {
        double resistenciaTotal = 0;
        // Si los componentes estan en serie, sumamos las resistencias
        if (enSerie) 
        {
            for (Componente c : getComponentes()) 
            {
                resistenciaTotal += c.getResistencia();
            }
        }
        // Si los componentes estan en paralelo, sumamos los inversos de las resistencias
        else
        {
            double sumInversos = 0;
            for (Componente c : getComponentes()) 
            {
                sumInversos += 1 / c.getResistencia();
            }
            // Calculamos la resistencia total para paralelo
            resistenciaTotal = 1 / sumInversos;
        }
        // Retorna la resistencia total del circuito
        return resistenciaTotal;
    }
    
}
