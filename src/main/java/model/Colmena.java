package model;

import java.util.Date;

/**
 *
 * @author Sary
 */

public class Colmena {
    
    private int idColmena;
    private String poblacion;
    private String reina;
    private String miel;
    private String cera;
    private String alimento;
    private String cria;
    private String vacio;
    private Date fechaInstalacion;
    private int idVisita;
    private int idApiario;
    private int idCajon;
    private int idRecoleccion;
    private int idMadre;

    public Colmena() {
    }
    
    public Colmena(int idColmena, String poblacion, String reina, String miel, String cera, String alimento, String cria, String vacio, Date fechaInstalacion, int idVisita, int idApiario, int idCajon, int idRecoleccion, int idMadre) {
        this.idColmena = idColmena;
        this.poblacion = poblacion;
        this.reina = reina;
        this.miel = miel;
        this.cera = cera;
        this.alimento = alimento;
        this.cria = cria;
        this.vacio = vacio;
        this.fechaInstalacion = fechaInstalacion;
        this.idVisita = idVisita;
        this.idApiario = idApiario;
        this.idCajon = idCajon;
        this.idRecoleccion = idRecoleccion;
        this.idMadre = idMadre;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getReina() {
        return reina;
    }

    public void setReina(String reina) {
        this.reina = reina;
    }

    public String getMiel() {
        return miel;
    }

    public void setMiel(String miel) {
        this.miel = miel;
    }

    public String getCera() {
        return cera;
    }

    public void setCera(String cera) {
        this.cera = cera;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getCria() {
        return cria;
    }

    public void setCria(String cria) {
        this.cria = cria;
    }

    public String getVacio() {
        return vacio;
    }

    public void setVacio(String vacio) {
        this.vacio = vacio;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdApiario() {
        return idApiario;
    }

    public void setIdApiario(int idApiario) {
        this.idApiario = idApiario;
    }

    public int getIdCajon() {
        return idCajon;
    }

    public void setIdCajon(int idCajon) {
        this.idCajon = idCajon;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }
    
}
