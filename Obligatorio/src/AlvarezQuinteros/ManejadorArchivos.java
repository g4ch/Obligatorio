/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.APPEND;

/**
 *
 * @author alumnoFI
 */
public class ManejadorArchivos {

    /**
     *
     * @param ruta
     * @param contenido
     * @throws java.io.IOException
     */
    public static void Escribir(String ruta, String contenido) throws IOException {
        Path file;
        contenido+="\r\n";
        file = Paths.get(ruta);
        byte[] buf;
        buf = contenido.getBytes();
        Files.write(file, buf, APPEND);
    }

    public static byte[] Leer(String ruta) throws IOException {
        Path file;
        file = Paths.get(ruta);
        byte[] fileArray;
        fileArray = Files.readAllBytes(file);
        return fileArray;
    }
}
