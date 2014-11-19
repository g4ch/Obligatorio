/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnoFI
 */
public class ArchivoGrabacion {

   private static BufferedWriter bw;

    public ArchivoGrabacion(String rutaDeArchivo) {
        try {
            File file = new File(rutaDeArchivo);
            FileWriter fw = new FileWriter(file);
            this.bw = new BufferedWriter(fw);
// Creo el archivo si el mismo no existe
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void escribirArchivo(String datos) {
        try {
            this.bw.write(datos);
            System.out.println("Se ha finalizado la escritura");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void escribirLineaArchivo(String datos) {
        try {
            this.bw.write(datos);
            this.bw.newLine();
            System.out.println("Se ha finalizado la escritura");
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarArchivo() {
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGrabacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
