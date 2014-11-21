/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

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
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    /**
     * Test of escribirArchivo method, of class ArchivoGrabacion.
     */
    @Test
    public void testEscribirArchivo() {
        System.out.println("escribirArchivo");
        try {
            File destino = folder.newFile("destino.txt");
            String expResult = destino.getAbsolutePath();
            ArchivoGrabacion instance = new ArchivoGrabacion(destino.getAbsolutePath());
            File[] lista = destino.listFiles();
            String resultado = lista[0].getAbsolutePath();
            assertEquals(expResult, resultado);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of escribirLineaArchivo method, of class ArchivoGrabacion.
     */
    @Test
    public void testEscribirLineaArchivo() {
        System.out.println("escribir En Archivo");
        File destino;
        try {
            destino = folder.newFile("destino.txt");
            Scanner in;
            in = new Scanner(new FileReader(destino));
            String linea = "hola mundo";
            System.out.println(destino.getAbsolutePath());
            ArchivoGrabacion instance = new ArchivoGrabacion(destino.getAbsolutePath());
            instance.escribirLineaArchivo(linea);
            String lineaRecibida = in.nextLine();
            in.close();
            assertEquals(linea, lineaRecibida);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
