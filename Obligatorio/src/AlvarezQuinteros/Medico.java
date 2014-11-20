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
public class Medico extends Persona{
    String especialidad;
    String sucursal;
    
    public Medico() {
        especialidad="Cardiologia";
    }

    public Medico(String cedula, String nombre, String apellido, String direccion, String nacimiento, String email, String telefono, String especialidad, String sucursal ) {
        super(cedula, nombre, apellido, direccion, nacimiento, email, telefono);
        this.especialidad = especialidad;
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    

    @Override
    public String toString() {
        return cedula + "|" + nombre + "|" + apellido + "|" + direccion + "|" + nacimiento + "|" + email + "|" + telefono + "|" + especialidad + "|" + sucursal + "|";
    }
    
}
