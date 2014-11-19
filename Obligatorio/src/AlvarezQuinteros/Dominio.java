/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import AlvarezQuinteros.Interfaz.AccesoSistema;
import java.io.File;
import java.io.IOException;
import static java.lang.System.console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnoFI
 */
public class Dominio {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Sucursal> sucursales;
    public static ArrayList<Persona> personas;

    public static void main(String[] args) {
        //  Persona p1=new Persona ("45909697","Agustin","Quinteros","25 de Mayo",141294,"agustinquinteros17@hotmail.com", "099147463");

        Persona p1 = new Persona();
        p1.setCedula("45909697");
        p1.setNombre("Agustin");
        p1.setApellido("Quinteros");
        p1.setDireccion("25 de Mayo");
        p1.setNacimiento(141294);
        p1.setEmail("agustinquinteros17@hotmail.com");
        p1.setTelefono("099147463");
        //  personas.add(p1);
        int test[] = Dominio.cargarArchivos();
        System.out.println(test[0]);
        System.out.println(test[1]);
        System.out.println(test[2]);
        //AccesoSistema ventana = new AccesoSistema();
        //ventana.setVisible(true);
        //personas.add(null);
    }

    public static boolean estaEnLista(ArrayList<Persona> p, String cedula) {
        boolean retorno = false;
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona aux = it.next();
            if (aux.getCedula().equals(cedula)) {
                retorno = true;
            }
        }
        return retorno;
    }

    public static int[] cargarArchivos() {
        int[] resultado = new int[3];//en [0] pacientes en [1] medicos en [2] sucursales
        File carpeta = new File("./Archivos/");
        File[] lista = carpeta.listFiles();
        resultado[2] = ((lista.length) / (3));
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isFile()) {
                ArchivoLectura al = new ArchivoLectura("./Archivos/" + lista[i].getName());
                String[] tipo = lista[i].getName().split("-");                
                while (al.hayMasLineas()) {
                    if (tipo[1].equals("afiliados.dat")) {
                        resultado[0]++;
                    }
                    if (tipo[1].equals("medicos.dat")) {
                        resultado[1]++;
                    }
                }
                al.cerrar();
            }
        }
        return resultado;
    }
}
