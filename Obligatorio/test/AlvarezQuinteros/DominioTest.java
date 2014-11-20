/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumnoFI
 */
public class DominioTest {

    public DominioTest() {
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
     * Test of main method, of class Dominio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dominio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cedulaValida method, of class Dominio.
     */
    @Test
    public void testCedulaValida() {
        System.out.println("cedulaValida");
        String ci = "";
        boolean expResult = false;
        boolean result = Dominio.cedulaValida(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void test1CedulaValida() {
        System.out.println("cedulaValida");
        String ci = "trdtr";
        boolean expResult = false;
        boolean result = Dominio.cedulaValida(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void test2CedulaValida() {
        System.out.println("cedulaValida");
        String ci = "12345678";
        boolean expResult = false;
        boolean result = Dominio.cedulaValida(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void test3CedulaValida() {
        System.out.println("cedulaValida");
        String ci = "123456-a";
        boolean expResult = false;
        boolean result = Dominio.cedulaValida(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void test4CedulaValida() {
        System.out.println("cedulaValida");
        String ci = "123456-7";
        boolean expResult = true;
        boolean result = Dominio.cedulaValida(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of estaEnLista method, of class Dominio.
     */
    @Test
    public void testEstaEnLista() {
        System.out.println("estaEnLista");
        ArrayList<Persona> p = null;
        String cedula = "";
        boolean expResult = false;
        boolean result = Dominio.estaEnLista(p, cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}
