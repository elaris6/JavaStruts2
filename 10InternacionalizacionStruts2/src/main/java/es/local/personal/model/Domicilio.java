package es.local.personal.model;

public class Domicilio {

    private String calle;
    private int numCalle;
    private String ciudad;

    public Domicilio() {
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numCalle=" + numCalle + ", ciudad=" + ciudad + '}';
    }
    
    
}
