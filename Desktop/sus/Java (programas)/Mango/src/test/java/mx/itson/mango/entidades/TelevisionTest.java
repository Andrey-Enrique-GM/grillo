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
public class TelevisionTest {
    
    public TelevisionTest() {
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
    public void tearDown() {
    }

    /**
     * Test of cambiarVoumen method, of class Television.
     */
    @Test
    public void testCambiarVoumen() {
        System.out.println("cambiarVolumen");
        int cantidad = 47;
        Television tv = new Television("Samsung", "XHDERBEZ", "Negro", 55, 35);
        String expResult = "Se cambio el volumen a 47";
        String result = tv.cambiarVolumen(cantidad);
        assertEquals(expResult, result);
    }
    
}
