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
public class Funcionario extends Persona {
    Sucursal sucursal;

    public Funcionario() {
        this.sucursal = sucursal;
    }

    public Funcionario(Sucursal sucursal, String cedula, String nombre, String apellido, String direccion, String nacimiento, String email, String telefono) {
        super(cedula, nombre, apellido, direccion, nacimiento, email, telefono);
        this.sucursal = sucursal;
    }
    

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    

    @Override
    public String toString() {
        return cedula + "|" + nombre + "|" + apellido + "|" + direccion + "|" + nacimiento + "|" + email + "|" + telefono + "|" + sucursal + "|";
    }
    
}
