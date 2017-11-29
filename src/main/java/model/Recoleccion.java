package model;

import java.util.Date;

/**
 *
 * @author Sary
 */
public class Recoleccion {
    
    private int idRecoleccion;
    private int idRecolector;
    private int idColmena;
    private Date fecha;
    private double kg;

    public Recoleccion() {
    }
    
    public Recoleccion(int idRecoleccion, int idRecolector, int idColmena, Date fecha, double kg) {
        this.idRecoleccion = idRecoleccion;
        this.idRecolector = idRecolector;
        this.idColmena = idColmena;
        this.fecha = fecha;
        this.kg = kg;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdRecolector() {
        return idRecolector;
    }

    public void setIdRecolector(int idRecolector) {
        this.idRecolector = idRecolector;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
    
    
    
}
