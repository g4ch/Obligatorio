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
class Medico extends Persona{
    String especialidad;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
        
    }
    Sucursal sucursal;

    public Medico() {
        especialidad="Cardiologia";
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