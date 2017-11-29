package model;

/**
 *
 * @author Sary
 */
public class CentroProduccion {
    
    private int idCentro;
    private String nombre;
    private String ubicacion;

    public CentroProduccion() {
    }

    public CentroProduccion(int idCentro, String nombre, String ubicacion) {
        this.idCentro = idCentro;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(int idCentro) {
        this.idCentro = idCentro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
