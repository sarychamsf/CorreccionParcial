package model;

/**
 *
 * @author Sary
 */
public class Cajon {
  
    private int idCajon;
    private int idFabrica;
    private String ubicacion;
    private String material;

    public Cajon() {
    }

    public Cajon(int idCajon, int idFabrica, String ubicacion, String material) {
        this.idCajon = idCajon;
        this.idFabrica = idFabrica;
        this.ubicacion = ubicacion;
        this.material = material;
    }

    public int getIdCajon() {
        return idCajon;
    }

    public void setIdCajon(int idCajon) {
        this.idCajon = idCajon;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
