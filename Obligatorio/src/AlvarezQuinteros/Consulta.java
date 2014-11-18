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
    int id;
    Date fecha;
    Sucursal sucursal;
    Medico medico;
    Afiliado afiliado;
    Funcionario admin;
    public Consulta() {
        id=0;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return id + "|" + fecha + "|" + sucursal.getNumeroSucursal() + "|" + medico.getCedula() + "|" + afiliado.getCedula() + "|" + admin.getCedula() + "|";
    }
    
}
