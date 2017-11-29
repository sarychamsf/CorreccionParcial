package model;

/**
 *
 * @author Sary
 */
public class Fabrica {
    
    private int idFabrica;
    private String nombre;

    public Fabrica() {
    }

    public Fabrica(int idFabrica, String nombre) {
        this.idFabrica = idFabrica;
        this.nombre = nombre;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
