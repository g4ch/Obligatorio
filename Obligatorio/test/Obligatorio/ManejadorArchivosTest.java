/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obligatorio;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
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
public class ManejadorArchivosTest {
    
    public ManejadorArchivosTest() {
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
     * Test of Escribir method, of class ManejadorArchivos.
     */
    @Test
    public void testEscribir() throws Exception {
        File archivo=folder.newFile("test.log");
        System.out.println("Escribir");
        String ruta = archivo.getAbsolutePath();
        String contenido = "Prueba1";
        ManejadorArchivos.Escribir(ruta, contenido);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(ruta);
        ManejadorArchivos.Escribir(ruta, contenido);
        Scanner in = new Scanner(new FileReader(ruta));
        String lineaRecibida = in.nextLine();
        in.close();
        assertEquals(contenido, lineaRecibida);
    }

    /**
     * Test of Leer method, of class ManejadorArchivos.
     */
    @Test
    public void testLeer() throws Exception {
        File archivo=folder.newFile("test.log");
        String ruta = archivo.getAbsolutePath();
        ManejadorArchivos.Escribir(ruta,"Prueba1");
        System.out.println("Leer");
        String expResult = "Prueba1\r\n";
        String result = new String(ManejadorArchivos.Leer(ruta), "UTF-8");
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result);
    }
    
}
