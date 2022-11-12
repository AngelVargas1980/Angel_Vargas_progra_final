/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Angel Vargas
 */
public class ArrayLibroTest {
    
    public ArrayLibroTest() {
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
     * Test of guardarCliente method, of class ArrayLibro.
     */
    @Test
    public void testGuardarCliente() {
        System.out.println("guardarCliente");
        LibroClase cliente = null;
        ArrayLibro instance = new ArrayLibro();
        instance.guardarCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes method, of class ArrayLibro.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        ArrayLibro instance = new ArrayLibro();
        LibroClase[] expResult = null;
        LibroClase[] result = instance.getClientes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abrirConexion method, of class ArrayLibro.
     */
    @Test
    public void testAbrirConexion() {
        System.out.println("abrirConexion");
        ArrayLibro instance = new ArrayLibro();
        instance.abrirConexion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarCliente2 method, of class ArrayLibro.
     */
    @Test
    public void testGuardarCliente2() {
        System.out.println("guardarCliente2");
        LibroClase cliente = null;
        ArrayLibro instance = new ArrayLibro();
        String expResult = "";
        String result = instance.guardarCliente2(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientes2 method, of class ArrayLibro.
     */
    @Test
    public void testGetClientes2() {
        System.out.println("getClientes2");
        StringBuffer respuesta = null;
        ArrayLibro instance = new ArrayLibro();
        instance.getClientes2(respuesta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCliente method, of class ArrayLibro.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        int carne = 0;
        ArrayLibro instance = new ArrayLibro();
        String expResult = "";
        String result = instance.eliminarCliente(carne);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
