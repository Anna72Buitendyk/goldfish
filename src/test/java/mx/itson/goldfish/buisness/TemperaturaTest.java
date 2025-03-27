/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.goldfish.buisness;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of convertir method, of class Temperatura.
     */
    @org.junit.jupiter.api.Test
    public void testConvertir() {
        // Nombre y descripcion del caso de prueba
        System.out.println("Convertir grados");
        // Input y resultado esperado
        float centigrados = 45f;
        float expResult = 113.01f;
        float result = Temperatura.convertir(centigrados);
        assertEquals(expResult, result, 0.02);
    }
    
}
