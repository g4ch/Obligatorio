/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Obligatorio;

import java.util.ArrayList;

/**
 *
 * @author alumnoFI
 */
public class Historia {
    ArrayList<Consulta> consultas;
    String detalles;
    Persona persona;
    public Historia() {
        consultas = new ArrayList<Consulta>();
        detalles="Enfermedades y otros relevantes";
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return persona.toString() + consultas.toString() + "|" + detalles + "|";
    }
    
}
