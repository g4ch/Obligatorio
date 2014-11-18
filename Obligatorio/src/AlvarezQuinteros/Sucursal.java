/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AlvarezQuinteros;

/**
 *
 * @author alumnoFI
 */
public class Sucursal {
    int numeroSucursal;

    public Sucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    @Override
    public String toString() {
        return numeroSucursal + "|";
    }
    
}
