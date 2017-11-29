package model;

/**
 *
 * @author Sary
 */
public class Apiario {
    
    private int idApiario;
    private int idCentro;

    public Apiario() {
    }

    public Apiario(int idApiario, int idCentro) {
        this.idApiario = idApiario;
        this.idCentro = idCentro;
    }

    public int getIdApiario() {
        return idApiario;
    }

    public void setIdApiario(int idApiario) {
        this.idApiario = idApiario;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }
    
}
