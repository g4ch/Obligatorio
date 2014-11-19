/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos.alvarez
 */
public class ArchivoLecturaTest {
    
    public ArchivoLecturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hayMasLineas method, of class ArchivoLectura.
     */
    @Test
    public void testHayMasLineas() {
        System.out.println("hayMasLineas");
        ArchivoLectura instance = null;
        boolean expResult = false;
        boolean result = instance.hayMasLineas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of linea method, of class ArchivoLectura.
     */
    @Test
    public void testLinea() {
        System.out.println("linea");
        ArchivoLectura instance = null;
        String expResult = "";
        String result = instance.linea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrar method, of class ArchivoLectura.
     */
    @Test
    public void testCerrar() {
        System.out.println("cerrar");
        ArchivoLectura instance = null;
        boolean expResult = false;
        boolean result = instance.cerrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
