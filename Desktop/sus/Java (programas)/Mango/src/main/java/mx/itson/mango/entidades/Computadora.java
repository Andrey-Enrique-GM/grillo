
package mx.itson.mango.entidades;

// @author Andrey

public class Computadora extends DispositivoElectronico 
{
    
    private int memoriaRam;
    private int espacioDisco;
    
    public Computadora (String marca, String modelo, String color, int memoriaRam, int espacioDisco)
    {
        super(marca, modelo, color);
        this.memoriaRam = memoriaRam;
        this.espacioDisco = espacioDisco;
    }
    
    public String disminuirDisco(int cantidad)
    {
        if (cantidad > espacioDisco){
            return "El tamaño del archivo es muy grande!";
        } else {
            this.espacioDisco -= cantidad; // this.espacioDisco = espacioDisco - cantidad;
            return "Almacenamiento actualizado: " + this.espacioDisco;
        }
    }
    
    @Override
    public double calcularDepreciacion(double precio)
    {
        return precio * 0.12;
    }
    
}
