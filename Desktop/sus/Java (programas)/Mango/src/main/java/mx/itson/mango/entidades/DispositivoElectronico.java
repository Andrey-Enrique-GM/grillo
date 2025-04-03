
package mx.itson.mango.entidades;

// @author Andrey

public abstract class DispositivoElectronico 
{
    
    private String marca;
    private String modelo;
    private String color;
    
    public DispositivoElectronico (String marca, String modelo, String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public String encender()
    {
        return "El dispositivo electronico esta encendido";
    }
    
    public abstract double calcularDepreciacion(double precio);
    
}
