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
    String direccion;
    int telefono;

    /*  public Sucursal(int numeroSucursal) {
     numeroSucursal = "1";
     }
     */
    public Sucursal() {
        this.numeroSucursal = 1;
        this.direccion = "";
        this.telefono = 0;
    }

    public Sucursal(int numeroSucursal, String direccion, int telefono) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    @Override
    public String toString() {
        return  numeroSucursal + "|" + direccion + "|" + telefono + "|";
    }
}
