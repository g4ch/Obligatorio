/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class ArchivoLectura {
    String linea="";
    BufferedReader in;
    
    public ArchivoLectura(String unNombre){
        try{
            in = new BufferedReader(new FileReader(unNombre));
            
        }catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
    }
    public boolean hayMasLineas(){
        try{
            linea=in.readLine();
            
        } catch(IOException e){
            linea=null;
        }
        return(linea != null);
    }
    public String linea(){
        return linea;
    }
    public boolean cerrar(){
        boolean ok=true;
        try{
            in.close();
        }catch(Exception e){
            System.out.println("Ocurrio un error al intentar cerrar el archivo");
            ok=false;
        }
        return ok;
    }
}
