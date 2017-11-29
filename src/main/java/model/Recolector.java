package model;

/**
 *
 * @author Sary
 */
public class Recolector {
    
    private int idRecolector;
    private String nombre;

    public Recolector() {
    }

    public Recolector(int idRecolector, String nombre) {
        this.idRecolector = idRecolector;
        this.nombre = nombre;
    }

    public int getIdRecolector() {
        return idRecolector;
    }

    public void setIdRecolector(int idRecolector) {
        this.idRecolector = idRecolector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
