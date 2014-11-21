/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AlvarezQuinteros;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumnoFI
 */
public class Historia {
    String detalles;
    String persona;
    public Historia() {
        detalles="Enfermedades y otros relevantes";
    }

    public Historia(String detalles, String persona) {
        this.detalles = detalles;
        this.persona = persona;
    }
    

    

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return persona+ "|" + "|" + detalles + "|";
    }
    
}
