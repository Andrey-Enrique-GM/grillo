
package mx.itson.mango.entidades;

// @author Andrey

public class Television extends DispositivoElectronico
{
    
    private int pulgadas;
    private int volumenActual;
    
    public Television (String marca, String modelo, String color, int pulgadas, int volumenActual)
    {
        super (marca, modelo, color);
        this.pulgadas = pulgadas;
        this.volumenActual = volumenActual;
    }
    
    public String cambiarVolumen(int cantidad)
    {
        if (cantidad > 0 && cantidad < 100){
            this.volumenActual = cantidad;
            return "Se cambio el volumen a " + cantidad;
        } else {
            return "El valor debe ser mayor igual a 0 y menor igual a 100!";
        }
    }
    
    @Override
    public String encender ()
    {
        return "La television esta cargando WAWAWAWA WAWAWAWA";
    }
    
    @Override
    public double calcularDepreciacion(double precio)
    {
        return precio * 0.05;
    }
    
}
