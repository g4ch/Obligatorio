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
    public static ArrayList<String> log = new ArrayList<String>();
    public static ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static String usuario;
    public static String rol;

    public static void main(String[] args) {
        Persona p1 = new Persona("4590969-7", "Agustin", "Quinteros", "25 de Mayo", "14/12/94", "agustinquinteros17@hotmail.com", "099147463");
        Dominio.personas.add(p1);
        AccesoSistema ventana = new AccesoSistema();
        ventana.setVisible(true);

        System.out.println(Dominio.estaEnLista(personas, "4590969-7"));
        System.out.println(Dominio.cedulaValida("4590969-7"));
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona aux = it.next();
            System.out.println(aux);
        }
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

    public static boolean cedulaValida(String ci) {
        Boolean res = false;
        if (ci.length() == 9) {
            res = true;
            for (int i = 0; i < ci.length() - 2; i++) {
                res = res && Character.isDigit(ci.charAt(i));
            }
            if (res && Character.isDigit(ci.charAt(8))) {//4590969-7
                res = true;
            }
            if (res && ci.charAt(7) == '-') {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
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
                    String[] datos = al.linea.split("\\|");
                    if (tipo[1].equals("afiliados.dat")) {
                        Dominio.personas.add(new Afiliado(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8], datos[9]));
                        resultado[0]++;
                    }
                    if (tipo[1].equals("medicos.dat")) {
                        Dominio.personas.add(new Medico(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], datos[8]));
                        resultado[1]++;
                    }
                }
                al.cerrar();
            }
        }
        return resultado;
    }
}
