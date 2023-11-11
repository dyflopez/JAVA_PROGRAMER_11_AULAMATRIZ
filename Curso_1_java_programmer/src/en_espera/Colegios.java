package en_espera;

public class Colegios {

    private  String nomnre;
    private  String direccion;

    public Colegios(String nomnre, String direccion) {
        this.nomnre = nomnre;
        this.direccion = direccion;
    }

    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Colegios{" +
                "nomnre='" + nomnre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
