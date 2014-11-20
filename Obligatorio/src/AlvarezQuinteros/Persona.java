/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AlvarezQuinteros;

import java.util.Date;

/**
 *
 * @author alumnoFI
 */
public class Persona {
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    String nacimiento;
    String email;
    String telefono;

    public Persona() {
        cedula="1111111-1";
        nombre="Pedro";
        apellido="Gonzalez";
        direccion="Cuareim 1451";
        nacimiento = "14/12/94";
      //  nacimiento=new Date();
        email="pgonzalez@gmail.com";
        telefono="094123456";
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, String nacimiento, String email, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }




    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  /*  public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return cedula + "|" + nombre + "|" + apellido + "|" + direccion + "|" + nacimiento + "|" + email + "|" + telefono + "|";
    }
    
}
