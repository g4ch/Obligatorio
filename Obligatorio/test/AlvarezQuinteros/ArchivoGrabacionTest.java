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
public class ArchivoGrabacionTest {
    
    public ArchivoGrabacionTest() {
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
     * Test of escribirArchivo method, of class ArchivoGrabacion.
     */
    @Test
    public void testEscribirArchivo() {
        System.out.println("escribirArchivo");
        String datos = "";
        ArchivoGrabacion instance = null;
        instance.escribirArchivo(datos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribirLineaArchivo method, of class ArchivoGrabacion.
     */
    @Test
    public void testEscribirLineaArchivo() {
        System.out.println("escribirLineaArchivo");
        String datos = "";
        ArchivoGrabacion instance = null;
        instance.escribirLineaArchivo(datos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarArchivo method, of class ArchivoGrabacion.
     */
    @Test
    public void testCerrarArchivo() {
        System.out.println("cerrarArchivo");
        ArchivoGrabacion instance = null;
        instance.cerrarArchivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
