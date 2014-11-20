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
public class Afiliado extends Persona {
    String medico;
    String sucursal;
    String historia;

    public Afiliado() {
        this.medico="";
        this.sucursal="";
        this.historia="";
    }

    public Afiliado(String cedula, String nombre, String apellido, String direccion, String nacimiento, String email, String telefono, String medico, String sucursal,String historia) {
        super(cedula, nombre, apellido, direccion, nacimiento, email, telefono);
        this.medico=medico;
        this.sucursal=sucursal;
        this.historia=historia;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
    
    @Override
    public String toString() {
        return cedula + "|" + nombre + "|" + apellido + "|" + direccion + "|" + nacimiento + "|" + email + "|" + telefono + "|" + medico + "|" + sucursal + "|"+ historia + "|";
    }
    
}
