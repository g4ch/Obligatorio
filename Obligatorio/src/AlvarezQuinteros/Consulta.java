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
public class Consulta {
    Date fecha;
    Sucursal sucursal;
    Medico medico;
    Afiliado afiliado;
    Funcionario admin;
    public Consulta() {
        fecha=new Date();
        sucursal=new Sucursal();
        medico=new Medico();
        afiliado=new Afiliado();
        admin=new Funcionario();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Funcionario getAdmin() {
        return admin;
    }

    public void setAdmin(Funcionario admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return fecha + "|" + sucursal + "|" + medico + "|" + afiliado + "|" + admin.toString() + "|";
    }
    
}
