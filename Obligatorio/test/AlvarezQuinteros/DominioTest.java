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
        String ci = "1234567-7";
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

    /**
     * Test of cargarArchivos method, of class Dominio.
     */
    @Test
    public void testCargarArchivos() {
        System.out.println("cargarArchivos");
        int[] expResult = null;
        int[] result = Dominio.cargarArchivos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarDeListaPersonas method, of class Dominio.
     */
    @Test
    public void testMostrarDeListaPersonas() {
        System.out.println("MostrarDeListaPersonas");
        Medico m=new Medico("5555555-5","Flavio","Solero","Rambla Wilson 1734","20/8/1969","f.solero@gmail.com","099555555","Nefrologia","001");
        Afiliado f=new Afiliado("1111111-1","Pedro","Benitez","Av italia 6201","11/11/1994","pbenitez@gmail.com","099111111","4444444-4","001","1111111-1");
        Dominio.personas.add(m);
        Dominio.personas.add(f);
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add(m.toString());
        expResult.add(f.toString());
        ArrayList<String> result = Dominio.MostrarDeListaPersonas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
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
     * Test of PersonaDeListaPersonas method, of class Dominio.
     */
    @Test
    public void testPersonaDeListaPersonas() {
        System.out.println("PersonaDeListaPersonas");
        String ci = "";
        Persona expResult = null;
        Persona result = Dominio.PersonaDeListaPersonas(ci);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
