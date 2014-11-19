/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlvarezQuinteros;

import AlvarezQuinteros.Interfaz.AccesoSistema;
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
    public static String usuario;
    public static String rol;

    public static void main(String[] args) {
        //  Persona p1=new Persona ("45909697","Agustin","Quinteros","25 de Mayo",141294,"agustinquinteros17@hotmail.com", "099147463");


        AccesoSistema ventana = new AccesoSistema();
        ventana.setVisible(true);
        //personas.add(null);
    }

    public static boolean cedulaValida(String ci) {
        Boolean res = false;
        if (ci.length() == 8) {
            res = true;
            for (int i = 0; i < ci.length() - 2; i++) {
                res = res && Character.isDigit(ci.charAt(i));
            }
            if (res && Character.isDigit(ci.charAt(7))) {
                res = true;

            } else {
                res = false;
            }
            if (res && ci.charAt(6) == '-') {
                res = true;
            } else {
                res = false;
            }

        }
        return res;
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
}
