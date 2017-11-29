/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Sary
 */
public class VisitaTecnica {
    
    private int idVisita;
    private Date fecha;
    private String aprobado;

    public VisitaTecnica() {
    }

    public VisitaTecnica(int idVisita, Date fecha, String aprobado) {
        this.idVisita = idVisita;
        this.fecha = fecha;
        this.aprobado = aprobado;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }
    
    
    
}
