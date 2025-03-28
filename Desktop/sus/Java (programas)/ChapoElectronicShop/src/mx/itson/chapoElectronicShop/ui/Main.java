
package mx.itson.chapoElectronicShop.ui;

// @author Andrey

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.chapoElectronicShop.entidades.Circuito;
import mx.itson.chapoElectronicShop.entidades.Componente;
import mx.itson.chapoElectronicShop.entidades.Ingeniero;
import mx.itson.chapoElectronicShop.enums.Especialidad;
import mx.itson.chapoElectronicShop.enums.TipoComponente;


public class Main 
{
    
    public static void main(String[] args) 
    {
    
    Scanner scanner = new Scanner(System.in);
    
    // Aqui se crea la lista con todos los componentes que llevara el circuito
    List<Componente> componentes = new ArrayList<>();

    // Aqui se crea al inge
    System.out.println("- Creacion del perfil del ingeniero");
    System.out.println("Nombre del ingeniero:");
    String nombreIngeniero = scanner.nextLine();
    // Aqui se pone de especialidad "OTRO" (no recuerdo si ya nos enseño a que el usuario elija un enum)
    Especialidad especialidad = Especialidad.OTRO;
    // Se agregan todos esos atributos para terminar al inge en una array list
    Ingeniero ingeniero = new Ingeniero(nombreIngeniero, especialidad, new ArrayList<>());
    System.out.println("* Perfil del ingeniero creado correctamente!\n");
    
    // Aqui es la creacion del circuito
    System.out.println("- Creacion del circuito");
    System.out.println("Nombre del circuito:");
    String nombreCircuito = scanner.nextLine();
    // Aqui se crea un nuevo objeto de tipo Circuito con esos parametros
    Circuito circuito = new Circuito(nombreCircuito, componentes, ingeniero);
    // Aqui se añadio el objeto circuito recien creado a la lista del ingeniero
    ingeniero.getCircuitosDiseñados().add(circuito);
    System.out.println("* Circuito creado correctamente!\n");
    
    // En esta parte, el circuito e ingeniero ya estan hechos, solo falta que
    // el usuario agregue tantos componentes como lleve el circuito.
        
    // Aqui se muestra en terminal un menu/guia de uso para el usuario:
    while (true) {
        try {
            System.out.println("\n====================================");
            System.out.println("Que desea hacer con el circuito " + circuito.getNombre() + "?");
            System.out.println("1: Agregar un componente");
            System.out.println("2: Ver detalles del circuito");
            System.out.println("3: Calcular consumo total del circuito (voltaje)");
            System.out.println("4: Calcular resistencia total (ohms)");
            System.out.println("0: Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();     // Limpiamos el scanner (buffer)
                
            if (opcion == 1) { 
                System.out.println("\nIngrese el nombre del componente:");
                String nombreC = scanner.nextLine();

                // Se asigna automaticamente el tipo de componente a "OTRO"
                TipoComponente tipo = TipoComponente.OTRO;

                System.out.println("Ingrese el voltaje de consumo del componente:");
                double voltaje = scanner.nextDouble();
                System.out.println("Ingrese la resistencia del componente (solo ohms):");
                double resistencia = scanner.nextDouble();
                System.out.println("Ingrese la cantidad de este componente:");
                int cantidad = scanner.nextInt();
                scanner.nextLine();     // Limpiamos el scanner (buffer)
                // Aqui se esta creando un nuevo objeto de la clase Componente
                Componente componente = new Componente(nombreC, tipo, voltaje, resistencia, cantidad);
                // Esto crea un nuevo componente con los valores dados antes
                componentes.add(componente);
                System.out.println("* Componente agregado correctamente!");
                    
                
                } else if (opcion == 2) {
                    System.out.println("\nDetalles del circuito: " + circuito.getNombre());
                    System.out.println("Diseñado por el ingeniero: " + ingeniero.getNombre()
                    + " - Especializado en " + ingeniero.getEspecialidad());
                    System.out.println("+ Componentes en el circuito:");
                    // Imprimimos TODOS los componentes utilizados en el circuito
                    for (Componente c : componentes) 
                    {
                        System.out.println("- " + c.getNombre() + " (" + c.getTipo() + ") Cantidad: " + c.getCantidad());
                        System.out.println("Voltaje: " + c.getVoltaje() + "V - Resistencia: " + c.getResistencia() + " Ohms.");
                    }
                    
                    
                } else if (opcion == 3) {
                    // Calcula el consumo total del circuito (sumando el voltaje de cada componente multiplicado por su
                    // cantidad), y lo imprime en la consola :))
                    System.out.println("\nConsumo total del circuito: " + circuito.getNombre());
                    System.out.println(circuito.calcularConsumoTotal() + "V");
                    
                       
                } else if (opcion == 4) {
                    System.out.println("\nCalcular resistencia total del circuito " + circuito.getNombre());
                    // Solicita al usuario si el circuito esta en serie o no
                    System.out.println("El circuito esta en serie? (true/false):");
                    boolean enSerie = scanner.nextBoolean();
                    // Calcula y muestra la resistencia total del circuito segun la respuesta
                    System.out.println("Resistencia total del circuito: " + circuito.calcularResistenciaTotal(enSerie) + " Ohms");
                    
                     
                } else if (opcion == 0) {
                    System.out.println("\nSaliendo...");
                    break;
                    
                    
                } else {
                    System.out.println(" - Opcion no valida, intente de nuevo");
                }
            
            } catch (Exception e) {
                System.out.println(" - Error, entrada invalida. Intente de nuevo");
                scanner.nextLine(); // Limpiamos el scanner (buffer)
            }
        
        }
        // Se utiliza para cerrar el objeto Scanner cuando ya no se va a usar mas, liberando los recursos que
        // este objeto estaba utilizando para leer la entrada del usuario.
        scanner.close();
        
    }
    
}
