
package mx.itson.mango.ui;

// @author Andrey

import mx.itson.mango.entidades.Computadora;
import mx.itson.mango.entidades.Television;

     
public class Main 
{
    
    public static void main(String[] args) 
    {
        
        // Aqui se crean 2 objetos; tv y pc
        Television tv = new Television("Samsung", "XHDERBEZ", "Negro", 55, 35);
        Computadora pc = new Computadora("Lenovo", "02DDLC", "Plata", 2, 512);
        
        tv.encender();
        tv.cambiarVolumen(62);
        
        pc.encender();
        pc.disminuirDisco(5);
    }
    
}
