/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mango.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andrey
 */
public class ComputadoraTest {
    
    public ComputadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void testDisminuirDisco() {
        System.out.println("cambiarDisco");
        int cantidad = 5;
        Computadora pc = new Computadora("Lenovom", "02DDLC", "Plata", 2, 512);
        String expResult = "Se cambio la cantidad de almacenamiento a 507";
        String result = pc.disminuirDisco(cantidad);
        assertEquals(expResult, result);
    }
    
}
